package datos;

public class Doctor {
    private String nombre;
    private String especializacion;

    public Doctor(String nombre, String especializacion) {
        this.nombre = nombre;
        this.especializacion = especializacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
