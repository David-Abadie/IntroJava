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
        int sumaFila = 0; int sumaColumna = 0;
        int diagonal1 = 0; int diagonal2 = 0;    
        
        //rellenar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                System.out.print("Ingrese elemento de la posicion "+i+","+j+": ");
                 matriz[i][j] = leer.nextInt();
                }while(matriz[i][j]<=0 || matriz[i][j]>9);        
            }             
        }
        //sumar filas y columnas
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
              sumaFila += matriz[i][j]; //+= es el nuevo valor que se le suma al anterior
              sumaColumna += matriz[j][i];  
            }
        }
        //sumar diagonales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if (i == j) {
                    diagonal1 += matriz[i][j];
                }
                if (i + j == 2) {
                    diagonal2 += matriz[i][j];  
                }
            } 
        }
        //verificar las sumas
        if (sumaFila == sumaColumna && sumaFila == diagonal1 && sumaFila == diagonal2) {
            System.out.println("\n La matríz es mágica.");
            System.out.println("\n La suma de sus filas, columnas y diagonales es: "+sumaFila+"\n");
        } else{
            System.out.println("\n La matríz no es mágica. \n");
        }
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print("["+matriz[i][j]+"]");   
            }
            System.out.println("");
        }
        System.out.println("");
    }
}

