import java.util.Scanner;

public class Problema2_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre y edad del estudiante");
        Problema2_Estudiante est1 = new Problema2_Estudiante(sc.next(), sc.nextInt());
        System.out.println("Ingrese el nombre, Nota ACD, Nota APE, Nota AA");
        Problema2_Materia mat1 = new Problema2_Materia(sc.next(),sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        est1.setMateria(mat1);
        if (est1.validarMateria()) {
            System.out.println("APROVADO");
        }else
            System.out.printf("REPOBADO EL ESTUDIANTE %s TIENE UNA NOTA DE %.1f POR LO CUAL DEBE DE DAR EXAMEN DE RECUPERACION%n", est1.getNombre(), est1.getNotaFinal());
        sc.close();
    }
}
