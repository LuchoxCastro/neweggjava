/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package AdopcionServicio;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class AdopcionService {

    Scanner leer = new Scanner(System.in);
    Perro can2 = new Perro("chancho", "dogo", 1, "chico");
    Persona Sr1 = new Persona();
   

    public Perro crearPerro() {

        Perro can1 = new Perro();
        System.out.println("ingtese el nombre del perro");
        can1.setNombre(leer.next());
        System.out.println("ingrese la raza");
        can1.setRaza(leer.next());
        System.out.println("ingrese la edad");
        can1.setEdad(leer.nextInt());
        System.out.println("ingrese el tamaño");
        can1.setTamanio(leer.next());
        

        return can1; 
    }
public Persona crearPersona(){
    Persona per1 = new Persona();
    System.out.println("nombre;");
    per1.setNombre(leer.next());
    System.out.println("apellido:");
    per1.setApellido(leer.next());
    System.out.println("edad:");
    per1.setEdad(leer.nextInt());
    System.out.println("dni:");
    per1.setDni(leer.nextInt());
//    System.out.println("perro:");
    per1.setPerro(null);
    
    return per1;
}
public void union(Persona auxpersona, Perro auxperro){
    auxpersona.setPerro(auxperro);
    
    
    
}
}
