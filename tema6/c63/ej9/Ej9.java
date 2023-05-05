/**
  @author: Christian Millán Soria
  @file: Ej9.java
  @info: ejercicio 9
*/

package tema6.c63.ej9;

public class Ej9{
  public static void main(String[] args){
    // número generado y contador
      int numero;
      int contador=0;

    /********************************/

    // mientras no sea 24, se siguen generando números
      do{
        numero=(int)(Math.random()*51)*2;// genera un número par entre 0 y 100
          System.out.println(numero);
        
        contador++;
      }while(numero!=24);

      System.out.print("Se han generado "+contador+" números.");
  }
}