import java.util.ArrayList;
import java.util.List;
public class Problema5_SistemaGestionConflictosEjecutor {
    public static void main(String[] args) {
        List<Problema5_Pais> paisesInvolucrados = new ArrayList<>();
        Problema5_Pais pais1 = new Problema5_Pais("Ecuador",true);
        paisesInvolucrados.add(pais1);
        Problema5_Pais pais2 = new Problema5_Pais("Colombia",false);
        paisesInvolucrados.add(pais2);

        Problema5_ConflictoInternacional conflicto = new Problema5_ConflictoInternacional("La guerra colombo-ecuatoriana",paisesInvolucrados, "02/03/1862 ", "Finalizada");

        Problema5_Evento evento1 = new Problema5_Evento("Batalla Territorial", "02/03/1862", "Frontera Ecuador-Colombia", "Fue una serie de conflictos armados librados entre las repúblicas de Colombia y Ecuador");
        conflicto.agregarEvento(evento1);

        System.out.println(conflicto);
        System.out.println("Paises involucrados:");
        for (Problema5_Pais pais : conflicto.paisesInvolucrados) {
            System.out.println("- " + pais);
        }

        System.out.println("Eventos relacionados:");
        for (Problema5_Evento evento : conflicto.eventos) {
            System.out.println(evento);
        }

        Problema5_Onu onu = new Problema5_Onu();
        if (onu.convocarReunionUrgente(conflicto)) {
            System.out.println("Se debe convocar una reunión urgente de la ONU");
        }
        if (onu.guerraMundial(conflicto)) {
            System.out.println("EL COMFLITO SE ESTA DESARROLLANDO EN UN PAIS DE PRIMER MUNDO - POR LO TANTO SE DECLARA GERRA MUNDIAL");
        }

        
    }
}
