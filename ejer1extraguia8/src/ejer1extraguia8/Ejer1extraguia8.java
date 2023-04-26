/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1extraguia8;

import RaicesServicio.RaicesService;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejer1extraguia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Ingrese los coeficientes de la ecuación de segundo grado: ");
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.print("c = ");
        c = sc.nextDouble();

        RaicesService servicio = new RaicesService(a, b, c);

        double discriminante = servicio.getDiscriminante();
        boolean tieneRaices = servicio.tieneRaices();
        boolean tieneRaiz = servicio.tieneRaiz();

        if (tieneRaices) {
            System.out.println("La ecuación tiene dos raíces: ");
            servicio.obtenerRaices();
        } else if (tieneRaiz) {
            System.out.println("La ecuación tiene una única raíz: ");
            servicio.obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene solución.");
        }
    }
}
