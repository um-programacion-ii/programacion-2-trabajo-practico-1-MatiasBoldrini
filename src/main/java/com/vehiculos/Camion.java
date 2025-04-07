package com.vehiculos;

/**
 * Subclase que representa un camión, extendiendo la clase Vehiculo.
 */
public class Camion extends Vehiculo {

    // Atributo adicional específico para camiones
    private boolean tieneAcoplado;

    /**
     * Constructor para crear un camión.
     * 
     * @param patente          Número de patente del camión
     * @param marca            Marca del camión
     * @param anio             Año de fabricación del camión
     * @param capacidadCargaKg Capacidad de carga en kilogramos
     * @param tieneAcoplado    Indica si el camión tiene acoplado
     */
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        // Llamada al constructor de la clase padre
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    /**
     * Indica si el camión tiene acoplado.
     * 
     * @return true si tiene acoplado, false en caso contrario
     */
    public boolean getTieneAcoplado() {
        return tieneAcoplado;
    }

    /**
     * Establece si el camión tiene acoplado.
     * 
     * @param tieneAcoplado valor a establecer
     */
    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }
}