/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1guia10;

import RazaServicio.RazaService;

/**
 *
 * @author Hogar
 */
public class ejer1guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RazaService Raza1 = new RazaService();
        Raza1.ejecutar();
        Raza1.mostrarRazasPerros();
        Raza1.eliminarRaza();
        Raza1.ordenarRazas();
        Raza1.mostrarRazasPerros();

    }
}
