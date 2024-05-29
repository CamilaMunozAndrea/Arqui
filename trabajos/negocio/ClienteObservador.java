package negocio;


public class ClienteObservador implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Cliente: Se ha notificado una nueva cita - " + mensaje);
    }
}

