/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Hogar
 */
public class Carta {
    private String Palo;
    private int numero;

    public Carta() {
    }

    public Carta(String Palo, int numero) {
        this.Palo = Palo;
        this.numero = numero;
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "" + Palo + ", " + numero + '}';
    }
    
    
    
}
