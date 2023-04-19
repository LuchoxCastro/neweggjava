/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaentidades;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Cuentas {

    private double saldo;
    private String titular;

    public Cuentas() {
    }

    public Cuentas(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void crear_cuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre de titular y el monto a depositar ");
        titular = leer.nextLine();
        saldo = leer.nextDouble();

    }

    public void retirar_dinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el monto a retirar ");
        double monto = leer.nextDouble();
        if (monto > saldo) {
            System.out.println("el monto ingresado no es posible");

        } else {
            saldo -= monto;
        }
        System.out.println("su saldo actual es " + saldo);

    }
}
