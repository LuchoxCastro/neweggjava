/*
 * Escriba un programa que averigüe si dos vectores de N enteros 
 *son iguales (la comparación deberá detenerse en cuanto
 *se detecte alguna diferencia entre los elementos).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerextra2guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int num = leer.nextInt();
        int[] vector1 = new int[num];
        int[] vector2 = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese los valores del vector 1 en la posicion" + i);

            vector1[i] = leer.nextInt();
            System.out.println("ingrese los valores del vector 2 en la posicion" + i);
            vector2[i] = leer.nextInt();

        }
        for (int j = 0; j < num; j++) {
            if (vector1[j] == vector2[j]) {
                System.out.println("los vectores son iguales");
            
        }else
        System.out.println("los vectores no son iguales");
        break;
    }

           for (int i = 0; i < num; i++) {
            System.out.println(vector1[i]);
            System.out.println(vector2[i]);
        }
    }
    }

   


/*
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



*/
