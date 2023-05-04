/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2guia9;

import ParServicio.ParService;
import entidadespar.ParDeNumeros;

/**
 *
 * @author Hogar
 */
public class Ejer2guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParService PS = new ParService();
        ParDeNumeros pdn = PS.crearPares();

        PS.mostrarValores(pdn);
        PS.devolverMayor(pdn);
        PS.calcularPotencia(pdn);
        PS.calculaRaiz(pdn);

        
        
    }
    
}
