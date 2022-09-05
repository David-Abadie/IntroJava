/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicios_aprendizaje;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        
        for (int i = 0; i < n; i++) { //rellenar vector aleatorio entre 0 y 9
            vector[i]= (int) (Math.random() * 10);
        }
        
         for (int i = 0; i < n; i++) { //mostrar vector
            System.out.print("["+vector[i]+"]");   
          
        }  System.out.println("");
        
        System.out.println("Indique el numero a buscar dentro del vector:");
        int buscar = leer.nextInt();
        
       
        for (int i = 0; i < n; i++) { //evaluar posicion
          
           if (vector[i]==buscar) {
               System.out.println("El numero se encuentra en la posicion "+i);
   
            }
        }
   
    }
}
