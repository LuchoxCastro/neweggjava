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
public class Lavadora extends Electrodomesticos  {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, String color, int precio, char consumoEnergatico, double peso) {
        super(color, precio, consumoEnergatico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    
    
}
