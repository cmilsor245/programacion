/**
  @author: Christian Millán Soria
  @file: TestEj2.java
  @info: clase "TestEj2" - ejercicio 2
*/

package tema9.c91.ej2_poo;

import java.util.Scanner;

public class TestEj2{
  public static void main(String[] args){
    // variable para la opción
      int opcion=0;

    /********************************/

    // variable para los kilómetros
      int km;

    /********************************/

    // bicicleta nueva
      Bicicleta bici1=new Bicicleta(9);

    // coche nuevo
      Coche coche1=new Coche(1900);

    /********************************/

    // scanner
      Scanner s=new Scanner(System.in);

    /********************************/

    // menú de opciones
      while(opcion!=9){
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
          opcion=s.nextInt();

        System.out.println();

        /*************************/

        // switch
          switch(opcion){
            case 1:
              System.out.print("¿Cuántos kilómetros quieres recorrer? -> ");

              km=s.nextInt();

              bici1.recorre(km);
            break;

            /***************/

            case 2:
              bici1.hazCaballito();
            break;

            /***************/

            case 3:
              System.out.print("¿Cuántos kilómetros quieres recorrer? -> ");

              km=s.nextInt();

              coche1.recorre(km);
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
                int pintar=s.nextInt();

                if(pintar==1){
                  coche1.pinta();
                }else if(pintar==2){
                  bici1.pinta();
                }else{
                  System.out.println("Opción inválida.");
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

              System.out.println(Vehiculo.getKmTotales()+" Km.");
          }
      }
  }
}