/*
 *Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
   e imprima el número ingresado seguido de tantos asteriscos como 
   indique su valor. Por ejemplo:
   5 *****
   3 ***
   11 ***********
   2 **
* 
 *  */
package introjaba2;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer10guia3guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese 4 numeros de 1 al 20 ");
        
              int numero;
        int j = 0;

        do {
            numero = leer.nextInt();
            if (numero <= 20 && numero >= 0) {
                j++;
                System.out.print(numero + " ");
                for (int i = 0; i < numero; i++) {
                    System.out.print("*");
                } 
                

                System.out.println("");
            } 
            else {
                System.out.println("El numero ingresado es mayor a 20");
                
            }
        } while (j < 4);

    }
}
       
      
            
       
     

