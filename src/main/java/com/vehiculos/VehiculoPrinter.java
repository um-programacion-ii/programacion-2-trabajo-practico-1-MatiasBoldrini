package com.vehiculos;

/**
 * Clase que se encarga de imprimir información de vehículos.
 * Aplicando el principio de Responsabilidad Única (SRP).
 */
public class VehiculoPrinter {

    /**
     * Muestra la información completa de un vehículo.
     * 
     * @param vehiculo El vehículo del cual mostrar la información
     */
    public void imprimirVehiculo(Vehiculo vehiculo) {
        System.out.println("Información del vehículo:");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }

    /**
     * Imprime la información del vehículo con un título personalizado.
     * 
     * @param vehiculo El vehículo a imprimir
     * @param titulo   El título que precederá a la información del vehículo
     */
    public void imprimirVehiculoConTitulo(Vehiculo vehiculo, String titulo) {
        System.out.println("\n=== " + titulo + " ===");
        imprimirVehiculo(vehiculo);
    }
}