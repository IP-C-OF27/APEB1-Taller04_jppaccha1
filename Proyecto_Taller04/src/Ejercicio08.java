import java.util.Scanner;
/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar el
 * valor total a pagar mensual de servicios digitales de una persona. Los
 * servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la
 * persona es menor a 30 años se descuenta el 20% del total mensual."
 *
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix, youtube, dropbox, spotify, total;
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingrese los valores de Netflix, YouTube, Dropbox y Spotify: ");
        netflix = tcl.nextDouble();
        youtube = tcl.nextDouble();
        dropbox = tcl.nextDouble();
        spotify = tcl.nextDouble();
        total = (netflix + youtube + dropbox + spotify);
        if (edad < 30) {
            total = total - (total * 0.20);
            System.out.printf("Aplicando el descuento del 20%%, su valor a cancelar es: $%.2f%n", total);
        } else 
            System.out.println("El valor toal que deberia pagar mesualmente es: $" + total);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese su edad: 21
Ingrese los valores de Netflix, YouTube, Dropbox y Spotify: 12 18 16 14
Aplicando el descuento del 20%, su valor a cancelar es: $48,00
BUILD SUCCESSFUL (total time: 13 seconds)
 */