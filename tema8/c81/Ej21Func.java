/**
  @author: Christian Millán Soria
  @file: Ej21Func.java
  @info: ejercicio 21 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import tema8.c81.misFunciones.Geometria;

public class Ej21Func{
  public static void main(String[] args){
    // menú
      int opcion=Varias.menu();

    /********************/

    // comprobación de la opción elegida
      if(opcion==1){
        // radio
          double radio=Varias.pideRadio();

        /**************/

        // debug
          System.out.println("La circunferencia es: "+Geometria.circunferencia(radio));
      }else if(opcion==2){
        // radio
          double radio=Varias.pideRadio();

        /**************/

        // debug
          System.out.println("El área es: "+Geometria.area(radio));
      }else{
        System.out.println("Opción no válida");
      }
  }
}