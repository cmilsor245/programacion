/**
  @author: Christian Millán Soria
  @file: Moto.java
  @info: subclase "Moto"
*/

package tema9.c93.ej6_extra.classes.terrestres;

public class Moto extends Terrestre{
  // atributos
    private String color;

  /*****************************************/

  // constructor
    public Moto(String matricula, String modelo, String color){
      super(matricula, modelo);
      this.color=color;
    }

  /*****************************************/

  // métodos
    /**
      @name: imprimir
      @info: imprime toda la información de una moto
    */
      @Override
        public void imprimir(){
          System.out.println("\n------------MOTO------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Número de ruedas: "+this.getNumRuedas());
          System.out.println("- Color: "+this.color);
          System.out.println("----------------------------\n");
        }
}