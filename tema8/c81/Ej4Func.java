/**
  @author: Christian Millán Soria
  @file: Ej4Func.java
  @info: ejercicio 4 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej4Func{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

      /**********************/

      // número
        System.out.print("Introduce el primer número: ");
          int n=s.nextInt();

      /**********************/

    // cierre de scanner
      s.close();

    /*********************************/

    // debug
      if(Varias.dimeSigno(n)==-1){
        System.out.print("\nEl número introducido es negativo.");
      }else if(Varias.dimeSigno(n)==0){
        System.out.print("\nEl número introducido es igual a 0.");
      }else{
        System.out.print("\nEl número introducido es positivo.");
      }
  }
}