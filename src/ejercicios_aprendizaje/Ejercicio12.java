/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        String fde = "&&&&&";
        int correcta = 0;
        int incorrecta = 0;
        int longitud = cadena.length();
        
        
        do {
            System.out.println("Ingrese la cadena de texto");
            cadena = leer.nextLine();
            cadena = cadena.toUpperCase();
            if (!cadena.equals(fde)) {
                
            if (cadena.length() <= 5 && cadena.substring(0,1).equals("X") && cadena.substring(cadena.length()-1,cadena.length()).equals("O")){
               // cadena.startsWith("x"); inicio de cadena
                //cadena.endsWith("o"); posicion final de cadena
                System.out.println("La cadena de texto es correcta");
               correcta = correcta + 1;
            } else{
                System.out.println("La cadena de texto es incorrecta");
                incorrecta = incorrecta + 1;
            }
            }
            
        } while (!cadena.equals(fde));
        System.out.println("");
        System.out.println("INFORME:");
        System.out.println("Lectura de cadenas correctas: " + correcta);
        System.out.println("Lectura de cadenas incorrectas: " + incorrecta);
        
    }
}
