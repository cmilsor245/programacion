/**
  @author: Christian Millán Soria
  @file: TestEj3Extra.java
  @info: clase principal
*/

package tema9.c93.ej3_extra;

import tema9.c93.ej3_extra.classes.*;

import java.util.Scanner;

public class TestEj3Extra {
  public static void main(String[] args){
    // creación de nuevo inventario
      Inventario inventario=new Inventario();

    // scanner
      Scanner input=new Scanner(System.in);

    /**********************************************/

    // opción elegida
      int opcion=0;

    // menú
      do{
        System.out.println("\n=== MENÚ ===");
        System.out.println("1. Mostrar lista de animales");
        System.out.println("2. Mostrar datos de un animal concreto");
        System.out.println("3. Mostrar datos de todos los animales");
        System.out.println("4. Insertar animal");
        System.out.println("5. Eliminar animal");
        System.out.println("6. Vaciar inventario");
        System.out.println("7. Salir");

        System.out.print("Introduce una opción: ");
          opcion=Integer.parseInt(input.next());

        /***************/

        // distintas opciones
          switch(opcion){
            case 1:// mostrar lista de animales
              inventario.mostrarListaAnimales();
            break;

            case 2:// mostrar datos de un animal concreto
              System.out.print("Introduce el nombre del animal: ");
              input.nextLine();
              String nombre = input.nextLine();
              inventario.mostrarDatosAnimal(nombre);
            break;

            case 3:// mostrar datos de todos los animales
              inventario.mostrarTodosDatosAnimales();
            break;

            case 4:// insertar un animal
              System.out.print("Introduce el nombre del animal: ");
                input.nextLine();
                String nombreAnimal=input.nextLine();

              System.out.print("Introduce la edad del animal: ");
                int edadAnimal=Integer.parseInt(input.next());

              System.out.print("Introduce el tipo de animal (perro/gato/loro/canario): ");
                input.nextLine();
                String tipoAnimal=input.nextLine();

                // dependiendo del tipo
                  switch(tipoAnimal.toLowerCase()){
                    case "perro":
                      System.out.print("Introduce la raza del perro: ");
                        String razaPerro=input.nextLine();

                      Perro perro=new Perro(nombreAnimal, edadAnimal, tipoAnimal, razaPerro);
                        inventario.insertarAnimal(perro);
                    break;

                    case "gato":
                      System.out.print("El gato es cazador? (S/N): ");
                        String respuesta=input.nextLine();
                          boolean esCazador=respuesta.equalsIgnoreCase("s")?true:false;// comprobación del boolean

                      Gato gato=new Gato(nombreAnimal, edadAnimal, tipoAnimal, esCazador);
                        inventario.insertarAnimal(gato);
                    break;

                    case "loro":
                      System.out.print("Introduce la especie del loro: ");
                        String especieLoro=input.nextLine();

                      Loro loro=new Loro(nombreAnimal, edadAnimal, tipoAnimal, especieLoro);
                        inventario.insertarAnimal(loro);
                    break;

                    case "canario":
                      System.out.print("Introduce el color del canario: ");
                        String colorCanario=input.nextLine();

                      Canario canario=new Canario(nombreAnimal, edadAnimal, tipoAnimal, colorCanario);
                        inventario.insertarAnimal(canario);
                    break;

                    default:
                      System.out.println("Tipo de animal no válido. Introduce \"perro\", \"gato\", \"loro\" o \"canario\".");
                    break;
                  }
            break;

            case 5:// eliminar animal
              System.out.print("Introduce el nombre del animal a eliminar: ");
                input.nextLine();

              String nombreEliminar=input.nextLine();
                inventario.eliminarAnimal(nombreEliminar);
            break;

            case 6:// vaciar inventario
              inventario.vaciarInventario();
            break;

            case 7:// salir
              System.out.println("Saliendo del programa...");
            break;

            default:
              System.out.println("Opción no válida. Introduce una opción del 1 al 7.");
            break;
          }
      }while(opcion!=7);
  }
}