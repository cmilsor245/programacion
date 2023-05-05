/**
  @author: Christian Millán Soria
  @file: TestEj2.java
  @info: programa principal
*/

package tema14.c141.ej2_poo_excep;

import java.util.Scanner;

import tema14.c141.ej2_poo_excep.classes.*;

public class TestEj2Excepciones{
  /**
    @name: esNumerico
    @info: comprueba si el input es numérico
    @param opcion: opción a comprobar
    @return:
      - true: si es numérico
      - false: en caso contrario
  */
    private static boolean esNumerico(String opcion){
      return opcion!=null&&opcion.matches("[0-9.]+");
    }

  /********************************/

  // main
    public static void main(String[] args){
      // variable para la opción
        String opcion;
        int opcionNum=0;

      /********************************/

      // variable para los kilómetros
        String km;
        int kmNum;

      /********************************/

      // bicicleta nueva
        BicicletaExcepciones bici1=new BicicletaExcepciones(9);

      // coche nuevo
        CocheExcepciones coche1=new CocheExcepciones(1900);

      /********************************/

      // scanner
        Scanner input=new Scanner(System.in);

      /********************************/

      // menú de opciones
        while(opcionNum!=9){
          System.out.println("\n1. Anda con la bicicleta");
          System.out.println("2. Haz el caballito con la bicicleta");
          System.out.println("3. Anda con el coche");
          System.out.println("4. Quema rueda con el coche");
          System.out.println("5. Pintar vehículo");
          System.out.println("6. Ver kilometraje de la bicicleta");
          System.out.println("7. Ver kilometraje del coche");
          System.out.println("8. Ver kilometraje total");
          System.out.println("9. Salir");

          System.out.print("\nElige una opción (1-8): ");
            opcion=input.next();

          if(esNumerico(opcion)){
            opcionNum=Integer.parseInt(opcion);
          }else{
            opcionNum=0;
          }

          System.out.println();

          /*************************/

          // switch
            switch(opcionNum){
              case 1:
                System.out.print("¿Cuántos kilómetros quieres recorrer? -> ");

                km=input.next();

                if(esNumerico(km)){
                  kmNum=Integer.parseInt(km);
                }else{
                  kmNum=0;// si no es numérico se suman 0 kilómetros recorridos

                  System.out.println("\nOpción inválida.");
                }

                bici1.recorre(kmNum);
              break;

              /***************/

              case 2:
                bici1.hazCaballito();
              break;

              /***************/

              case 3:
                System.out.print("¿Cuántos kilómetros quieres recorrer? -> ");

                km=input.next();

                if(esNumerico(km)){
                  kmNum=Integer.parseInt(km);
                }else{
                  kmNum=0;// si no es numérico se suman 0 kilómetros recorridos

                  System.out.println("\nOpción inválida.");
                }

                coche1.recorre(kmNum);
              break;

              /***************/

              case 4:
                coche1.quemaRueda();
              break;

              /***************/

              case 5:
                System.out.println("¿Qué vehículo quieres pintar?");
                  System.out.println("1. Coche");
                  System.out.println("2. Bicicleta");

                System.out.print("Elige una opción (1-2): ");
                  String pintar=input.next();
                    int pintarNum;

                  if(esNumerico(pintar)){
                    pintarNum=Integer.parseInt(pintar);

                    if(pintarNum==1){
                      coche1.pinta();
                    }else if(pintarNum==2){
                      bici1.pinta();
                    }else{
                      System.out.println("Opción inválida.");
                    }
                  }else{
                    System.out.println("\nOpción inválida.");
                  }
              break;

              /***************/

              case 6:
                System.out.print("La bicicleta lleva recorridos ");

                System.out.println(bici1.getKmRecorridos()+" Km.");
              break;

              /***************/

              case 7:
                System.out.print("El coche lleva recorridos ");

                System.out.println(coche1.getKmRecorridos()+" Km.");
              break;

              /***************/

              case 8:
                System.out.print("Los vehículos llevan recorridos ");

                System.out.println(VehiculoExcepciones.getKmTotales()+" Km.");
              break;

              /***************/

              case 9:
                System.out.print("");
              break;

              /***************/

              default:
                System.out.println("Opción inválida.");
              break;
            }
        }

      /********************************/

      // cierre de scanner
        input.close();
    }
}