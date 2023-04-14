/*
 *Escribir un programa que lea un número entero por teclado
 *y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 *Nota: investigar la función Math.sqrt().
 */
package introjaba2;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer5guia2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();
        int nd = num*2;
        int nt = num * 3;
        int rn = (int) Math.sqrt(num);
        System.out.println("el doble de " +num+ " es " +nd);
        System.out.println("el triple de " +num+ " es " +nt);
        System.out.println("la raiz de " +num+ " es " +rn);

                
                
        
        
    }
}
