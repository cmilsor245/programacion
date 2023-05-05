/*
 * @author: Christian Millán Soria
 * date: 20/12/2022
 * description: Punto 6.1 - Ejemplo 4
 */

package tema6.c61.ejemplo4;

public class Ejemplo4{
  public static void main(String[] args){
    System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");

    for(int i=1; i<=20; i++){
      System.out.println((int)(Math.random()*10+1));
    }
  }
}