/**
  @author: Christian Millán Soria
  @file: Ej11Func.java
  @info: ejercicio11 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej11Func{
  public static void main(String[] args){
    // número
      // scanner
        Scanner s=new Scanner(System.in);

        /***************/

        // obtención
          System.out.print("Introduce un número para ver su tabla de multiplicar: ");
            int num=s.nextInt();

          System.out.println();

        /***************/

      // cierre de scanner
        s.close();

    /*****************************************/

    // debug
      Varias.tablaMultiplicar(num);
    }
}