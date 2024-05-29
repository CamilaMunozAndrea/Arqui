package datos;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private static BaseDeDatos instancia;
    private List<Paciente> pacientes;
    private List<Doctor> doctores;
    private List<Cita> citas;

    private BaseDeDatos() {
        pacientes = new ArrayList<>();
        doctores = new ArrayList<>();
        citas = new ArrayList<>();
    }

    public static BaseDeDatos obtenerInstancia() {
        if (instancia == null) {
            instancia = new BaseDeDatos();
        }
        return instancia;
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public List<Paciente> obtenerPacientes() {
        return pacientes;
    }

    public List<Doctor> obtenerDoctores() {
        return doctores;
    }

    public List<Cita> obtenerCitas() {
        return citas;
    }
}
