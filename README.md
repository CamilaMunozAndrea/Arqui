# Proyecto de Gestión de Citas Médicas
Este proyecto es una aplicacion de consola para la gestión de citas medicas. Permite a los usuarios agregar pacientes y doctores, agendar citas, y recibir notificaciones de nuevas citas.

- **Tecnologias:** Java
- **Requisitos Previos:** Debemos tener instalados Java Development Kit (JDK) y BlueJ
- **Enlace del repositorio:** [Repositorio](https://github.com/CamilaMunozAndrea/Arqui.git)
- **Clone el repositorio:**
    ```
    git clone https://github.com/CamilaMunozAndrea/Arqui.git
    ```
## Estructura del Proyecto
El proyecto se organiza en una arquitectura de 3 capas:
**Capa de Presentación:** Interactúa con el usuario a través de la terminal ademas contiene la clase Main.
**Capa de Lógica de Negocio:** Contiene la lógica de negocio y la gestión de las citas médicas, contiene las clases HistorialMedico y las interfaces y clases relacionadas con el patrón Observer.
**Capa de Acceso a Datos:** Gestiona la comunicacion y el almacenamiento de datos, contiene la clase BaseDeDatos.

## Principios SOLID Aplicados

- Single Responsibility Principle (SRP): En las clases Doctor, Paciente, y Cita, cada clase tiene una unica responsabilidad relacionada con la información específica de doctores, pacientes y citas.
- Open/Closed Principle (OCP): En la clase CitaDecorator con sus implementeaciones se permiten extender las funcionalidades de las citas sin modificar las clases que ya tenemos.
- Liskov Substitution Principle (LSP): en la clase CitaDecorator sus implementaciones pueden ser usadas de forma intercambiable sin alterar la funcionalidad del programa.
- Interface Segregation Principle (ISP): tenemos el Observer el cual define una interfaz específica para la actualizacion de observadores.
- Dependency Inversion Principle (DIP): tenemos la clase ObservableHistorialMedico y Observer, el uso de interfaces para observadores permite desacoplar la dependencia directa entre las clases.

## Patrones de Diseño Aplicados
1. Comportamiento - Observer: con este patron implementado se permite notificar a los observadores (como ClienteObservador) cuando se agendan nuevas citas.
2. Creacional - Singleton: garantiza que ambas clases tengan una unica instancia a lo largo del ciclo de vida de la aplicacion.
3. Estructural - Decorator: este patron nos permite añadir funcionalidades adicionales a las citas de forma flexible y extensible.
