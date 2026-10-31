import java.util.Scanner;
/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor a
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 *
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoKwh, kwConsu, valorFinal;
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingrese el costo por kilovatio/hora: ");
        costoKwh = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos en el mes: ");
        kwConsu = tcl.nextDouble();
        valorFinal = costoKwh * kwConsu;
        if (edad > 65) {
            valorFinal = valorFinal - (valorFinal * 0.10);
            System.out.printf("Aplicando el descuento del 10%%, su valor a cancelar es: $%.2f%n", valorFinal);
        } else {
            System.out.printf("Su valor a cancelar es: $%.2f%n", valorFinal);
        }
    }
}
/**
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 70
Ingrese el costo por kilovatio/hora: 5
Ingrese el numero de kilovatios consumidos en el mes: 12
Aplicando el descuento del 10%, su valor a cancelar es: $54,00
BUILD SUCCESSFUL (total time: 13 seconds)
* 
 */