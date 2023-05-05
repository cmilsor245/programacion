/**
  @author: Christian Millán Soria
  @file: Ejemplo2.java
  @info: ejemplo 2
*/

package tema7.repaso.ejemplo2;

public class Ejemplo2{
  public static void main(String[] args){
    // array
      // nº de elementos
        int t=100;

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