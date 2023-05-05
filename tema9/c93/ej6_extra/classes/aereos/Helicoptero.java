/**
  @author: Christian Millán Soria
  @file: Helicoptero.java
  @info: subclase "Helicoptero"
*/

package tema9.c93.ej6_extra.classes.aereos;

public class Helicoptero extends Aereo{
  // atributos
    private int numHelices;

  /**********************************************/

  // constructor
    public Helicoptero(String matricula, String modelo){
      super(matricula, modelo);
      this.numHelices=(int)(Math.random()*4+1);// número de hélices entre 1 y 4
    }

  /**********************************************/

  // métodos
    /**
      @name: imprimir
      @info: imprime toda la información de un helicóptero
    */
      @Override
        public void imprimir(){
          System.out.println("\n------------HELICÓPTERO------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Número de asientos: "+this.getNumAsientos());
          System.out.println("- Número de hélices: "+this.numHelices+" hélices");
          System.out.println("-----------------------------------\n");
        }
}