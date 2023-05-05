/**
  @author: Christian Millán Soria
  @file: Ej35.java
  @info: ejercicio 35
*/

package tema8.vc82;

import tema8.vc82.misFunciones.Varias;

import java.util.Scanner;

public class Ej35{
  public static void main(String[] args){
    // número a convertir
      System.out.print("Introduce el número a convertir: ");

      // obtención
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();
        s.close();

    /*****************************************/

    // debug
      System.out.print("El número "+n+" en el sistema de palotes es -> "+Varias.convierteEnPalotes(n)+".");
  }
}