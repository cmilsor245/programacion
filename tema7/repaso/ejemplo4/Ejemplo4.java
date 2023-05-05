/**
  @author: Christian Millán Soria
  @file: Ejemplo4.java
  @info: ejemplo 4
*/

package tema7.repaso.ejemplo4;

import java.util.Scanner;

public class Ejemplo4{
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

    // array
      // creación
        int[] array=new int[t];

      // asignación de valores
        for(int i=0; i<t; i++){
          array[i]=(int)(Math.random()*11+50);
        }

    /***********************************/

    // debug
      for(int i=0; i<t; i++){
        System.out.printf("| %-2d ", array[i]);
      }

      System.out.print("|");
  }
}