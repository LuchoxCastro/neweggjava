/*
*Crear un programa que pida una frase y si esa frase es igual a
*“eureka” el programa pondrá un mensaje de Correcto, sino mostrará 
*un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer2guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese la clave");
         String clave = leer.nextLine() ; 
         
         if(clave.equalsIgnoreCase("eureka")){
             System.out.println("la clave es correcta");
             
         }else{ 
             System.out.println("la clave es incorrecta");
         }
    }
    
}
