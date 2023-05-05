/**
  @author: Christian Millán Soria
  @file: Ej21.java
  @info: ejercicio 21
*/

package tema6.c63.ej21;

public class Ej21{
  public static void main(String[] args){
    // arrays con los tipos de monedas y las posiciones posibles
      String[] monedas={"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
      String[] posiciones={"cara", "cruz"};

    /**********************************/

    // generación aleatoria
      for(int i=0; i<5; i++){
        int monedaIndex=(int)(Math.random()*monedas.length);
        int posicionIndex=(int)(Math.random()*posiciones.length);

        String moneda=monedas[monedaIndex];
        String posicion=posiciones[posicionIndex];
        System.out.println(moneda+" - "+posicion);
      }
  }
}