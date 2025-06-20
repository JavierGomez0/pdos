package org.javier.System;

import org.javier.Model.*;
import java.util.Scanner;

/**
 *
 * @author jgome
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Sistema de Figuras Geométricas
                    ejecutarSistemaFiguras();
                    break;
                case 2:
                    // Jerarquía de Empleados
                    ejecutarJerarquiaEmpleados();
                    break;
                case 3:
                    // Sistema de Vehículos
                    ejecutarSistemaVehiculos();
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Sistema de Figuras Geométricas");
        System.out.println("2. Jerarquía de Empleados");
        System.out.println("3. Sistema de Vehículos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para ejecutar el sistema de figuras geométricas
    public static void ejecutarSistemaFiguras() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenuFiguras();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Calcular área y perímetro de un círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo);
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    break;
                case 2:
                    // Calcular área y perímetro de un rectángulo
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;
                case 3:
                    // Calcular área y perímetro de un triángulo
                    System.out.print("Ingrese el lado 1 del triángulo: ");
                    double lado1Triangulo = scanner.nextDouble();
                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    double lado2Triangulo = scanner.nextDouble();
                    System.out.print("Ingrese el lado 3 del triángulo: ");
                    double lado3Triangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    break;
                case 4:
                    // Volver al menú principal
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }

    // Método para mostrar el menú de opciones del sistema de figuras geométricas
    public static void mostrarMenuFiguras() {
        System.out.println("\nSistema de Figuras Geométricas:");
        System.out.println("1. Calcular área y perímetro de un círculo");
        System.out.println("2. Calcular área y perímetro de un rectángulo");
        System.out.println("3. Calcular área y perímetro de un triángulo");
        System.out.println("4. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    // Método para ejecutar la jerarquía de empleados
    public static void ejecutarJerarquiaEmpleados() {
        Empleado empleado1 = new Empleado("Juan", 30000);
        Gerente gerente = new Gerente("Ana", 50000, "Ventas");
        Director director = new Director("Pedro", 70000, "Operaciones");

        Empleado[] empleados = {empleado1, gerente, director};

        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println();
        }
    }

    // Método para ejecutar el sistema de vehículos
    public static void ejecutarSistemaVehiculos() {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla");
        Carro carro = new Carro("Ford", "Mustang", "Deportivo");
        Moto moto = new Moto("Honda", "CBR", "Deportiva");

        Vehiculo[] vehiculos = {vehiculo1, carro, moto};

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            System.out.println();
        }
    }
}