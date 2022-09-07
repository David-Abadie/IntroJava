/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);   
        int [][] matriz = new int [3][3];
        int [] vector = new int [3];
        int sumaFila = 0; int sumaColumna = 0; int cont = 0;
        int diagonal1 = 0; int diagonal2 = 0; int cont2 = 0;    
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                System.out.print("Ingrese elemento de la posicion "+i+","+j+": ");
                 matriz[i][j] = leer.nextInt();
                }while(matriz[i][j]<=0 || matriz[i][j]>9);  
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                vector[i] += matriz[i][j];
            }             
        } System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j == 0; j--) {
                 diagonal2 += matriz[i][j];        
            } 
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { 
                if (sumaColumna!=sumaFila || sumaFila != diagonal2){
                cont = 0;
                cont2 = 0;
                sumaFila = 0;
                sumaColumna = 0;
                }else{
                cont++;
                cont2++;
                }
            }
        }
        
        if (cont == matriz.length && cont2 == matriz.length) {
                System.out.println("La matriz es mágica");
                System.out.println("La suma es: "+vector[0]);   
            } else{ 
                    System.out.println("La matriz no es mágica");
                }
        
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print("["+matriz[i][j]+"]");   
            }
            System.out.println("");
        }
        System.out.println("");
    }
}

