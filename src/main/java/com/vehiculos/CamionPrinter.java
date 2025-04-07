package com.vehiculos;

/**
 * Clase especializada en imprimir camiones.
 * Extiende de VehiculoPrinter, demostrando el principio OCP.
 */
public class CamionPrinter extends VehiculoPrinter {

    /**
     * Sobrescribe el método para agregar los detalles específicos de un camión.
     * 
     * @param vehiculo El vehículo (debe ser un Camion) del cual mostrar los
     *                 detalles específicos
     */
    @Override
    protected void imprimirDetallesEspecificos(Vehiculo vehiculo) {
        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.println("Tiene acoplado: " + (camion.getTieneAcoplado() ? "Sí" : "No"));
        }
    }
}