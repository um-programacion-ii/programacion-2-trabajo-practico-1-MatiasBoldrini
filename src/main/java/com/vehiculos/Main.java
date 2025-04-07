package com.vehiculos;

/**
 * Clase principal para demostrar la funcionalidad de vehículos y el principio OCP.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión de Vehículos ===");
        
        try {
            // Crear vehículos genéricos
            Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 800.5);
            Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Ford", 2018, 750.0);
            
            // Crear camiones (usando polimorfismo)
            Vehiculo camion1 = new Camion("CAM001", "Volvo", 2019, 5000, true);
            Vehiculo camion2 = new Camion("CAM002", "Scania", 2021, 4500, false);
            
            // Crear impresores
            VehiculoPrinter vehiculoPrinter = new VehiculoPrinter();
            VehiculoPrinter camionPrinter = new CamionPrinter();
            
            // Imprimir vehículos usando el impresor genérico
            System.out.println("\n=== Vehículos genéricos con impresor genérico ===");
            vehiculoPrinter.imprimirVehiculoConTitulo(vehiculo1, "Vehículo 1");
            vehiculoPrinter.imprimirVehiculoConTitulo(vehiculo2, "Vehículo 2");
            
            // Imprimir camiones usando el impresor específico de camiones
            System.out.println("\n=== Camiones con impresor específico ===");
            camionPrinter.imprimirVehiculoConTitulo(camion1, "Camión 1");
            camionPrinter.imprimirVehiculoConTitulo(camion2, "Camión 2");
            
            // Demostración del principio OCP: el código existente no se modificó
            // pero puede manejar nuevos tipos de vehículos
            System.out.println("\n=== Demostración de OCP: ===");
            System.out.println("Vehículo genérico usando impresor de camiones (no muestra información de acoplado):");
            camionPrinter.imprimirVehiculoConTitulo(vehiculo1, "Vehículo genérico");
            
            System.out.println("\nCamión usando impresor genérico (no muestra información de acoplado):");
            vehiculoPrinter.imprimirVehiculoConTitulo(camion1, "Camión con impresor genérico");
            

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
