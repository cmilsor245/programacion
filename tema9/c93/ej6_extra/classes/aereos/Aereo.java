/**
  @author: Christian Millán Soria
  @file: Aereo.java
  @info: subclase "Aereo"
*/

package tema9.c93.ej6_extra.classes.aereos;

import tema9.c93.ej6_extra.classes.Vehiculo;

public class Aereo extends Vehiculo{
  // atributos
    private final int numAsientos;

  /******************************************/

  // constructor
      public Aereo(String matricula, String modelo){
        super(matricula, modelo);
        if(this instanceof Avion){
          this.numAsientos=(int)(Math.random()*151+50);// si es avión tiene entre 50 y 200 asientos
        }else if(this instanceof Helicoptero){
          this.numAsientos=(int)(Math.random()*11)+2;// si es helicóptero tiene entre 2 y 12 asientos
        }else{
          this.numAsientos=8;// si es un vehículo aéreo genérico tiene 8 asientos
        }
      }

  /******************************************/

  // métodos
    // getter para el atributo "numAsientos"
      public double getNumAsientos(){
        return this.numAsientos;
      }

    /**************/

    /**
      @name: imprimir
      @info: imprime toda la información de un vehículo aéreo
    */
      @Override
        public void imprimir(){
          System.out.println("\n--------------------------------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Número de asientos: "+this.numAsientos);
          System.out.println("--------------------------------------\n");
        }
  }