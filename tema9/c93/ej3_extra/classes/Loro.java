/**
  @author: Christian Millán Soria
  @file: Loro.java
  @info: subclase "Loro"
*/

package tema9.c93.ej3_extra.classes;

public class Loro extends Animal{
  // atributos
    private String especie;

  /****************************************/

  // constructor
    public Loro(String nombre, int edad, String tipo, String especie){
      super(nombre, edad, tipo);
      this.especie=especie;
    }

  /****************************************/

  // métodos
    // getter para el atributo "especie"
      public String getEspecie(){
        return especie;
      }

    // setter para el atributo "especie"
      public void setEspecie(String especie){
        this.especie=especie;
      }

    /**************/

    // toString
      @Override
        public String toString(){
          return "Loro { "+
            "nombre='"+this.getNombre()+'\''+
            ", edad="+this.getEdad()+
            ", tipo='"+this.getTipo()+'\''+
            ", especie='"+this.especie+'\''+
            " }";
        }
}