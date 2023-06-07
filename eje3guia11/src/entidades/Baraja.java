/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Hogar
 */
public class Baraja {
private ArrayList<Carta> cartas = new ArrayList();
 
    public Baraja() {
        this.cartas = new ArrayList();
        
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
  
   
    
   
    
}
