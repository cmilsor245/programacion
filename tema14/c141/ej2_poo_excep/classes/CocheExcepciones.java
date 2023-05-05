/**
  @author: Christian Millán Soria
  @file: Coche.java
  @info: clase "Coche"
*/

package tema14.c141.ej2_poo_excep.classes;

public class CocheExcepciones extends VehiculoExcepciones{
  // cilindrada en cm3
    private int cilindrada;

  /******************************/

  /**
    @info: constructor de la clase "Coche"
    @param c: cilindrada del coche en cm3
  */
    public CocheExcepciones(int c){
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