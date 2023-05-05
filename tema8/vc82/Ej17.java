/**
  @author: Christian Millán Soria
  @file: Ej17.java
  @info: ejercicio 17
*/

package tema8.vc82;

import tema8.vc82.misFunciones.Varias;

import java.util.Scanner;

public class Ej17{
  public static void main(String[] args){
    // número a convertir
      System.out.print("Introduce un número binario (sin decimales) para obtenerlo en decimal: ");

      // scanner
        Scanner s=new Scanner(System.in);
          int num=s.nextInt();

    /***********************************************/

    // comprobación de si es binario
      if(!Varias.esBinario(num)){
        System.out.println("\nEl número "+num+" no es binario.");
      }else{
        System.out.print("\nEl numero binario "+num+" en decimal es "+Varias.binarioADecimal(num)+".");
      }
  }
}