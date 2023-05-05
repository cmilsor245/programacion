/**
  @author: Christian Millán Soria
  @file: Ej3Func.java
  @info: ejercicio 3 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej3Func{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

      /**********************/

      // primer número
        System.out.print("Introduce el primer número: ");
          int num1=s.nextInt();

      // segundo número
        System.out.print("Introduce el segundo número: ");
          int num2=s.nextInt();

      /**********************/

    // cierre de scanner
      s.close();

    /*********************************/

    // debug
      System.out.print("\nEl menor de estos dos números es el "+Varias.minimo(num1, num2));
  }
}