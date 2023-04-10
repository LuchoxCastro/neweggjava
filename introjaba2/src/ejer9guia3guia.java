
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hogar
 */
public class ejer9guia3guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros");
            int nota;
            int cont=0;
            int suma = 0;
            
            
           do {

            nota = leer.nextInt();
            ++cont;
               if (nota == 0) {
                   System.out.println("Se capturó el numero cero");
                   break;
                   
               }
               if (nota > 0) {
                   suma = suma + nota;
                   
               }
              // System.out.println("contador = " + cont);
        } while (cont < 20);
           System.out.println("La sumatoria de los numeros ingresados es: " + suma);
          
           
        }
    
}

