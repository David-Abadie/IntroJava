/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio14 {
   public static void main(String[] args){
       Scanner leer = new Scanner(System.in);
       double euro;
       System.out.println("Euros a convertir:");
       euro = leer.nextDouble();
       
       System.out.println("Moneda a convertir:");
       System.out.println("1. Dólares");
       System.out.println("2. Yenes");
       System.out.println("3. Libras");
       int moneda;
       moneda = leer.nextInt();
       
       conversion(euro, moneda);
   } 
   
   public static void conversion (double euro, int moneda){
       double cambio = 0;
       switch (moneda){
           case 1: cambio = euro * 1.28611;
               System.out.println(euro+" euros son "+ cambio +" dólares.");
               break;
           case 2: cambio = euro * 129.852;
               System.out.println(euro+" euros son "+ cambio +" yenes.");
               break;
           case 3: cambio = euro * 0.86;
               System.out.println(euro+" euros son "+ cambio + " libras.");
               break;
           default: System.out.println("La opción es incorrecta.");
           break;    
       }
   }
}
