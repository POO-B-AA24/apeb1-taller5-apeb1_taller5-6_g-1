import java.util.List;
public class Problema5_SistemaGestionConflictosEjecutor {
    public static void main(String[] args) {
        Problema5_Pais pais1 = new Problema5_Pais("Ecuador");
        Problema5_Pais pais2 = new Problema5_Pais("Colombia");

        Problema5_ConflictoInternacional conflicto = new Problema5_ConflictoInternacional("La guerra colombo-ecuatoriana",
                List.of(pais1, pais2), "02/03/1862 ", "Finalizada");

        Problema5_Evento evento1 = new Problema5_Evento("Batalla Territorial", "02/03/1862", "Frontera Ecuador-Colombia", "fue una serie de conflictos armados librados entre las repúblicas de Colombia y Ecuador");
        conflicto.agregarEvento(evento1);

        Problema5_Onu onu = new Problema5_Onu();
        onu.convocarReunionUrgente(conflicto);
        
        System.out.println("Nombre del conflicto: " + conflicto.nombre);
        System.out.println("Fecha de inicio: " + conflicto.fechaInicio);
        System.out.println("Estado actual: " + conflicto.estadoActual);
        System.out.println("Paises involucrados:");
        for (Problema5_Pais pais : conflicto.paisesInvolucrados) {
            System.out.println("- " + pais.nombre);
        }
        System.out.println("Eventos relacionados:");
        for (Problema5_Evento evento : conflicto.eventos) {
            System.out.println("- Nombre: " + evento.nombre);
            System.out.println("  Fecha: " + evento.fecha);
            System.out.println("  Ubicación: " + evento.ubicacion);
            System.out.println("  Descripción: " + evento.descripcion);
        }
    }
    
}
