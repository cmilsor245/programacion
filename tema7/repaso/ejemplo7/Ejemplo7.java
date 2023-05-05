/**
  @author: Christian Millán Soria
  @file: Ejemplo7.java
  @info: ejemplo 7
*/

package tema7.repaso.ejemplo7;

import java.util.Scanner;

public class Ejemplo7{
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
        for(int i=0; i<f; i++){
          for(int j=0; j<c; j++){
            array[i][j]=(int)(Math.random()*101+100);
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