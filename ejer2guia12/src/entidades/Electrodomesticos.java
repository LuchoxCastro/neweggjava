/*
 * 
 */
package entidades;

/**
 *
 * @author Hogar
 */
public class Electrodomesticos {
    protected String color;
    protected double precio;
    protected char consumoEnergatico;
    protected double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(String color, double precio, char consumoEnergatico, double peso) {
        this.color = color;
        this.precio = precio;
        this.consumoEnergatico = consumoEnergatico;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getConsumoEnergatico() {
        return consumoEnergatico;
    }

    public void setConsumoEnergatico(char consumoEnergatico) {
        this.consumoEnergatico = consumoEnergatico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
   
    
}
