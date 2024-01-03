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
public class Curso implements Serializable{
     /**
     * Declaracion de las variables propias de la clase Alumno
     */
    private int idCurso;
    private String nombre;
    private String descripcion;
    private int creditos;

    /**
     * Declaracion del constructor de la clase que recibira los artributos previos
     * @param idCurso
     * @param nombre
     * @param descripcion
     * @param creditos 
     */
    public Curso(int idCurso, String nombre, String descripcion, int creditos) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
    }

    /**
     * Declaramos los seter y los geter proviod de los atributos
     * @return 
     */
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * Declaramos el metodo toString de la clase que devolvera la cadena de atributos de la misma
     * @return 
     */
    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", descripcion=" + descripcion + ", creditos=" + creditos + '}';
    }
    
}
