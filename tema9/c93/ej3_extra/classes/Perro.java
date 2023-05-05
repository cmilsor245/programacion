/**
  @author: Christian Millán Soria
  @file: Perro.java
  @info: subclase "Perro"
*/

package tema9.c93.ej3_extra.classes;

public class Perro extends Animal{
  // atributos
    private String raza;

  /***************************************/

  // constructor
    public Perro(String nombre, int edad, String tipo, String raza){
      super(nombre, edad, tipo);
      this.raza=raza;
    }

  /***************************************/

  // métodos
    // getter para el atributo "raza"
      public String getRaza(){
        return raza;
      }

    // setter para el atributo "raza"
      public void setRaza(String raza){
        this.raza=raza;
      }

    /****************/

    // toString
      @Override
        public String toString(){
          return "Perro { "+
            "nombre='"+this.getNombre()+'\''+
            ", edad="+this.getEdad()+
            ", tipo='"+this.getTipo()+'\''+
            ", raza='"+this.raza +'\''+
            " }";
        }
}