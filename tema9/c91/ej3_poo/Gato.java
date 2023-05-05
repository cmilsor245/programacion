/**
  @author: Christian Millán Soria
  @file: Gato.java
  @info: clase "Gato" - ejercicio 3
*/

package tema9.c91.ej3_poo;

public class Gato extends Mamifero{
  // constructor
    public Gato(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // arañar
      public void arañar(){
        System.out.println("El gato está arañando.");
      }

    /****************/

    // maullar
      public void maullar(){
        System.out.println("El gato está maullando.");
      }
}