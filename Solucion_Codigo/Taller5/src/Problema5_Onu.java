import java.util.List;

public class Problema5_Onu {
    public boolean convocarReunionUrgente(Problema5_ConflictoInternacional conflicto) {
        return existe50PorcientoPaises(conflicto);
    }

    private boolean existe50PorcientoPaises(Problema5_ConflictoInternacional conflicto) {
        List<Problema5_Pais> paisesInvolucrados = conflicto.paisesInvolucrados;
        int totalPaises = paisesInvolucrados.size();
        int PaisesEnGuerra = 0;

        for (Problema5_Pais pais : paisesInvolucrados) {
            if (existeGuerraEnPais(pais, conflicto.eventos)) {
                PaisesEnGuerra++;
            }
        }

        double porcentajePaisesEnGuerra = PaisesEnGuerra / totalPaises * 100;
        return porcentajePaisesEnGuerra > 50;
    }

    private boolean existeGuerraEnPais(Problema5_Pais pais, List<Problema5_Evento> eventos) {
        for (Problema5_Evento evento : eventos) {
            if (evento.descripcion.equalsIgnoreCase("batalla") && evento.ubicacion.contains(pais.nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean guerraMundial(Problema5_ConflictoInternacional conflicto){
        for (Problema5_Pais paisINV : conflicto.paisesInvolucrados) {
            if (paisINV.primerMundo) {
                return true;
            }
        }
        return false;
    }
}