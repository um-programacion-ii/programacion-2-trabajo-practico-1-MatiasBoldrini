package com.vehiculos;

/**
 * Clase que se encarga de imprimir información de vehículos.

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
     */
    protected final void imprimirDetallesBasicos(Vehiculo vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }

    /**
     * Imprime detalles específicos del tipo de vehículo.

     * 
     * @param vehiculo El vehículo del cual mostrar los detalles específicos
     */
    protected void imprimirDetallesEspecificos(Vehiculo vehiculo) {
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
