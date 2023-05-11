/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaSevicio;

import PersonaEntidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class PersonaService {
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el nombre de la persona");
        String nombre = leer.nextLine();

        System.out.println("ingrese la fecha de nacimiento (formato: dd/mm/yyyy:))");
        strimg fexhastring = leer.nextLine();
        
    }
}
