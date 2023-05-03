/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadespar;

/**
 *
 * @author Hogar
 */
public class ParDeNumeros {

    private double par1;
    private double par2;

    public ParDeNumeros() {
        par1 = (Math.random()*200)-100 ;
        par2 = (Math.random()*200) -100 ;
    }

    public double getPar1() {
        return par1;
    }

    public void setPar1(double par1) {
        this.par1 = par1;
    }

    public double getPar2() {
        return par2;
    }

    public void setPar2(double par2) {
        this.par2 = par2;
    }

}
