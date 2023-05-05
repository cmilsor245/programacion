/**
  @author: Christian Millán Soria
  @file: Terrestre.java
  @info: subclase "Terrestre"
*/

package tema9.c93.ej6_extra.classes.terrestres;

import tema9.c93.ej6_extra.classes.Vehiculo;

public class Terrestre extends Vehiculo{
  // atributos
    private final int numRuedas;

  /******************************************/

  // constructor
    public Terrestre(String matricula, String modelo){
      super(matricula, modelo);
      this.numRuedas=(int)(Math.random()*3+2);
    }

  /******************************************/

  // métodos
    // getter para el atributo "numRuedas"
      public int getNumRuedas(){
        return this.numRuedas;
      }

    /**************/

    /**
      @name: imprimir
      @info: imprime toda la información de un vehículo terrestre
    */
      @Override
        public void imprimir(){
          System.out.println("\n--------------------------------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Número de ruedas: "+this.numRuedas);
          System.out.println("--------------------------------------\n");
        }
}