/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaAlumnosCursos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Iker Ruiz
 */
public class GestionInscripciones {

    /**
     * Declaracion de los atributos prpios de la clase
     */
    private BaseDatos bd;
    private String ficheroSer = "ficheroInscrip.ser";
    private Verificaciones verif = new Verificaciones();

    /**
     * Constructor de la clase que recibe el atriuburo tipo basedatos
     *
     * @param bd
     */
    public GestionInscripciones(BaseDatos bd) {
        this.bd = bd;
    }

    /**
     * Metodo que busca por parametros recibidos a un alumno y un curso de la
     * base de datos y los vincula guardandolos en la tabla de inscripciones
     *
     * @param telAlumno
     * @param nomCurso
     * @throws MisExceptions
     */
    public void MatricularAlumnos(String telAlumno, String nomCurso) throws MisExceptions {
        String conAlu = "select * from alumnos where telefono = '" + telAlumno + "'";
        String conCur = "select * from cursos where nombre = '" + nomCurso + "'";
        ResultSet rsAlu = bd.consulta(conAlu);
        ResultSet rsCur = bd.consulta(conCur);
        ResultSet rsIns = null;
        try {
            if (rsAlu.next() && rsCur.next()) {
                String conInsc = "select * from inscripciones where id_alumno = " + rsAlu.getInt("id_alumno") + " and id_curso = " + rsCur.getInt("id_Curso");
                rsIns = bd.consulta(conInsc);
            }
            rsAlu.beforeFirst();
            rsCur.beforeFirst();
            if (rsAlu.next() && rsCur.next() && rsIns.next()) {
                throw new MisExceptions("El alumno ya esta en ese curso");
            }
            rsAlu.beforeFirst();
            rsCur.beforeFirst();
            if (rsAlu.next() && rsCur.next()) {
                bd.insertarMatricula(rsAlu.getInt("id_alumno"), rsCur.getInt("id_curso"));
            } else {
                throw new MisExceptions("El curso o el alumno que ha introducido no es correcto");
            }
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }

    }

    /**
     * Metodo que busca a un alumno y un curso que esten relacionados en la
     * tabla de inscripciones de la base de datos y aniade un valor, previamente
     * recibido, al atributo calificaciones
     *
     * @param telAlumno
     * @param nomCurso
     * @param calificacion
     * @throws MisExceptions
     */
    public void CalificarAlumno(String telAlumno, String nomCurso, Float calificacion) throws MisExceptions {
        String conAlu = "select * from alumnos where telefono = '" + telAlumno + "'";
        String conCur = "select * from cursos where nombre = '" + nomCurso + "'";

        ResultSet rsAlu = bd.consulta(conAlu);
        ResultSet rsCur = bd.consulta(conCur);

        if (rsAlu != null && rsCur != null) {

            try {
                rsAlu.first();
                rsCur.first();
                String conInsc = "select * from inscripciones where id_alumno = " + rsAlu.getInt("id_alumno") + " and id_curso = " + rsCur.getInt("id_Curso");
                ResultSet rsIns = bd.consulta(conInsc);
                rsAlu.beforeFirst();
                rsCur.beforeFirst();
                if (rsAlu.next() && rsCur.next() && rsIns.next()) {
                    if (rsIns.getString("calificacion") == null) {

                        bd.consulta("update inscripciones set calificacion = " + calificacion + "where id_curso = " + rsCur.getInt("id_curso") + " and id_alumno = " + rsAlu.getInt("id_alumno"));
                    } else {
                        throw new MisExceptions("Alumno ya calificado");
                    }
                }
            } catch (SQLException ex) {
//                ex.printStackTrace();
            }
        } else {
            throw new MisExceptions("El curso o el alumno que ha introducido no existen");
        }
    }

    /**
     * Metodo que busca un alumno y un curso en la tabla de inscripciones de la
     * base de datos para borrar su vinculacion de la misma
     *
     * @param telAlumno
     * @param nomCurso
     * @throws MisExceptions
     */
    public void Desmatricular(String telAlumno, String nomCurso) throws MisExceptions {
        String conAlu = "select * from alumnos where telefono = '" + telAlumno + "'";
        String conCur = "select * from cursos where nombre = '" + nomCurso + "'";
        ResultSet rsAlu = bd.consulta(conAlu);
        ResultSet rsCur = bd.consulta(conCur);
        if (rsAlu != null && rsCur != null) {
            try {
                if (rsAlu.next() && rsCur.next()) {
                    bd.consulta("delete from inscripciones where id_alumno = " + rsAlu.getInt("id_alumno") + " and id_curso = " + rsCur.getInt("id_curso"));
                }
            } catch (SQLException ex) {
//                ex.printStackTrace();
            }
        } else {
            throw new MisExceptions("El curso o el alumno que ha introducido no existen");
        }
    }

