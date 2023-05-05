/*
 * @author: Christian Millán Soria
 * date: 20/12/2022
 * description: Punto 6.1 - Ejemplo 2
 */

package tema6.c61.ejemplo2;

public class Ejemplo2{
  public static void main(String[] args){
    System.out.println("20 números aleatorios entre 1 y 15 sin llegar a 15:");

    for(int i=1; i<=20; i++){
      System.out.println(Math.random()*14+1);
    }
  }
}