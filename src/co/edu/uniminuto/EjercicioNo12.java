
package co.edu.uniminuto;
/**
 12. Realizar un programa que genere una matriz 5x5, inicializarla
 * en 2 e imprimirla.
 */
public class EjercicioNo12 {

    public static void main(String[] args) {
          int[][] matriz = new int[5][5]; //Esta declara matriz de tipo int.
          //Construccion de la matriz
            for (int i = 0; i < matriz.length; i++) {//Esto recorre cada fila de la matriz.
            for (int j = 0; j < matriz[i].length; j++) {///Esto recorre cada elemento dentro de una fila específica.
                matriz[i][j] = 2; //asignar el valor 2 al elemento en la posición actual de la fila (i) y la columna (j) en la matriz.
            }
        }

        System.out.println("Matriz 5x5:");//imprime una etiqueta que indica que es una matriz de 5x5.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");//imprime el valor en la posición actual seguido de un espacio.
            }
            System.out.println();
        }
    }
    
}
