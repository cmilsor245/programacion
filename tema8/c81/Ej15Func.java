/**
  @author: Christian Millán Soria
  @file: Ej15Func.java
  @info: ejercicio 15 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Arrays;

import java.util.Scanner;

public class Ej15Func{
  public static void main(String[] args){
    // tamaño array
      // scanner
        Scanner s=new Scanner(System.in);

        /*****************/

        // obtención
          System.out.print("Introduce el tamaño del array a generar: ");
            int t=s.nextInt();

          System.out.println();

        /*****************/

      // cierre de scanner
        s.close();

    /****************************************/

    // debug
      for(int i=0; i<t; i++){
        System.out.printf("| %-3d ", Arrays.arrayNaturales(t)[i]);
      }

      System.out.print("|");
  }
}