/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese temperatura en °C");
        double C = leer.nextDouble();
        double F = 32 + (9 * C / 5);
        System.out.println("La temperatura en grados Fahrenheit es de " + F + "°F");
        
    }
}
