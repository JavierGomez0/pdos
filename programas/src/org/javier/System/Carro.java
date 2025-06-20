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
public class Carro extends Vehiculo {
     private String tipo;

    public Carro(String marca, String modelo, String tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }
}

