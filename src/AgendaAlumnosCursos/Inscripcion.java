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
public class Inscripcion implements Serializable{
    
    /**
     * Declaracion de los atributos prpios de la clase
     */
    private int idInscripcion;
    private int idCurso;
    private int idAlumno;
    private String fechaMat;
    private String fechaCalif;
    private float calificacion;

     /**
      * Constructor de la clase que recibe los atributos previos
      * @param idInscripcion
      * @param idCurso
      * @param idAlumno
      * @param fechaMat
      * @param fechaCalif
      * @param calificacion 
      */
    public Inscripcion(int idInscripcion, int idAlumno, int idCurso, String fechaMat, String fechaCalif, float calificacion) {
        this.idInscripcion = idInscripcion;
        this.idCurso = idCurso;
        this.idAlumno = idAlumno;
        this.fechaMat = fechaMat;
        this.fechaCalif = fechaCalif;
        this.calificacion = calificacion;
    }

    /**
     * Declaracion de geters y seters 
     */
    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getFechaMat() {
        return fechaMat;
    }

    public void setFechaMat(String fechaMat) {
        this.fechaMat = fechaMat;
    }

    public String getFechaCalif() {
        return fechaCalif;
    }

    public void setFechaCalif(String fechaCalif) {
        this.fechaCalif = fechaCalif;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Declaracion del toString de la clase que devuelve en forma de cadena los atributos de la misma
     * @return 
     */
    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", idCurso=" + idCurso + ", idAlumno=" + idAlumno + ", fechaMat=" + fechaMat + ", fechaCalif=" + fechaCalif + ", calificacion=" + calificacion + '}';
    }

   
    
    
    
}
