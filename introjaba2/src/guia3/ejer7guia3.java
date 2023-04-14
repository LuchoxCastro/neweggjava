/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer7guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String cadena = leer.nextLine();
        int FDE = 0;
        int INC = 0;
        while (!cadena.equals("&&&&&")) {
            if (cadena.length() <= 5 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(cadena.length() - 1, cadena.length()).equalsIgnoreCase("O")) {
                System.out.println("Secuencia Correcta");
                FDE++;
            } else {
                INC++;
                System.out.println("Secuencia Incorrecta");
            }
            System.out.println("Ingrese una palabra o &&&&& para finalizar");
            cadena = leer.nextLine();
        }
        System.out.println("El programa ha finalizado");
        System.out.println("El número de secuencias incorrectas es " + FDE);
        System.out.println("El número de secuencias incorrectas es " + INC);
    }
    
}
