/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int[n];
        int unDig = 0;
        int dosDig = 0;
        int tresDig=0;
        int cuatroDig=0;
        int cincoDig=0;
          
        for (int i = 0; i < n; i++) { //rellenar vector
            vector[i]= (int) (Math.random() * 100000);
        }
        for (int i = 0; i < n; i++) { //mostrar vector
            System.out.print("["+vector[i]+"]");
        }System.out.println("");
        
        for (int i = 0; i < n; i++) { //evaluar cantidad digitos
            if (vector[i]<10) {
                unDig=unDig +1;
            }
            if (vector[i]<100 && vector[i]>10) {
                dosDig=dosDig +1;
            }
            if (vector[i]<1000 && vector[i]>100) {
                tresDig=tresDig +1;
            }
            if (vector[i]<10000 && vector[i]>1000){
                cuatroDig=cuatroDig +1;
            }
            if (vector[i]<100000 && vector[i]>10000) {
                cincoDig=cincoDig +1;
            }
        }
        System.out.println("Números de un digito: "+unDig);
        System.out.println("Números de dos digitos: "+dosDig);
        System.out.println("Números de tres digitos: "+tresDig);
        System.out.println("Números de cuatros digitos: "+cuatroDig);
        System.out.println("Números de cinco digitos: "+cincoDig);
    }
}
