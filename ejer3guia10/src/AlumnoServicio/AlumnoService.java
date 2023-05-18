/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnoServicio;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class AlumnoService {



    //ArrayList<Alumno> alumnos = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarAlumno(ArrayList<Alumno> alumnos) {
        boolean nuevo = true;

        System.out.println("Ingrese un alumno");
        String nombre = leer.next();
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota nº"+(i+1));
            notas.add(leer.nextInt());
        }
        Alumno alumno = new Alumno(nombre, notas);
        alumnos.add(alumno);
        do {

            System.out.println("Desea Ingresar otro Alumno (S/N)");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Ingrese nombre");
                nombre = leer.next();
                notas = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ingrese las 3 notas:");
                    notas.add(leer.nextInt());
                }
                alumno = new Alumno(nombre, notas);
                alumnos.add(alumno);

            } else {
                nuevo = false;
            }

        } while (nuevo);

        System.out.println(alumnos);
    }
    /*
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public void notaFinal(ArrayList<Alumno> alumnos){
    System.out.println("Ingrese el nombre del alumno a buscar:");
    String alumno1 = leer.next();
    boolean noEstá =true;
    int suma=0;
    for (Alumno alumno : alumnos) {
        if (alumno.getNombre().equalsIgnoreCase(alumno1)) {
            noEstá=false;
            System.out.println("Calculando promedio del alumno "+alumno.getNombre()+":");
            for (Integer nota : alumno.getNotas()) {
                suma += nota; // es += no =+!!!
            }
            System.out.println("El promedio del alumno "+alumno.getNombre()+" es "+(double)(suma/3));
        }
    }
    if (noEstá) {
        System.out.println("El alumno solicitado no se encuentra en la lista de alumnos.");
    }
}
}

