package negocio;


import java.util.ArrayList;
import java.util.List;

public class ObservableHistorialMedico {
    private List<Observer> observadores;
    
    public ObservableHistorialMedico() {
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensaje) {
        for (Observer observador : observadores) {
            observador.update(mensaje);
        }
    }
}
