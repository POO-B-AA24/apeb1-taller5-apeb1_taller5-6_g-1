
import java.util.ArrayList;
import java.util.Arrays;


public class Problema3_SistemaGestionEmpresaEjecutor {
    public static void main(String[] args) {
        Problema3_Empresa empresa = new Problema3_Empresa ("Iluv", "0760045360001","24 de Mayo");
        ArrayList<Problema3_Departamento> listDemp  = new ArrayList<Problema3_Departamento>(Arrays.asList
            (new Problema3_Departamento("Programador", 25, 1500000),
             new Problema3_Departamento("Marketing", 20, 1000000),
             new Problema3_Departamento("Recursos Humanos", 10, 500000)
        ));
        System.out.println("Detalles empresa: ");
        System.out.println(empresa);
        for (Problema3_Departamento departamento : listDemp) {
            System.out.println(departamento);
        }
        
    }
}
