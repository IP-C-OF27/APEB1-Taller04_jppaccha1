import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se pide 
 * que haga un programa que calcule el área total.
 * Por cultura general, sabemos que el área de un rectángulo se calcula 
 * multiplicando su base por su altura; el área de un triángulo rectángulo se 
 * calcula multiplicando su base por su altura, y luego dividiendo el resultado 
 * entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado 
 * la medida de uno de sus lados. La parte interesante de este problema es 
 * determinar el mínimo número de datos que hay que preguntar."
 * @author José Paccha
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double ladoCua, alturaTri, areaCua, areaTri, areaRec, areaTotal;
        System.out.print("Ingrese la medida de un lado del cuadrado: ");
        ladoCua=tcl.nextDouble();
        System.out.print("Ingrese la medida de la altura de cualquier triangulo: ");
        alturaTri=tcl.nextDouble();
        areaCua= Math.pow(ladoCua, 2);     
        areaTri= 3*(ladoCua * alturaTri/2);
        areaRec=ladoCua*alturaTri;
        areaTotal= areaCua+areaTri+areaRec;
        System.out.println("Area del cuadrado: "+areaCua+" |Area de los triangulos: "+areaTri+" |Area del rectangulo: " + areaRec);
        System.out.println("El area total del poligono es: " + areaTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese la medida de un lado del cuadrado: 5
Ingrese la medida de la altura de cualquier triangulo: 4
Area del cuadrado: 25.0 |Area de los triangulos: 30.0 |Area del rectangulo: 20.0
El area total del poligono es: 75.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */