/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServicio;

import Personaentidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona Persona) {
        return Persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        String nombre;
        System.out.println("ingrese su nombre ");
        nombre = leer.next();
        System.out.println("ingrese su edad ");
        int edad = leer.nextInt();
      
        
    System.out.println("Ingrese el sexo (H - hombre, M - mujer, O - otro):");
        char sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo inválido, ingrese nuevamente (H - hombre, M - mujer, O - otro):");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        
    
        
        System.out.println("ingrse su peso actual");
        int peso = leer.nextInt();
        System.out.println("ingrse su altura actual en centimetros ");
        int altura = leer.nextInt();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona Persona) {
        int imc = (int) (Persona.getPeso() / Math.pow(Persona.getAltura(), 2));

        if (imc < 20) {
            System.out.println(Persona.getNombre() + "esta por debajo de su peso ideal");
            return -1;
        } else if (imc > 25) {
            System.out.println(Persona.getNombre() + "esta con sobre peso");
            return 1;

        } else {
            System.out.println(Persona.getNombre() + "se encuentra en su peso ideal");

            return 0;
        }

        
        
        
        

    }
    public void mostrarPersona(Persona Persona){
       System.out.println(Persona.getNombre());
       System.out.println("Edad: "+Persona.getEdad());
       System.out.println("Sexo: "+Persona.getSexo());
       System.out.println("Peso "+Persona.getEdad());
       System.out.println("Altura "+Persona.getAltura());       
   }
}
