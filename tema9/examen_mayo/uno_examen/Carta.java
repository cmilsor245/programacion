/**
  @author: Christian Millán Soria
  @file: Carta.java
  @info: clase "Carta" del examen
*/

package tema9.examen_mayo.uno_examen;

public class Carta{
  // atributos
    private int numero;
    private String color;

    static final String PURPURA="\033[1;105m";

    static final String RESET="\033[0m";

    private static Carta cartaEnJuego;

  /*************************************************************/

  // constructor
    public Carta(int numero, String color){
      this.numero=numero;

      this.color=color;
    }

  /*************************************************************/

  // métodos
    /**
      @name: dibujaFila
      @info: dibuja una fila específica
      @param fila: número de la fila a dibujar
      @return fila: fila dibujada
    */
    public String dibujaFila(int fila){
      String filaDibujada="";

      switch (fila){
        case 1:
          filaDibujada+=color+"/ \\"+RESET+" ";// agrega los caracteres correspondientes a la fila de arriba
        break;

        case 2:
          filaDibujada+=color+" "+String.format("%-2s", this.numero)+RESET+" ";// agrega el número de la carta con color y ancho fijo// string.format equivaldría a printf
        break;

        case 3:
          filaDibujada+=color+"\\ /"+RESET+" ";// agrega los caracteres correspondientes a la fila de abajo
        break;
      }

      return filaDibujada;
  }


    /****************************/

    public static void setCartaEnJuego(Carta cartaAJugar){
      cartaEnJuego=cartaAJugar;
    }

    /****************************/

    public static Carta getCartaEnJuego(){
      return cartaEnJuego;
    }

    /****************************/

    public String getColor(){
      return this.color;
    }

    /****************************/

    public int getNumero(){
      return this.numero;
    }

    /****************************/

    public String toString(){
      String toString="";

      toString+=this.color+this.numero+RESET;

      return toString;
    }

    /****************************/

    /**
      @name: esJugable
      @info: realiza una comprobación de si una carta es jugable con otra
      @return:
        - true: la carta es jugable
        - false: la carta no es jugable
    */
      public boolean esJugable(){
        Carta cartaEnJuego=Carta.getCartaEnJuego();

        if(cartaEnJuego==null){
          return true;
        }else if(this.numero==0&&PURPURA.equals(this.color)){
          return true;
        }else if(this.color!=null&&this.color.equals(cartaEnJuego.color)||this.numero==cartaEnJuego.numero){
          return true;
        }else{
          return false;
        }
      }

    /****************************/

    /**
      @name: esComodin
      @info: comprueba si la carta es comodín
      @return:
        - true: la carta es comodín
        - false: la carta no es comodín
    */
      public boolean esComodin(){
        return this.numero==0&&PURPURA.equals(this.color);
      }
}