/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio
 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de asociado (A, B o C)");
        String letra = leer.nextLine();
        letra = letra.toUpperCase();
        double costoTratamiento = 0, importeAPagar = 0;

        if (letra.equals("A") || letra.equals("B") || letra.equals("C")) {
            System.out.println("Ingrese el costo del tratamiento");
            costoTratamiento = leer.nextDouble();
        }
        switch (letra) {
            case "A":
                importeAPagar = costoTratamiento * 0.5;
                System.out.println("El importe a Pagar es: " + importeAPagar);
                break;
            case "B":
                importeAPagar = costoTratamiento * 0.65;
                System.out.println("El importe a Pagar es: " + importeAPagar);
                break;
            case "C":
                importeAPagar = costoTratamiento;
                System.out.println("El importe a Pagar es: " + importeAPagar);
                break;
            default:
                System.out.println("La opción no es correcta");
        }

    }

}
