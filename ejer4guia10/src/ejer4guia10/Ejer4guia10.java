/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4guia10;

import CineServicio.CineService;
import entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejer4guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        CineService cine = new CineService();

        boolean crearOtraPelicula = true;
        while (crearOtraPelicula) {
            System.out.print("Ingrese el título de la película: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el director de la película: ");
            String director = scanner.nextLine();

            System.out.print("Ingrese la duración de la película en horas: ");
            double duracion = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            cine.agregarPelicula(pelicula);

            System.out.print("¿Desea crear otra película? (s/n): ");
            String opcion = scanner.nextLine();
            crearOtraPelicula = opcion.equalsIgnoreCase("s");
        }

        System.out.println();

        cine.mostrarPeliculas();
        cine.mostrarPeliculasDuracionMayorAUnaHora();
        cine.ordenarPeliculasPorDuracionDescendente();
        cine.ordenarPeliculasPorDuracionAscendente();
        cine.ordenarPeliculasPorTitulo();
        cine.ordenarPeliculasPorDirector();    }
    
}
