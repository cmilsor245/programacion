/**
  @author: Christian Millán Soria
  @file: Animal.java
  @info: clase "Animal" - ejercicio 3
*/

package tema9.c91.ej3_poo;

public abstract class Animal{
  // atributos
    private String nombre;
    private int edad;

  /***********************************/

  // constructor
    public Animal(String nombre, int edad){
      this.nombre=nombre;

      this.edad=edad;
    }

  /***********************************/

  // métodos
    // getNombre
      public String getNombre(){
        return nombre;
      }

    /*******************/

    // getEdad
      public int getEdad(){
        return edad;
      }

    /*******************/

    // comer
      public void comer(){
        System.out.print("El animal llamado "+this.nombre+" está comiendo.");
      }

    /*******************/

    // comer
    public void moverse(){
      System.out.print("El animal llamado "+this.nombre+" se está moviendo.");
    }

    /*******************/

    // comer
    public void emitirSonido(){
      System.out.print("El animal llamado "+this.nombre+" está emitiendo un sonido.");
    }
}