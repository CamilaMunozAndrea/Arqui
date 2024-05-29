package negocio;
import datos.Cita;

public class RecordatorioCitaDecorator implements CitaDecorator {
    private final Cita cita;

    public RecordatorioCitaDecorator(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String obtenerDescripcion() {
        return cita.obtenerDescripcion() + ", con recordatorio";
    }
}

