
package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo9 {

    /**
     *9. Leer N cantidad de notas (validar rango de notas), imprimir 
     * el promedio de las notas, la nota más alta y la más baja.
     */
    public static void main(String[] args) {
          // Crear el objeto de leer la entrada  
         Scanner leer = new Scanner(System.in);
         //variables
         double acumulador = 0;
        double notaMasAlta = 0;
        double notaMasBaja = 10;
        double promedio=0;
        double nota=0;
        int numero=0;
        //Se le pide al usuario que ingrese la cantidad de notas utilizando
        System.out.print("Ingrese la cantidad de notas: ");
        numero = leer.nextInt();
        //Condicion para obtener la cantidad de notas 
        while (numero <= 0) {
            System.out.println("Error: la cantidad de notas debe ser mayor que 0.");
            System.out.print("Ingrese la cantidad de notas: ");
            numero = leer.nextInt();
        }
        //Condicion para leer las notas
        for (int i = 1; i <= numero; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = leer.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.println("Error: la nota debe estar entre 0 y 10.");
                System.out.print("Ingrese la nota " + i + ": ");
                nota = leer.nextDouble();
            }
            //condicion de acumulador, notasMasAltas y notasMasBajas
            acumulador += nota;
            notaMasAlta = Math.max(notaMasAlta, nota);
            notaMasBaja = Math.min(notaMasBaja, nota);
        }
            //Calcular Promedio
        promedio = acumulador / numero;
            //Mostrar resultados
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Nota mas alta: " + notaMasAlta);
        System.out.println("Nota mas baja: " + notaMasBaja); 
    }  
}
