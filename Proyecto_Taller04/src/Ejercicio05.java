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
        System.out.print("Ingrese los precios del CPU, teclado, pantalla y raton: ");
        precioCPU = tcl.nextDouble();
        precioTcl = tcl.nextDouble();
        precioPat = tcl.nextDouble();
        precioRat = tcl.nextDouble();
        costoFin=(precioCPU+precioTcl+precioPat+precioRat);
        System.out.println("El costo final de su computadora es: " + costoFin);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese los precios del CPU, teclado, pantalla y raton: 24 12 38 7 
El costo final de su computadora es: 81.0
BUILD SUCCESSFUL (total time: 29 seconds)
 */