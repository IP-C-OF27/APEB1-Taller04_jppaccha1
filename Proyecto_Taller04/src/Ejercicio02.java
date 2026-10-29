import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gasto1, gasto2, gasto3, gastototal;
        System.out.print("Ingrese los gastos: ");
        gasto1= tcl.nextDouble();
        gasto2= tcl.nextDouble();
        gasto3= tcl.nextDouble();
        gastototal=gasto1+gasto2+gasto3;
        System.out.println("El gasto total de los tres hijos es: " + gastototal);
    }
}
/***
run:
Ingrese los gastos: 250 59 20
El gasto total de los tres hijos es: 329.0
BUILD SUCCESSFUL (total time: 12 seconds)
 */