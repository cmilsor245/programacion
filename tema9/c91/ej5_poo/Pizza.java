/**
  @author: Christian Millán Soria
  @file: Pizza.java
  @info: clase "Pizza" - ejercicio 5
*/

package tema9.c91.ej5_poo;

public class Pizza{
  // atributos
    private String tipo;
    private String tamano;
    private String estado;

    // total pedidas y servidas
    private static int totalPedidas=0;
    private static int totalServidas=0;

  /************************************************/

  // constructor
    public Pizza(String tipo, String tamano){
        this.tipo=tipo;

        this.tamano=tamano;

        this.estado="pedida.";

        this.totalPedidas++;// se incrementa el total de pizzas pedidas al crear una nueva instancia de la clase "Pizza"
    }

  /************************************************/

  // métodos
    // "getTipo"
      public String getTipo(){
        return tipo;
      }

    /**********************/

    // "getTamano"
      public String getTamano(){
        return tamano;
      }

    /**********************/

    // "getEstado"
      public String getEstado(){
        return estado;
      }

    /**********************/

    // "getTotalPedidas"
      public static int getTotalPedidas(){
        return totalPedidas;
      }

    /**********************/

    // "getTotalServidas"
      public static int getTotalServidas(){
        return totalServidas;
      }

    /**********************/

    // sirve una pizza
      public void sirve(){
        if(this.estado.equals("pedida.")){
          this.estado="servida.";

          this.totalServidas++;
        }
      }

  /************************************************/

  // sobreescritura del método "toString" para imprimir información sobre la instancia de "Pizza"
    @Override
      public String toString() {
        return "Pizza "+this.tipo+" "+this.tamano+", "+this.estado;
      }
}