
import java.util.Scanner;

/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 *
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoMin, minutosCon, valorPla;
        System.out.print("Ingrese el costo por minutos: ");
        costoMin = tcl.nextDouble();
        System.out.print("Ingrese el numero de minutos consumidos en el mes: ");
        minutosCon = tcl.nextDouble();
        valorPla = costoMin * minutosCon;
        System.out.println("El valor de su planilla de telefono es: " + valorPla);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese el costo por minutos: 0,50
Ingrese el numero de minutos consumidos en el mes: 389
El valor de su planilla de telefono es: 194.5
BUILD SUCCESSFUL (total time: 8 seconds)
 */
