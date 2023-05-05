/**
  @author: Christian Millán Soria
  @file: Ej1.java
  @info: ejercicio 1
*/

package tema8.c81;

import java.util.Scanner;

public class Ej1{
  /**
    @info: función para números capicúa
    @param x: número
    @return:
      - "true": el número es capicúa
      - "false": el número no es capicúa
  */
    public static boolean esCapicua(int x){
      // variable auxiliar
        int aux=x;

      // número invertido
        int rev=0;

      // volteo
        while(aux!=0) {
            rev=rev*10+aux%10;
            aux/=10;
        }        

      // comprobación
        if(x==rev){
          return true;
        }else{
          return false;
        }
    }

  /***************************************************************/

  // main
    public static void main(String[] args){
      // número
        // scanner
          Scanner s=new Scanner(System.in);

        // obtención del número
          System.out.print("Introduce el número: ");
            int n=s.nextInt();

        // cierre scanner
          s.close();

      /************************************/

      // función "esCapicua"
        if(esCapicua(n)){
          System.out.print("\nEl número "+n+" es capicúa.");
        }else{
          System.out.print("\nEl número "+n+" no es capicúa.");
        }
    }
}