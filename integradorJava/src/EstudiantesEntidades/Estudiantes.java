/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudiantesEntidades;

/**
 *
 * @author Hogar
 */
public class Estudiantes {
    private String nombre;
    private double nota;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Estudiantes(double nota, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
            
    
    
}
