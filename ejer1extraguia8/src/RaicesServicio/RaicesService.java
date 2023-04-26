/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaicesServicio;

/**
 *
 * @author Hogar
 */
public class RaicesService {

    private RaicesService raices;

    public RaicesService() {
       
    }

   private RaicesService(double a, double b, double c) {
       
    }

    public double getDiscriminante() {
        double discriminante = Math.pow(this.raices.getb(), 2) - 4 * this.raices.geta() * this.raices.getc();
        return discriminante;
    }

    public boolean tieneRaices() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz() {
        double discriminante = getDiscriminante();
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        if (tieneRaices()) {
            double x1 = (-this.raices.getb() + Math.sqrt(discriminante)) / (2 * this.raices.geta());
            double x2 = (-this.raices.getb() - Math.sqrt(discriminante)) / (2 * this.raices.geta());
            System.out.println("Las posibles soluciones son: " + x1 + " y " + x2);
        } else {
            System.out.println("No hay soluciones reales");
        }
    }

    public void obtenerRaiz() {
        double discriminante = getDiscriminante();
        if (tieneRaiz()) {
            double x = -this.raices.getb() / (2 * this.raices.geta());
            System.out.println("La única solución es: " + x);
        } else {
            System.out.println("No hay solución única");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No hay soluciones reales");
        }
    }
}
  