/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2guia8;

import CafeteraService.CafeteraServicio;
import cafeteraentidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejer2guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cafe = new CafeteraServicio();
        Cafetera realcapmax = cafe.realcapmax();

        Scanner leer = new Scanner(System.in);

        System.out.println("bienvenido a la cafetera");

        cafe.llenarCafetera(realcapmax);
        cafe.servirTaza(500);

        cafe.agregarCafe(realcapmax);
        System.out.println("al fin termino, ya puede retirar su cafe");
        cafe.vaciarCafetera();
    }

}
