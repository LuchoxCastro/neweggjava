/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1poo;

import cancionentidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejercicioextra1poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el titulo de la cancion ");
        cancion1.setTitulo(leer.nextLine());
        System.out.println("ingrese el nombre del autor ");
        cancion1.setAutor(leer.nextLine());
        System.out.println(cancion1.toString());
    }

}
