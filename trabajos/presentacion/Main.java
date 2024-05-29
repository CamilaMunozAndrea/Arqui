package presentacion;

import negocio.HistorialMedico;
import datos.BaseDeDatos;
import datos.Doctor;
import datos.Paciente;
import datos.Cita;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseDeDatos baseDeDatos = BaseDeDatos.obtenerInstancia();

        // Agregar nuevo paciente
        System.out.println("Ingrese el nombre del paciente:");
        String nombrePaciente = scanner.nextLine();

        System.out.println("Ingrese la edad del paciente:");
        int edadPaciente = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese la dirección del paciente:");
        String direccionPaciente = scanner.nextLine();

        Paciente paciente = new Paciente(nombrePaciente, edadPaciente, direccionPaciente);
        baseDeDatos.agregarPaciente(paciente);
        System.out.println("Nuevo paciente agregado: " + paciente.getNombre());

        // Agregar nuevo doctor
        System.out.println("Ingrese el nombre del doctor:");
        String nombreDoctor = scanner.nextLine();

        System.out.println("Ingrese la especialización del doctor:");
        String especializacionDoctor = scanner.nextLine();

        Doctor doctor = new Doctor(nombreDoctor, especializacionDoctor);
        baseDeDatos.agregarDoctor(doctor);
        System.out.println("Nuevo doctor agregado: " + doctor.getNombre());

        // Agregar nueva cita
        System.out.println("Ingrese la fecha de la cita (DD/MM/AAAA):");
        String fechaCita = scanner.nextLine();

        System.out.println("Ingrese la hora de la cita:");
        String horaCita = scanner.nextLine();

        System.out.println("¿Desea asignar la cita al paciente " + paciente.getNombre() + " con el doctor " + doctor.getNombre() + "? (S/N)");
        String confirmacion = scanner.nextLine();

        if (confirmacion.equalsIgnoreCase("S")) {
            Cita cita = new Cita(doctor, paciente, fechaCita, horaCita);
            baseDeDatos.agregarCita(cita);
            System.out.println("Nueva cita agregada para el paciente " + paciente.getNombre() + " con el doctor " + doctor.getNombre());
        } else {
            System.out.println("La cita no fue agendada.");
        }

        scanner.close();
    }
}
