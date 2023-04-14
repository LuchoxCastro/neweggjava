/*
 * Recorrer un vector de N enteros contabilizando cuántos números 
son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerprac3guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese la cantidad de numeros ");

        int num = leer.nextInt();
        int unacifra = 0;
        int doscifras = 0;
        int trescifras = 0;
        int cuatrocifras = 0;
        int cincocifras = 0;
        
        int[] vector = new int[num];

        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10000 + 1);
            //System.out.println(vector[i]);
        }
        for (int i = 0; i < num; i++) {
            if (vector[i]>=1 && vector[i] <= 9) {
                unacifra++;
                
            }
            if (vector[i]>=10 && vector[i]<=99) {
                doscifras++;
            }
            if (vector[i]>=100 && vector[i]<=999) {
                trescifras++;
            }
            if (vector[i]>=1000 && vector [i]<=9999) {
                cuatrocifras++;
            }
            if (vector[i]>=10000) {
                cincocifras++;
            }
        }
    }
}
