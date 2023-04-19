package juegoentidades;


import java.util.Scanner;

/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos
y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar 
el número y el número de veces que cada jugador ha ganado.
package juegoentidades;
*/

/**
 *
 * @author Hogar
 */
public class Juego {

    public int num1;
    public int num2;
    public int P1;
    public int P2;

    public Juego() {
    }

    public Juego(int num1, int num2, int P1, int P2) {
        this.num1 = num1;
        this.num2 = num2;
        this.P1 = P1;
        this.P2 = P2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getP1() {
        return P1;
    }

    public void setP1(int P1) {
        this.P1 = P1;
    }

    public int getP2() {
        return P2;
    }

    public void setP2(int P2) {
        this.P2 = P2;
    }

    public void Iniciar_juego1() {
        Scanner leer = new Scanner(System.in);

        System.out.println("------ Hola jugador 1 -------");

        System.out.println("Ingrese el numero secreto, elige del 1 al 10: ");
        num1 = leer.nextInt();

    }

    public void Adivinador2() {
        Scanner ah = new Scanner(System.in);
        int i = 0;

        System.out.println("Jugador 2, adivene el numero secreto");

        do {
            System.out.println("Ingresa un numero del 1 al 10: ");
            num2 = ah.nextInt();

           

           if (num1 < num2) {
                System.out.println("OJO PISTA: Es mas bajo");
                i++;
            }else if (num2 < num1) {
            System.out.println("OJO PISTA: Es mas alto");
            i++;

            } else if (num2 == num1) {

                System.out.println("****  Adivinaste ****");

                P2++;
                i=3;

            } 
           
           if (i == 3 && num1 != num2) {
                System.out.println("***** Perdiste ******");

            }
}
while (i < 3);

    }

    public void Iniciar_juego2() {
        Scanner leer = new Scanner(System.in);

        System.out.println("------ Hola jugador 2 ------");

        System.out.println("Ingrese el numero secreto, elige del 1 al 10: ");
        num1 = leer.nextInt();

    }

    public void Adivinador1() {
        Scanner ah = new Scanner(System.in);

        int i = 0;

       System.out.println("Jugador 1, adivene el numero secreto");

        do {
            System.out.println("Ingresa un numero del 1 al 10: ");
            num2 = ah.nextInt();

           

           if (num1 < num2) {
                System.out.println("OJO PISTA: Es mas bajo");
                i++;
            }else if (num2 < num1) {
            System.out.println("OJO PISTA: Es mas alto");
            i++;

            } else if (num2 == num1) {

                System.out.println("****  Adivinaste ****");

                P1++;
                i=3;

            } 
           
           if (i == 3 && num1 != num2) {
                System.out.println("***** Perdiste ******");

            }
}
while (i < 3);

    }

    public void Puntaje() {

        if (P1 < P2) {

            System.out.println("El jugador 1 ah gano con " + P1);
            System.out.println("El jugador 2 fue derrotado con " + P2);

        }
        System.out.println("El jugador 2 ah gano con " + P2);
        System.out.println("El jugador 1 fue derrotado con " + P1);

    }
}
