/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicios_aprendizaje;

import java.util.Scanner;


public class Ejercicio13 {
   public static void main(String[] args){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el tamaño del cuadrado:");
      int n;
      n = leer.nextInt();
  
            if(n >= 0 && n<=50) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
    
       System.out.println("");
    }
   }
}

