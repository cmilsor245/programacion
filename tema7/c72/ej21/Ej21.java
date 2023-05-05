/*
  @author: Christian Millán Soria
  info: ejercicio 21
*/

package tema7.c72.ej21;

public class Ej21{
  public static void main(String[] args){
    // array
      // número de elementos
        int t=15;

      // creación
        int[] array=new int[t];

      // asignación de valores
        for(int i=0; i<t; i++){
          array[i]=(int)(Math.random()*501);
        }

    /******************************************/

    // array original
      System.out.println("Array original");

      for(int i=0; i<t; i++){
        System.out.printf("%-3d  ", array[i]);
      }

      System.out.println();

    /******************************************/

    // cincuerización
      for(int i=0; i<t; i++){
        while(array[i]%5!=0){
          array[i]+=1;
        }
      }

    /******************************************/

    // debug cincuerizado
      System.out.println("\nArray concuerizado");

      for(int i=0; i<t; i++){
        System.out.printf("%-3d  ", array[i]);
      }

      System.out.println();
  }
}