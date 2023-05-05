/*
  @author: Christian Millán Soria
  info: ejemplo
*/

package tema7.c71.ejemplo;

public class Ejemplo{
  public static void main(String[] args){
    // creación del array
      // número de elementos
        int t=10;

      // creación
        int[] n=new int[10];

    /***************************/

    // asignación de valores
      for(int i=0; i<6; i++){
        n[i]=(int)(Math.pow(i, i));
      }

      // elementos restantes
        n[6]=n[2]*10;
        n[7]=n[2]/10;
        n[8]=n[0]+n[1]+n[2];
        n[9]=n[8];

    /***************************/

    // debug
      for(int i=0; i<t; i++){
        System.out.print("| "+n[i]+" |");
      }
  }
}