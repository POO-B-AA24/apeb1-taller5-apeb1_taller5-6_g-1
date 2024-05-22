
public class Problema5_Evento {
    public String nombre;
    public String fecha;
    public String ubicacion;
    public String descripcion;

    public Problema5_Evento(String nombre, String fecha, String ubicacion, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    } 
    @Override
    public String toString() {
        return "Problema5_Evento{" + "nombre=" + nombre + "fecha="+fecha+"ubicacion="+ubicacion+"descripcion="+descripcion+'}';
    }
}
