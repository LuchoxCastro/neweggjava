/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3guia9;

import ArregloServicio.ArregloService;

/**
 *
 * @author Hogar
 */
public class Ejer3guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ArregloService.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        ArregloService.mostrar(arregloA);

        ArregloService.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor: ");
        ArregloService.mostrar(arregloA);

        ArregloService.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo B:");
        ArregloService.mostrar(arregloB);

    }

}
