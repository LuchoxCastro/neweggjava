/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaiseServicio;

;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Hogar
 */


public class PaiseService {
        public static Comparator<PaiseService> comparadornombre = new Comparator<PaiseService>(){
            @Override
            public int compare(PaiseService t, PaiseService t1) {
            
          
        
                

    Set<String> paises = new HashSet<>();
    Scanner leer = new Scanner(System.in);
    String pais;

    public void ingresarPais() {
        do {

            System.out.println("ingrese un pais ");
            pais = leer.nextLine();
            if (paises.contains(pais)) {
                paises.add(pais);
                String respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {

                } else {
                    System.out.println(" el pais ya ha sido ingresado anteriormente");

                }
            }
        } while (true);

    }

    public void mostrarPaises() {
        System.out.println("paises guardados en el conjunto");

        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    List<String> PaisesOrdenados = new ArrayList<>(paises);
    
    Collections.sort(PaisesOrdenados);
    


}
