/**
  @author: Christian Millán Soria
  @file: Vehiculo.java
  @info: clase "Vehiculo"
*/

package tema9.c93.ej6_extra.classes;

public abstract class Vehiculo{
  // atributos
    private final String matricula;
    private final String modelo;

  /****************************************/

  // constructor
    public Vehiculo(String matricula, String modelo){
      this.matricula=matricula;
      this.modelo=modelo;
    }

  /****************************************/

  // métodos
    // getter para el atributo "matricula"
      public String getMatricula(){
        return this.matricula;
      }

    // getter para el atributo "modelo"
      public String getModelo(){
        return this.modelo;
      }

    /**************/

    /**
      @name: imprimir
      @info: imprime toda la información de un vehículo
    */
      public abstract void imprimir();
}