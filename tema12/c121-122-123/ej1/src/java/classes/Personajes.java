/**
  @author: Christian Millán Soria
  @file: Personajes.java
  @info: clase para objetos "Personajes"
*/

package classes;

public class Personajes{
  // atributos
    private String nombre;
    private String imagen;

  /***********************************************/

  // constructor
    public Personajes(String nombre, String imagen){
    this.nombre=nombre;
    this.imagen=imagen;
    }

  /***********************************************/

  // métodos
    public String getNombre(){
      return nombre;
    }

    public String getImagen(){
      return imagen;
    }

    @Override
      public String toString(){
        return "<img src=\""+imagen+"\" width=\"250\">Hola, soy "+nombre+"<br>";
      }
}