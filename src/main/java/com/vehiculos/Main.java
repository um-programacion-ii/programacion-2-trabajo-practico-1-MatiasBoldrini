package com.vehiculos;

/**
 * Clase principal para demostrar la funcionalidad de vehículos y
 * el principio de Sustitución de Liskov (LSP).
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión de Vehículos ===");

        try {
            // Crear instancias de diferentes tipos de vehículos
            Vehiculo vehiculoGenerico = new Vehiculo("ABC123", "Toyota", 2020, 800.5);
            Vehiculo camion = new Camion("CAM001", "Volvo", 2019, 5000, true);
            Vehiculo auto = new Auto("AUT001", "Honda", 2022, 400, 5);

            // Demostración del principio LSP: todos los subtipos se pueden usar
            // a través de la interfaz de la clase base
            System.out.println("\n=== Demostración del principio LSP ===");

            // Crear un array de vehículos que incluye diferentes subtipos
            Vehiculo[] vehiculos = new Vehiculo[3];
            vehiculos[0] = vehiculoGenerico;
            vehiculos[1] = camion;
            vehiculos[2] = auto;

            // Imprimir todos los vehículos usando la misma interfaz
            for (int i = 0; i < vehiculos.length; i++) {
                System.out.println("\n--- Vehículo " + (i + 1) + " ---");
                imprimirInformacionVehiculo(vehiculos[i]);
            }

            // Demostración avanzada: usar impresores específicos
            System.out.println("\n=== Impresores específicos para cada tipo ===");

            VehiculoPrinter printerGenerico = new VehiculoPrinter();
            VehiculoPrinter printerCamion = new CamionPrinter();
            VehiculoPrinter printerAuto = new AutoPrinter();

            printerGenerico.imprimirVehiculoConTitulo(vehiculoGenerico, "Vehículo Genérico");
            printerCamion.imprimirVehiculoConTitulo(camion, "Camión");
            printerAuto.imprimirVehiculoConTitulo(auto, "Auto");

            // Prueba LSP: podemos pasar cualquier subtipo donde se espera el tipo base
            System.out.println("\n=== Prueba LSP con impresores ===");

            // Array de impresores
            VehiculoPrinter[] impresores = new VehiculoPrinter[3];
            impresores[0] = printerGenerico;
            impresores[1] = printerCamion;
            impresores[2] = printerAuto;

            // Usar cualquier impresor con cualquier vehículo
            for (int i = 0; i < impresores.length; i++) {
                for (int j = 0; j < vehiculos.length; j++) {
                    impresores[i].imprimirVehiculoConTitulo(vehiculos[j],
                            "Impresor " + (i + 1) + " con Vehículo " + (j + 1));
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Método estático que demuestra cómo podemos usar un vehículo
     * sin importar su tipo específico (LSP).
     * 
     * @param vehiculo El vehículo del cual mostrar información
     */
    private static void imprimirInformacionVehiculo(Vehiculo vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");

        // Manejo polimórfico de los diferentes tipos
        if (vehiculo instanceof Auto) {
            Auto auto = (Auto) vehiculo;
            System.out.println("Tipo: Auto");
            System.out.println("Cantidad de pasajeros: " + auto.getCantidadPasajeros());
        } else if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.println("Tipo: Camión");
            System.out.println("Tiene acoplado: " + (camion.getTieneAcoplado() ? "Sí" : "No"));
        } else {
            System.out.println("Tipo: Vehículo genérico");
        }
    }
}