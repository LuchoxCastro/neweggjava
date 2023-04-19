/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra5poo;

import empleadoentidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Ejerextra5poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado empleado1 = new Empleado();
        System.out.println("ingrese su nombre ");
        empleado1.setNombre(leer.nextLine());
        System.out.println("ingrese su edad ");
        empleado1.setEdad(leer.nextInt());
        System.out.println("ingrese su salario actual ");
        empleado1.setSalario(leer.nextDouble());
        empleado1.calcular_salario();
    }
    
}
