package datos;
import negocio.CitaDecorator;

public class Cita implements CitaDecorator {
    private Doctor doctor;
    private Paciente paciente;
    private String fecha;
    private String hora;

    public Cita(Doctor doctor, Paciente paciente, String fecha, String hora) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }
    @Override
    public String obtenerDescripcion() {
        return "Cita con el Dr. " + doctor.getNombre() + " para el paciente " + paciente.getNombre() +
               " el " + fecha + " a las " + hora;
    }
    // Getters y Setters
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
