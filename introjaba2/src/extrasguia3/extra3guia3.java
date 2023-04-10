/*
 Elaborar un algoritmo en el cuál se ingrese una letra 
y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje.
Nota: investigar la función equals() de la clase String.
 */
package extrasguia3;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class extra3guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
         System.out.println("ingrese una letra");
         String letra = leer.nextLine() ;  
    letra=letra.toUpperCase();
    
    switch (letra){
        case "A" :
        case "E" :
        case "I" :
        case "O" :
        case "U" :
        
            System.out.println("la letra ingresada es una vocal ");
            break;
        default :
            System.out.println("la letra no es vocal");
            
            
    }
    
            
    
    }
    
}
