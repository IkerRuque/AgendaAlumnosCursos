/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaAlumnosCursos;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Iker Ruiz
 */
public class GestionCursos {

    /**
     * Declaracion de los atributos prpios de la clase
     */
    private BaseDatos bd;
    private String ficheroSer = "FicheroCurso.ser";

    /**
     * Constructor de la clase que recibe el atriuburo tipo basedatos
     *
     * @param bd
     */
    public GestionCursos(BaseDatos bd) {
        this.bd = bd;
    }

    /**
     * Metodo que por medio de la clase basedatos, permite insertar un curso a
     * la misma
     *
     * @param nombre
     * @param descripcion
     * @param creditos
     */
    public void alta(String nombre, String descripcion, int creditos) {
        bd.insertarCurso(nombre, descripcion, creditos);
    }

    /**
     * Metodo que por medio de la clase basedatos, permite borrar un curso de la
     * misma
     *
     * @param nombre
     */
    public void baja(String nombre) {
        bd.borrarCurso(nombre);
    }

    /**
     * Metodo que por medio de la clase basedatos, permite modificar cualquier
     * atributo de un curso
     *
     * @param nombre
     * @return
     * @throws MisExceptions
     */
    public void modificar(String nombre, String descripcion, int creditos, int id) {
        String creditosString = String.valueOf(creditos);
        bd.modificar("cursos", "nombre", "'" + nombre + "'", "id_curso", id);
        bd.modificar("cursos", "descripcion", "'" + descripcion + "'", "id_curso", id);
        bd.modificar("cursos", "creditos", creditosString, "id_curso", id);

    }

    /**
     * Metodo que devuelve el resultado de una consulta en la base de datos.
     * Busca los cursos por su nombre
     *
     * @param nombre
     * @return
     * @throws MisExceptions
     */
    public ResultSet buscar(String nombre) throws MisExceptions {
        ResultSet resultado = null;

        try {

            resultado = bd.consulta("*", "cursos", "nombre", nombre);

            if (resultado.first()) {
                resultado.beforeFirst();

            } else {
                throw new MisExceptions("No se ha encontrado ningun curso con ese nombre");
            }
            return resultado;
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }

        return resultado;
    }

    /**
     * Metodo que por medio de una consulta sql en la base de datos consigue y
     * devuelve un listado que contiene el valor de los atributos de cada curso
     */
    public ArrayList<String> mostrarTodo() {
        ResultSet rs = bd.mostrarTodo();
        ResultSet rs2 = bd.consulta("select * from cursos where id_curso NOT IN(select id_curso from inscripciones)");
        ArrayList<String> listado = new ArrayList();
        try {
            while (rs.next()) {
                listado.add(rs.getString("cursos.nombre") + ",  " + rs.getString("alumnos.nombre") + ", " + rs.getString("inscripciones.calificacion"));
            }
            while (rs2.next()) {
                listado.add(rs2.getString("cursos.nombre"));
            }
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }

        return listado;
    }

    /**
     * Metodo que guarda una copia serializada a modo de arrayList que contiene
     * a los cursos existentes en la base de datos
     */
    public void guardarCursos() {
        String sql = "select * from cursos";
        ResultSet rs = bd.consulta(sql);
        ArrayList<Curso> listadoCursos = new ArrayList();
        FicheroSerializable fs = new FicheroSerializable();
        try {
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                int creditos = rs.getInt("creditos");

                int id = rs.getInt("id_curso");
                Curso cur = new Curso(id, nombre, descripcion, creditos);
                listadoCursos.add(cur);
            }
            fs.guardar(listadoCursos, ficheroSer);
        } catch (SQLException ex) {
//            ex.printStackTrace();

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    /**
     * Metodo que sirve para leer el fichero serializado que guarda los cursos
     * de la base de datos y los vuelve a insertar en ella
     *
     * @throws MisExceptions
     */
    public void cargarCursos() throws MisExceptions {
        FicheroSerializable fs = new FicheroSerializable();
        ArrayList<Curso> listadoCursos = new ArrayList();
        listadoCursos = fs.leer(ficheroSer);
        for (Curso cur : listadoCursos) {
            int idCurso = cur.getIdCurso();
            String nombre = cur.getNombre();
            String descripcion = cur.getDescripcion();
            int creditos = cur.getCreditos();

            bd.insertarCursoComp(idCurso, nombre, descripcion, creditos);

        }

    }

    /**
     * Metodo que lee el ficheroSer del programa y verifica que existe
     *
     * @throws MisExceptions
     */
    public void leer() throws MisExceptions {
        FicheroSerializable fs = new FicheroSerializable();
        fs.leer(ficheroSer);

    }
}
