/**
  @author: Christian Millán Soria
  @file: Ej6.java
  @info: ejercicio 6
*/

package tema8.c81;

import java.util.Scanner;

public class Ej6{
  /**
    @info: función para número invertido
    @param x: número
    @return rev: número invertido
  */
    public static int voltea(int x){
      // variable auxiliar
        int aux=x;

      // número invertido
        int rev=0;

      // volteo
        while(aux!=0){
          rev=rev*10+aux%10;
          aux/=10;
        }

      // return
        return rev;
    }

  /***************************************************************/

  // main
    public static void main(String[] args){
      // números
        // scanner
          Scanner s=new Scanner(System.in);

        // obtención del número
          System.out.print("Introduce el número: ");
            int n=s.nextInt();

        // cierre scanner
          s.close();

      /************************************/

      // función "voltea"
        System.out.println("\nEl número "+n+" al revés es "+voltea(n)+".");
    }
}