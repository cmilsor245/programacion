/**
  @author: Christian Millán Soria
  @file: TestEj7.java
  @info: clase "TestEj7" - ejercicio 7
*/

package tema9.c91.ej7_poo;

import java.util.Scanner;

public class TestEj7{
  public static void main(String[] args){
    // instancias
      Zona zonaPrincipal=new Zona(1000);
      Zona zonaCompraVenta=new Zona(200);
      Zona zonaVIP=new Zona(25);

    /*********************************************/

    // scanner
      Scanner input=new Scanner(System.in);
      int opcion;

    /*********************************************/

    // menú
      do{
        // output
          System.out.println("Menú:");
          System.out.println("1. Mostrar número de entradas libres");
          System.out.println("2. Vender entradas");
          System.out.println("3. Salir");
          System.out.print("Elige una opción: ");
            opcion=input.nextInt();

        /************************/

        // switch
          switch(opcion){
              case 1:
                System.out.println("Entradas disponibles en la zona principal: "+zonaPrincipal.getEntradasPorVender());
                System.out.println("Entradas disponibles en la zona de compra-venta: "+zonaCompraVenta.getEntradasPorVender());
                System.out.println("Entradas disponibles en la zona VIP: "+zonaVIP.getEntradasPorVender());
              break;

              /*************/

              case 2:
                System.out.print("¿Para qué zona quieres las entradas? (1 - Principal, 2 - Compra-Venta, 3 - VIP): ");
                  int zona=input.nextInt();
                System.out.print("¿Cuántas entradas quieres? ");
                  int numEntradas=input.nextInt();

                switch(zona){
                    case 1:
                      zonaPrincipal.vender(numEntradas);
                    break;

                    case 2:
                      zonaCompraVenta.vender(numEntradas);
                    break;

                    case 3:
                      zonaVIP.vender(numEntradas);
                    break;

                    default:
                      System.out.println("Zona no válida.");
                    break;
                }
              break;

              /*************/

              case 3:
                System.out.println("Saliendo del programa...");
              break;

              /*************/

              default:
                System.out.println("Opción no válida.");
              break;
          }

          System.out.println();
      }while(opcion!=3);

    /*********************************************/

    // cierre de scanner
      input.close();
  }
}