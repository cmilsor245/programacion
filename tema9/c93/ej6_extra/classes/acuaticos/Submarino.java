/**
  @author: Christian Millán Soria
  @file: Submarino.java
  @info: subclase "Submarino"
*/

package tema9.c93.ej6_extra.classes.acuaticos;

public class Submarino extends Acuatico{
  // atributos
    private double profundidadMaxima;

  /**********************************************/

  // constructor
    public Submarino(String matricula, String modelo){
      super(matricula, modelo);
      this.profundidadMaxima=Math.random()*4901+100;// profundidad máxima entre 100 y 5000 metros
    }

  /**********************************************/

  // métodos
    /**
      @name: imprimir
      @info: imprime toda la información de un submarino
    */
      @Override
        public void imprimir(){
          System.out.println("\n------------SUBMARINO------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Eslora: "+this.getEslora()+" metros");
          System.out.println("- Profundidad máxima: "+this.profundidadMaxima+" metros");
          System.out.println("---------------------------------\n");
        }
}