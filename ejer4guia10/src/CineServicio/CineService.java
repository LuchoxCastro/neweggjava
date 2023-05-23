/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineServicio;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class CineService {
    private List<Pelicula> peliculas;
    Scanner leer = new Scanner(System.in);
    public CineService() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void mostrarPeliculas() {
        System.out.println("Lista de películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void mostrarPeliculasDuracionMayorAUnaHora() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
        System.out.println();
    }

    public void ordenarPeliculasPorDuracionDescendente() {
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void ordenarPeliculasPorDuracionAscendente() {
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
        System.out.println("Películas ordenadas por título:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
        System.out.println("Películas ordenadas por director:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }
}

