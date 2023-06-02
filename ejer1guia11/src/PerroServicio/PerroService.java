/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerroServicio;

import entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class PerroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
      public Perro crearPerro() {
        Perro b = new Perro();
        System.out.println("Ingrese el nombre del perro");
        b.setNombre(leer.next());
        System.out.println("Ingrese raza");
        b.setRaza(leer.next());
            System.out.println("Ingrese edad");
        b.setEdad(leer.nextInt());
            System.out.println("Ingrese tamaño");
        b.setTamaño(leer.next());
        return b;

    }
}

