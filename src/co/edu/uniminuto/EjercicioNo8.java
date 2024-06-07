
package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo8 {

    /**
     8.Dado N cantidad de precios de gaseosas en un supermercado el gerente 
     * de ventas desea que se genere un programa que le permita saber cuál de
     * las gaseosas tiene el mayor precio, cuál tiene menor precio y cuál es
     * el precio promedio. Hacer las impresiones según lo requerido.
     */
    public static void main(String[] args) {
        // 1 Crear el objeto de leer la entrada 
        Scanner leer = new Scanner(System.in);
        //Asignacion de variables 
         int cantidadPrecios=0;//Almacena la cantidad de precios de gaseosas que el usuario va a ingresar.
         double mayorPrecio=0;//Esta variable acompaña con Double.NEGATIVE_INFINITY para representar el menor valor posible.
         double menorPrecio=0;//Esta variable acompaña con Double.POSITIVE_INFINITY para representar el mayor valor posible.
         double promedioPrecios=0.0;// Esta variable se inicia en 0.0 para almacenar la suma de los precios en decimales
         double precio=0;//Variable que almacena cada precio individual de gaseosa ingresado por el usuario.
         double precioPromedio=0;// Almacena el precio promedio de las gaseosas.
        // Se agrega el double para la variable mayorPrecio y menorPrecio
        mayorPrecio = Double.NEGATIVE_INFINITY;
        menorPrecio = Double.POSITIVE_INFINITY;
        
        // Solicitar al usuario la cantidad de precios de gaseosas a ingresar
        System.out.println("Ingrese la cantidad de precios de gaseosas:");
        cantidadPrecios = leer.nextInt();//Leer la cantidad que ingresa el usuario

        // Verificar que la cantidad de precios sea mayor a 0
        if (cantidadPrecios <= 0) {
            System.out.println("La cantidad de precios debe ser mayor a 0.");
            return;
        }
        // Iterar sobre la cantidad de precios ingresados por el usuario
        for (int i = 0; i < cantidadPrecios; i++) {
            System.out.println("Ingrese el precio de la gaseosa " + (i + 1) + ":");
             precio = leer.nextDouble();

            // Actualizar el mayor y el menor precio
            if (precio > mayorPrecio) {
                mayorPrecio = precio;
            }
            if (precio < menorPrecio) {
                menorPrecio = precio;
            }
            // Sumar el precio al total
            promedioPrecios += precio;
        }

        // Calcular el precio promedio
        precioPromedio = promedioPrecios / cantidadPrecios;

        // Imprimir los resultados
        System.out.println("El mayor precio es: " + mayorPrecio);
        System.out.println("El menor precio es: " + menorPrecio);
        System.out.println("El precio promedio es: " + precioPromedio);


  }
    
}
