/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1guia8;

import CuentaBservice.CuentaBanservice;

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

        cuentaServicio1.crearCuenta();
        cuentaServicio1.ingresar(0);
        cuentaServicio1.retirar(0);
        cuentaServicio1.extraccionRapida();
                
        cuentaServicio1.consultarSaldo();
        cuentaServicio1.consultarDatos();
    }
}    
    

