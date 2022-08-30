/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package ejercicios_aprendizaje;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra (solo de 8 caracteres de largo):");
        String frase = leer.nextLine();
        int longitud = frase.length();
        
        if (longitud > 8 || longitud < 8) {
            System.out.println("INCORRECTO. La frase tiene "+longitud+" caracteres");
        } else {
            System.out.println("CORRECTO. La frase tiene " +longitud+" caracteres");
            
        }
    }
}
