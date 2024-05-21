
import java.util.ArrayList;
import java.util.List;

public class Problema1_CarritoCompras {
    public double total;
    public List<Problema1_Producto> productosEnCarrito;

    public Problema1_CarritoCompras() {
        this.productosEnCarrito = new ArrayList<>();
        this.total = 0;
    }

    public void agregarProducto(Problema1_Producto producto, int cantidad) {
        if (cantidad <= producto.cantidad) {
            Problema1_Producto productoEnCarrito = new Problema1_Producto(producto.nombre, producto.precio, cantidad);
            productosEnCarrito.add(productoEnCarrito);
            total += producto.precio * cantidad;
            producto.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente cantidad disponible de " + producto.nombre + ".");
        }
    }

    public double calcularTotal() {
        return total;
    }

    public void realizarPago(double montoPagado, double descuento) {
        double totalAPagar = total;
        if (total > 1000) {
            totalAPagar = total * ((100 - descuento) / 100);
        }
        if (montoPagado >= totalAPagar) {
            System.out.println("Pago realizado con éxito. Gracias por su compra.");
            double cambio = montoPagado - totalAPagar;
            if (cambio > 0) {
                System.out.printf("Su cambio es: %.2f\n", cambio);
            }
        } else {
            double faltante = totalAPagar - montoPagado;
            System.out.println("Faltan por pagar: " + faltante);
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        for (Problema1_Producto producto : productosEnCarrito) {
            System.out.printf("%s - Cantidad: %d - Precio unitario: %.2f\n",
                    producto.nombre, producto.cantidad, producto.precio);
        }
        System.out.printf("Total: %.2f\n", total);
    }

    @Override
    public String toString() {
        StringBuilder detalle = new StringBuilder("Productos en el carrito:\n");
        for (Problema1_Producto producto : productosEnCarrito) {
            detalle.append(String.format("%s - Cantidad: %d - Precio unitario: %.2f\n",
                    producto.nombre, producto.cantidad, producto.precio));
        }
        detalle.append(String.format("Total: %.2f\n", total));
        return detalle.toString();
    }
}
