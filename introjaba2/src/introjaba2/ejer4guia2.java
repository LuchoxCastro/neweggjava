/*
 * Dada una cantidad de grados centígrados se debe mostrar
 *su equivalente en grados Fahrenheit. La fórmula 
 *correspondiente es: F = 32 + (9 * C / 5)..
 */
package introjaba2;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer4guia2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la tempreratura en grados centigrados ");
        int C = leer.nextInt();
        int F = 32 + (9 * C / 5);
        System.out.println( F+ " °F es equivalente a " +C+ " °C " );
            
        
    }
   
           
    
}
