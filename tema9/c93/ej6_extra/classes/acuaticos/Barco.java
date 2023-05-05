/**
  @author: Christian Millán Soria
  @file: Barco.java
  @info: subclase "Barco"
*/

package tema9.c93.ej6_extra.classes.acuaticos;

public class Barco extends Acuatico{
  // atributos
    private boolean motor;

  /**********************************************/

  // constructor
    public Barco(String matricula, String modelo){
      super(matricula, modelo);
      int tiene=(int)(Math.random()*2);
        if(tiene==0){
          this.motor=false;
        }else{
          this.motor=true;
        }
    }

  /**********************************************/

  // métodos
    /**
      @name: imprimir
      @info: imprime toda la información de un barco
    */
      @Override
        public void imprimir(){
          System.out.println("\n------------BARCO------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Eslora: "+this.getEslora()+" metros");
          System.out.print("- Motor: ");
            if(this.motor){
              System.out.println("Sí");
            }else{
              System.out.println("No");
            }
          System.out.println("-----------------------------\n");
        }
}