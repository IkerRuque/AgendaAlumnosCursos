/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaAlumnosCursos;

/**
 *
 * @author Iker Ruiz
 */
public class Verificaciones {
    
     /**
      * metodo que verifica si la cadena que recibe tiene exactamente 9 caracteres.
      * @param cadena
      * @throws MisExceptions 
      */
    public void nuveCaracteres(String cadena) throws MisExceptions{ 
        cadena = cadena.trim() ; // Eliminamos espacios de los laterales
        if (cadena.length() != 9) {
            throw new MisExceptions ("Deberia de tener 9 caracteres");
        }  
    }
    
   /**
    *  Metodo ver si la cadena que recibe contiene alguna coma
    * @param cadena
    * @throws MisExceptions 
    */
    public void tieneComa(String cadena) throws MisExceptions{
        cadena = cadena.trim();
        if(cadena.contains(",")){
            throw new MisExceptions("Has introducido comas. Por favor no introduzcas comas ");
        }
    }
    
    /**
     * verifica si se ha introducido numeros y no se ha colado ninguna letra
     * @param num
     * @throws MisExceptions 
     */
     public void soloNum(String num) throws MisExceptions {       
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {                
                throw new MisExceptions ("Ha introducido caracteres que nos son numeros");
            }                
        }        
    }   
    
     /**
      * Metodo que verifica si la variable que recibe contiene al menos un caracter
      * @param cadena
      * @throws MisExceptions
      */
     public void  hayAlgo (String cadena) throws MisExceptions{
         if(cadena.length()==0){        
             throw new MisExceptions ("Campo vacio");
         }
         
     }
     
     /**
      * Metodo que captura un fallo para saber si se puede pasar de String a float y si se puede lo devuelve en float
      * @param num
      * @return float
      * @throws MisExceptions
      */
     public float esFloat (String num) throws MisExceptions{
         float numNuevo ;
         try {
             numNuevo = Float.parseFloat(num);
             return numNuevo;
         }catch (NumberFormatException e){
             throw new MisExceptions ("Lo que  ha introducido no es una calificacion");
         }
     }

}
