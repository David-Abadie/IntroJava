/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("Mostramos la suma: ");
        System.out.println(num1 + "+" + num2 + "=" + suma);
    }
}
