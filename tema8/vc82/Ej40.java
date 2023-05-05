/**
  @author: Christian Millán Soria
  @file: Ej40.java
  @info: ejercicio 40
*/

package tema8.vc82;

import tema8.vc82.misFunciones.Arrays;

import java.util.Scanner;

public class Ej40{
  public static void main(String[] args){
    // tamaño del array
      // print
        System.out.print("Introduce el tamaño que tendrá el array: ");

        // scanner
          Scanner tamanoScanner=new Scanner(System.in);
            int t=tamanoScanner.nextInt();;

    /************************/

    // creación del array
      int[] x=new int[t];

    /************************/

    // asignación de valores
      // mínimo
        System.out.print("Introduce el valor mínimo que tendrá el array: ");

        // scanner
          Scanner minScanner=new Scanner(System.in);
            int min=minScanner.nextInt();

      // máximo
        System.out.print("Introduce el valor máximo que tendrá el array: ");

        // scanner
          Scanner maxScanner=new Scanner(System.in);
            int max=maxScanner.nextInt();

      // función para generar el array
        x=Arrays.generaArrayInt(t, min, max);

    /*****************************************/

    // debug
      // array original
        System.out.println("\nEl array original es el siguiente:");
          for(int i=0; i<t; i++){
            System.out.print("| "+x[i]);
          }
          System.out.println(" |");

      /****************/

      // array filtrado
        int[] filtrado=Arrays.filtraCon7(x);

        System.out.println("\nEl array filtrado es el siguiente:");
          for(int i=0; i<filtrado.length; i++){
            System.out.print("| "+filtrado[i]);
          }
          System.out.println(" |");
  }
}