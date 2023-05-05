/**
  @author: Christian Millán Soria
  @file: Ej39.java
  @info: ejercicio 39
*/

package tema8.vc82;

import tema8.vc82.misFunciones.Varias;

import java.util.Scanner;

public class Ej39{
  public static void main(String[] args){
    // número
      System.out.print("Introduce un número para verlo en palabras: ");

      // obtención
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();
        s.close();

    /**************************/

    // debug
      System.out.println("El número "+n+" en palabras es el siguiente:");
      System.out.print(Varias.convierteEnPalabras(n));
  }
}