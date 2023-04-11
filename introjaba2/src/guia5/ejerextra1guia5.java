/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de
un vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerextra1guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   System.out.println("ingrese el tamaño del vector");     
   int num = leer.nextInt();
   int suma ;
   suma = 0;
   int [] vector = new int [num];
    System.out.println("ingrese los valores del vector");
        for (int i = 0; i < num; i++) {
            vector[i] = leer.nextInt(); 
            suma = suma + vector [i];
            
        }
        System.out.println( suma );
    }
    
}
