
package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo2 {

    /**
     * 2.Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 
     * (para ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) 
     * comprendidos entre 1 y n (n es determinado por el usuario). 
     * Imprimir la cantidad de múltiplos de 5 y 3.
     */
    public static void main(String[] args) {
        // 1 Crear el objeto de leer la entrada 
        Scanner leer=new Scanner(System.in);
        //2.Asignacion de variables
        int valor;  // Numero que digite el usuario 
        int contar=0;// Contador para la cantidad de multiplos
        int sumar=0;// Para almacenar la suma de los multiplos
        
        //3.Pedir el valor al usuario
        System.out.println("Digite un numero:"); // Imprimir texto solicitando al usurio el valor 
        valor=leer.nextInt();// Lee el numero que ingreso al usuario
        
        //4. Condicion para realizar los numeros de 1 al valor que digite el usuario
        for( int i=1; i<=valor;i++ ){  // ciclo for para ejecutar desde i=1 hasta i=valor
            if (i % 15 == 0) {// verifica si el valor actual de i es divisible entre 15 (múltiplo de 5 y 3).
              contar++;  // Es donde incrementa el contador de múltiplos encontrados.
              sumar++; // Su suma el valor actual de i a la varible sumar
            }
        }
        //Imprimir Resultado 
        System.out.println(" La cantidad de multiplos de 5 y 3: " + contar);// imprime la cantidad de multiplos encontrados
        System.out.println(" La suma de los multiplos de 5 y 3: " + sumar);// imprime la suma de los multiplos encontrados
    }
    
}
