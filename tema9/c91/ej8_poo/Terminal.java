/**
  @author: Christian Millán Soria
  @file: Terminal.java
  @info: clase "Terminal" - ejercicio 8
*/

package tema9.c91.ej8_poo;

public class Terminal{
  // atributos
    private String numero;
    private int tiempoConversacion;

  /*****************************/

  // constructor
    public Terminal(String n){
      this.numero=n;

      this.tiempoConversacion=0;
    }

    /*****************************/

    // métodos
      /**
        @info: genera una llamada de un terminal a otro
        @param n: segundos de la conversación
      */
        public void llama(Terminal t, int segundos){
          this.tiempoConversacion+=segundos;

          t.tiempoConversacion+=segundos;
        }

      // método "toString"
        public String toString(){
          return "Nº "+this.numero+" - "+this.tiempoConversacion+"s de conversación.";
        }
}