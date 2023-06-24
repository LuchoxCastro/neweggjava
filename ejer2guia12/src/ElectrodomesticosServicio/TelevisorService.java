/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectrodomesticosServicio;

import entidades.Electrodomesticos;
import entidades.Televisor;

/**
 *
 * @author Hogar
 */
public class TelevisorService extends ElectrodomesticoService {

    private Televisor tele = new Televisor();

    public void crearTelevisor() {
        System.out.println("seccion televisores");
        Electrodomesticos E1 = crearElectrodomestico();
        System.out.println("ingrese la resolucion deseada en pulgadas");
        tele.setResolucion(leer.nextInt());
        System.out.println("Tiene sintonizador? (S/N)");
        tele.setSintonizadorTDT(false);
        if (leer.next().equalsIgnoreCase("S")) {
            tele.setSintonizadorTDT(true);
        }

        tele.setColor(E1.getColor());
        tele.setConsumoEnergatico(E1.getConsumoEnergatico());
        tele.setPeso(E1.getPeso());
        tele.setPrecio( precioFinalTele());
        System.out.println(tele.getPrecio());
    }

    public double precioFinalTele() {
        tele.setPrecio(super.precioFinal());
        //System.out.println(tele.getPrecio());
        if (tele.getResolucion() > 40) {
            tele.setPrecio(tele.getPrecio() * 1.3);

        }
        if (tele.isSintonizadorTDT()) {
            tele.setPrecio(tele.getPrecio() + 500);
        }
return tele.getPrecio();
    }

}
