/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa 
mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerprac2guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el numero que desea buscar");
        int j = 0;
        int buscador = leer.nextInt();

        int[] vector = new int[20];
        System.out.println("");
        for (int i = 0; i <= 19; i++) {
            vector[i] = (int)(Math.random() * 10+1);
            System.out.println(vector[i]);
            if (buscador == vector[i]) {
                j++;
                System.out.println("numerom encontrado en posicion " + i);
            }

        }
        if (j > 1) {
            System.out.println("se repite");
        } else if (j == 0) {
            System.out.println("no se encuentra");
            
        } else { 
            System.out.println("se encontro una sola vez");
    }
    }

}
