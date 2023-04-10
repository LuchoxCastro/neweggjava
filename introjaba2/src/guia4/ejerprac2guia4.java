/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las
personas ingresadas por teclado e indique si son mayores o menores de edad. Después 
de cada persona, el programa debe preguntarle al usuario si quiere 
seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejerprac2guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        int edad = 0;

        datos(nombre, edad);

    }

    public static void datos(String nombre, int edad) {
        Scanner leer = new Scanner(System.in);
        String confirmacion = "";
        System.out.println("Ingrese los datos");
        do {

            System.out.println("Nombre:");
            nombre = leer.nextLine();
            System.out.println("edad");
            edad = leer.nextInt();
            leer.nextLine();
            if (edad < 18) {
                System.out.println("\033[1;32m"+"es menor de edad"+"\033[0m");
            } else {
                System.out.println("es mayor de edad");
            }
            System.out.println("¿desea continual cargando datos? s/n");
            confirmacion = leer.nextLine();
            if (confirmacion.equalsIgnoreCase("n")) {
                break;

            }
        } while (confirmacion.equalsIgnoreCase("s"));

    }

}
