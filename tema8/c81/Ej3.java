/**
  @author: Christian Millán Soria
  @file: Ej3.java
  @info: ejercicio 3
*/

package tema8.c81;

import java.util.Scanner;

public class Ej3{
  /**
    @info: función para el siguiente número primo
    @param x: número
    @return num: variable que contiene el siguiente número primo
  */
    public static int siguientePrimo(int x){
      // siguiente número
        int num=x+1;

      // bucle infinito
      while(true){
        // de forma predeterminada, el número es primo
          boolean primo=true;

        // comprobación de si es primo
          for(int i=2; i<=(num/2); i++){
            // si no es primo, se acaba el bucle "for" y se sigue ejecutando el bucle "while"
              if(num%i==0){
                primo=false;

                break;
              }
          }

        // si el número sacado del "for" es primo, se devuelve al "main"
          if(primo){
            return num;
          }

        // si no es primo, no se devuelve al "main" y se aumenta en 1 unidad
          num++;
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

      // función "esPrimo"
        System.out.println("\nEl siguiente valor primo es el "+siguientePrimo(n)+".");
    }
}