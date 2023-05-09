/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArregloServicio;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Hogar
 */
public class ArregloService {
    
public static void inicializarA (double[]arreglo){
    Random random = new Random ();
    for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] = random.nextDouble();
        
    }
}
public static void mostrar (double[]arreglo){
    for (double elemento : arreglo) {
        System.out.println(elemento);
    }
    System.out.println();
}
public static void ordenar (double[]arreglo){
    Arrays.sort(arreglo);
    for (int i = 0; i < arreglo.length /2; i++) {
        double temp = arreglo[i];
        arreglo[i]=arreglo[arreglo.length -1 - i];
        arreglo[arreglo.length -1 -i]= temp;
    }
}
public static void inicializarB (double[]arregloA, double[]arregloB){
    for (int i = 0; i < 10; i++) {
        arregloB[i] = arregloA[i];
    }
    for (int i = 0; i < arregloB.length; i++) {
        arregloB[i]=0.5;
    }
}

}