/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer13guia5guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
String [] Equipo = new String[7];
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("engrese nombre; " + i + " ; ");
            Equipo[i] = leer.nextLine(); 
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(Equipo[1]+"-");
            
        }
    }
    
}
