/**
  @author: Christian Millán Soria
  @file: Mod1Func.java
  @info: modificación 1 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import tema8.c81.misFunciones.Geometria;

public class Mod1Func{
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
      }else if(opcion==3){
        // radio
          double radio=Varias.pideRadio();

        /**************/

        // debug
          System.out.println("El volumen es: "+Geometria.volumen(radio));
      }else{
        System.out.println("Opción no válida");
      }
  }
}