/**
  @author: Christian Millán Soria
  @file: Ej2.java
  @info: ejercicio 2
*/

package tema8.c81;

import java.util.Scanner;

public class Ej2{
  /**
    @info: función para números primos
    @param x: número
    @return:
      - "true": el número es primo
      - "false": el número no es primo
  */
    public static boolean esPrimo(int x){
      // si es 1 o menor, no es primo
        if(x<=1){
          return false;
        }
    
      // comprobación de divisores
        for(int i=2; i<=x/2; i++){
          if(x%i==0){
            return false;
          }
        }

      // de forma predeterminada es "true"
        return true;
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

      // función "esPrimo"
        if(esPrimo(n)){
          System.out.print("\nEl número "+n+" es primo.");
        }else{
          System.out.print("\nEl número "+n+" no es primo.");
        }
    }
}