/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra3poo;

/**
 *
 * @author Hogar
 */
public class Ejerextra3poo {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Juego adivina = new Juego();
        
        for (int i = 0; i < 3; i++) {

            adivina.Iniciar_juego1();
            adivina.Adivinador2();
            adivina.Iniciar_juego2();
            adivina.Adivinador1();

        }
       
        adivina.Puntaje();
        
    }    
}

    

