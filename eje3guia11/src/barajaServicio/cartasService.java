/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajaServicio;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Hogar
 */
public class cartasService {

    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        String[] palos = {"Basto", "Copa", "Espada", "Oro"};
        ArrayList<Carta> mazo = new ArrayList();

        for (int j = 0; j < palos.length; j++) {
            for (int i = 1; i <= 12; i++) {
                if (i == 8 || i == 9) {
                    continue;
                }
                mazo.add(new Carta(i, palos[j]));

            }

        }
        baraja.setMazo(mazo);
        return baraja;
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getMazo());
    }

    public void siguienteCarta(Baraja baraja) {
      
        if (baraja.getMazo().size() == 1) {
            System.out.println("ultima carta");

        }else if (baraja.getMazo().size() == 0){
            System.out.println("No hay mas cartas");
        }else {
            Carta carta = baraja.getMazo().get(0);
            System.out.println(carta);
            baraja.getMazo().remove(0);
            
        }
    }

}
