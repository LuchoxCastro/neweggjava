/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1guia11nuevo;

import AdopcionServicio.AdopcionService;
import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author Hogar
 */
public class Ejer1guia11nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Perro can1 = new Perro();
      AdopcionService puente = new AdopcionService();
     
      Perro pablito = puente.crearPerro();
      Perro manchas = puente.crearPerro();
      Persona cacho = puente.crearPersona();
      Persona ricky = puente.crearPersona();
      
      puente.union(ricky, pablito);
      puente.union(cacho, manchas);
      
        System.out.println(cacho);
        System.out.println(ricky);
        
    }
    
}
