/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectrodomesticosServicio;

import entidades.Electrodomesticos;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
public class ElectrodomesticoService {
 protected Scanner leer = new Scanner(System.in);
   private Electrodomesticos electro1 = new Electrodomesticos();

    protected void comprovarConsumoEnergetico() {

        Character.toLowerCase(electro1.getConsumoEnergatico());
        if (electro1.getConsumoEnergatico() <= 'a' && 'f' >= electro1.getConsumoEnergatico()) {
            electro1.setConsumoEnergatico(electro1.getConsumoEnergatico());
        } else {
            electro1.setConsumoEnergatico('f');
        }

    }
//    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.

    protected void comprobarColor() {
        String[] auxColor = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean aux = true;
        for (int i = 0; i < auxColor.length; i++) {
            if (auxColor[i].equalsIgnoreCase(electro1.getColor())) {
                electro1.setColor(electro1.getColor());

            }

        }
        if (aux) {
            electro1.setColor("blanco");

        }

    }
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.

    public Electrodomesticos crearElectrodomestico() {
       
        System.out.println("ingrese el color del electrodomestico");
        electro1.setColor(leer.next());
        comprobarColor();

        System.out.println("ingrese consume del electrodomestico");
        electro1.setConsumoEnergatico(leer.next().charAt(0));
        comprovarConsumoEnergetico();

        electro1.setPrecio(1000);
        System.out.println("ingrese el peso en kilos del producto");
        electro1.setPeso(leer.nextDouble());

        return electro1;
    }

    public double precioFinal() {
        switch (electro1.getConsumoEnergatico()) {
            case 'a':
                electro1.setPrecio(electro1.getPrecio() + 1000);
                break;
            case 'b':
                electro1.setPrecio(electro1.getPrecio() + 800);
                break;
            case 'c':
                electro1.setPrecio(electro1.getPrecio() + 600);
                break;
            case 'd':
                electro1.setPrecio(electro1.getPrecio() + 400);
                break;
            case 'e':
                electro1.setPrecio(electro1.getPrecio() + 200);
                break;
            case 'f':
                electro1.setPrecio(electro1.getPrecio() + 100);
                break;

        }
        if (electro1.getPeso() >= 1 && electro1.getPeso() < 20) {
            electro1.setPrecio(electro1.getPrecio() + 100);

        } else if (electro1.getPeso() >= 20 && electro1.getPeso() < 50) {
            electro1.setPrecio(electro1.getPrecio() + 500);

        } else if (electro1.getPeso() >= 50 && electro1.getPeso() < 80) {
            electro1.setPrecio(electro1.getPrecio() + 800);

        } else if (electro1.getPeso() > 80) {
            electro1.setPrecio(electro1.getPrecio() + 1000);

        }

        return electro1.getPrecio();
    }
}
