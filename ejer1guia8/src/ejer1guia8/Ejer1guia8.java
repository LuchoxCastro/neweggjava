/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1guia8;

import CuentaBservice.CuentaBanservice;
import cuentabanentidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejer1guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBanservice cuentaServicio1 = new CuentaBanservice();
        CuentaBancaria saldofinal = cuentaServicio1.crearCuenta(0, 0, 0);
        Scanner leer = new Scanner(System.in);
        while (true) {
            System.out.println("MENU DEL BANCO");
            System.out.println("1- INGRESAR DINERO");
            System.out.println("2- RETIRAR DINERO");
            System.out.println("3- EXTRACCION RAPIDA");
            System.out.println("4- CONSULTAR SALDO");
            System.out.println("5- CONSULTAR DATOS");
            System.out.println("6- SALIR");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el monto");
                    double cantidad = leer.nextDouble();
                    cuentaServicio1.ingresar(saldofinal, cantidad);
                    break;
                case 2:
                    System.out.println("ingrese monto a retirar ");
                    cantidad = leer.nextDouble();
                    cuentaServicio1.retirar(cantidad);
                    break;
                case 3:
                    System.out.println("modo extraccion rapida");
                    cuentaServicio1.extraccionRapida();
                    break;
                case 4:
                    System.out.println("su saldo actual es ");
                    cuentaServicio1.consultarSaldo();
                    break;
                case 5:
                    System.out.println("consulta de datos");
                    cuentaServicio1.consultarDatos();
                    break;
                case 6:
                    System.out.println("cierre de operacion");
                    System.exit(0);
            }

        }

    }
}
