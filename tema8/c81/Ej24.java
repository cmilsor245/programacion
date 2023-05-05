/**
  @author: Christian Millán Soria
  @file: Ej24.java
  @info: ejercicio 24
*/

package tema8.c81;

import java.util.Scanner;

public class Ej24{
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
      @info: función para obtener el mínimo de array
      @param int[] x: array del que se saca el mínimo
      @return min: valor mínimo del array
    */
      public static int minimoArrayInt(int[] x){
        // variable para el máximo
          int valorMin=Integer.MAX_VALUE;

        /*********************/

        // recorrer array
          for(int i=0; i<x.length; i++){
            if(x[i]<valorMin){
              valorMin=x[i];
            }
          }

        /*********************/

        // return
          return valorMin;
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

    /**
      @info: función para obtener la media del array
      @param:
        - "int[] x": array
        - "y": nº de elementos totales del array
      @return media: media del array
    */
      public static int mediaArrayInt(int[] x, int y){
        // suma de los valores del array
          int suma=0;

        /****************/

        // cálculo de la media
          for(int i=0; i<y; i++){
            suma+=x[i];
          }

          int media=suma/y;

        /****************/

        // return
          return media;
      }

    /*******************************************************************************************/

    /**
      @info: función para comprobar si un número está en el array
      @param:
        - "int[] x": array
        - "y": valor a encontrar en el array
      @return:
        - "true": el valor se encuentra en el array
        - "false": el valor no se encuentra en el array
    */
      public static boolean estaEnArrayInt(int[] x, int y){
        // variable booleana
          boolean esta=false;

        // recorrer el array para encontrar el valor
          for(int i=0; i<x.length; i++){
            if(x[i]==y){
              return true;
            }
          }

        // return predeterminado
          return esta;
      }

    /*******************************************************************************************/

    // main
      public static void main(String[] args) throws InterruptedException{
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

        /****************************************************/

        // almacenar el array
          // nuevo array
            int[] arrayGuardado=new int[ele];

          // asignación de valores
            for(int i=0; i<ele; i++){
              arrayGuardado[i]=generaArrayInt(ele, min, max)[i];
            }

        /****************************************************/

        // debug
          System.out.println("");

          for(int i=0; i<ele; i++){
            System.out.printf("| %-5d", arrayGuardado[i]);
          }

          System.out.println(" |");

        /****************************************************/

        // mínimo
          System.out.println("\nEl valor mínimo de este array es el "+minimoArrayInt(arrayGuardado)+".");

        /*******************/

        // máximo
          System.out.println("El valor máximo de este array es el "+maximoArrayInt(arrayGuardado)+".");

        /****************************************************/

        // media
          System.out.println("\nLa media de todos los valores del array es "+mediaArrayInt(arrayGuardado, ele)+".");

        /****************************************************/

        // está el número en el array o no?
          Thread.sleep(5000);

          // obtención del número
            System.out.print("\nIntroduce un valor del array para comprobar su existencia en el array: ");
              int busca=s.nextInt();

          // cierre de scanner
            s.close();

        /******************************/

        // debug
          if(estaEnArrayInt(arrayGuardado, busca)){
            System.out.print("\nEl valor "+busca+" sí está en el array.");
          }else{
            System.out.print("\nEl valor "+busca+" no está en el array.");
          }
      }
}