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
public class Caballo implements Perrointerface {

    public Caballo() {

    }

    
    @Override
    public void hacerRuido() {
        System.out.println("nihihihji");
    }

//    public Caballo(String nombre, String alimento, Integer edad, String raza) {
//        super(nombre, alimento, edad, raza);
//    }

}
