/*
  @author: Christian Millán Soria
  info: ejercicio 1
*/

package tema7.c71.ej1;

public class Ej1{
  public static void main(String[] args){
    // creación del array
      int[] num=new int[12];

      // asignación de valores
        num[0]=39;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;

    // contenido de todos los elementos
      for(int i=0; i<12; i++){
        System.out.print("| "+num[i]+" |");
      }
  }
}