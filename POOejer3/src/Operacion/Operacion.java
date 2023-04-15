/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Operacion {

    private int num1, num2;
    //private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primero numero 1 , seguido numer 2");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

    }

    public int Sumar() {
        int aux = num1 + num2;
        return aux;

    }

    public int restar() {
        int aux = num1 - num2;
        return aux;
    }

    public int multiplicar() {
        int aux = 0;

        if (num1 == 0 || num2 == 0) {
            System.out.println("error");
            return aux;

        } else {
            aux = num1 * num2;
            return aux;
        }

    }

    public double division() {
        double aux = 0;

        if (num1 == 0 || num2 == 0) {
            System.out.println("error");
            return aux;

        } else {
            aux = (double)num1 / (double)num2;
            return aux;
        }

    }
}
