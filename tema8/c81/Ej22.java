/**
  @author: Christian Millán Soria
  @file: Ej22.java
  @info: ejercicio 22
*/

package tema8.c81;

import java.util.Scanner;

public class Ej22{
  /**
    @info:función para generar un array
    @param:
      - "x": nº de elementos
      - "y": intervalo menor
      - "z": intervalo mayor
    @return array: array generado
  */
    public static int[] generaArrayInt(int x, int y, int z){
      // array
        // nº de elementos
        int t=x;

        // creación
          int[] array=new int[t];

        // asignación de valores
          for(int i=0; i<t; i++){
            array[i]=(int)(Math.random()*(z-y+1)+y);
          }

      /**********************************/

      // return
        return array;
    }

    /*******************************************************************************************/

    /**
      @info: función para obtener el máximo de array
      @param int[] x: array del que se saca el máximo
      @return min: valor máximo del array
    */
      public static int maximoArrayInt(int[] x){
        // variable para el máximo
          int valorMax=Integer.MIN_VALUE;

        /*********************/

        // recorrer array
          for(int i=0; i<x.length; i++){
            if(x[i]>valorMax){
              valorMax=x[i];
            }
          }

        /*********************/

        // return
          return valorMax;
      }

    /*******************************************************************************************/

    // main
      public static void main(String[] args){
        // scanner
          Scanner s=new Scanner(System.in);

          /************************/

          // nº de elementos
            System.out.print("Introduce el número de elementos que debe tener el array: ");
              int ele=s.nextInt();

          /************************/

          // intervalo menor
          System.out.print("Introduce el valor mínimo del intervalo de los valores: ");
            int min=s.nextInt();

          /************************/

          // intervalo menor
          System.out.print("Introduce el valor máximo del intervalo de los valores: ");
            int max=s.nextInt();

        // cierre de scanner
          s.close();

        /***********************************/

        // almacenar el array
          // nuevo array
            int[] arrayGuardado=new int[ele];

          // asignación de valores
            for(int i=0; i<ele; i++){
              arrayGuardado[i]=generaArrayInt(ele, min, max)[i];
            }

        /***********************************/

        // debug
          System.out.println("");

          for(int i=0; i<ele; i++){
            System.out.printf("| %-5d", arrayGuardado[i]);
          }

          System.out.println(" |");

        /***********************************/

        // máximo
          System.out.print("\nEl valor máximo de este array es el "+maximoArrayInt(arrayGuardado)+".");
      }
}