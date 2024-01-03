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
public class GestionAlumnos {

    /**
     * Declaracion de los atributos prpios de la clase
     */
    private BaseDatos bd;
    private String ficheroSer = "FicheroAlumno.ser";

    /**
     * Constructor de la clase que recibe el atriuburo tipo basedatos
     *
     * @param bd
     */
    public GestionAlumnos(BaseDatos bd) {
        this.bd = bd;
    }

    /**
     * Metodo que por medio de la clase basedatos, permite insertar un alumno a
     * la misma
     *
     * @param nombre
     * @param apellido
     * @param telefono
     * @param direccion
     */
    public void alta(String nombre, String apellido, String telefono, String direccion) {
        bd.insertarAlumno(nombre, apellido, direccion, telefono);
    }

    /**
     * Metodo que por medio de la clase basedatos, permite borrar un alumno de
     * la misma
     *
     * @param telefono
     */
    public void baja(String telefono) {
        bd.borrarAlumno(telefono);
    }

    /**
     * Metodo que por medio de la clase basedatos, permite modificar cualquier
     * atributo de un alumno
     *
     * @param nombre
     * @param apellido
     * @param telefono
     * @param direccion
     * @param id
     */
    public void modificar(String nombre, String apellido, String telefono, String direccion, int id) {
        bd.modificar("alumnos", "nombre", "'" + nombre + "'", "id_alumno", id);
        bd.modificar("alumnos", "apellido", "'" + apellido + "'", "id_alumno", id);
        bd.modificar("alumnos", "telefono", "'" + telefono + "'", "id_alumno", id);
        bd.modificar("alumnos", "correo_electronico", "'" + direccion + "'", "id_alumno", id);
    }

    /**
     * Metodo que devuelve el resultado de una consulta en la base de datos.
     * Busca tanto por telefono como por nombre
     *
     * @param nombre
     * @param telefono
     * @return
     * @throws MisExceptions
     */
    public ResultSet buscar(String nombre, String telefono) throws MisExceptions {
        ResultSet resultado = null;
        if (nombre.equals("")) {
            try {

                resultado = bd.consulta("*", "alumnos", "telefono", telefono);

                if (resultado.first()) {
                    resultado.beforeFirst();

                } else {
                    throw new MisExceptions("No se ha encontrado ningun Alumno con ese telefono");
                }
                return resultado;
            } catch (SQLException ex) {
//                ex.printStackTrace();
            }

        } else {
            try {

                resultado = bd.consulta("*", "alumnos", "nombre", nombre);

                if (resultado.first()) {
                    resultado.beforeFirst();

                } else {
                    throw new MisExceptions("No se ha encontrado ningun Alumno con ese nombre");
                }
                return resultado;
            } catch (SQLException ex) {
//                ex.printStackTrace();
            }
        }
        return resultado;
    }

    /**
     * Metodo que por medio de una consulta sql en la base de datos consigue y
     * devuelve un listado que contiene el valor de los atributos de cada alumno
     */
    public ArrayList<String> mostrarTodo() {
        ResultSet rs = bd.mostrarTodo();
        ResultSet rs2 = bd.consulta("select * from alumnos where id_alumno NOT IN(select id_alumno from inscripciones)");
        ArrayList<String> listado = new ArrayList();
        try {
            while (rs.next()) {
                listado.add(rs.getString("alumnos.nombre") + ", " + rs.getString("alumnos.apellido") + ", " + rs.getString("cursos.nombre") + ", " + rs.getString("inscripciones.calificacion"));
            }
            while (rs2.next()) {
                listado.add(rs2.getString("alumnos.nombre") + ", " + rs2.getString("alumnos.apellido"));
            }
        } catch (SQLException ex) {
//            ex.printStackTrace();
        }

        return listado;
    }

    /**
     * Metodo que guarda una copia serializada a modo de arrayList que contiene
     * a los alumnos existentes en la base de datos
     */
    public void guardarAlumnos() {
        String sql = "select * from alumnos";
        ResultSet rs = bd.consulta(sql);
        ArrayList<Alumno> listadoAlumnos = new ArrayList();
        FicheroSerializable fs = new FicheroSerializable();
        try {
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");
                String eMail = rs.getString("correo_electronico");
                int id = rs.getInt("id_alumno");
                Alumno al = new Alumno(id, nombre, apellido, telefono, eMail);
                listadoAlumnos.add(al);
            }
            fs.guardar(listadoAlumnos, ficheroSer);
        } catch (SQLException ex) {
//            ex.printStackTrace();

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    /**
     * Metodo que sirve para leer el fichero serializado que guarda los alumnos
     * de la base de datos y los vuelve a insertar en ella
     *
     * @throws MisExceptions
     */
    public void cargarAlumnos() throws MisExceptions {
        FicheroSerializable fs = new FicheroSerializable();
        ArrayList<Alumno> listadoAlumnos = new ArrayList();
        listadoAlumnos = fs.leer(ficheroSer);
        for (Alumno al : listadoAlumnos) {
            int idAlu = al.getIdAlumno();
            String nombre = al.getNombre();
            String apellido = al.getApellido();
            String telefono = al.getTelefono();
            String eMail = al.geteMail();
            bd.insertarAlumnoComp(idAlu, nombre, apellido, eMail, telefono);

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
