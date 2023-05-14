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

    public String conversacionAleatoria(int conversacionElegida, int identificativo){
      String conver="";

      switch(conversacionElegida){
        case 1:
          switch(identificativo){
            case 1:
              conver="¿Qué hacen unos viajeros como vosotros por aquí?";
            break;

            case 2:
              conver="Pues nada, dando una vuelta por Ahch-To.";
            break;

            case 3:
              conver="Eso mismo.";
            break;
          }
        break;

        case 2:
          switch(identificativo){
            case 1:
              conver="¿Buscáis algo?";
            break;

            case 2:
              conver="En realidad... sí. Necesitamos algo de comida.";
            break;

            case 3:
              conver="¿Sabes de algún lugar donde vendan?";
            break;
          }
        break;

        case 3:
          switch(identificativo){
            case 1:
              conver="¿No habréis visto un sable de luz por ahí, no? Se me cayó antes.";
            break;

            case 2:
              conver="La verdad es que no, si vemos algo se lo decimos.";
            break;

            case 3:
              conver="Sí, no se preocupe.";
            break;
          }
        break;
      }

      return conver;
    }

    /**************************************************/

    public String segundoMensaje(int conversacionElegida, int identificativo){
      String conver="";

      switch(conversacionElegida){
        case 1:
          switch(identificativo){
            case 1:
              conver="Pues espero que no vengáis a robarme la leche azul de Thala-siren.";
            break;

            case 2:
              conver="Solo estamos explorando un mundo nuevo, nada de lo que preocuparse.";
            break;

            case 3:
              conver="Yo he venido obligado.";
            break;
          }
        break;

        case 2:
          switch(identificativo){
            case 1:
              conver="La verdad es que no, pero igual las Lanai pueden ayudaros.";
            break;

            case 2:
              conver="*No me fío ni un pelo de este tío...*";
            break;

            case 3:
              conver="Muchas gracias por su amabilidad.";
            break;
          }
        break;

        case 3:
          switch(identificativo){
            case 1:
              conver="¡Donde estará el dichoso sable!";
            break;

            case 2:
              conver="*Lo llevo encima, no le digas nada. ;-)*";
            break;

            case 3:
              conver="Bueno, nos vamos. ¡Un saludo!";
            break;
          }
        break;
      }

      return conver;
    }
}