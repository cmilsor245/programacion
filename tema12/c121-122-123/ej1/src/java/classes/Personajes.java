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

    public String toString(int opcion){
      String saludo="";

      switch(opcion){
        case 1:
          saludo="";
        break;

        case 2:
          saludo="";
        break;

        case 3:
          saludo="";
        break;
      }

      return saludo;
    }
}