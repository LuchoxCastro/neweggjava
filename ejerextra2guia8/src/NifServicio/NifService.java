/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NifServicio;

import java.util.Scanner;
import nifentidades.NIF;

/**
 *
 * @author Hogar
 */
public class NifService {

    Scanner leer = new Scanner(System.in);
    String [] verif = new String []{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    private NifService numeros;

    public NifService() {

    }

    public NifService(long dni, String letra) {

    }

    public void getcrearNif(NIF asig) {
        System.out.println("ingrese el numero de DNI ");
        asig.setDNI(leer.nextLong());
        
        int posicion = (int) asig.getDNI()%23;
      asig.setLetra(verif[posicion]);
        
                }
    
                
    

    public void mostrar(NIF asig) {
        System.out.println(asig.getDNI()+"-"+asig.getLetra());
       

    }
    
}

