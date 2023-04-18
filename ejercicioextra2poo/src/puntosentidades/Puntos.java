/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
y los ingresa en los atributos del objeto. Después, a través de otro método calcular
y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. 
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package puntosentidades;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Puntos {

    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void CrearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor de x1 e y1");
        x1 = leer.nextInt();
        y1 = leer.nextInt();

        System.out.println("ingerse el valor de x2 e y2 ");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
        
    }
    public double CrearCalcular(){
       
      double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return distancia ;
            
    }
    
}
