/**
  @author: Christian Millán Soria
  @file: Coche.java
  @info: clase "Coche" - ejercicio 2
*/

package tema9.c91.ej2_poo;

public class Coche extends Vehiculo{
  // cilindrada en cm3
    private int cilindrada;

  /******************************/

  /**
    @info: constructor de la clase "Coche"
    @param c: cilindrada del coche en cm3
  */
    public Coche(int c){
      // llama al constructor sin argumentos de la superclase "Vehiculo"
        super();

      // asigna el valor de "c" al atributo "cilindrada"
        this.cilindrada=c;
    }

  /******************************/

  // métodos
    // hace que el coche queme rueda
      public void quemaRueda(){
        System.out.println("*Quemando rueda*");
      }

    /*********************/

    // método "pinta"
      @Override
        public void pinta(){
          System.out.println("\nEl coche ha sido pintado de otro color.");
        }
}