/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer2;

import circunferenciaentidad.Circunferencia;

/**
 *
 * @author Hogar
 */
public class Pooejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circu = new Circunferencia();
        circu.crearCincunferencia();
        System.out.println("el area es " + circu.area());
        System.out.println("el perimetro es "+circu.perimetro());
        
        
    }
    
}
