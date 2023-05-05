/**
  @author: Christian Millán Soria
  @file: Ej3.java
  @info: programa principal
*/

package tema14.c142.ej3;

// importaciones necesarias
  import java.io.FileNotFoundException;
  import java.io.IOException;


public class Ej3{
  public static void main(String[] args) throws IOException, FileNotFoundException{// hace falta poner el "throws" para estas dos excepciones
    // identificador de cada excepción
      int identificador=(int)(Math.random()*5+1);

    /**************************************/

    // comprobación
    switch(identificador){
        case 1:
          throw new NumberFormatException();
        // no hacen falta los breaks, ya que el error termina el programa
      
        case 2:
          throw new IOException();
      
        case 3:
          throw new FileNotFoundException();
      
        case 4:
          throw new IndexOutOfBoundsException();
      
        case 5:
          throw new ArithmeticException();
      
        default:
          System.out.println("Error.");
      }  
  }
}