/**
  @author: Christian Millán Soria
  @file: Pinguino.java
  @info: clase "Pinguino" - ejercicio 3
*/

package tema9.c91.ej3_poo;

public class Pinguino extends Ave{
  // constructor
    public Pinguino(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // nadar
      public void nadar(){
        System.out.println("El pingüino está nadando.");
      }

    /****************/

    // deslizarse
      public void deslizarse(){
        System.out.println("El pingüino está deslizándose.");
      }
}