package com.vehiculos;

import java.util.ArrayList;

/**
 * Clase que gestiona una colección de vehículos usando ArrayList.
 */
public class GestorVehiculos {

    private ArrayList<Vehiculo> vehiculos;
    private VehiculoPrinter printer;

    /**
     * Constructor que inicializa la lista de vehículos y el impresor.
     */
    public GestorVehiculos() {
        vehiculos = new ArrayList<>();
        printer = new VehiculoPrinter();
    }

    /**
     * Agrega un vehículo a la lista.
     * 
     * @param vehiculo Vehículo a agregar
     * @return true si se agregó correctamente
     */
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            return false;
        }
        return vehiculos.add(vehiculo);
    }

    /**
     * Elimina un vehículo de la lista por su posición.
     * 
     * @param indice Índice del vehículo a eliminar
     * @return El vehículo eliminado o null si el índice es inválido
     */
    public Vehiculo eliminarVehiculo(int indice) {
        if (indice < 0 || indice >= vehiculos.size()) {
            return null;
        }
        return vehiculos.remove(indice);
    }

    /**
     * Busca un vehículo por su patente.
     * 
     * @param patente Patente a buscar
     * @return El vehículo encontrado o null si no existe
     */
    public Vehiculo buscarPorPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            return null;
        }

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equalsIgnoreCase(patente.trim())) {
                return vehiculo;
            }
        }

        return null;
    }

    /**
     * Obtiene la cantidad de vehículos en la lista.
     * 
     * @return Número de vehículos
     */
    public int getCantidadVehiculos() {
        return vehiculos.size();
    }

    /**
     * Obtiene un vehículo por su índice.
     * 
     * @param indice Posición del vehículo
     * @return El vehículo en esa posición o null si el índice es inválido
     */
    public Vehiculo getVehiculo(int indice) {
        if (indice < 0 || indice >= vehiculos.size()) {
            return null;
        }
        return vehiculos.get(indice);
    }

    /**
     * Imprime todos los vehículos de la lista.
     */
    public void imprimirTodosLosVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        System.out.println("\n=== Lista de Vehículos (" + vehiculos.size() + ") ===");
        for (int i = 0; i < vehiculos.size(); i++) {
            printer.imprimirVehiculoConTitulo(vehiculos.get(i), "Vehículo #" + (i + 1));
        }
    }

    /**
     * Imprime un vehículo buscándolo por su patente.
     * 
     * @param patente Patente del vehículo a imprimir
     * @return true si se encontró e imprimió el vehículo, false en caso contrario
     */
    public boolean imprimirVehiculoPorPatente(String patente) {
        Vehiculo vehiculo = buscarPorPatente(patente);
        if (vehiculo == null) {
            System.out.println("No se encontró ningún vehículo con la patente: " + patente);
            return false;
        }

        printer.imprimirVehiculoConTitulo(vehiculo, "Vehículo con patente " + patente);
        return true;
    }
}