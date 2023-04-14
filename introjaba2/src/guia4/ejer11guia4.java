/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de 
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla 
y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne
la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ejer11guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese una frase terminada en punto");
        String frase = leer.nextLine();
        String nuevaFrase = convertido(frase);
        System.out.println(nuevaFrase);
    }

    public static String convertido(String a) {
        String aux, palabra="";
        for (int i = 0; i < (a.length()); i++) {
            aux = a.substring(i, (i + 1));

            switch (aux.toUpperCase()) {
                case "A":
                    aux = "@";
                    break;
                case "E":
                    aux = "#";
                    break;
                case "I":
                    aux = "$";
                    break;
                case "O":
                    aux = "%";
                    break;
                case "U":
                    aux = "*";
                    break;
            }
            palabra=palabra+aux;

        }
        return (palabra);
    }
}
    

