import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Ingrese la base: ");
        base=tcl.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura=tcl.nextDouble();
        area= (base * altura)/2;
        System.out.println("El area del triangulo es: " + area);
    }
}
/***
 * EVIDENCIA DEL RUN:
run :
Ingrese la base: 5
Ingrese la altura: 4
El area del triangulo es: 10.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */