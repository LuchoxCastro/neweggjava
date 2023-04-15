/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio1;

import entidadlibro.Libro;

/**
 *
 * @author Hogar
 */
public class Pooejercicio1 {

    /**
     * @param args the command line arguments
     */
    /**
     */
    public static void main(String[] args) {
        Libro miLibro1 = new Libro();
        miLibro1.pedirDatos();
        miLibro1.mostrarDatos();

        Libro miLibro2 = new Libro(999999, "MD", "Chiq", 155);
        miLibro2.mostrarDatos();

    }

}
