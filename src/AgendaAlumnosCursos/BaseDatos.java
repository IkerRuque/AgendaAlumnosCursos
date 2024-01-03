/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaAlumnosCursos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.sql.SQLException;

/**
 *
 * @author Iker Ruiz
 */
public class BaseDatos {

    /**
     * Declaracion de las variables propias de la clase BaseDatos
     */
    private String ip = "localhost";
    private String puerto = "3306";
    private String db = "";
    private String usuario = "root";
    private String password = "";
    private Connection conn = null;

    /**
     * Declaracion del constructor de la clase
     *
     * @param fichero
     */
    public BaseDatos(String fichero) {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        HashMap<String, String> parametros = new HashMap<String, String>();
        try {
            reader = new FileReader(fichero);
            bufferedReader = new BufferedReader(reader);
            int cont = 1;
            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println("num linea " + cont + " " + line);
                cont++;
                line = line.trim();
                if (line.length() != 0) {

                    String valores[] = line.split("=");//definimos por que signo estan separados la key del valor
                    if (valores.length == 2) {
                        if (parametros.containsKey(valores[0])) {
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        } else {
                            parametros.put(valores[0].trim(), valores[1].trim());
                        }
                    } else if (valores.length == 1) {
                        if (parametros.containsKey(valores[0])) {
                            System.out.println("ERROR PARAMETROS YA DEFINIDO");
                        } else {
                            parametros.put(valores[0].trim(), "");
                        }
                    }
                }

            }
            for (String clave : parametros.keySet()) {
                //System.out.println(clave + ":" + parametros.get(clave));
                switch (clave) {
                    case "ip":
                        this.ip = parametros.get(clave);
                        break;
                    case "puerto":
                        this.puerto = parametros.get(clave);
                        break;
                    case "usuario":
                        this.usuario = parametros.get(clave);
                        break;
                    case "password":
                        this.password = parametros.get(clave);
                        break;
                    case "db":
                        this.db = parametros.get(clave);
                        break;
                }
            }

        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                reader.close();
            } catch (IOException ex) {
//                ex.printStackTrace();
            }

        }

        conectar();
    }

    /**
     * Metodo que conecta con la base de datos
     */
    public void conectar() {

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("CONECTAR A " + "jdbc:mariadb://" + this.ip + ":" + this.puerto + "/" + this.db + " " + this.usuario + " " + this.password);
            conn = DriverManager.getConnection("jdbc:mariadb://" + this.ip + ":" + this.puerto + "/" + this.db, this.usuario, this.password);
        } catch (Exception ex) {
//            ex.printStackTrace();
        }
    }

    /**
     * Metodo que crea ,si no esta ya creada, la base datos con la que
     * trabajaremos
     */
    public void crearBase() {

        /**
         * Trigger para la base de datos que actualiza la fecha de calificacion
         * cada vez que se aniade una nota a una inscripcion de un alumno en un
         * curso
         */
        String sql = "CREATE OR REPLACE TRIGGER actualiza_fechaCalif "
                + "BEFORE UPDATE ON inscripciones "
                + "FOR EACH ROW "
                + "BEGIN "
                + "    IF NEW.calificacion IS NOT NULL THEN "
                + "       SET NEW.fecha_calificacion = CURRENT_DATE(); "
                + "    END IF; "
                + "END ;";

        /**
         * Trigger para la base de datos que convierte en null aquellas
         * calificaciones negativas. Es necesario ya que el tipo Float de las
         * calificaciones no puede enviarse como null directamente a la base de
         * datos en aquellos casos en los que el alumno aun no tenga nota.
         */
        String sql2 = "CREATE OR REPLACE TRIGGER notMenorCero BEFORE INSERT ON inscripciones\n"
                + "FOR EACH ROW\n"
                + "BEGIN\n"
                + "    IF NEW.calificacion < 0 THEN\n"
                + "        SET NEW.calificacion = NULL;\n"
                + "    END IF;\n"
                + "END  ;";

        /**
         * TryCatch que controla la creacion de la base de datos de la
         * aplicacion
         */
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS JavierVillarta_IkerRuiz_centroFormacion;");
            stmt.executeUpdate("USE JavierVillarta_IkerRuiz_centroFormacion;");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS alumnos("
                    + "    id_alumno INT auto_increment,"
                    + "    nombre VARCHAR (20)  not null,"
                    + "    apellido VARCHAR (20) NOT NULL,"
                    + "    correo_electronico VARCHAR (30) NOT NULL,"
                    + "    telefono CHAR (9) UNIQUE NOT NULL,"
                    + "    PRIMARY KEY (id_alumno)"
                    + ");");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS cursos("
                    + "    id_curso INT  auto_increment,"
                    + "    nombre VARCHAR (20) UNIQUE NOT NULL,"
                    + "    descripcion VARCHAR (50) NOT NULL,"
                    + "    creditos INT NOT NULL, "
                    + "    PRIMARY KEY (id_curso)"
                    + ");");

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS inscripciones(\n"
                    + "id_inscripcion INTEGER AUTO_INCREMENT,"
                    + "    id_curso INTEGER NOT NULL,"
                    + "    id_alumno INTEGER NOT NULL,    "
                    + "      fecha_matriculacion DATE default CURRENT_DATE, "
                    + "      fecha_calificacion DATE,"
                    + "    calificacion FLOAT (5),    "
                    + "    PRIMARY KEY (id_inscripcion)"
                    + ");");
            stmt.executeLargeUpdate("ALTER TABLE  inscripciones\n"
                    + "DROP FOREIGN KEY IF EXISTS fk_inscripciones_cursos,"
                    + "DROP FOREIGN KEY IF EXISTS fk_inscripciones_alumnos;");
            stmt.executeLargeUpdate("ALTER TABLE  inscripciones\n"
                    + "ADD CONSTRAINT fk_inscripciones_cursos FOREIGN KEY (id_curso) REFERENCES cursos (id_curso) ON DELETE CASCADE,\n"
                    + "ADD CONSTRAINT fk_inscripciones_alumnos FOREIGN KEY (id_alumno) REFERENCES alumnos(id_alumno) ON DELETE CASCADE;");
            stmt.execute(sql);
            stmt.execute(sql2);
            this.conn.commit();
            stmt.close();
        } catch (SQLException e) {
//            e.printStackTrace();
        }

    }

    /**
     * Metodo que permite insertar un alumno en la tabla correspondiente de la
     * base de datos, recibe los atributos propios de un alumno y los guarda
     *
     * @param nombre
     * @param apellido
     * @param correo
     * @param telefono
     */
    public void insertarAlumno(String nombre, String apellido, String correo, String telefono) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("insert into alumnos (nombre,apellido,correo_electronico,telefono) values ('" + nombre + "','" + apellido + "','" + correo + "','" + telefono + "')");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }

    }

    /**
     * Metodo relacionado con la serializacion. A diferencia del metodo
     * insertarAlumno este aniade el atributo id previamente serializado para la
     * copia de seguridad por lo que inserta los alumnos que ya estaban en la
     * base de datos y de este modo su id no cambia
     *
     * @param idAlumno
     * @param nombre
     * @param apellido
     * @param correo
     * @param telefono
     */
    public void insertarAlumnoComp(int idAlumno, String nombre, String apellido, String correo, String telefono) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("insert into alumnos (id_alumno,nombre,apellido,correo_electronico,telefono) values (" + idAlumno + ", '" + nombre + "','" + apellido + "','" + correo + "','" + telefono + "')");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }

    }

    /**
     * Metodo que permite borrar un alumno de la base de datos por medio de su
     * primary key
     *
     * @param telefono
     */
    public void borrarAlumno(String telefono) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("delete from alumnos where telefono = '" + telefono + "';");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }
    }

    /**
     * Metodo que permite borrar un curso por medio de su primary key
     *
     * @param nombre
     */
    public void borrarCurso(String nombre) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("delete from cursos where nombre = '" + nombre + "';");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }
    }

    /**
     * Metodo que permite insertar un curso en la tabla correspondiente de la
     * base de datos, recibe los atributos propios de un curso y los guarda
     *
     * @param nombre
     * @param descripcion
     * @param creditos
     */
    public void insertarCurso(String nombre, String descripcion, int creditos) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("insert into cursos (nombre,creditos,descripcion) values ('" + nombre + "','" + creditos + "','" + descripcion + "')");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }

    }

    /**
     * Metodo relacionado con la serializacion. A diferencia del metodo
     * insertarCurso este aniade el atributo id previamente serializado para la
     * copia de seguridad por lo que inserta los cursos que ya estaban en la
     * base de datos y de este modo su id no cambia
     *
     * @param idCurso
     * @param nombre
     * @param descripcion
     * @param creditos
     */
    public void insertarCursoComp(int idCurso, String nombre, String descripcion, int creditos) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("insert into cursos (id_curso,nombre,creditos,descripcion) values (" + idCurso + ",'" + nombre + "'," + creditos + ",'" + descripcion + "')");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }
    }

    /**
     * Metodo que permite insertar una matricula o inscripcion en la tabla
     * correspondiente de la base de datos, recibe los atributos propios de una
     * matricula y los guarda
     *
     * @param idAlumno
     * @param idCurso
     */
    public void insertarMatricula(int idAlumno, int idCurso) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("insert into inscripciones (id_alumno, id_curso) values (" + idAlumno + "," + idCurso + ")");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }
    }

    /**
     * Metodo relacionado con la serializacion. A diferencia del metodo
     * insertarMatriculaeste aniade el atributo id previamente serializado para
     * la copia de seguridad por lo que inserta las matriculas que ya estaban en
     * la base de datos y de este modo sus atributos no cambian
     *
     * @param idInscrip
     * @param idAlumno
     * @param idCurso
     * @param fechaMat
     * @param fechaCalif
     * @param calificacion
     */
    public void insertarMatComp(int idInscrip, int idAlumno, int idCurso, String fechaMat, String fechaCalif, float calificacion) {
        Statement stmt;
        try {
            stmt = this.conn.createStatement();

            stmt.executeUpdate("insert into inscripciones (id_inscripcion, id_alumno, id_curso, fecha_matriculacion, fecha_calificacion, calificacion) values (" + idInscrip + "," + idAlumno + "," + idCurso + ",'" + fechaMat + "'," + fechaCalif + "," + calificacion + ");");
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
          //ex.printStackTrace();
        }
    }

    /**
     * Metodo para realizar consultas sql en la base de datos. Recibe por
     * parametros lo que se va a seleccionar, de que tabla se va a seleccionar,
     * la columna de la misma y el valor del atributo buscado, ejecuta la
     * consulta y recibe el resultado
     *
     * @param seleccion
     * @param tabla
     * @param columna
     * @param nombre
     * @return
     */
    public ResultSet consulta(String seleccion, String tabla, String columna, String nombre) {
        Statement stmt;
        ResultSet consulta = null;
        String sql = "select " + seleccion + " from " + tabla + " where " + columna + "='" + nombre + "';";
        try {
            stmt = this.conn.createStatement();
            consulta = stmt.executeQuery(sql);
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
            return consulta;
        }
        return consulta;
    }

    /**
     * Metodo para ejecutar consultas libres en la base de datos. Recibe la
     * consulta, la ejecuta y devuelve el resultado
     *
     * @param sql
     * @return
     */
    public ResultSet consulta(String sql) {
        Statement stmt;
        ResultSet consulta = null;

        try {
            stmt = this.conn.createStatement();
            consulta = stmt.executeQuery(sql);
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
          // ex.printStackTrace();
            return consulta;
        }
        return consulta;
    }

    /**
     * Metodo para para consultar en la base de datos todos los valores de todas
     * las tablas y devuelve el resultado
     *
     * @return
     */
    public ResultSet mostrarTodo() {
        Statement stmt;
        ResultSet consulta = null;
        String sql = "SELECT a.*,c.*, i.* from alumnos a, cursos c, inscripciones i where a.id_alumno = i.id_alumno and i.id_curso = c.id_curso;";
        try {
            stmt = this.conn.createStatement();
            consulta = stmt.executeQuery(sql);
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
            return consulta;
        }
        return consulta;
    }

    /**
     * Metodo para poder borrar cualquier fila de cualquier tabla, especificando
     * la tabla, el tipo de id y su valor
     *
     * @param tabla
     * @param textId
     * @param id
     */
    public void borrar(String tabla, String textId, int id) {
        Statement stmt;

        String sql = "DELETE FROM " + tabla + " where " + textId + " = " + id + ";";
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate(sql);
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();

        }
    }

    /**
     * Metodo para modificar cualquier valor de la base de datos, especificando
     * la tabla, la columna, el campo nuevo, el tipo de id y su valor
     *
     * @param tabla
     * @param columna
     * @param campo
     * @param textId
     * @param id
     */
    public void modificar(String tabla, String columna, String campo, String textId, int id) {
        Statement stmt;

        String sql = "UPDATE " + tabla + " SET " + columna + " = " + campo + " WHERE " + textId + " = " + id + ";";
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate(sql);
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();

        }

    }

    /**
     *Metodo que elimina todas las filas de la tabla que le pasamos
     * @param tabla
     */
    public void borrarTabla(String tabla) {
        Statement stmt;

        String sql = "delete from " + tabla;
        try {
            stmt = this.conn.createStatement();
            stmt.executeUpdate(sql);
            this.conn.commit();
            stmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();

        }

    }
}
