/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer3;

import Operacion.Operacion;

/**
 *
 * @author Hogar
 */
public class POOejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion MiOperacion = new Operacion();

        MiOperacion.crearOperacion();
        System.out.println("la suma es " + MiOperacion.Sumar());

        System.out.println("la resta es " + MiOperacion.restar());

        System.out.println("la multiplicacion es " + MiOperacion.multiplicar());

        System.out.println("la divicion es " + MiOperacion.division());

    }

}
