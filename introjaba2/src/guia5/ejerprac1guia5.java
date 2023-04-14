/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Hogar
 */
public class ejerprac1guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear un vector de tamaño 100
        int[] vector = new int[100];

        // Llenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }

        // Mostrar el vector en orden descendente
        System.out.println("Vector en orden descendente:");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i] + " ");
        }
        System.out.println();
    }
    
}
