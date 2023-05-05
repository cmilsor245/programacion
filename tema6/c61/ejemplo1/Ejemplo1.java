/**
  @author: Christian Millán Soria
  @file: Ejemplo1.java
  @info: ejemplo 1
*/

package tema6.c61.ejemplo1;

public class Ejemplo1{
  public static void main(String[] args){
    System.out.println("Diez números aleatorios:");

    for(int i=1; i<11; i++){
      System.out.println(Math.random());
    }
  }
}