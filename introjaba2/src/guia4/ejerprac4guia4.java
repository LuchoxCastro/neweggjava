/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerprac4guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número para verificar");
        int num = leer.nextInt();
        boolean esPrimo = numerosPrimos(num);
        if (esPrimo) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es Primo");
        }
    }

    private static boolean numerosPrimos(int num) {
        boolean esPrimo = false;
        int i = 2, aux;

        do {
            if (num % i == 0) {
                i = num;
                break;
            } else {
                if (i == num-1) {
                    esPrimo = true;
                    break;
                } else {
                    i++;
                }
            }
        } while (i < num);

        return (esPrimo);
    }

}



  


