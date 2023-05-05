/**
  @author: Christian Millán Soria
  @file: Ej17.java
  @info: ejercicio 17
*/

package tema6.c63.ej17;

import java.util.Scanner;

public class Ej17{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

    /**********************************/

    // se pide el ancho y alto de la pecera al usuario
      System.out.print("Introduce el ancho de la pecera (mínimo 4): ");
        int ancho=s.nextInt();

      System.out.print("Introduce el alto de la pecera (mínimo 4): ");
        int alto=s.nextInt();

    /**********************************/

    // si los valores introducidos son menores que 4, se cambian a 4
      if(ancho<4){
        ancho=4;
      }

      if(alto<4){
        alto=4;
      }

    /**********************************/

    // se genera la posición aleatoria del pez
      int posX=(int)(Math.random()*(ancho-2))+1;
      int posY=(int)(Math.random()*(alto-2))+1;

    /**********************************/

    // se dibuja la pecera con el pez
      for(int i=0; i<alto; i++){
        for(int j=0; j<ancho; j++){
          if(i==0||i==alto-1||j==0||j==ancho-1){
            // borde de la pecera
              System.out.print("* ");
          }else if(i==posY&&j==posX){
            // posición del pez
              System.out.print("& ");
          }else{
            // agua de la pecera
              System.out.print("  ");
          }
        }
          System.out.println();
      }

    /**********************************/

    // cierre de scanner
      s.close();
  }
}