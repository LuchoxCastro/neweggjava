/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServicio;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class PersonaService {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona a = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        a.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        a.setApellido(leer.next());
        System.out.println("Ingrese dni");
        a.setDni(leer.nextInt());
        System.out.println("Ingrese perro");
        a.setPerro(leer.next());

        return a;

    }

    public void setNombre(String next) {
    }
}
