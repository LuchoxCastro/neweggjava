/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciaentidad;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCincunferencia() {
        System.out.println("ingrese el valor del radio");
        Scanner leer = new Scanner(System.in);
        radio = leer.nextDouble();
    }

    public double area() {
       
        return (Math.PI * (radio * radio));
    }

    public double perimetro() {

        return 2 * Math.PI * radio;
    }

}
