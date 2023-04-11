/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerextra2n2guia5 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector1 = new int[N];
        int[] vector2 = new int[N];
        int suma = 0;
        int cont = 0;
        System.out.println("Llenado del vector");
        for (int i = 0; i < N; i++) {
            vector1[i] = (int) (Math.random() * 2 + 1);
            vector2[i] = (int) (Math.random() * 2 + 1);
        }
        System.out.println("Vector 1");
        mostrar(vector1,N);
        System.out.println("Vector 2");
        mostrar(vector2,N);
        System.out.println("Comparacion:");
        
        for (int i = 0; i < N; i++) {
            if (vector2[i] != vector1[i]) {
                cont = 1;
                break;  
            }
        }
        if (cont == 1) {
            System.out.println("Los vectores no son iguales");
        }else{
                System.out.println("Los vectores son iguales");}

    }
    public static void mostrar(int vector[], int N){
        for (int i = 0; i < N; i++) {
            System.out.print("Vector["+i+ "] "+vector[i]);
            System.out.print(" ; ");
        }
        System.out.println("");
        }
    
}
