/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjava;

import EstudiantesEntidades.Estudiantes;
import EstudiantesService.EstudianteService;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class IntegradorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        EstudianteService escuelaService = new EstudianteService();
        Estudiantes[] estudiantes = escuelaService.crearEstudiantes(cantidadEstudiantes);

        double promedio = escuelaService.calcularPromedio(estudiantes);
        System.out.println("El promedio de notas del curso es: " + promedio);

        Estudiantes[] estudiantesArribaPromedio = escuelaService.obtenerEstudiantesArribaPromedio(estudiantes, promedio);
        System.out.println("Los estudiantes con una nota mayor al promedio son:");
        for (Estudiantes estudiante : estudiantesArribaPromedio) {
            System.out.println(estudiante);
        }
    }
}
    

        
 
    
    

