/**
  @author: Christian Millán Soria
  @file: Perro.java
  @info: clase "Perro" - ejercicio 3
*/

package tema9.c91.ej3_poo;

public class Perro extends Mamifero{
  // constructor
    public Perro(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // ladrar
      public void ladrar(){
        System.out.println("El perro está ladrando.");
      }

    /****************/

    // morder
      public void morder(){
        System.out.println("El perro está mordiendo.");
      }
}