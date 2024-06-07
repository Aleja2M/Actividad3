
package co.edu.uniminuto;

/**
 16. Realizar una matriz 5x5, inicializarla totalmente en 1 y luego 
 * en la diagonal trasversa colocar el número cero (0). Imprimir la matriz
 */
public class EjercicioNo16 {

    public static void main(String[] args) {
       int[][] matriz = new int[5][5];//Esta declara matriz de tipo int.
          //Construccion de la matriz
        for (int i = 0; i < matriz.length; i++) {//recorrer cada fila de la matriz
            for (int j = 0; j < matriz[i].length; j++) {//recorrer cada elemento dentro de una fila específica.
                matriz[i][j] = 1;//asignar el valor 1 al elemento en la posición actual de la fila (i) y la columna (j) en la matriz.
            }
        }

        for (int i = 0; i < matriz.length; i++) {//recorre cada fila de la matriz otra vez
            matriz[i][i] = 0;//establecer el elemento en la posición actual de la fila (i) y la columna (i) en 0.
        }

        System.out.println("Matriz 5x5:");//Imprime una etiqueta
        for (int i = 0; i < matriz.length; i++) {//recorrer cada fila para imprimir.
            for (int j = 0; j < matriz[i].length; j++) {//recorrer cada elemento dentro de una fila para imprimir su valor.
                System.out.print(matriz[i][j] + " ");//Imprime valor
            }
            System.out.println();//agrega un carácter de nueva línea para pasar a la siguiente línea de la siguiente fila.
        }

    }
    
}
