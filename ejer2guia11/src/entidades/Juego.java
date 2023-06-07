/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Juego {

    private Scanner leer = new Scanner(System.in);
    private Revolver r = new Revolver();
    private ArrayList<Jugador> Jugadores = new ArrayList();

    public void llenarJuego() {
        int cantidadJugadores;
        do {
            System.out.println("ingrese la cantidad de jugadores entre 2 y 6");
            cantidadJugadores = leer.nextInt();

        } while (cantidadJugadores < 2 || cantidadJugadores > 6);

        int id = 1;
        for (int i = 0; i < cantidadJugadores; i++) {

            Jugador jug1 = new Jugador(id);
            Jugadores.add(jug1);
            id++;
            System.out.println(" Los jugadores son " + jug1  );

        }
       
       
         this.r = new Revolver();
         r.llenarRevolver();
          this.Jugadores = this.Jugadores;
         
    }

    public void ronda() {
        boolean exit = true;

        do {

            for (Jugador Jugadore : Jugadores) {

                Jugadore.disparo( r , Jugadore);

                System.out.println("continua el siguienter participante " + Jugadore.getNombrejugador());

                if (Jugadore.isMojado()) {
                    System.out.println("final del juego " + Jugadore.getNombrejugador() + " fue mojado");
                    exit = false;
                    break;
                } else {
                    System.out.println("te salvaste");

                }
            }

        } while (exit);

    }

}
