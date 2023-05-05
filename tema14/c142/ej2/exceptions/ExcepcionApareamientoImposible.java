/**
  @author: Christian Millán Soria
  @file: ExcepcionApareamientoImposible.java
  @info: subclase de la clase "Exception"
*/

package tema14.c142.ej2.exceptions;

public class ExcepcionApareamientoImposible extends Exception{
  public ExcepcionApareamientoImposible(){
    super("No es posible aparear dos gatos del mismo sexo.");// llamo al constructor de la clase padre y muestro un mensaje personalizado
  }
}