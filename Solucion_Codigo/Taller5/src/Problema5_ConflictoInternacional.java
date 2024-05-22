import java.util.List;
import java.util.ArrayList;
public class Problema5_ConflictoInternacional {
    public String nombre;
    public List<Problema5_Pais> paisesInvolucrados;
    public String fechaInicio;
    public String estadoActual;
    public List<Problema5_Evento> eventos;

    public Problema5_ConflictoInternacional(String nombre, List<Problema5_Pais> paisesInvolucrados, String fechaInicio, String estadoActual) {
        this.nombre = nombre;
        this.paisesInvolucrados = paisesInvolucrados;
        this.fechaInicio = fechaInicio;
        this.estadoActual = estadoActual;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Problema5_Evento evento) {
        this.eventos.add(evento);
    } 
    @Override
    public String toString() {
        return "Problema5_ConflictoInternacional{" + "nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", estadoActual=" + estadoActual +'}';
    }
}
