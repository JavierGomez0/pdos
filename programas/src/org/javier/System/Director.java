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
public class Director extends Empleado {
    private String division;

    public Director(String nombre, double salario, String division) {
        super(nombre, salario);
        this.division = division;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("División: " + division);
    }
}
