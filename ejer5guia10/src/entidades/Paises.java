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
public class Paises {
private String paises;
private String buscar;

    public Paises() {
    }

    public Paises(String paises, String buscar) {
        this.paises = paises;
        this.buscar = buscar;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    @Override
    public String toString() {
        return "Paises{" + "paises=" + paises + ", buscar=" + buscar + '}';
    }
    
}
