package co.edu.uniminuto;

import javax.swing.JOptionPane;

/**
 * 18. Generar una matriz nxn (dado por el usuario) el valor de n debe ser mayor
 * a 2 y menor a 10 y llenarla con números aleatorios.
 */
public class EjercicioNo18 {

    public static void main(String[] args) {
        // Casteo de datos--> String a Short
         //Asignacion de variables
        short fila = 0;
        short columna = 0;
        //Pedir cantidad de columnas y filas al usuario
        do {
            fila = Short.parseShort(JOptionPane.showInputDialog("Dame las filas de la matriz")); //Pedir cantidad filas
            columna = Short.parseShort(JOptionPane.showInputDialog("Dame las columnas de la matriz:"));//Pedir cantidad columnas
            short[][] arrayBidimen = new short[fila][columna];
        } while (fila <= 2 || fila >= 10 || columna <= 2 || columna >= 10);
        short arrayBidimen[][] = new short[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                arrayBidimen[i][j] = (short) ((Math.random() * 10) + 1);
            }
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(arrayBidimen[i][j]+" ");       
        }
            System.out.println("");
    }
}
}
