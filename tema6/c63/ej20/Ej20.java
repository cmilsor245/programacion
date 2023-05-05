/**
  @author: Christian Millán Soria
  @file: Ej20.java
  @info: ejercicio 20
*/

package tema6.c63.ej20;

import java.util.Scanner;

public class Ej20{
  public static void main(String[] args){
    // obtención de la capacidad
      System.out.print("Indica la capacidad máxima de la cuba en litros: ");

      /***************/

      // scanner
        Scanner s=new Scanner(System.in);
          int capacidad=s.nextInt();

    /**************************************/

    // generación aleatoria de la cantidad
      int cantidadAleatoria=(int)(Math.random()*(capacidad+1));

    /**************************************/

    // generación de la cuba
      // espacios vacíos en la parte superior
        int vacio=capacidad-cantidadAleatoria;

        for(int i=0; i<vacio; i++){
          System.out.println("*    *");
        }

      /******************/

      // espacios rellenos
        for(int i=0; i<cantidadAleatoria; i++){
          System.out.println("*====*");
        }

      /******************/

      // base
        System.out.println("******");

    /**************************************/

    // informe
      System.out.print("La cuba tiene una capacidad de "+capacidad+" litros y contiene "+cantidadAleatoria+" litros de agua.");
  }
}