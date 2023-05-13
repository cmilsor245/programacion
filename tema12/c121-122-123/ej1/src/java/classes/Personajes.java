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

    /********************/

    public String toString(String opcion){
      String saludo="";

      switch(opcion){
        case "1":
          saludo="<div><img src=\""+imagen+"\" width=\"250\"></div>"+ "<div>¡Hola! Soy "+nombre+".</div>";
        break;

        case "2":
          saludo="<div><img src=\""+imagen+"\" width=\"250\"></div>"+ "<div>¡Saludos! Mi nombre es "+nombre+".</div>";
        break;

        case "3":
          saludo="<div><img src=\""+imagen+"\" width=\"250\"></div>"+"<div>¡Encantado de conocerte! Yo soy "+nombre+".</div>";
        break;
      }

      return saludo;
    }

    /********************/

    public String conversacionAleatoria(int opcionConversacion, int identificativo){
      String conversacionGenerada="";

      switch(opcionConversacion){
        case 1:
          switch(identificativo){
            case 1:
              conversacionGenerada="<div>¿Cómo vosotros por aquí?</div><div>esta línea va debajo</div>";
            break;

            case 2:
              conversacionGenerada="";
            break;

            case 3: 
              conversacionGenerada="";
            break;
          }
        break;

        case 2:
          switch(opcionConversacion){
            case 1:
              conversacionGenerada="";
            break;

            case 2:
              conversacionGenerada="";
            break;

            case 3: 
              conversacionGenerada="";
            break;
          }
        break;

        case 3:
          switch(opcionConversacion){
            case 1:
              conversacionGenerada="";
            break;

            case 2:
              conversacionGenerada="";
            break;

            case 3: 
              conversacionGenerada="";
            break;
          }
        break;
      }

      return conversacionGenerada;
    }
}