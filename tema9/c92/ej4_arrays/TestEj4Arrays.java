/**
  @author: Christian Millán Soria
  @file: TestEj3Arrays.java
  @info: programa principal del ejercicio 3 de arrays
*/

package tema9.c92.ej4_arrays;

import java.util.Scanner;

public class TestEj4Arrays{
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
      int opcionListado;
        int min;
        int max;
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
            do{
              System.out.println("LISTADO");
              System.out.println("=======");
              System.out.println("1. Completo");
              System.out.println("2. Por autor");
              System.out.println("3. Por género");
              System.out.println("4. En un rango de duración");
              System.out.println("5. Menú principal");
                System.out.print("Introduce una opción: ");
                  opcionListado=input.nextInt();
                  input.nextLine();// consumir buffer del teclado

              switch(opcionListado){
                case 1:// completo
                  for(int i=0; i<t; i++){
                    if(!album[i].getCodigo().equals("LIBRE")){// se muestran todas las instancias que no están libres
                      System.out.println(album[i]);
                    }
                  }
                break;

                case 2:// por autor
                  System.out.print("Introduce el autor: ");
                    autorIntroducido=input.nextLine();

                  for(int i=0; i<t; i++){
                    if((!album[i].getCodigo().equals("LIBRE"))&&(album[i].getAutor().equals(autorIntroducido))){
                      System.out.println(album[i]);
                    }
                  }
                break;

                case 3:// por género
                  System.out.print("Introduce el género: ");
                    generoIntroducido=input.nextLine();
                    input.nextLine();// consumir buffer del teclado

                  for(int i=0; i<t; i++){
                    if((!album[i].getCodigo().equals("LIBRE"))&&(album[i].getGenero().equals(generoIntroducido))){
                      System.out.println(album[i]);
                    }
                  }
                break;

                case 4:// en un rango de duración
                  System.out.println("Indica el intervalo de duración.");
                    System.out.print("Introduce el límite inferior de duración en minutos: ");
                      min=input.nextInt();
                    System.out.print("Introduce el límite superior de duración en minutos: ");
                      max=input.nextInt();

                  for(int i=0; i<t; i++){
                    if((!album[i].getCodigo().equals("LIBRE"))&&(album[i].getDuracion()<=max)&&(album[i].getDuracion()>=min)){
                      System.out.println(album[i]);
                    }
                  }
                break;
              }
            }while(opcionListado!=5);
          break;

          case 2:
            System.out.println("\nNUEVO DISCO");
            System.out.println("===========");

            // busca la primera posición libre del array
              int primeraLibre=-1;
                do{
                  primeraLibre++;
                }while(primeraLibre<t&&!((album[primeraLibre].getCodigo()).equals("LIBRE")));

              if(primeraLibre>=t){
                System.out.println("No hay ningún hueco libre para añadir un nuevo disco.");
              }else{
                System.out.println("Introduce los datos del disco.");
                System.out.print("Código: ");
                  codigoIntroducido=input.nextLine();

                  // comprobación de si el código ya existe
                    for(int i=0; i<t; i++){
                      if(album[i].getCodigo().equals(codigoIntroducido)){
                        System.out.println("El código ya existe.");
                        break;
                      }else{
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
                      }
                    }
              }
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

            // se busca el disco con el código indicado por el usuario
              int indiceDisco=-1;

              for(int j=0; j<t; j++){
                if(album[j].getCodigo().equals(codigoIntroducido)){
                  indiceDisco=j;

                  break;
                }
              }

              if(indiceDisco==-1){
                System.out.println("No se ha encontrado ningún disco con el código "+codigoIntroducido);
              }else{
                // se borra el disco encontrado
                  album[indiceDisco].setCodigo("LIBRE");
                    System.out.println("Se ha borrado el disco con el código "+codigoIntroducido);
              }
          break;
        }
      }while(opcion!=5);
  }
}