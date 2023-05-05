/*
  @author: Christian Millán Soria
  info: ejercicio 5
*/

package tema7.c71.ej5;

import java.util.Scanner;

public class Ej5{
  public static void main(String[] args){
    // array
      int[] n=new int[10];

    // variables
      // máximo
        int max=0;
        String maxText="";

      // mínimo
        int min=999999999;
        String minText="";

    /*****************************/

    // números
      // scanner
        Scanner s=new Scanner(System.in);

      // obtención
        for(int i=0; i<10; i++){
          System.out.print("Introduce un número: ");
            n[i]=s.nextInt();

          // comprobación
            // máximo
              if(n[i]>max){
                maxText=n[i]+" -> máximo";
                max=n[i];
              }

            // mínimo
              if(n[i]<min){
                minText=n[i]+" -> mínimo";
                min=n[i];
              }
        }

      // cierre scanner
        s.close();

    /*****************************/

    // debug
      for(int i=0; i<10; i++){
        System.out.print("| "+n[i]+" |");
      }

      System.out.println();
      System.out.println(maxText);
      System.out.print(minText);
  }
}