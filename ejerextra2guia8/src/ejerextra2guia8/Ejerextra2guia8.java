/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra2guia8;

import NifServicio.NifService;
import nifentidades.NIF;

/**
 *
 * @author Hogar
 */
public class Ejerextra2guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
NifService NIFES = new NifService();
NIF objeto1 = new NIF();

NIFES.getcrearNif(objeto1);
NIFES.mostrar(objeto1);
    }
    
}
