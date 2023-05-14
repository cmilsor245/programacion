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

  /*****************************************************************************/

  // constructor
    public Personajes(String nombre, String imagen){
    this.nombre=nombre;
    this.imagen=imagen;
    }

  /*****************************************************************************/

  // métodos
    public String getNombre(){
      return nombre;
    }

    public String getImagen(){
      return imagen;
    }

    /**************************************************/

    public String mostrarImagen(){
      return "<div><img src=\""+imagen+"\" width=\"250\"></div>";
    }

    /**************************************************/

    public String mostrarSaludo(String opcion){
      String saludo="";

      switch(opcion){
        case "1":
          saludo="<div class=\"saludo\">¡Hola! Soy "+nombre+".</div>";
        break;

        case "2":
          saludo="<div class=\"saludo\">¡Saludos! Mi nombre es "+nombre+".</div>";
        break;

        case "3":
          saludo="<div class=\"saludo\">¡Encantado de conocerte! Yo soy "+nombre+".</div>";
        break;
      }

      return saludo;
    }

    /**************************************************/

    public String conversacionAleatoria(String conversacionElegida, String identificativo){
      
    }
}