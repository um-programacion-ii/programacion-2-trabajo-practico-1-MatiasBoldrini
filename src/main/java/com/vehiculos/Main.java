package com.vehiculos;

/**
 * Clase principal para demostrar la funcionalidad de la clase Vehiculo.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión de Vehículos ===");

        try {
            // Creación de al menos 3 vehículos diferentes
            Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 800.5);
            Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Ford", 2018, 750.0);
            Vehiculo vehiculo3 = new Vehiculo("DEF456", "Honda", 2022, 600.25);

            System.out.println("\n=== Vehículo 1 ===");
            vehiculo1.mostrarInformacion();

            System.out.println("\n=== Vehículo 2 ===");
            vehiculo2.mostrarInformacion();

            System.out.println("\n=== Vehículo 3 ===");
            vehiculo3.mostrarInformacion();

            // Demostración de getters y setters
            System.out.println("\n=== Modificación de vehículo ===");
            System.out.println("Marca original del vehículo 1: " + vehiculo1.getMarca());
            vehiculo1.setMarca("Mazda");
            System.out.println("Nueva marca del vehículo 1: " + vehiculo1.getMarca());

            // Mostrar información actualizada
            System.out.println("\n=== Vehículo 1 (Actualizado) ===");
            vehiculo1.mostrarInformacion();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}