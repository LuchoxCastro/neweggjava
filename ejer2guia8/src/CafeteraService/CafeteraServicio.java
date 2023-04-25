/*
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. 
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package CafeteraService;

import cafeteraentidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class CafeteraServicio {

    private Scanner leer = new Scanner(System.in);
    Cafetera c2 = new Cafetera();

    private int actual;
    private int capacidad;

    public Cafetera realcapmax() {
        System.out.println(" ingrese la capacidad de la cafetera  ");
        c2.setCapacidadMaxima(leer.nextInt());
        // int realcapmax = leer.nextInt();
        return c2;
    }

    public void llenarCafetera(Cafetera c2) {
        System.out.println("se lleno la cafetera");
        c2.setCantidadActual(c2.getCapacidadMaxima());

    }

    public void servirTaza(int tamanoTaza) {

        if (c2.getCantidadActual() < tamanoTaza) {
            System.out.println("No se pudo llenar la taza completamente, quedó con " + c2.getCantidadActual() + " ml de café.");
            c2.setCantidadActual(0);
        } else {
            c2.setCantidadActual(c2.getCantidadActual() - tamanoTaza);
            System.out.println("Se lleno la taza y la cafetera quedo con " + c2.getCantidadActual() + " ml de cafe");

        }
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero. 

    public void vaciarCafetera() {
        System.out.println("se vacio la cafetera");
        c2.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera c2) {
        System.out.println("cuanto cafe desea cargar?");
        int sumarcafe = leer.nextInt();

        c2.setCantidadActual(c2.getCantidadActual() + sumarcafe);
        System.out.println("quedo de cafe "+ c2.getCantidadActual()+" ml de cafe" );
    }
}
