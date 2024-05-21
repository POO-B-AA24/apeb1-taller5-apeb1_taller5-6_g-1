
public class Problema1_SistemaVentasEjecutor {
    public static void main(String[] args) {
        Problema1_Producto producto1 = new Problema1_Producto("Manzana", 0.5, 100);
        Problema1_Producto producto2 = new Problema1_Producto("Leche", 1.2, 50);
        Problema1_Producto producto3 = new Problema1_Producto("Pan", 1.0, 80);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        Problema1_CarritoCompras carrito = new Problema1_CarritoCompras();

        carrito.agregarProducto(producto1, 5);
        carrito.agregarProducto(producto2, 3);
        carrito.agregarProducto(producto3, 10);

        carrito.mostrarDetalleCompra();

        double total = carrito.calcularTotal();
        System.out.printf("Total a pagar: %.2f\n", total);

        double descuento = 10;
        double montoPagado = 20;
        carrito.realizarPago(montoPagado, descuento);

        System.out.println(carrito);
    }
}