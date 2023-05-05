/**
  @author: Christian Millán Soria
  @file: Gato.java
  @info: subclase "Gato"
*/

package tema9.c93.ej3_extra.classes;

public class Gato extends Animal{
  // atributos
    private boolean esCazador;

  /***************************************/

  // constructor
    public Gato(String nombre, int edad, String tipo, boolean esCazador){
      super(nombre, edad, tipo);
      this.esCazador=esCazador;
    }

  /***************************************/

  // métodos
    // getter para el atributo "esCazador"
      public boolean getEsCazador(){
        return esCazador;
      }

    // setter para el atributo "esCazador"
      public void setEsCazador(boolean esCazador){
        this.esCazador=esCazador;
      }

    /*******************/

    // toString
      @Override
        public String toString(){
          return "Gato { "+
            "nombre='"+this.getNombre()+'\''+
            ", edad="+this.getEdad()+
            ", tipo='"+this.getTipo()+'\''+
            ", esCazador="+this.esCazador+
            " }";
        }
}