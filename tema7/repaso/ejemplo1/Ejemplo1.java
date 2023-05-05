/**
  @author: Christian Millán Soria
  @file: Ejemplo1.java
  @info: ejemplo 1
*/

package tema7.repaso.ejemplo1;

public class Ejemplo1{
  public static void main(String[] args){
    // array
      // nº de elementos
        int t=20;

      // creación
        int[] array=new int[t];

      // asignación de valores
        for(int i=0; i<t; i++){
          array[i]=(int)(Math.random()*11);
        }

    /***********************************/

    // debug
      for(int i=0; i<t; i++){
        System.out.printf("| %-2d ", array[i]);
      }

      System.out.print("|");
  }
}