/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBservice;

import cuentabanentidades.CuentaBancaria;
import java.util.Scanner;


/**
 *
 * @author Hogar
 */
public class CuentaBanservice {

Scanner leer = new Scanner(System.in);
    private CuentaBancaria cuenta;
    private Object numeroCuenta;

    public void crearCuenta() {

        
        //System.out.println("Creación de Cuenta Bancaria");
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = leer.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        double saldoActual = leer.nextDouble();
        cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        System.out.println("Cuenta creada exitosamente");
    }
    
    public void ingresar(double cantidad) {
        cuenta.setSaldoActual(cantidad+cuenta.getSaldoActual());
        System.out.println("Ingreso de $" + cantidad + " realizado correctamente");
    }
    
    public void retirar(double cantidad) {
        if (cantidad > cuenta.getSaldoActual()) {
            cantidad = cuenta.getSaldoActual();
        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        System.out.println("Retiro de $" + cantidad + " realizado correctamente");
    }
    
    
    public void extraccionRapida() {
        double saldoActual = cuenta.getSaldoActual();
        double cantidadMaxima = saldoActual * 0.2;
        System.out.print("Ingrese la cantidad a retirar (máximo $" + cantidadMaxima + "): ");
        double cantidad = leer.nextDouble();
        if (cantidad > cantidadMaxima) {
            System.out.println("No puede retirar más de $" + cantidadMaxima);
        } else {
            retirar(cantidad);
            System.out.println("Extracción rápida realizada correctamente");
        }
    }
    
    
    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }
    

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }
}
