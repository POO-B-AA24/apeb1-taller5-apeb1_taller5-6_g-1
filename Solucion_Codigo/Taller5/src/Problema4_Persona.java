public class Problema4_Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion;
    private int sentencia;
    private double dañoEconomico;
    private double fianza;
    private boolean reduccionPena = false;
    private boolean colaboro = false;

    public Problema4_Persona(String nombre, int edad, String ocupacion, String nivelImplicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
    }

    public void setSentencia(int sentencia) {
        this.sentencia = sentencia;
    }

    public void setReduccionPena() {
        this.reduccionPena = this.colaboro;
    }

    public void setColaboro(boolean colaboro) {
        this.colaboro = colaboro;
    }

    public void setDañoEconomico(double dañoEconomico) {
        this.dañoEconomico = dañoEconomico;
    }

    public void setFianza(double porcentajeFianza) {
        if (reduccionPena && porcentajeFianza <= 0.5 && this.sentencia <= 1) {
            this.fianza = this.dañoEconomico * porcentajeFianza;
        } else
            this.fianza = 0;
    }

    public String getNivelImplicacion() {
        return nivelImplicacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", ocupacion=" + ocupacion + ", nivelImplicacion="
                + nivelImplicacion + ",         sentencia=" + sentencia + ", da\u00f1oEconomico=" + dañoEconomico
                + ",         fianza=" + fianza + ", reduccionPena=" + reduccionPena + ", colaboro=" +
                colaboro + '}';
    }

}
