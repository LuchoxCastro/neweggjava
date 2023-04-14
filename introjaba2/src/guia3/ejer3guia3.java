/*
*Realizar un programa que solo permita introducir 
solo frases o palabras de 8 de largo. Si el usuario 
ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer3guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("ingrese una frase de 8 letras");
         String frase = leer.nextLine() ; 
         
         if(frase.length()!=8){
             System.out.println("la frase es incorrecta");
             
         }else{ 
             System.out.println("la frase es correcta");
    }
    
    }
}