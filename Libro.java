/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIbro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Libro {
   
    public String isbn;
    public String titulo;
    public String autor;
    public int cantPaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int cantPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
    
    public void pedirDatos () {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el título del libro");
        titulo = leer.nextLine();
        System.out.println("Ingrese el ISBN");
        isbn = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de páginas");
        cantPaginas= leer.nextInt();
       
}
    public void mostrarDatos (){
        System.out.println(titulo + " " + isbn + " " + autor + " " + cantPaginas);
    }
    
}

