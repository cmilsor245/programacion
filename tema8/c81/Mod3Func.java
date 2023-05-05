/**
  @author: Christian Millán Soria
  @file: Mod3Func.java
  @info: modificación 3 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import tema8.c81.misFunciones.Geometria;

public class Mod3Func{
  public static void main(String[] args){
    // variable para la opción elegida
      int opcion;

    // bucle mientras la opción no sea la 5
      do{
        // obtención de la opción
          opcion=Varias.menu();

        /***************/

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
          }else if(opcion==4){
            // radio
              double radio=Varias.pideRadio();

            /**************/

            // debug
              System.out.println("La circunferencia es: "+Geometria.circunferencia(radio));
              System.out.println("El área es: "+Geometria.area(radio));
              System.out.println("El volumen es: "+Geometria.volumen(radio));
          }else if(opcion!=5){
            System.out.println("Opción no válida");
          }
        }while(opcion!=5);

        System.out.print("Programa terminado.");
  }
}