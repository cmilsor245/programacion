/**
  @author: Christian Millán Soria
  @file: Ej18Func.java
  @info: ejercicio 18 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej18Func{
  public static void main(String[] args){
    // dni
      // scanner
        Scanner s=new Scanner(System.in);

        /***************/

        // obtención
          System.out.print("Introduce tu número de DNI: ");
            int dni=s.nextInt();

        /***************/

      // cierre de scanner
        s.close();

    /***************************************/

    // debug
      char letra=Varias.obtenerLetra(dni);

      System.out.println("Tu NIF es: "+dni+letra+".");
  }
}