    /**
     * Metodo que devuelve una consulta de la base de datos para mostrar todos
     * los cursos vinculados a un alumno en la tabla inscripciones de la base de
     * datos
     *
     * @param telAlumno
     * @return
     */
    public ResultSet mostrarCursosAlu(String telAlumno) throws MisExceptions {
        ResultSet rs = bd.consulta("select * from cursos c, alumnos a, inscripciones i where c.id_curso = i.id_curso and i.id_alumno = a.id_alumno and a.telefono = '" + telAlumno + "'");
        try{
            if(rs.next()){
                rs.beforeFirst();
            }else
                throw new MisExceptions ("Alumno no encontrado");
        }catch(SQLException ex){
//            ex.printStackTrace();
        }
        return rs;
    }

    /**
     * Metodo que devuelve una consulta de la base de datos para mostrar todos
     * los alumnos vinculados a un curso en la tabla inscripciones de la base de
     * datos
     *
     * @param nombre
     * @return
     */
    public ResultSet mostrarAlumnosCurso(String nombre) throws MisExceptions {
        ResultSet rs = bd.consulta("select * from cursos c, alumnos a, inscripciones i where c.id_curso = i.id_curso and i.id_alumno = a.id_alumno and c.nombre = '" + nombre + "'");
         try{
            if(rs.next()){
                rs.beforeFirst();
            }else
                throw new MisExceptions ("Alumno no encontrado");
        }catch(SQLException ex){
//            ex.printStackTrace();
        }
        return rs;
    }

    /**
     * Metodo que guarda una copia serializada a modo de arrayList que contiene
     * las inscripciones existentes en la base de datos
     */
    public void guardarInscripciones() {
        String sql = "select * from inscripciones";
        ResultSet rs = bd.consulta(sql);
        ArrayList<Inscripcion> listadoInscrip = new ArrayList();
        FicheroSerializable fs = new FicheroSerializable();
        try {
            while (rs.next()) {
                int idInscrip = rs.getInt("id_inscripcion");
                int idAlu = rs.getInt("id_alumno");
                int idCurso = rs.getInt("id_curso");
                String fechaMat = rs.getString("fecha_matriculacion");
                String fechaCalif = rs.getString("fecha_calificacion");
                String calificacionCadena = rs.getString("calificacion");
                float calificacion = -1;
                try {
                    calificacion = Float.parseFloat(rs.getString("calificacion"));

                } catch (Exception e) {
   //                 e.printStackTrace();
                    
                    calificacion = -1;
                }
                
                Inscripcion ins = new Inscripcion(idInscrip, idAlu, idCurso, fechaMat, fechaCalif, calificacion);
                listadoInscrip.add(ins);
            }
            fs.guardar(listadoInscrip, ficheroSer);
        } catch (SQLException ex) {
//            ex.printStackTrace();

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    /**
     * Metodo que sirve para leer el fichero serializado que guarda las
     * inscripciones de la base de datos y las vuelve a insertar en ella
     *
     * @throws MisExceptions
     */
    public void cargarInscripciones() throws MisExceptions {
        FicheroSerializable fs = new FicheroSerializable();
        ArrayList<Inscripcion> listadoInscri = new ArrayList();
        listadoInscri = fs.leer(ficheroSer);
        for (Inscripcion ins : listadoInscri) {
            //System.out.println(ins);
        }
        for (Inscripcion ins : listadoInscri) {
            int idInscrip = ins.getIdInscripcion();
            int idAlumno = ins.getIdAlumno();
            int idCurso = ins.getIdCurso();
            String fechaMat = ins.getFechaMat();
            String fechaCalif = ins.getFechaCalif();
            float calificacion = ins.getCalificacion();
            if (fechaCalif == null) {
                calificacion = -1;
                  
                bd.insertarMatComp(idInscrip, idAlumno, idCurso, fechaMat, fechaCalif, calificacion);
            } else {
                 
                bd.insertarMatComp(idInscrip, idAlumno, idCurso, fechaMat, "'" + fechaCalif + "'", calificacion);
            }

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
