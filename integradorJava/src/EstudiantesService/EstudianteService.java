/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudiantesService;

import EstudiantesEntidades.Estudiantes;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EstudianteService {
  public Estudiantes[] crearEstudiantes(int cantidad) {
        Estudiantes[] estudiantes = new Estudiantes[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ":");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner

            estudiantes[i] = new Estudiantes(nombre, nota);
        }

        return estudiantes;
    }

    public double calcularPromedio(Estudiantes[] estudiantes) {
        double suma = 0;
        for (Estudiantes estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        return suma / estudiantes.length;
    }

    public Estudiantes[] obtenerEstudiantesArribaPromedio(Estudiantes[] estudiantes, double promedio) {
        int count = 0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                count++;
            }
        }

        Estudiantes[] estudiantesArribaPromedio = new Estudiantes[count];
        int index = 0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                estudiantesArribaPromedio[index] = estudiante;
                index++;
            }
        }
        return estudiantesArribaPromedio;
    }
}
