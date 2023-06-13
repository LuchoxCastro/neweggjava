/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejermaoguia12;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Hogar
 */
public class Ejermaoguia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();

//        Animal a = new Animal();
//        Animal b = new Perro();
//        Animal c = new Gato();
//        animales.add(a);
//        animales.add(b);
//        animales.add(c);
//
//        for (Animal animale : animales) {
//            animale.hacerRuido();
 //   }

    Animal perro = new Perro("picho", "dogchow", 7, "baeggle");

    perro.alimentar ();
    Animal gato = new Gato("chimuelo", "catchow", 1, "persha");

    gato.alimentar ();
    Animal caballo = new Caballo("Spirit", "pasto", 15, "percheron");

    caballo.alimentar ();

}

}
