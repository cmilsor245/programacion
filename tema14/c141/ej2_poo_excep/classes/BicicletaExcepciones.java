/**
  @author: Christian Millán Soria
  @file: Bicicleta.java
  @info: clase "Bicicleta"
*/

package tema14.c141.ej2_poo_excep.classes;

public class BicicletaExcepciones extends VehiculoExcepciones{
  // nº de piñones
    private int pinones;

  /*************************************/

  /**
    @info: constructor de la clase "Bicicleta"
    @param p: número de piñones de la bicicleta
  */
    public BicicletaExcepciones(int p){
      // llama al constructor sin argumentos de la superclase "Vehiculo"
        super();

      // asigna el valor de "p" al atributo "pinones"
        this.pinones=p;
    }

  /*************************************/

  // métodos
    // realiza la acción de hacer un caballito con la bicicleta
      public void hazCaballito(){
        System.out.print("Estoy haciendo el caballito.");
        System.out.println();
      }

    /*********************/

    // método "pinta"
      @Override
        public void pinta(){
          System.out.println("\nLa bicicleta ha sido pintada de otro color.");
        }
}