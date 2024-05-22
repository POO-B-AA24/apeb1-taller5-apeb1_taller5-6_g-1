
public class Problema3_Departamento {
    public String nombre;
    public int numeroEmpleados;
    public double produccionAnual;
    public char categoria;

    public Problema3_Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = determinarCategoria();
    }

    private char determinarCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            return 'A';
        } else if (numeroEmpleados == 20 && produccionAnual == 1000000) {
            return 'B';
        } else if (numeroEmpleados == 10 && produccionAnual == 500000) {
            return 'C';
        } else {
            return 'N';
        }
    }

    @Override
    public String toString() {
        return String.format("Departamento: %s, Empleados: %d, Producción Anual: %.2f, Categoría: %c",
                nombre, numeroEmpleados, produccionAnual, categoria);
    }
}
