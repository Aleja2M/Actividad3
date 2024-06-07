
package co.edu.uniminuto;

/**
13. Realizar un programa que genere una matriz 7x7, inicializarla la diagonal
principal con el número “0”(cero), el resto de las posiciones deben ser - (guion).
Imprimir la matriz.
 */
public class EjercicioNo13 {

    public static void main(String[] args) {
      int[][] matriz = new int[7][7];//Esta declara matriz bidimensional denominada matriz de tipo int.
          //Construccion de la matriz
        for (int i = 0; i < matriz.length; i++) {//Esto recorre cada fila de la matriz.
            for (int j = 0; j < matriz[i].length; j++) {//Esto recorre cada elemento dentro de una fila específica.
                matriz[i][j] = '-';
                if (i == j) {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("Matriz 7x7:");//imprime una etiqueta que indica que es una matriz de 5x5.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");//imprime el valor en la posición actual seguido de un espacio.
            }
            System.out.println();//agrega un carácter de nueva línea para pasar a la siguiente línea de la siguiente fila.
        }
    }
    
}
