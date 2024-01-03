/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaAlumnosCursos;

import java.io.Serializable;

/**
 *
 * @author Iker Ruiz
 */
public class Alumno implements Serializable {

    /**
     * Declaramos las variables propias de la clase Alumno
     */
    private int idAlumno;
    private String nombre;
    private String apellido;
    private String telefono;
    private String eMail;

    /**
     * Declaramos el constructor de la clase que recibira los atributos previos
     *
     * @param idAlumno
     * @param nombre
     * @param apellido
     * @param telefono
     * @param eMail
     */
    public Alumno(int idAlumno, String nombre, String apellido, String telefono, String eMail) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.eMail = eMail;
    }

    /**
     * Declaramos los seter y los geter provios de los atributos
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * Declaramos el metodo toString de la clase que devolvera la cadena de
     * atributos de la misma
     */
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", eMail=" + eMail + '}';
    }

}
