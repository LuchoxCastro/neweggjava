/*
 * Escriba un programa que pida una frase o palabra y valide si la primera 
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.nthe editor .
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer4guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese una frase");
         String frase = leer.nextLine() ; 
         
         if(frase.Substrings(0,1).equalsIgnoreCase("String")){
             System.out.println("la frase es incorrecta");
             
         }else{ 
             System.out.println("la frase es correcta");
    }
    
    }
}
    
    

