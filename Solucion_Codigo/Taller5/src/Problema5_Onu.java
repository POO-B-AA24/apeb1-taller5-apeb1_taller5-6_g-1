import java.util.List;

public class Problema5_Onu {
    public void convocarReunionUrgente(Problema5_ConflictoInternacional conflicto) {
        if (existe50PorcientoPaises(conflicto)) {
            System.out.println("Se debe convocar una reunión urgente de la ONU.");
        }
    }

    private boolean existe50PorcientoPaises(Problema5_ConflictoInternacional conflicto) {
        List<Problema5_Pais> paisesInvolucrados = conflicto.paisesInvolucrados;
        int totalPaises = paisesInvolucrados.size();
        int countPaisesConEventoBatalloso = 0;

        for (Problema5_Pais pais : paisesInvolucrados) {
            if (existeEventoBatallosoEnPais(pais, conflicto.eventos)) {
                countPaisesConEventoBatalloso++;
            }
        }

        double porcentajePaisesConEventoBatalloso = (double) countPaisesConEventoBatalloso / totalPaises * 100;
        return porcentajePaisesConEventoBatalloso > 50;
    }

    private boolean existeEventoBatallosoEnPais(Problema5_Pais pais, List<Problema5_Evento> eventos) {
        for (Problema5_Evento evento : eventos) {
            if (evento.descripcion.toLowerCase().contains("batalla") && evento.ubicacion.equals(pais.nombre)) {
                return true;
            }
        }
        return false;
    }
}