/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javier.System;

/**
 *
 * @author jgome
 */
class Vehiculo {
      private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

