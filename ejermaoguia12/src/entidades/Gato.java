/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import AnimalesInterfaces.Perrointerface;

/**
 *
 * @author Hogar
 */
public class Gato implements Perrointerface {
    public Gato() {
    
}

   
    @Override
    public void hacerRuido() {
        System.out.println("miaoo");
    }
//
//    public Gato(String nombre, String alimento, Integer edad, String raza) {
//        super(nombre, alimento, edad, raza);
//    }
//     
}
