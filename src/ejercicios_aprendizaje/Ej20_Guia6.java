/* EJERCICIO 20
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9. */
package ej20_guia6;

import java.util.Scanner;

public class Ej20_Guia6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int n = 0;

        rellenar(matriz, n);
        imprimir(matriz, n);    
        int sumFila = sumaFilas(matriz, n);
        int sumColumna = sumaColumnas(matriz, n);
        int sumDp = sumaDp(matriz, n);
        int sumDs = sumaDs(matriz, n);
        validar(sumFila,sumColumna,sumDp,sumDs);

    }
  
    
    public static void rellenar(int matriz[][], int n) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Ingrese un valor para posicion: [" + i + "] [" + j + "]: ");
                    n = input.nextInt();
                } while (n < 1 || n > 9);
                matriz[i][j] = n;
            }
        }

    }

    public static void imprimir(int matriz[][], int n) {

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

    public static int sumaFilas(int matriz[][], int n) {

        int sumFila = 0;

        for (int i = 0; i < 3; i++) {
            sumFila = 0;
            for (int j = 0; j < 3; j++) {
                sumFila = sumFila + matriz[i][j];
            }
        }

        return sumFila;

    }

    public static int sumaColumnas(int matriz[][], int n) {

        int sumColumna = 0;

        for (int j = 0; j < 3; j++) {
            sumColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumColumna = sumColumna + matriz[i][j];
            }
        }

        return sumColumna;

    }

    public static int sumaDp(int matriz[][], int n) {

        int sumDp = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumDp = sumDp + matriz[i][j];
                }
            }
        }

        return sumDp;

    }

    public static int sumaDs(int matriz[][], int n) {

        int sumDs = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    sumDs = sumDs + matriz[i][j];
                }
            }
        }

        return sumDs;

    }

    public static void validar(int sumFila, int sumColumna, int sumDp, int sumDs) {

        if (sumFila == sumColumna && sumFila == sumDp && sumFila == sumDs) {

            System.out.println("\nES UNA MATRIZ MAGICA!");
            System.out.println("La suma de las filas, columnas y diagonales es: " + sumFila + "\n");

        } else {

            System.out.println("\nNO ES UNA MATRIZ MAGICA :(");
            System.out.println("La suma de las filas, columnas y diagonales no da el mismo resultado.\n");

        }

    }
    
}
    

