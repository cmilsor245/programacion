/**
  @author: Christian Millán Soria
  @file: Animal.java
  @info: clase "Animal"
*/

package tema9.c93.ej3_extra.classes;

public abstract class Animal{
  // atributos
    private String nombre;
    private int edad;
    private String tipo;

  /************************************************/

  // constructor
    public Animal(String nombre, int edad, String tipo){
      this.nombre=nombre;
      this.edad=edad;
      this.tipo=tipo;
    }

  /************************************************/

  // métodos
    // getter para el atributo "nombre"
      public String getNombre(){
        return nombre;
      }

    // setter para el atributo "nombre"
      public void setNombre(String nombre){
        this.nombre=nombre;
      }

    // getter para el atributo "edad"
      public int getEdad(){
        return edad;
      }

    // setter para el atributo "edad"
      public void setEdad(int edad){
        this.edad=edad;
      }

    // getter para el atributo "tipo"
      public String getTipo(){
        return tipo;
      }

    // setter para el atributo "tipo"
      public void setTipo(String tipo){
        this.tipo=tipo;
      }

    /****************/

    // toString
      public String toString(){
        return "Animal [nombre="+nombre+", tipo="+tipo+", edad="+edad+"]";
      }
}