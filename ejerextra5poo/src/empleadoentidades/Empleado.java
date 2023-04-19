/*
 * }Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de
un empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años
o del 5% si tiene menos de 30 años.
 */
package empleadoentidades;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_salario() {
        Scanner leer = new Scanner(System.in);
        double aumento;
        if (edad > 30) {

            aumento = salario * 0.10;

        } else {
            aumento = salario * 0.05;

        }
        salario += aumento;
        System.out.println("su aumento es"+aumento+ "y su salario actual es "+ salario);
    }

}
