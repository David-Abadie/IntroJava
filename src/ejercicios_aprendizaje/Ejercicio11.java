/*

 */
package ejercicios_aprendizaje;

import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese dos números:");
        int num1;
        num1 = leer.nextInt();
        int num2;
        num2 = leer.nextInt();
        int opcion;
        String salir = "";
        
        do {
            System.out.println("MENU:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    int suma = num1 + num2;
                    System.out.println(num1+ "+" + num2 +"="+suma);
                    continue;
                case 2:
                    int resta = num1 - num2;
                    System.out.println(num1+ "-" + num2 +"="+resta);
                    continue;
                case 3:
                    int multiplicar = num1 * num2;
                    System.out.println(num1+ "*" + num2 +"="+multiplicar);
                   continue;
                case 4:
                    double dividir = num1 / num2;
                    System.out.println(num1+ "/" + num2 +"="+dividir);
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = leer1.nextLine();
                   
                  }
            if (salir != "s" ) {
                        System.out.println("FIN");
                    } break;   
        } while (salir != "s");
       
    }
}
