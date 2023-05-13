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

    public String toString(String opcion){
      String saludo="";

      switch(opcion){
        case "1":
          saludo="<img src=\""+imagen+"\" width=\"250\">¡Hola! Soy "+nombre+".";
        break;

        case "2":
          saludo="<img src=\""+imagen+"\" width=\"250\">¡Saludos! Mi nombre es "+nombre+".";
        break;

        case "3":
          saludo="<img src=\""+imagen+"\" width=\"250\">¡Encantado de conocerte! Yo soy "+nombre+".";
        break;
      }

      return saludo;
    }
}