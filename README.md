[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/-JQrLgaz)
# 🧠 Trabajo Práctico: Sistema de Gestión de Vehículos (Java + SOLID + GitHub)

## 📋 Información del Alumno
- **Nombre y Apellido:** Matias Boldrini

## 📌 Objetivo General

Desarrollar una aplicación en Java para gestionar vehículos de una empresa, aplicando los principios de programación orientada a objetos y los **primeros tres principios SOLID**:  
**SRP (Single Responsibility), OCP (Open/Closed) y LSP (Liskov Substitution)**.

A lo largo del trabajo se utilizará también la estructura `ArrayList` para manejar listas dinámicas de vehículos.

Además, deberán aplicar buenas prácticas de **gestión de proyectos usando GitHub**: `Issues`, `Milestones`, `Projects` y `Pull Requests`.

---

## 🧩 Tecnologías y Herramientas

- Java SE (cualquier versión compatible con JDK 8+)
- Git y GitHub
- GitHub Projects
- GitHub Issues
- GitHub Pull Requests

---

## 📘 Etapas del Trabajo

El trabajo está dividido en etapas. Cada etapa deberá registrarse como un **Milestone** en GitHub.

### Etapa 1: Clases Básicas
- Crear la clase `Vehiculo` con atributos: `patente`, `marca`, `año`, `capacidadCargaKg`.
- Agregar constructor, getters/setters y método `mostrarInformacion()`.
- Crear la clase `Main` que cree e imprima al menos 3 vehículos.

### Etapa 2: Aplicar SRP
- Extraer la responsabilidad de impresión a una nueva clase `VehiculoPrinter`.
- Eliminar el método `mostrarInformacion()` de `Vehiculo`.

### Etapa 3: Aplicar OCP
- Crear subclase `Camion` con atributo `tieneAcoplado`.
- Modificar `VehiculoPrinter` para imprimir camiones sin modificar el código existente (usar polimorfismo).

### Etapa 4: Aplicar LSP
- Crear subclase `Auto` con atributo `cantidadPasajeros`.
- Validar que se puedan tratar todos los vehículos desde una misma interfaz (`Vehiculo`).

### Etapa 5: Uso de ArrayList
- Usar `ArrayList<Vehiculo>` para gestionar todos los vehículos.
- Recorrer e imprimir usando `VehiculoPrinter`.
- (Opcional) Buscar por patente dentro de la lista.

---

## 🚀 Instrucciones para Ejecutar el Proyecto

### Requisitos Previos
- Java Development Kit (JDK) 8 o superior
- Entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o Visual Studio Code (opcional)
- Git instalado (para clonar el repositorio)

### Pasos para Compilar y Ejecutar

#### Usando Terminal

1. Clonar el repositorio:
   ```
   git clone https://github.com/um-programacion-ii/programacion-2-trabajo-practico-1-MatiasBoldrini.git
   ```

2. Navegar al directorio del proyecto:
   ```
   cd programacion-2-trabajo-practico-1-MatiasBoldrini
   ```

3. Compilar el proyecto:
   ```
   javac -d ./bin src/main/java/com/vehiculos/*.java
   ```

4. Ejecutar la aplicación:
   ```
   java -cp ./bin com.vehiculos.Main
   ```

#### Usando un IDE

1. Importar el proyecto en su IDE favorito.
2. Asegurarse de que la estructura de directorios es correcta.
3. Compilar el proyecto usando la funcionalidad del IDE.
4. Ejecutar la clase `Main` ubicada en el paquete `com.vehiculos`.

### Ejemplos de Uso

Al ejecutar la aplicación, se mostrará un menú con las siguientes opciones:

```
=== MENÚ PRINCIPAL ===
1. Ver todos los vehículos
2. Buscar vehículo por patente
3. Agregar nuevo vehículo
4. Eliminar vehículo
5. Mostrar cantidad de vehículos
6. Salir
Seleccione una opción: 
```

#### Ver todos los vehículos (Opción 1)
Muestra la información de todos los vehículos registrados en el sistema.

#### Buscar vehículo por patente (Opción 2)
```
Ingrese la patente a buscar: AUT001

=== Vehículo con patente AUT001 ===
Información del vehículo:
Patente: AUT001
Marca: Honda
Año: 2022
Capacidad de carga: 400.0 kg
Tipo: Auto
Cantidad de pasajeros: 5
```

#### Agregar nuevo vehículo (Opción 3)
```
=== AGREGAR NUEVO VEHÍCULO ===
Tipo de vehículo:
1. Vehículo genérico
2. Auto
3. Camión
Seleccione el tipo: 2
Patente: AUT003
Marca: BMW
Año: 2023
Capacidad de carga (kg): 500
Cantidad de pasajeros: 4
Vehículo agregado correctamente.
```

#### Eliminar vehículo (Opción 4)
```
=== ELIMINAR VEHÍCULO ===
Ingrese la posición del vehículo a eliminar (1-7): 1
Vehículo eliminado: Patente VEH001
```

---

## 📝 Licencia

Este trabajo es parte del curso de Programación 2 de Ingeniería en Informática. Uso educativo únicamente.
