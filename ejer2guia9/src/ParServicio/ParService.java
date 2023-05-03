/*
 * 
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener
un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar 
los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además 
implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos
valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*


*/
package ParServicio;

import entidadespar.ParDeNumeros;

/**
 *
 * @author Hogar
 */
public class ParService {
    public ParDeNumeros crearPares(){
        return new ParDeNumeros();
       
        
    }
   public void mostrarValores(ParDeNumeros pdn){
       System.out.println(pdn.toString()
       );
    
}
     public double devolverMayor(ParDeNumeros pdn){
        return  Math.max(pdn.getPar1(), pdn.getPar2());
     }
          
   public double calcularPotencia(ParDeNumeros pdn) {
            double mayor = devolverMayor(pdn);
            double menor = Math.min(pdn.getPar1(), pdn.getPar2());
            mayor = Math.round(mayor);
            menor = Math.round(menor);
            return Math.pow(mayor, menor);
}
   public double calculaRaiz(ParDeNumeros pdn ) {
            double menor = Math.min(Math.abs(pdn.getPar1()), Math.abs(pdn.getPar2()));
            return Math.sqrt(menor);
            
        }
}

