import java.util.ArrayList;
import java.util.List;
public class Problema3_Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private List<Problema3_Departamento> departamentos;

    public Problema3_Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Problema3_Departamento departamento) {
        departamentos.add(departamento);
    }

    public void mostrarInformacionEmpresa() {
        System.out.println("Nombre de la Empresa: " + nombre);
        System.out.println("RUC: " + ruc);
        System.out.println("Dirección: " + direccion);
        System.out.println("Departamentos:");
        for (Problema3_Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
    }
}
 
