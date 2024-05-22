
public class Problema5_Pais {
    public String nombre;
    public boolean primerMundo;
    public Problema5_Pais(String nombre,Boolean primerMundo) {
        this.nombre = nombre;
        this.primerMundo = primerMundo;
    }

    @Override
    public String toString() {
        return "Problema5_Pais{" + "nombre=" + nombre + "Primer mundo="+primerMundo+'}';
    }

    
}
