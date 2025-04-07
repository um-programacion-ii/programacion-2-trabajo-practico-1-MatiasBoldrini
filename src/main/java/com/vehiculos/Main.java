package com.vehiculos;

/**
 * Clase principal para demostrar la funcionalidad de las clases Vehiculo y
 * VehiculoPrinter.

 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión de Vehículos ===");

        try {
            // Creación de al menos 3 vehículos diferentes
            Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 800.5);
            Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Ford", 2018, 750.0);
            Vehiculo vehiculo3 = new Vehiculo("DEF456", "Honda", 2022, 600.25);

            // Crear el impresor de vehículos
            VehiculoPrinter printer = new VehiculoPrinter();

            // Imprimir información de los vehículos
            printer.imprimirVehiculoConTitulo(vehiculo1, "Vehículo 1");
            printer.imprimirVehiculoConTitulo(vehiculo2, "Vehículo 2");
            printer.imprimirVehiculoConTitulo(vehiculo3, "Vehículo 3");


            // Demostración de getters y setters
            System.out.println("\n=== Modificación de vehículo ===");
            System.out.println("Marca original del vehículo 1: " + vehiculo1.getMarca());
            vehiculo1.setMarca("Mazda");
            System.out.println("Nueva marca del vehículo 1: " + vehiculo1.getMarca());

            // Mostrar información actualizada
            printer.imprimirVehiculoConTitulo(vehiculo1, "Vehículo 1 (Actualizado)");


        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}