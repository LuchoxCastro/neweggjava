/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectrodomesticosServicio;

import entidades.Electrodomesticos;
import entidades.Lavadora;

/**
 *
 * @author Hogar
 */
public class LavadoraService extends ElectrodomesticoService {

    private Lavadora Lav1 = new Lavadora();
//   • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    
    public void crearLavadora() {
        
       
        
        Electrodomesticos E1 = crearElectrodomestico();
        System.out.println("ingrese la carga en kilogramos");
        Lav1.setCarga(leer.nextInt());
        Lav1.setColor(E1.getColor());
        Lav1.setConsumoEnergatico(E1.getConsumoEnergatico());
        Lav1.setPeso(E1.getPeso());
        
        Lav1.setPrecio(precioFinalLav());
        System.out.println(Lav1.getPrecio());
    }

//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
//Se debe crear también una subclase llamada Televisor con los siguientes atributos:
//resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
//heredados.
//    
    public double precioFinalLav() {
        
        Lav1.setPrecio(super.precioFinal());
        System.out.println(Lav1.getPrecio());
        if (Lav1.getCarga() > 30) {
            
            Lav1.setPrecio(Lav1.getPrecio() + 500);
            
        }
        
        return Lav1.getPrecio();
        
    }
    
}
