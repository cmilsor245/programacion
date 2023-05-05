/**
  @author: Christian Millán Soria
  @file: Ejemplo5.java
  @info: ejemplo 5
*/

package tema7.repaso.ejemplo5;

import java.util.Scanner;

public class Ejemplo5{
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

    // array
      // creación
        int[] array=new int[t];

      // asignación de valores
        for(int i=0; i<t; i++){
          array[i]=(int)(Math.random()*11+50);

          if(array[i]>max){
            max=array[i];
          }
        }

    /***********************************/

      // debug
        for(int i=0; i<t; i++){
          if(array[i]>=max){
            System.out.printf("| **%-2d** ", array[i]);
          }else{
            System.out.printf("| %-2d ", array[i]);
          }
        }

        System.out.print("|");
  }
}