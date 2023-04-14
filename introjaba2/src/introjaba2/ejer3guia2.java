/*Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
Nota: investigar la función t() oUpperCase() y toLowerCase() en Java
 *  
 *  
 */
package introjaba2;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer3guia2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
                
                
        
        
    }
}
