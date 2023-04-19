/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra4poo;

import cuentaentidades.Cuentas;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejerextra4poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);

Cuentas cuenta1 = new Cuentas();
cuenta1.crear_cuenta();
boolean salir = false; 
           String opcion ;

        do {
            cuenta1.retirar_dinero();
                System.out.println("desea hacer otra operacion S = si ");
                opcion= leer.nextLine();
        } while (opcion.equalsIgnoreCase("S"));
        


    }
    
}
