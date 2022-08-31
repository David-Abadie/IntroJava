/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese un valor limite:");
        int limite = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
           suma = suma + num;
        } while (suma < limite);
        System.out.println("Ha superado el valor limite "+limite+ ". La suma de los numeros es "+suma);
        
   }
  }
