import java.util.ArrayList;
public class Problema4_Ejecutor {

    public static void main(String[] args) {
    ArrayList<Problema4_Persona> personas = new ArrayList<>();
    //CASO 1
    Problema4_CasoCorrupcion cc1 = new Problema4_CasoCorrupcion("Lavado de activos", 
    5, 3);
    Problema4_Persona p1 = new Problema4_Persona("Perez", 18, "Estudiante", "Culpable");
    personas.add(p1);
    Problema4_Persona p2 = new Problema4_Persona("Juan", 19, "Estudiante", "Victima");
    personas.add(p2);
    for (Problema4_Persona personasImplicada : personas) {
    if 
    (personasImplicada.getNivelImplicacion().equalsIgnoreCase("Culpable")) {
    personasImplicada.setSentencia(1);
    personasImplicada.setColaboro(true);
    personasImplicada.setDañoEconomico(1000);
    personasImplicada.setReduccionPena();
    personasImplicada.setFianza(0.4);
    cc1.setPersonasImplicadas(personasImplicada);
    } else {
    cc1.setPersonasImplicadas(personasImplicada);
    }
    }
    cc1.calcularEstado();
    System.out.println("CASO 1");
    System.out.println(cc1);
    ArrayList<Problema4_Persona> personasImplicadas = 
    cc1.consultarInformacion();
    System.out.println("PERSONAS IMPLICADAS");
    for (Problema4_Persona personasImplicada : personasImplicadas) {
    System.out.println(personasImplicada);
    }
    }
}
