
package org.javier.Model;

/**
 *
 * @author jgome
 */
public abstract class Vheiculos {
  private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Vheiculos(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para acelerar (simulación)
    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }

    // Método para frenar (simulación)
    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }

    // Métodos para obtener los atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
}
class Coche extends Vehiculo {
    private int numeroPuertas;

    // Constructor
    public Coche(String marca, String modelo, int año, int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Método para obtener el número de puertas
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
class Motocicleta extends Vehiculo {
    private String tipo;

    // Constructor
    public Motocicleta(String marca, String modelo, int año, String tipo) {
        this.tipo = tipo;
    }

    // Método para obtener el tipo de motocicleta
    public String getTipo() {
        return tipo;
    }
}
class Camion extends Vehiculo {
    private double capacidadCarga;

    // Constructor
    public Camion(String marca, String modelo, int año, double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Método para obtener la capacidad de carga del camión
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}