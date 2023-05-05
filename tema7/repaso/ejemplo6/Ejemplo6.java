/**
  @author: Christian Millán Soria
  @file: Ejemplo6.java
  @info: ejemplo 6
*/

package tema7.repaso.ejemplo6;

import java.util.Scanner;

public class Ejemplo6{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

    // tamaño array
      System.out.print("Introduce el tamaño que debe tener el array: ");
        int t=s.nextInt();

      System.out.println();

    // cierre de scanner
      s.close();

    /***********************************/
    
    // máximo
      int max=Integer.MIN_VALUE;
    
    /***********************************/

    // array pares
      int[] fila2=new int[t];

    /***********************************/

    // array original
      // creación
        int[] fila1=new int[t];

      // asignación de valores
        for(int i=0; i<t; i++){
          fila1[i]=(int)(Math.random()*11+50);

          // máximo
            if(fila1[i]>max){
              max=fila1[i];
            }
        }

    /***********************************/

    // asignación de valores pares
      int aux=t;

      for(int i=0; i<t; i++){
        if(fila1[i]%2==0){
          fila2[aux-1]=fila1[i];

          aux--;
        }
      }

    /***********************************/

      // debug original
        for(int i=0; i<t; i++){
          if(fila1[i]>=max){
            System.out.printf("| **%-2d** ", fila1[i]);
          }else{
            System.out.printf("| %-2d ", fila1[i]);
          }
        }

        System.out.print("|");

        System.out.println();
        System.out.println();

      /**************/

      // debug
        for(int i=0; i<t; i++){
          System.out.printf("| %-2d ", fila2[i]);
        }

        System.out.print("|");
  }
}