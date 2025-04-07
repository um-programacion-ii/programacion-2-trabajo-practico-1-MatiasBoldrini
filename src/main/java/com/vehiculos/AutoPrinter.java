package com.vehiculos;

/**
 * Clase especializada en imprimir automóviles.
 * Extiende de VehiculoPrinter, demostrando el principio de Sustitución de
 * Liskov (LSP).
 */
public class AutoPrinter extends VehiculoPrinter {

    /**
     * Sobrescribe el método para agregar los detalles específicos de un automóvil.
     * 
     * @param vehiculo El vehículo (debe ser un Auto) del cual mostrar los detalles
     *                 específicos
     */
    @Override
    protected void imprimirDetallesEspecificos(Vehiculo vehiculo) {
        if (vehiculo instanceof Auto) {
            Auto auto = (Auto) vehiculo;
            System.out.println("Cantidad de pasajeros: " + auto.getCantidadPasajeros());
        }
    }
}