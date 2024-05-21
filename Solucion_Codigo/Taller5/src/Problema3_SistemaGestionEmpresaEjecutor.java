
public class Problema3_SistemaGestionEmpresaEjecutor {
    public static void main(String[] args) {
        Problema3_Empresa empresa = new Problema3_Empresa("Tech Innovators", "1234567890", "Av. Siempre Viva 742");

        Problema3_Departamento departamento1 = new Problema3_Departamento("Programador", 25, 1500000);
        Problema3_Departamento departamento2 = new Problema3_Departamento("Marketing", 20, 1000000);
        Problema3_Departamento departamento3 = new Problema3_Departamento("Recursos Humanos", 10, 500000);

        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);
        empresa.agregarDepartamento(departamento3);
        
        empresa.mostrarInformacionEmpresa();
    }
}
