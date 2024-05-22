public class Problema2_Estudiante {
    private String nombre;
    private int edad;
    private double notaFinal;
    private Problema2_Materia materia;

    
    Problema2_Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setMateria(Problema2_Materia materia){
        this.materia = materia;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getNotaFinal(){
        return this.notaFinal;
    }

    public boolean validarMateria(){
        this.notaFinal = (materia.getNotaAA() * 0.35) + (materia.getNotaACD()* 0.3) + (materia.getNotaAPE()* 0.35);
        return notaFinal>=7;
    }
}