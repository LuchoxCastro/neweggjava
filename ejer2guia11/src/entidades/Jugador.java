/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Jugador {

    private Scanner leer = new Scanner(System.in);
    private int id;
    private String nombrejugador;
    private boolean mojado;

    public Jugador(int id) {
        System.out.println("ingrese el nombre");
        String j = leer.nextLine();
        this.nombrejugador = "Jugador " + id + " " + j;
        this.id = id;
        this.mojado = false;

    }

    public void disparo(Revolver r,Jugador j1 ) {
     
        j1.setMojado(r.mojar());
        r.siguienteChorro();

    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrejugador() {
        return nombrejugador;
    }

    public void setNombrejugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean moja) {
        this.mojado = moja;
    }

    @Override
    public String toString() {
        return ( " nombrejugador " + nombrejugador   );
    }

}
