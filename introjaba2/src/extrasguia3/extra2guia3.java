/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrasguia3;

/**
 *
 * @author Hogar
 */
public class extra2guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C,D,aux;
        A=10;
        B=20;
        C=30;
        D=40;
        System.out.print(" A = " +A);
        System.out.print(" B = " +B);
        System.out.print(" C = " +C);
        System.out.print(" D = " +D);
        System.out.println("");
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.print( "A = " +A);
        System.out.print(" ; B = " +B);
        System.out.println(" ; C = " +C);
        System.out.println( " ; D = " +D);
        System.out.println("");
        
        
                
    }
    
}
