/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3guia10;

import AlumnoServicio.AlumnoService;
import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejer3guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService servAl = new AlumnoService();
        servAl.ingresarAlumno(alumnos);
        servAl.notaFinal(alumnos);
    }   
}
    

