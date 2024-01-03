/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaAlumnosCursos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Iker Ruiz
 */
public class FicheroSerializable<E> { //clase generica

    /**
     * Metodo que permite guardar de forma serializada cualquier array que
     * reciba. Crea un fichero de tipo serializable por medio del atributo
     * String que recibe y es ahi donde lo guarda.
     *
     * @param coleccion
     * @param fichero
     */
    public void guardar(ArrayList<E> coleccion, String fichero) {
        FileOutputStream fileOut = null;
        BufferedOutputStream bufOut = null;
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream(fichero);
            bufOut = new BufferedOutputStream(fileOut);
            out = new ObjectOutputStream(bufOut);
            out.writeObject(coleccion);
        } catch (IOException ex) {
//            ex.printStackTrace();
        } finally {
            try {
                out.close();
                bufOut.close();
                fileOut.close();
            } catch (Exception ex) {
              //ex.printStackTrace();
            }
        }
    }

    /**
     * Metodo que permite devolver un arraylist de los objetos guardados en los
     * ficheros serializados a partir del nombre del fichero que recibe.
     *
     * @param fichero
     * @return
     */
    public ArrayList<E> leer(String fichero) throws MisExceptions {
        FileInputStream fileIn = null;
        BufferedInputStream bufIn = null;
        ObjectInputStream in = null;
        ArrayList<E> partidas = null;
        try {
            fileIn = new FileInputStream(fichero);
            bufIn = new BufferedInputStream(fileIn);
            in = new ObjectInputStream(bufIn);
            partidas = (ArrayList) in.readObject();
        } catch (Exception ex) {
//            ex.printStackTrace();
            throw new MisExceptions ("No hay copia de seguridad hecha");
        } finally {
            try {
                in.close();
                bufIn.close();
                fileIn.close();
            } catch (Exception ex) {
                //ex.printStackTrace();
            }
        }
        return partidas;
    }

}
