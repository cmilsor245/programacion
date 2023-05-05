/**
  @author: Christian Millán Soria
  @file: Ej7Func.java
  @info: ejercicio 7 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Geometria;

import java.util.Scanner;

public class Ej7Func{
  public static void main(String[] args){
    // área y perímetro
      // scanner
        Scanner s=new Scanner(System.in);

        /**************/

        // ancho
          System.out.print("Introduce el ancho del rectángulo: ");
            double ancho=s.nextDouble();

        // alto
          System.out.print("Introduce el alto del rectángulo: ");
            double alto=s.nextDouble();

        /**************/

      // cierre de scanner
        s.close();

    /************************************/

    // debug
      // perímetro
        System.out.println("\nEl perímetro de un rectángulo de ancho "+ancho+" y alto "+alto+" es: "+Geometria.perimetroRectangulo(ancho,alto));

      // área
        System.out.print("\nEl área de un rectángulo de ancho "+ancho+" y alto "+alto+" es: "+Geometria.areaRectangulo(ancho,alto));
  }
}