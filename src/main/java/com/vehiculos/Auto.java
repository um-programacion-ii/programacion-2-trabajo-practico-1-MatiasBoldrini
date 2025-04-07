package com.vehiculos;

/**
 * Subclase que representa un automóvil, extendiendo la clase Vehiculo.
 * Demuestra el principio de Sustitución de Liskov (LSP).
 */
public class Auto extends Vehiculo {

    // Constantes
    private static final int CANTIDAD_PASAJEROS_MINIMA = 1;

    // Atributo adicional específico para autos
    private int cantidadPasajeros;

    /**
     * Constructor para crear un automóvil.
     * 
     * @param patente           Número de patente del automóvil
     * @param marca             Marca del automóvil
     * @param anio              Año de fabricación del automóvil
     * @param capacidadCargaKg  Capacidad de carga en kilogramos
     * @param cantidadPasajeros Cantidad de pasajeros que puede transportar
     */
    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        // Llamada al constructor de la clase padre
        super(patente, marca, anio, capacidadCargaKg);

        // Validación específica de Auto
        if (cantidadPasajeros < CANTIDAD_PASAJEROS_MINIMA) {
            throw new IllegalArgumentException(
                    "La cantidad de pasajeros debe ser al menos " + CANTIDAD_PASAJEROS_MINIMA);
        }

        this.cantidadPasajeros = cantidadPasajeros;
    }

    /**
     * Obtiene la cantidad de pasajeros que puede transportar el automóvil.
     * 
     * @return la cantidad de pasajeros
     */
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    /**
     * Establece la cantidad de pasajeros que puede transportar el automóvil.
     * 
     * @param cantidadPasajeros valor a establecer
     * @throws IllegalArgumentException si el valor es menor que el mínimo permitido
     */
    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros < CANTIDAD_PASAJEROS_MINIMA) {
            throw new IllegalArgumentException(
                    "La cantidad de pasajeros debe ser al menos " + CANTIDAD_PASAJEROS_MINIMA);
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }
}