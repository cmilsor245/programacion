/**
  @author: Christian Millán Soria
  @file: TestEj2Arrays.java
  @info: programa principal del ejercicio 2 de arrays
*/

package tema9.c92.ej2_arrays;

public class TestEj2Arrays{
  public static void main(String[] args){
    // array
      // creación
        Gato[] gatos=new Gato[4];

      /******************/

      // generación de instancias
        gatos[0]=new Gato("marrón", "persa", "hembra", 7, 2.5);
        gatos[1]=new Gato("blanco", "bengalí", "macho", 3, 1.67);
        gatos[2]=new Gato("negro", "korat", "macho", 8, 5);
        gatos[3]=new Gato("gris", "birmano", "hembra", 11, 5.4);

      /*************************************/

      // info de todos los gatos
        for(int i=0; i<4; i++){
          System.out.println(gatos[i].toString(i+1));
        }
  }
}