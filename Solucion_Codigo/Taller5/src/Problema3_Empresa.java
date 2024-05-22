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

    @Override
    public String toString() {
        return  "nombre: " + nombre + "\nruc: " + ruc + "\ndireccion: " + direccion ;
    }
    
}
 
