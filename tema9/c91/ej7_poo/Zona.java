/**
  @author: Christian Millán Soria
  @file: Zona.java
  @info: clase "Zona" - ejercicio 7
*/

package tema9.c91.ej7_poo;

public class Zona{
  // atributos
    private int entradasPorVender;

  /*****************************************/

  // constructor
    public Zona(int n){
      entradasPorVender=n;
    }

  /*****************************************/

  // métodos
    // método para obtener el número de entradas por vender
      public int getEntradasPorVender(){
        return entradasPorVender;
      }

    /******************/

    /**
      @info: método para vender un número de entradas (comprueba si quedan entradas libres antes de realizar la venta)
      @param n: número de entradas a vender
    */
      public void vender(int n){
        if(this.entradasPorVender==0){// si no hay entradas disponibles en la zona
          System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        }else if(this.entradasPorVender<n){// si no hay suficientes entradas disponibles en la zona
          System.out.println("Sólo quedan "+this.entradasPorVender+" entradas para esa zona.");
        }else if(this.entradasPorVender>=n){// si hay suficientes entradas disponibles en la zona
          entradasPorVender-=n;// eliminación de las entradas que se van a vender

          System.out.println("Aquí tienes tus "+n+" entradas, gracias.");
        }
      }
}