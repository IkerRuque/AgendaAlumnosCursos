/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaAlumnosCursos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author Iker Ruiz
 */
public class Ficheros {

    /**
     * Metodo que lee el fichero de texto relacionado con los usuarios y sus
     * contrasenias de la base de datos. Recibe los datos introducidos para
     * usuario y contrasenia y comprueba que existan en el fichero solicitado Se
     * devuelve un true o un false segun coincida o no la vinculacion entre
     * ambos
     *
     * @param fichero
     * @param usuario
     * @param contrasena
     * @return
     */
    public boolean usuarioCont(String fichero, String usuario, String contrasena) {

        FileReader reader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        HashMap<String, String> parametros = new HashMap<String, String>();
        try {
            reader = new FileReader(fichero);
            bufferedReader = new BufferedReader(reader);
            int cont = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("num linea " + cont + " " + line);
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
            if (parametros.get("pass1").equals(contrasena) && parametros.get("usuario1").equals(usuario)) {
                return true;
            } else if (parametros.get("pass2").equals(contrasena) && parametros.get("usuario2").equals(usuario)) {
                return true;
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

        return false;
    }

    /**
     * Metodo que permite aniadir texto a un fichero de texto. Recibe tanto el
     * nombre del fichero como lo que se quiere guardar
     *
     * @param texto
     * @param fichero
     */
    public void escribir(String texto, String fichero) {
        //extraido de https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter pw = null;
        try {
            //writer = new FileWriter(fichero);
            writer = new FileWriter(fichero);//Para añadir sin borrar lo anterior
            bufferedWriter = new BufferedWriter(writer);
            pw = new PrintWriter(bufferedWriter);

            //bufferedWriter.write(texto);
            //bufferedWriter.newLine(); 
            pw.write(texto);
            pw.write("\n");

        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bufferedWriter.close();
                writer.close();
            } catch (IOException ex) {
//                ex.printStackTrace();
            }
        }
    }

}
