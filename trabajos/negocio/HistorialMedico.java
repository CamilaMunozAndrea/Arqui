package negocio;
import datos.Cita;
import datos.Doctor;
import datos.Paciente;
import java.util.ArrayList;
import java.util.List;
public class HistorialMedico extends ObservableHistorialMedico {
    private static HistorialMedico instancia;
    private List<Cita> citas;

    private HistorialMedico() {
        this.citas = new ArrayList<>();
    }

    public static HistorialMedico obtenerInstancia() {
        if (instancia == null) {
            instancia = new HistorialMedico();
        }
        return instancia;
    }

    public void agendarCita(Doctor doctor, Paciente paciente, String fecha, String hora) {
        Cita cita = new Cita(doctor, paciente, fecha, hora);
        citas.add(cita);
        notificarObservadores("Nueva cita agendada para el " + fecha + " a las " + hora + " con el Dr. " + doctor.getNombre() + " para el paciente " + paciente.getNombre());
    }

    public void verCitas() {
        System.out.println("Próximas citas:");
        for (Cita cita : citas) {
            System.out.println("- Fecha: " + cita.getFecha() + ", Hora: " + cita.getHora() + ", Dr. " + cita.getDoctor().getNombre() + " - Paciente: " + cita.getPaciente().getNombre());
        }
    }
}

