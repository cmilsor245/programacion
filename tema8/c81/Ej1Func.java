/**
  @author: Christian Millán Soria
  @file: Ej1Func.java
  @info: ejercicio 1 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej1Func{
  public static void main(String[] args) {
    // scanner
      Scanner s=new Scanner(System.in);

      /******************/

      // primer número
        System.out.print("Introduce el primer número a multiplicar: ");
          double num1=s.nextDouble();

      // segundo número
        System.out.print("Introduce el segundo número a multiplicar: ");
          double num2=s.nextDouble();

      /******************/

    // cierre de scanner
      s.close();

    /**************************************/

    // debug
      System.out.print("\nEl resultado de "+num1+"*"+num2+" es: "+Varias.multiplica(num1, num2));
  }
}
