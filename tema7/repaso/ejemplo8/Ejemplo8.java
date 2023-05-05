/**
  @author: Christian Millán Soria
  @file: Ejemplo8.java
  @info: ejemplo 8
*/

package tema7.repaso.ejemplo8;

import java.util.Scanner;

public class Ejemplo8{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

    // tamaño array
      System.out.print("Introduce el tamaño de las filas del array: ");
        int f=s.nextInt();

      System.out.print("Introduce el tamaño de las columnas del array: ");
        int c=s.nextInt();

    // cierre de scanner
      s.close();

    /*************************/

    // array
      // creación
        int[][] array=new int[f][c];

      // asignación de valores
        int aux=0;

        for(int i=0; i<f; i++){
          for(int j=0; j<c; j++){
            array[i][j]=aux;

            aux+=2;
          }
        }

    /*************************/

    // debug
    for(int i=0; i<f; i++){
      for(int j=0; j<c; j++){
        System.out.printf("| %-3d ", array[i][j]);
      }

      System.out.println("|");
    }
  }
}