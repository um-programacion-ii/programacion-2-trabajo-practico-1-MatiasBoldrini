package com.vehiculos;

import java.time.Year;

/**
 * Clase base que representa un vehículo genérico.
 */
public class Vehiculo {
    // Constantes
    private static final int ANIO_MINIMO = 1900;
    private static final int ANIO_ACTUAL = Year.now().getValue();

    // Atributos
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    /**
     * Constructor completo para crear un vehículo.
     * 
     * @param patente          Número de patente del vehículo
     * @param marca            Marca del vehículo
     * @param anio             Año de fabricación del vehículo
     * @param capacidadCargaKg Capacidad de carga en kilogramos
     * @throws IllegalArgumentException si algún parámetro no cumple con las
     *                                  validaciones
     */
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        // Validaciones
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía");
        }

        if (anio < ANIO_MINIMO || anio > ANIO_ACTUAL) {
            throw new IllegalArgumentException("El año debe estar entre " + ANIO_MINIMO + " y " + ANIO_ACTUAL);
        }

        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }


    /**
     * Muestra la información completa del vehículo.
     */
    public void mostrarInformacion() {
        System.out.println("Información del vehículo:");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Capacidad de carga: " + capacidadCargaKg + " kg");
    }


    // Getters y setters

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < ANIO_MINIMO || anio > ANIO_ACTUAL) {
            throw new IllegalArgumentException("El año debe estar entre " + ANIO_MINIMO + " y " + ANIO_ACTUAL);
        }
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }
}