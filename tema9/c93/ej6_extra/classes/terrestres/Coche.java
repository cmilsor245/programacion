/**
  @author: Christian Millán Soria
  @file: Coche.java
  @info: subclase "Coche"
*/

package tema9.c93.ej6_extra.classes.terrestres;

public class Coche extends Terrestre{
  // atributos
    private boolean aireAcondicionado;

  /**********************************************/

  // constructor
    public Coche(String matricula, String modelo){
      super(matricula, modelo);
      int tiene=(int)(Math.random()*2);
        if(tiene==0){
          this.aireAcondicionado=false;
        }else{
          this.aireAcondicionado=true;
        }
    }

  /**********************************************/

  // métodos
    /**
      @name: imprimir
      @info: imprime toda la información de un coche
    */
      @Override
        public void imprimir(){
          System.out.println("\n------------COCHE------------");
          System.out.println("- Matrícula: "+this.getMatricula());
          System.out.println("- Modelo: "+this.getModelo());
          System.out.println("- Número de ruedas: "+this.getNumRuedas());
          System.out.print("- Aire acondicionado: ");
            if(this.aireAcondicionado){
              System.out.println("Sí");
            }else{
              System.out.println("No");
            }
          System.out.println("-----------------------------\n");
        }
}