/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerpreac3guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor  euros\");en euros");
        int euro = leer.nextInt();
        int dolar = 0;
        int libra = 0;
        int yeng = 0;

    }

    public static void monedas(String money, int euro) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la moneda a convertir");

        //0.86 libra/1eu
        //x/10eu
        //10*0.86/1
    }
}
