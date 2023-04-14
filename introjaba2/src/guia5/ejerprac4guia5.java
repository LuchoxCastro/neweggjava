/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Hogar
 */
public class ejerprac4guia5 {

    /**
     * @param args the command line arguments
     */
       
   public static void main(String[] args) {
       
   
        int [][] matriz = new int[4][4];
        llenarMatriz( matriz);
        mostrarMatriz(matriz);
        System.out.println("***************************");
        traspuestaMatriz(matriz);
        
}
    public static void llenarMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*10+1); 
                
            }
        }
    }
    
    public static void mostrarMatriz(int [][]matriz){
      
        for (int[] fila: matriz) {
            for (int elemento:fila) { 
                System.out.print(elemento + "\t"); 
            }
            System.out.println();              
        }
    }
        
        public static void traspuestaMatriz(int[][]matriz){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[j][i]+ "\t");
                    
                } 
                System.out.println();
            }
        }
}

    
    

