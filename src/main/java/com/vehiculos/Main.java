package com.vehiculos;

import java.util.Scanner;

/**
 * Clase principal para demostrar la funcionalidad del sistema
 * usando ArrayList para gestionar vehículos.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GestorVehiculos gestor = new GestorVehiculos();

    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión de Vehículos con ArrayList ===");

        // Cargar algunos vehículos de prueba
        cargarVehiculosDePrueba();

        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);

        scanner.close();
        System.out.println("¡Gracias por usar el Sistema de Gestión de Vehículos!");
    }

    /**
     * Carga algunos vehículos de prueba en el sistema.
     */
    private static void cargarVehiculosDePrueba() {
        try {
            // Agregar vehículos genéricos
            gestor.agregarVehiculo(new Vehiculo("VEH001", "Toyota", 2020, 800.5));
            gestor.agregarVehiculo(new Vehiculo("VEH002", "Ford", 2018, 750.0));

            // Agregar autos
            gestor.agregarVehiculo(new Auto("AUT001", "Honda", 2022, 400, 5));
            gestor.agregarVehiculo(new Auto("AUT002", "Chevrolet", 2021, 350, 4));

            // Agregar camiones
            gestor.agregarVehiculo(new Camion("CAM001", "Volvo", 2019, 5000, true));
            gestor.agregarVehiculo(new Camion("CAM002", "Scania", 2021, 4500, false));

            System.out.println("Se han cargado " + gestor.getCantidadVehiculos() + " vehículos de prueba.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al cargar vehículos de prueba: " + e.getMessage());
        }
    }

    /**
     * Muestra el menú de opciones del sistema.
     */
    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Ver todos los vehículos");
        System.out.println("2. Buscar vehículo por patente");
        System.out.println("3. Agregar nuevo vehículo");
        System.out.println("4. Eliminar vehículo");
        System.out.println("5. Mostrar cantidad de vehículos");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Obtiene la opción seleccionada por el usuario.
     * 
     * @return número de opción seleccionada
     */
    private static int obtenerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0; // Opción inválida
        }
    }

    /**
     * Procesa la opción seleccionada por el usuario.
     * 
     * @param opcion número de opción a procesar
     */
    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                // Ver todos los vehículos
                gestor.imprimirTodosLosVehiculos();
                break;

            case 2:
                // Buscar vehículo por patente
                buscarVehiculoPorPatente();
                break;

            case 3:
                // Agregar nuevo vehículo
                agregarNuevoVehiculo();
                break;

            case 4:
                // Eliminar vehículo
                eliminarVehiculo();
                break;

            case 5:
                // Mostrar cantidad de vehículos
                System.out.println("Cantidad de vehículos en el sistema: " + gestor.getCantidadVehiculos());
                break;

            case 6:
                // Salir
                System.out.println("Saliendo del sistema...");
                break;

            default:
                System.out.println("Opción inválida. Por favor intente nuevamente.");
                break;
        }
    }

    /**
     * Busca un vehículo por su patente y lo muestra.
     */
    private static void buscarVehiculoPorPatente() {
        System.out.print("Ingrese la patente a buscar: ");
        String patente = scanner.nextLine();

        if (!gestor.imprimirVehiculoPorPatente(patente)) {
            System.out.println("No se encontró ningún vehículo con esa patente.");
        }
    }

    /**
     * Agrega un nuevo vehículo al sistema.
     */
    private static void agregarNuevoVehiculo() {
        System.out.println("\n=== AGREGAR NUEVO VEHÍCULO ===");
        System.out.println("Tipo de vehículo:");
        System.out.println("1. Vehículo genérico");
        System.out.println("2. Auto");
        System.out.println("3. Camión");
        System.out.print("Seleccione el tipo: ");

        int tipo;
        try {
            tipo = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Tipo inválido. Operación cancelada.");
            return;
        }

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo inválido. Operación cancelada.");
            return;
        }

        try {
            System.out.print("Patente: ");
            String patente = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Año: ");
            int anio = Integer.parseInt(scanner.nextLine());

            System.out.print("Capacidad de carga (kg): ");
            double capacidadCarga = Double.parseDouble(scanner.nextLine());

            Vehiculo vehiculo = null;

            switch (tipo) {
                case 1:
                    // Vehículo genérico
                    vehiculo = new Vehiculo(patente, marca, anio, capacidadCarga);
                    break;

                case 2:
                    // Auto
                    System.out.print("Cantidad de pasajeros: ");
                    int cantidadPasajeros = Integer.parseInt(scanner.nextLine());
                    vehiculo = new Auto(patente, marca, anio, capacidadCarga, cantidadPasajeros);
                    break;

                case 3:
                    // Camión
                    System.out.print("¿Tiene acoplado? (S/N): ");
                    boolean tieneAcoplado = scanner.nextLine().trim().equalsIgnoreCase("S");
                    vehiculo = new Camion(patente, marca, anio, capacidadCarga, tieneAcoplado);
                    break;
            }

            if (vehiculo != null && gestor.agregarVehiculo(vehiculo)) {
                System.out.println("Vehículo agregado correctamente.");
            } else {
                System.out.println("No se pudo agregar el vehículo.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número inválido. " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Elimina un vehículo del sistema.
     */
    private static void eliminarVehiculo() {
        if (gestor.getCantidadVehiculos() == 0) {
            System.out.println("No hay vehículos para eliminar.");
            return;
        }

        System.out.println("\n=== ELIMINAR VEHÍCULO ===");
        System.out.print("Ingrese la posición del vehículo a eliminar (1-" + gestor.getCantidadVehiculos() + "): ");

        try {
            int posicion = Integer.parseInt(scanner.nextLine());

            if (posicion < 1 || posicion > gestor.getCantidadVehiculos()) {
                System.out.println("Posición inválida.");
                return;
            }

            Vehiculo eliminado = gestor.eliminarVehiculo(posicion - 1);
            if (eliminado != null) {
                System.out.println("Vehículo eliminado: Patente " + eliminado.getPatente());
            } else {
                System.out.println("No se pudo eliminar el vehículo.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        }
    }
}

