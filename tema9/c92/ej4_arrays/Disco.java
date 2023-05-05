/**
  @author: Christian Millán Soria
  @file: Disco.java
  @info: clase "Disco" - ejercicio 3 de arrays
*/

package tema9.c92.ej4_arrays;

public class Disco{
  // atributos
    private String codigo="LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;// en minutos

  /*****************************************/

  /* constructor
    public Disco(String c, String a, String t, String g, int d){
      // código
        this.codigo=c;

      // autor
        this.autor=a;

      // título
        this.titulo=t;

      // género
        this.genero=g;

      // duración
        this.duracion=d;
    }
  */

  /*****************************************/

  // métodos
    // getter para el código
      public String getCodigo(){
        return this.codigo;
      }

    /******************/

    // getter para el autor
      public String getAutor(){
        return this.autor;
      }

    /******************/

    // getter para el título
      public String getTitulo(){
        return this.titulo;
      }

    /******************/

    // getter para el género
      public String getGenero(){
        return this.genero;
      }

    /******************/

    // getter para el duración
      public int getDuracion(){
        return this.duracion;
      }

    /******************/

    //setter para el código
      public void setCodigo(String c){
        this.codigo=c;
      }

    /******************/

    // setter para el autor
      public void setAutor(String a){
        this.autor=a;
      }

    /******************/

    // setter para el título
      public void setTitulo(String t){
        this.titulo=t;
      }

    /******************/

    // setter para el género
      public void setGenero(String g){
        this.genero=g;
      }

    /******************/

    // setter para el duración
      public void setDuracion(int d){
        this.duracion=d;
      }

    /******************/

    // método "toString"
      public String toString(){
        String info="----------------------------";
          info+="\nCódigo: "+this.codigo;
          info+="\nAutor: "+this.autor;
          info+="\nTítulo: "+this.titulo;
          info+="\nGénero: "+this.genero;
          info+="\nDuración: "+this.duracion;
          info+="\n----------------------------";

        return info;
      }
}