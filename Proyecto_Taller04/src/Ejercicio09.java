import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un 
 * porcentaje de asistencia. La regla institucional establece que:
 * La asistencia mínima debe alcanzarse para ser evaluado
 * Existe una nota mínima en el examen final, y
 * La nota final se calcula combinando evaluación continua y examen final.
 * La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la 
 * nota final redondeada a un decimal."
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaluacion, examenFin, notaFinal;
        int asistencia;
        System.out.print("Ingrese el porcentaje de asistencia: % ");
        asistencia = tcl.nextInt();
        if (asistencia >= 80) {
            System.out.print("Ingrese la nota de evaluacion continua: ");
            evaluacion = tcl.nextDouble();
            System.out.print("Ingrese la nota del examen final: ");
            examenFin = tcl.nextDouble();
            notaFinal = (evaluacion + examenFin) / 2;
            System.out.printf("La nota final es: %.1f%n", notaFinal);
            if (examenFin >= 7 && notaFinal >= 7) 
                System.out.println("Su estado es: APROBADO");
            else 
                if (examenFin >= 7 && notaFinal >= 5) 
                    System.out.println("Su estado es: SUPLETORIO");
                else 
                    System.out.println("Su estado es: REPROBADO");         
        } else {
            System.out.println("No cumple con el porcentaje minimo de asistencia.");
            System.out.println("Su estado es: REPROBADO");
        }
    }
}    
/***
 * EVIDENCIA DEL RUN:
run:87
Ingrese el porcentaje de asistencia: % 87
Ingrese la nota de evaluacion continua: 6,84
Ingrese la nota del examen final: 8,75
La nota final es: 7,8
Su estado es: APROBADO
BUILD SUCCESSFUL (total time: 21 seconds)
 */