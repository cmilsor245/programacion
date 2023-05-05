/**
  @author: Christian Millán Soria
  @file: Ejemplo9.java
  @info: ejemplo 9
*/

package tema7.repaso.ejemplo9;

import java.util.Scanner;

public class Ejemplo9{
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

    // array múltiplos 3
      int[] multiplos3=new int[f*c];

    /*************************/

    // array
      // creación
        int[][] array=new int[f][c];

      // asignación de valores
        int aux=0;
        int aux2=0;

        for(int i=0; i<f; i++){
          for(int j=0; j<c; j++){
            array[i][j]=aux;

            aux+=2;

            if(array[i][j]%3==0){
              if(aux2%2==0){
                  multiplos3[aux2]=array[i][j];
              }

              aux2++;
            }
          }
        }

    /*************************/

    // debug original
      for(int i=0; i<f; i++){
        for(int j=0; j<c; j++){
          System.out.printf("| %-3d ", array[i][j]);
        }

        System.out.println("|");
      }

      System.out.println();
      System.out.println();

    /*************************/

    // debug múltiplos
      for(int i=0; i<f; i++){
        System.out.printf("| %-3d ", multiplos3[i]);
      }

      System.out.print("|");
  }
}