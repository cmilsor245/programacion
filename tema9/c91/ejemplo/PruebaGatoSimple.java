/**
  @author: Christian Millán Soria
  @file: PruebaGatoSimple.java
  @info: ejemplo 1 - prueba gato simple
*/

package tema9.c91.ejemplo;

public class PruebaGatoSimple{
  public static void main(String[] args){
    // primer gato
      GatoSimple garfield=new GatoSimple("macho");

    /********************************************/

    // primera interacción
      System.out.println("Hola gatito.");

      garfield.maulla();

      System.out.println("\nToma tarta.");

      garfield.come("tarta selva negra");

      System.out.println("\nToma pescado, a ver si esto te gusta.");

      garfield.come("pescado");

    /********************************************/

    // segundo gato
      GatoSimple tom=new GatoSimple("macho");

    /********************************************/

    // segunda interacción
      System.out.println("\nTom, toma sopita de verduras.");

      tom.come("sopa de verduras");

    /********************************************/

    // tercer gato
      GatoSimple lisa=new GatoSimple("hembra");

    /********************************************/

    // tercera interacción
      System.out.println("\nGatitos, ¡a ver cómo maulláis!");

      garfield.maulla();
      tom.maulla();
      lisa.maulla();

      System.out.println("\n¡Ahora a pelear!");

      garfield.peleaCon(lisa);
      lisa.peleaCon(tom);
      tom.peleaCon(garfield);
  }
}