/**
  @author: Christian Millán Soria
  @file: TestEj7Excepciones.java
  @info: programa principal
*/

package tema14.c141.ej7_poo_excep;

import java.util.Scanner;

import tema14.c141.ej7_poo_excep.classes.ZonaExcepciones;

public class TestEj7Excepciones{
  public static void main(String[] args){
    // instancias
      ZonaExcepciones zonaPrincipal=new ZonaExcepciones(1000);
      ZonaExcepciones zonaCompraVenta=new ZonaExcepciones(200);
      ZonaExcepciones zonaVIP=new ZonaExcepciones(25);

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
            try{
              opcion=Integer.parseInt(input.next());
            }catch(Exception e){
              opcion=0;

              System.out.println("\nOpción inválida.");

              // info sobre el error que se mostraría
                System.out.println("\n"+e.getClass());
                System.out.println("\n"+e.getMessage());
            }

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
                try{
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
                }catch(Exception e){
                  System.out.println("\nError al vender entradas: "+e.getMessage());
                }
              break;

              /*************/

              case 3:
                System.out.println("Saliendo del programa...");
              break;

              /*************/

              case 0:
                System.out.print("");
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