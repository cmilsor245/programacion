/**
  @author: Christian Millán Soria
  @file: Ej18.java
  @info: ejercicio 18
*/

package tema8.vc82;

import tema8.vc82.misFunciones.Varias;

import java.util.Scanner;

public class Ej18{
  public static void main(String[] args){
    // número a convertir
      System.out.print("Introduce el número decimal: ");

      // scanner
        Scanner s=new Scanner(System.in);
          int num=s.nextInt();

    /***************************************/

    // debug
      System.out.print("\nEl número decimal "+num+" es "+Varias.decimalABinario(num)+".");
  }
}