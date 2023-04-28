/*
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para construir 
el objeto a través de un método constructor. Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en 
que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla
las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package RaicesServicio;

import raicesentidades.Raices;

/**
 *
 * @author Hogar
 */
public class RaicesService {

    private RaicesService raices;

    public RaicesService() {

    }

    public RaicesService(double A, double B, double C) {

    }
//(b^2)-4*a*c

    public double getDiscriminante(Raices nombre) {
        double discriminante = Math.pow(nombre.getB(), 2) - 4 * nombre.getA() * nombre.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices nombre) {

        return getDiscriminante(nombre) >= 0;

    }

    public boolean tieneRaiz(Raices nombre) {

        return getDiscriminante(nombre) == 0;

    }
    // (-b±√((b^2)-(4*a*c)))/(2*a)

    public void obtenerRaices(Raices nombre) {

        if (tieneRaices(nombre)) {
            double x1 = (-nombre.getB() + Math.sqrt(Math.pow(nombre.getB(), 2) - (4 * nombre.getA() * nombre.getC()))) / (2 * nombre.getA());

            double x2 = (-nombre.getB() - Math.sqrt(Math.pow(nombre.getB(), 2) - (4 * nombre.getA() * nombre.getC()))) / (2 * nombre.getA());
            nombre.getA();
            System.out.println("Las posibles soluciones son: " + x1 + " y " + x2);
        } else {
            System.out.println("No hay soluciones reales");
        }
    }

    public void obtenerRaiz(Raices nombre) {

        if (tieneRaiz(nombre)) {
            double x1 = (-nombre.getB() + Math.sqrt(Math.pow(nombre.getB(), 2) - (4 * nombre.getA() * nombre.getC()))) / (2 * nombre.getA());
            System.out.println("La única solución es: " + x1);
        } else {
            System.out.println("No hay solución en el campo de los reales");
        }
    }

    public void calcular(Raices nombre) {
        if (tieneRaices(nombre)) {
            obtenerRaices(nombre);
        } else if (tieneRaiz(nombre)) {
            obtenerRaiz(nombre);
        } else {
            System.out.println("No hay soluciones reales");
        }
    }
}
