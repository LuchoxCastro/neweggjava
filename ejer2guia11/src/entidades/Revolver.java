/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;

/**
 *
 * @author Hogar
 */
public class Revolver {
    private int posactual;
    private int posagua;

    public Revolver(int posactual, int posagua) {
        this.posactual = posactual;
        this.posagua = posagua;
    }

   
    public int getPosactual() {
        return posactual;
    }

    public void setPosactual(int posactual) {
        this.posactual = posactual;
    }

    public int getPosagua() {
        return posagua;
    }

    public void setPosagua(int posagua) {
        this.posagua = posagua;
    }


    public Revolver() {
    }
     @Override
    public String toString() {
        return "Revolver{" + "posactual=" + posactual + ", posagua=" + posagua + '}';
    }
public void llenarRevolver(){
 
    Random revolver = new Random();
  this.posactual = revolver.nextInt(6);
  this.posagua = revolver.nextInt(6);
  
  
}
 public Boolean mojar(){
     
     return  this.posactual == this.posagua ;
     
 }
 public void siguienteChorro (){
     if (this.posactual == 5) {
         this.posactual = 0;
         
     }else{
         this.posactual = this.posactual +1;
         
     }
 }
 
}
