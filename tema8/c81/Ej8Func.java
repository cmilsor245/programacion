/**
  @author: Christian Millán Soria
  @file: Ej8Func.java
  @info: ejercicio 8 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej8Func{
  public static void main(String[] args){
    // número
      // scanner
        Scanner s=new Scanner(System.in);

      /***************/

        // obtención de números
          System.out.print("Introduce el número: ");
            int n=s.nextInt();

      /***************/

      // cierre de scanner
        s.close();

    /****************************************/

    // suma
      System.out.println("\nLa suma de los números desde 1 a "+n+" es: "+Varias.suma1aN(n)+".");

    /****************************************/

    // producto
      System.out.println("\nEl producto de los factoriales de cada número desde 1 a "+n+" es: "+Varias.producto1aN(n));

    /****************************************/

    // intermedio
      if(Varias.intermedio1aN(n)==0){
        System.out.print("\nEl valor introducido es el 1, por lo que no hay ningún valor intermedio.");
      }else if(Varias.intermedio1aN(n)==1){
        System.out.print("\nEl valor intermedio entre 1 y "+n+" es el 1.5");
      }else{
        System.out.print("\nEl valor intermedio entre 1 y "+n+" es el "+Varias.intermedio1aN(n)+".");
      }
  }
}