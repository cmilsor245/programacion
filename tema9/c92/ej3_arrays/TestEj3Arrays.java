/**
  @author: Christian Millán Soria
  @file: TestEj3Arrays.java
  @info: programa principal del ejercicio 3 de arrays
*/

package tema9.c92.ej3_arrays;

import java.util.Scanner;

public class TestEj3Arrays{
  public static void main(String[] args){
    // array
      // tamaño
        final int t=100;

      /***************/

      // creación
        Disco[] album=new Disco[t];

      /***************/

      // instancias de base
        for(int i=0; i<t; i++){
          album[i]=new Disco();
        }

    /*****************************************/

    // menú
      int opcion;
      Scanner input=new Scanner(System.in);
      String codigoIntroducido;
      String autorIntroducido;
      String tituloIntroducido;
      String generoIntroducido;
      int duracionIntroducida;

      /*********************/

      do{
        System.out.println("\nCOLECCIÓN DE DISCOS");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
          System.out.print("Introduce una opción: ");
            opcion=input.nextInt();
            input.nextLine();// consumir buffer del teclado

        /***********************/

        switch(opcion){
          case 1:
            System.out.println("LISTADO");
            System.out.println("=======");

            for(int i=0; i<t; i++){
              if(!album[i].getCodigo().equals("LIBRE")){// se muestran todas las instancias que no están libres
                System.out.println(album[i]);
              }
            }
          break;

          case 2:
            System.out.println("\nNUEVO DISCO");
            System.out.println("===========");

            // busca la primera posición libre del array
              int primeraLibre=-1;
                do{
                  primeraLibre++;
                }while(!((album[primeraLibre].getCodigo()).equals("LIBRE")));

              System.out.println("Introduce los datos del disco.");
                System.out.print("Código: ");
                  codigoIntroducido=input.nextLine();
                    album[primeraLibre].setCodigo(codigoIntroducido);

                System.out.print("Autor: ");
                  autorIntroducido=input.nextLine();
                    album[primeraLibre].setAutor(autorIntroducido);

                System.out.print("Título: ");
                  tituloIntroducido=input.nextLine();
                    album[primeraLibre].setTitulo(tituloIntroducido);

                System.out.print("Género: ");
                  generoIntroducido=input.nextLine();
                    album[primeraLibre].setGenero(generoIntroducido);

                System.out.print("Duración: ");
                  duracionIntroducida=input.nextInt();
                    album[primeraLibre].setDuracion(duracionIntroducida);
                    input.nextLine();// consumir buffer del teclado
          break;

          case 3:
            System.out.println("\nMODIFICAR");
            System.out.println("===========");

            System.out.print("Introduce el código del disco cuyos datos desea cambiar: ");
              codigoIntroducido=input.nextLine();

            int i=-1;
              do{
                i++;
              }while(!((album[i].getCodigo()).equals(codigoIntroducido)));

            System.out.println("Introduce los nuevos datos del disco o INTRO para dejarlos igual.");

            System.out.println("Código: "+album[i].getCodigo());
            System.out.print("Nuevo código: ");
              codigoIntroducido=input.nextLine();
                if(!codigoIntroducido.equals("")){
                  album[i].setCodigo(codigoIntroducido);
                }

            System.out.println("Autor: "+album[i].getAutor());
            System.out.print("Nuevo autor: ");
              autorIntroducido=input.nextLine();
                if(!autorIntroducido.equals("")){
                  album[i].setAutor(autorIntroducido);
                }

            System.out.println("Título: "+album[i].getTitulo());
            System.out.print("Nuevo título: ");
              tituloIntroducido=input.nextLine();
                if(!tituloIntroducido.equals("")){
                  album[i].setTitulo(tituloIntroducido);
                }

            System.out.println("Género: "+album[i].getGenero());
            System.out.print("Nuevo género: ");
              generoIntroducido=input.nextLine();
                if(!generoIntroducido.equals("")){
                  album[i].setGenero(generoIntroducido);
                }

            System.out.println("Duración: "+album[i].getDuracion());
            System.out.print("Duración: ");
              final String duracionIntroducidaString=input.nextLine();
                if(!duracionIntroducidaString.equals("")){
                  album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                  input.nextLine();// consumir buffer del teclado
                }
          break;

          case 4:
            System.out.println("\nBORRAR");
            System.out.println("======");

            System.out.print("Introduce el código del disco que desea borrar: ");
              codigoIntroducido=input.nextLine();

            i=-1;
              do{
                i++;
              }while(!((album[i].getCodigo()).equals(codigoIntroducido)));

            album[i].setCodigo("LIBRE");// no se elimina la instancia, sino que se marca como "libre" para poder ser usada de nuevo
              System.out.println("Album borrado.");
          break;
        }
      }while(opcion!=5);
  }
}