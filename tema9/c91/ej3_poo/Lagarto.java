/**
  @author: Christian Millán Soria
  @file: Lagarto.java
  @info: clase "Lagarto" - ejercicio 3
*/

package tema9.c91.ej3_poo;

public class Lagarto extends Animal{
  // constructor
    public Lagarto(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // tomarElSol
      public void tomarElSol(){
        System.out.println("El lagarto está tomando el sol.");
      }

    /****************/

    // cazar
      public void cazar(){
        System.out.println("El lagarto está cazando..");
      }
}