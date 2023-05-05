/**
  @author: Christian Millán Soria
  @file: ProbarExcepciones.java
  @info: programa principal
*/

package tema14.c142.probar_excepciones;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class ProbarExcepciones{
  /**
    @name: main
    @info: programa principal
  */
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      int opcion=0;

      /**********************************************/

      // bucle para el menú
        do{
          System.out.println("1. Provocar un StackOverFlowError");
          System.out.println("2. Provocar una NumberFormatException");
          System.out.println("3. Provocar una ArrayIndexOutOfBoundsException");
          System.out.println("4. Provocar una FileNotFoundException");
          System.out.println("5. Provocar una ArithmeticException");
          System.out.println("6. Salir");

          System.out.print("Introduce la opción elegida: ");
            opcion=input.nextInt();

          try{
            switch(opcion){
              case 1:
                funcion1();
              break;

              case 2:
                funcion2();
              break;

              case 3:
                funcion3();
              break;

              case 4:
                funcion4();
              break;

              case 5:
                funcion5();
              break;

              case 6:
                System.out.println("Saliendo del programa...");
              break;

              default:
                System.out.println("Opción incorrecta. Inténtalo de nuevo.");
            }
          }catch(StackOverflowError e){// se generan los errores pero el programa no se detiene, ya que únicamente se muestra información del error y vuelve a aparecer el menú
            System.out.println("\nExcepción capturada en el main: "+e.getClass().getName()+" - "+e.getMessage()+"\n");
          }catch(NumberFormatException e){
            System.out.println("\nExcepción capturada en el main: "+e.getClass().getName()+" - "+e.getMessage()+"\n");
          }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nExcepción capturada en el main: "+e.getClass().getName()+" - "+e.getMessage()+"\n");
          }catch(FileNotFoundException e){
            System.out.println("\nExcepción capturada en el main: "+e.getClass().getName()+" - "+e.getMessage()+"\n");
          }catch(ArithmeticException e){
            System.out.println("\nExcepción capturada en el main: "+e.getClass().getName()+" - "+e.getMessage()+"\n");
          }
        }while(opcion!=6);
    }

  /***********************************************************/

  // funciones para cada excepción
    /**
      @name: funcion1
      @info: provocar un StackOverFlowError
    */
      public static void funcion1() throws StackOverflowError{
        funcion1();// llamada recursiva sin criterio de parada, es decir, tiende al infinito
      }

    /**********************************************/

    /**
      @name: funcion2
      @info: provocar una NumberFormatException
    */
      public static void funcion2() throws NumberFormatException{
        String cadena="Hola";
        int num=Integer.parseInt(cadena);// conversión incorrecta del string a int
      }

    /**********************************************/

    /**
      @name: funcion3
      @info: provocar una ArrayIndexOutOfBoundsException
    */
      public static void funcion3() throws ArrayIndexOutOfBoundsException{
        int[] numeros={1, 2, 3};
        int num=numeros[3];// intento de acceso al 4 elemento inexistente
      }

    /**********************************************/

    /**
      @name: funcion4
      @info: provocar una FileNotFoundException
    */
      public static void funcion4() throws FileNotFoundException{
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduce el nombre de un archivo: ");
          String nombreArchivo=scanner.nextLine();// nombre del archivo a leer

        java.io.File archivo=new java.io.File(nombreArchivo);// creación de un objeto de tipo "File" que contiene el nombre del archivo
          Scanner input=new Scanner(archivo);// intento de abrir el archivo, el cual no existe
      }

    /**********************************************/

    /**
      @name: funcion5
      @info: provocar una ArithmeticException
    */
      public static void funcion5() throws ArithmeticException{
        int a=5;
        int b=0;// provocador del error
          int resultado=a/b;// intento de realizar una división entre 0
      }
}