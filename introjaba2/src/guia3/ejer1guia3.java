package guia3;


import java.util.Scanner;

/*
 * Crear un programa que dado un número determine si es par o impar.*
 * 
 */
public class ejer1guia3 {
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
         int num; 
        System.out.print("ingrese un numero entero positivo " );
        num = leer.nextInt();
                if (num%2 != 0) {
                    System.out.println(num +" es un numero impar.");
                } else {
                    System.out.println(num + " es un numero par.");
                }
    }
}
       
  
