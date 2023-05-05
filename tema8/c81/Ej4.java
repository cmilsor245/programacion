/**
  @author: Christian Millán Soria
  @file: Ej4.java
  @info: ejercicio 4
*/

package tema8.c81;

import java.util.Scanner;

public class Ej4{
  /**
    @info: función para obtener la potencia
    @param:
      - "x": base
      - "y": exponente
    @return resultado: resultado de la potencia de la base y el exponente introducidos por teclado
  */
    public static int potencia(int x, int y){
      // int resultado=(int)(Math.pow(x, y));

      int acu=1;

      for(int i=0; i<y; i++){
        acu*=x;
      }

      return acu;
    }

  /***************************************************************/

  // main
    public static void main(String[] args){
      // números
        // scanner
          Scanner s=new Scanner(System.in);

        // obtención de la base
          System.out.print("Introduce la base: ");
            int b=s.nextInt();

        // obtención del exponente
          System.out.print("Introduce la base: ");
            int e=s.nextInt();

        // cierre scanner
          s.close();

      /************************************/

      // función "potencia"
        System.out.println("\nEl resultado de la potencia de "+b+" elevado a "+e+" es "+potencia(b, e)+".");
    }
}