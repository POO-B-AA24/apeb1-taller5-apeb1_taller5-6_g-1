import java.util.ArrayList;

public class Problema4_CasoCorrupcion {

    private String nombreCaso;
    private int fechaInicio;
    private String estadoCaso;
    private int fechaActual;
    private ArrayList<Problema4_Persona> personasImplicadas = new ArrayList<>();

    public Problema4_CasoCorrupcion(String nombreCaso, int fechaInicio, int fechaActual) {
        this.nombreCaso = nombreCaso;
        this.fechaInicio = fechaInicio;
        this.fechaActual = fechaActual;
    }

    public void calcularEstado() {
        if ((this.fechaActual - this.fechaInicio) >= 7 &&
                (this.fechaActual - this.fechaInicio) < 15) {
            this.estadoCaso = "Alerta";
        } else if ((this.fechaActual - this.fechaInicio) >= 15) {
            this.estadoCaso = "Urgente";
        } else {
            this.estadoCaso = "Iniciado";
        }
    }

    public void setPersonasImplicadas(Problema4_Persona persona) {
        personasImplicadas.add(persona);
    }

    public ArrayList<Problema4_Persona> consultarInformacion() {
        return personasImplicadas;
    }

    @Override
    public String toString() {
        return "CasodeCorrupcion{" + "nombreCaso=" + nombreCaso + ", fechaInicio=" + fechaInicio + ", estadoCaso="
                + estadoCaso + ", fechaActual=" + fechaActual + ", personasImplicadas=" + personasImplicadas
                + '}';
    }
}
