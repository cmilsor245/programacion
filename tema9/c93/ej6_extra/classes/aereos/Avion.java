/**
  @author: Christian Millán Soria
  @file: Avion.java
  @info: subclase "Avion"
*/

package tema9.c93.ej6_extra.classes.aereos;

public class Avion extends Aereo{
  // atributos
    private double tiempoMaximoDeVuelo;

  /**********************************************/

  // constructor
    public Avion(String matricula, String modelo){
      super(matricula, modelo);
      this.tiempoMaximoDeVuelo=Math.random()*954+30;// tiempo máximo de vuelo entre 30 y 983 minutos
    }

  /**********************************************/

  // métodos
    /**
      @name: imprimir
      @info: imprime toda la información de un avión
    */
      @Override
        public void imprimir(){
          System.out.println("\n------------AVIÓN------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Número de asientos: "+this.getNumAsientos());
          System.out.println("- Tiempo máximo de vuelo: "+this.tiempoMaximoDeVuelo+" minutos");
          System.out.println("-----------------------------\n");
        }
}