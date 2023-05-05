/**
  @author: Christian Millán Soria
  @file: Ej37.java
  @info: ejercicio 37
*/

package tema8.vc82;

import tema8.vc82.misFunciones.Varias;

import java.util.Scanner;

public class Ej37{
  public static void main(String[] args){
    // número a convertir
      System.out.print("Introduce el número a convertir: ");

      // obtención
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();
        s.close();

    /*******************************/

    // debug
      System.out.print("El número "+n+" en morse es -> "+Varias.convierteEnMorse(n));
  }
}