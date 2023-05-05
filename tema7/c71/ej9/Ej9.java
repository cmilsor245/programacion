/*
  @author: Christian Millán Soria
  info: ejercicio 9
*/

package tema7.c71.ej9;

import java.util.Scanner;

public class Ej9{
  public static void main(String[] args){
    // creación de array
      int x=8;
      int[] n=new int[x];

    /*******************************************/

    // números
      // scanner
        Scanner s=new Scanner(System.in);

      // obtención
        for(int i=0; i<x; i++){
          System.out.print("Introduce un número: ");
            n[i]=s.nextInt();
        }

      // cierre de scanner
        s.close();

    /*******************************************/

    // separación
      for(int i=0; i<x; i++){
        if((n[i]%2)==0){
          System.out.print("| "+n[i]+" - par |");
        }else{
          System.out.print("| "+n[i]+" - impar |");
        }
      }
  }
}