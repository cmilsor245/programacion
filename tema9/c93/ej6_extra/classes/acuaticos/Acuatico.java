/**
  @author: Christian Millán Soria
  @file: Acuatico.java
  @info: subclase "Acuatico"
*/

package tema9.c93.ej6_extra.classes.acuaticos;

import tema9.c93.ej6_extra.classes.Vehiculo;

public class Acuatico extends Vehiculo{
  // atributos
    private final double eslora;

  /******************************************/

  // constructor
    public Acuatico(String matricula, String modelo){
      super(matricula, modelo);
      this.eslora=Math.random()*15+5;// eslora de entre 5 y 20 metros
    }

  /******************************************/

  // métodos
    // getter para el atributo "eslora"
      public double getEslora(){
        return this.eslora;
      }

    /**************/

    /**
      @name: imprimir
      @info: imprime toda la información de un vehículo acuático
    */
      @Override
        public void imprimir(){
          System.out.println("\n--------------------------------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Eslora: "+this.eslora+" metros");
          System.out.println("--------------------------------------\n");
        }
}