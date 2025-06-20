
package org.javier.Model;

/**
 *
 * @author jgome
 */
public class Empleados {
    private String nombre;
    protected double salario;  // Usamos protected para que las clases derivadas puedan acceder a este atributo

    // Constructor
    public Empleados(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para calcular el salario (en este caso, simplemente devuelve el salario)
    public double calcularSalario() {
        return salario;
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }
}
class Gerente extends Empleado {
    private double bono;

    // Constructor
    public Gerente(String nombre, double salario, double bono) {
        this.bono = bono;
    }

    // Método para calcular el salario (incluye el bono)
    public double calcularSalario() {
        double salario = 0;
        return salario + bono;
    }
}
class Desarrollador extends Empleado {
    private String lenguaje;

    // Constructor
    public Desarrollador(String nombre, double salario, String lenguaje) {
        this.lenguaje = lenguaje;
    }

    // Método para obtener el lenguaje de programación del desarrollador
    public String getLenguaje() {
        return lenguaje;
    }
}
class Diseñador extends Empleado {
    private String herramienta;

    // Constructor
    public Diseñador(String nombre, double salario, String herramienta) {
        this.herramienta = herramienta;
    }

    // Método para obtener la herramienta de diseño del diseñador
    public String getHerramienta() {
        return herramienta;
    }
}