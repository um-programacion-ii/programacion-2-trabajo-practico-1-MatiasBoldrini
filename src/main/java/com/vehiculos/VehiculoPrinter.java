package com.vehiculos;

/**
 * Clase que se encarga de imprimir información de vehículos.
 * Diseñada siguiendo el principio Abierto/Cerrado (OCP).
 */
public class VehiculoPrinter {

    /**
     * Muestra la información completa de un vehículo.
     * 
     * @param vehiculo El vehículo del cual mostrar la información
     */
    public void imprimirVehiculo(Vehiculo vehiculo) {
        System.out.println("Información del vehículo:");
        imprimirDetallesBasicos(vehiculo);
        imprimirDetallesEspecificos(vehiculo);
    }
    /**
     * Imprime los detalles básicos comunes a todos los vehículos.
     * Este método es final para garantizar que todos los vehículos
     * muestren esta información de manera consistente.
     * 
     * @param vehiculo El vehículo del cual mostrar los detalles básicos
     */
    protected final void imprimirDetallesBasicos(Vehiculo vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }


    /**
     * Imprime detalles específicos del tipo de vehículo.
     * Este método está diseñado para ser sobrescrito por las subclases.
     * 
     * @param vehiculo El vehículo del cual mostrar los detalles específicos
     */
    protected void imprimirDetallesEspecificos(Vehiculo vehiculo) {
        // No hay detalles específicos para la clase base
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
