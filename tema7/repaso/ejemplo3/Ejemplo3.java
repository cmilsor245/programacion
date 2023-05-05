/**
  @author: Christian Millán Soria
  @file: Ejemplo3.java
  @info: ejemplo 3
*/

package tema7.repaso.ejemplo3;

import java.util.Scanner;

public class Ejemplo3{
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
          array[i]=(int)(Math.random()*10+1);
        }

    /***********************************/

    // debug
      for(int i=0; i<t; i++){
        System.out.printf("| %-2d ", array[i]);
      }

      System.out.print("|");
  }
}