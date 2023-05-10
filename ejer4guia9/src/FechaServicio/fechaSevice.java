/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FechaServicio;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author Hogar
 */
public class fechaSevice {
    public static Date fechaNacimiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dia de su nacimiento:");
        int dia = leer.nextInt();
        
        System.out.println("ingrese el mes de su nacimiento(1_12):");
        int mes = leer.nextInt() -1;
        
        System.out.println("ingrse el año de su nacimiento:");
        int anio = leer.nextInt();
        
        return new Date (anio - 1900, mes , dia);
    }
    public static Date fechaActual(){
        return new Date();
       
    }
    public static int diferencia (Date fecha1, Date fecha2){
      int anio1 = fecha1.getYear();
      int anio2 = fecha2.getYear();
      
      return Math.abs(anio1 - anio2);
      
      
    }
     public static void main (String[] args){
         Date fechaNacimiento = fechaNacimiento();
         Date fechaActual = fechaActual();
         int edad = diferencia(fechaNacimiento, fechaActual);
         System.out.println("Tu edad es : "+ edad + " años");
         
     }
}
    