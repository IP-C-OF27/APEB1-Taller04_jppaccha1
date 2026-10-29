import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos 
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precioCPU, precioTcl, precioPat,precioRat,costoFin ;
        System.out.print("Ingrese el precio del CPU: ");
        precioCPU=tcl.nextDouble();
        System.out.print("Ingrese el precio del teclado: ");
        precioTcl=tcl.nextDouble();
        System.out.print("Ingrese el precio de la pantalla: ");
        precioPat=tcl.nextDouble();
        System.out.print("Ingrese el precio del raton: ");
        precioRat=tcl.nextDouble();
        costoFin=(precioCPU+precioTcl+precioPat+precioRat);
        System.out.println("El costo final de su computadora es: " + costoFin);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese la base: 5
Ingrese la altura: 4
El area del triangulo es: 10.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */