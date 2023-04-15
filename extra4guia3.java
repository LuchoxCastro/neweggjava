/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println("El número " + num + " en romano es: I");
                break;
            case 2:
                System.out.println("El número " + num + " en romano es: II");
                break;
            case 3:
                System.out.println("El número " + num + " en romano es: III");
                break;
            case 4:
                System.out.println("El número " + num + " en romano es: IV");
                break;
            case 5:
                System.out.println("El número " + num + " en romano es: V");
                break;
            case 6:
                System.out.println("El número " + num + " en romano es: VI");
                break;
            case 7:
                System.out.println("El número " + num + " en romano es: VII");
                break;
            case 8:
                System.out.println("El número " + num + " en romano es: VIII");
                break;
            case 9:
                System.out.println("El número " + num + " en romano es: IX");
                break;
            case 10:
                System.out.println("El número " + num + " en romano es: X");
                break;
            default:
                System.out.println("El número no es correcto");
        }
    }

}
