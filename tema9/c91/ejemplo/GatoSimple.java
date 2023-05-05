/**
  @author: Christian Millán Soria
  @file: GatoSimple.java
  @info: ejemplo 1 - gato simple
*/

package tema9.c91.ejemplo;

public class GatoSimple{
  // atributos
    String color, raza, sexo;

    int edad;

    double peso;

  /************************************************/

  // métodos
    // constructor
      GatoSimple(String s){
        this.sexo=s;
      }

    // getter
      String getSexo(){
        return this.sexo;
      }

  /************************************************/

  // gato maulla
    void maulla(){
      System.out.println("Miau");
    }

  // gato ronronea
    void ronronea(){
      System.out.print("Mrrr");
    }

  /************************************************/

  /**
    @info: gato come - si no se le da pescado, la rechaza
    @param comida: comida que se le ofrece al gato
  */
    void come(String comida){
      comida=comida.toLowerCase();

      if(comida.equals("pescado")){
        System.out.println("*Hmmm, gracias*");
      }else{
        System.out.println("*Lo siento, solo como pescado*");
      }
    }

  /************************************************/

  /**
    @info: pelea de gatos - solo se pelean los machos entre si (¿?)
    @param contrincante: gato contra el que pelea el primer gato
  */
    void peleaCon(GatoSimple contrincante){
      if(this.sexo.equals("hembra")){
        System.out.println("*No me gusta pelear*");
      }else{
        if(contrincante.getSexo().toLowerCase().equals("hembra")){
          System.out.println("*No peleo contra gatitas*");
        }else{
          System.out.println("*Ven aquí que te vas a enterar*");
        }
      }
    }
}