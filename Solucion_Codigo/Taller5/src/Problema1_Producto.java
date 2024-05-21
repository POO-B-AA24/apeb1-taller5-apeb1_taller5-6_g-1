
public class Problema1_Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Problema1_Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Problema1_Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    
}