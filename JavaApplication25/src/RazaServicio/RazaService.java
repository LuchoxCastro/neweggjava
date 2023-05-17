/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package RazaServicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class RazaService {

    private ArrayList<String> Razas;
    private Scanner leer;

    public RazaService() {
        this.Razas = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void ejecutar() {
        String salir = "";
        do {

            System.out.print("Ingrese la raza del perro (o 'salir' para terminar): ");
            Razas.add(leer.next());
            System.out.println("Desea cargar otra rasa?S/N");
            salir = leer.next();

        } while (salir.equalsIgnoreCase("s"));

    }

    public void mostrarRazasPerros() {
        System.out.println("Razas de perros guardadas:");
        for (String raza : Razas) {

            System.out.println(raza);

        }
    }
    public void eliminarRaza(){
        System.out.println("ingrese la raza a eliminar");
        String borrarRaza = leer.next();
        boolean raz = true;
        Iterator<String> it = Razas.iterator();
        
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(borrarRaza)) {
                it.remove();
                System.out.println("la raza se borro");
                raz = false;
                break;
                
            }
            
        }
        if (raz) {
            System.out.println("la raza no se encuentra en la lista");
            
        }
        
    }
    public void ordenarRazas(){
        Collections.sort(Razas);
    }
}
