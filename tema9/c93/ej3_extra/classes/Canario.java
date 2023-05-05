/**
  @author: Christian Millán Soria
  @file: Canario.java
  @info: subclase "Canario"
*/

package tema9.c93.ej3_extra.classes;

public class Canario extends Animal{
  // atributos
    private String color;

  /************************************/

  // constructor
    public Canario(String nombre, int edad, String tipo, String color){
      super(nombre, edad, tipo);
      this.color=color;
    }

  /************************************/

  // métodos
    // getter para el atributo "color"
      public String getColor(){
        return color;
      }

    // setter para el atributo "color"
      public void setColor(String color){
        this.color=color;
      }

    /***************/

    // toString
      @Override
        public String toString(){
          return "Canario { "+
            "nombre='"+this.getNombre()+'\''+
            ", edad="+this.getEdad()+
            ", tipo='"+this.getTipo()+'\''+
            ", color='"+this.color+'\''+
            " }";
        }
}