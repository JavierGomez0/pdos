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
class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

