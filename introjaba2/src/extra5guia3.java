
import java.util.Scanner;

/*
*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada
y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben 
descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa 
la clase de un socio, y luego un valor real que represente el costo del 
tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
+/

package extrasguia3;

/**
 *
 * @author Hogar
 */
public class extra5guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
         System.out.println("ingrese el tipo de asociado");
         String letra = leer.nextLine() ;  
    letra=letra.toUpperCase();
    
    switch (letra){
        case "A" :
        case "E" :
        case "I" :
        case "O" :
        case "U" :
        
            System.out.println("la letra ingresada es una vocal ");
            break;
        default :
            System.out.println("la letra no es vocal");
            
            
    }    }
    
}
