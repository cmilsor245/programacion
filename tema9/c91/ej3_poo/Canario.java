/**
  @author: Christian Millán Soria
  @file: Canario.java
  @info: clase "Canario" - ejercicio 3
*/

package tema9.c91.ej3_poo;

public class Canario extends Ave{
  // constructor
    public Canario(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // cantar
      public void cantar(){
        System.out.println("El canario está cantando.");
      }

    /****************/

    // picar
      public void picar(){
        System.out.println("El canario está picando.");
      }
}