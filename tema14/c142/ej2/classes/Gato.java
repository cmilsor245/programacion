/**
  @author: Christian Millán Soria
  @file: Gato.java
  @info: clase "Gato"
*/

package tema14.c142.ej2.classes;

import tema14.c142.ej2.exceptions.ExcepcionApareamientoImposible;

public class Gato{
  // atributos
    String color, raza, sexo;
    int edad;
    double peso;

  /************************************************/

  // constructor
    public Gato(String sexo){
      this.sexo=sexo;
    }

  /************************************************/

  // métodos
    // getter para el atributo "sexo"
      public String getSexo(){
        return this.sexo;
      }

    // setter para el atributo "sexo"
      public void setSexo(String sexo){
        this.sexo=sexo;
      }

    /*****************************/

    // getter para el atributo "color"
      public String getColor(){
        return this.color;
      }

    // setter para el atributo "color"
      public void setColor(String color){
        this.color=color;
      }

    /*****************************/

    // getter para el atributo "raza"
      public String getRaza(){
        return this.raza;
      }

    // setter para el atributo "raza"
      public void setRaza(String raza){
        this.raza=raza;
      }

    /*****************************/

    // getter para el atributo "edad"
      public int getEdad(){
        return this.edad;
      }

    // setter para el atributo "edad"
      public void setEdad(int edad){
        this.edad=edad;
      }

    /*****************************/

    // getter para el atributo "peso"
      public double getPeso(){
        return this.peso;
      }

    // setter para el atributo "peso"
      public void setPeso(double peso){
        this.peso=peso;
      }

    /*****************************/

    /**
      @name: maulla
      @info: hace maullar al gato
    */
      public void maulla(){
        System.out.println("Miau");
      }

    /*****************************/

    /**
      @name: ronronea
      @info: hace ronronear al gato
    */
      public void ronronea(){
        System.out.print("Mrrr");
      }

    /*****************************/

    /**
      @name: come
      @info: gato come - si no se le da pescado, rechaza la comida
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

    /*****************************/

    /**
      @name: peleaCon
      @info: pelea de gatos - solo se pelean los machos entre si (¿?)
      @param contrincante: gato contra el que pelea el primer gato
    */
      void peleaCon(Gato contrincante){
        if(this.sexo.equals("hembra")){
          System.out.println("No me gusta pelear.");
        }else{
          if(contrincante.getSexo().toLowerCase().equals("hembra")){
            System.out.println("¡No peleo contra gatitas!");
          }else{
            System.out.println("¡Ven aquí que te vas a enterar!");
          }
        }
      }

    /*****************************/

    /**
      @name: apareaCon
      @info: comprueba que los gatos son de distinto sexo, tras lo cual genera un nuevo gato
      @param pareja: gato con el que se aparea
      @return: nuevo gato
    */
      public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible{
        if(this.sexo.equals(pareja.getSexo())){
          throw new ExcepcionApareamientoImposible();// si el sexo es el mismo, se genera el error, establecido en la subclase
        }else{
          // generación aleatoria de atributos
            String nuevoSexo=Math.random()<0.5?"macho":"hembra";// sexo aleatorio entre las dos posibilidades - si el número aleatorio generado es menor que 0.5, será "macho", sino, "hembra"
            int nuevaEdad=(int)(Math.random()*10);// nueva edad para la cría
            double nuevoPeso=Math.random()*5;// nuevo peso para la cría

          /**************/

          // creación del gato
            Gato nuevoGato=new Gato(nuevoSexo);
              nuevoGato.color=this.color;
              nuevoGato.raza=this.raza;
              nuevoGato.edad=nuevaEdad;
              nuevoGato.peso=nuevoPeso;

            return nuevoGato;
        }
      }
}