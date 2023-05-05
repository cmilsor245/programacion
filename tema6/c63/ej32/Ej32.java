/**
  @author: Christian Millán Soria
  @file: Ej32.java
  @info: ejercicio 32
*/

// !no consigo hacer que el sendero se curve, o los objetos se mueven o el sendero se mueve

package tema6.c63.ej32;

import java.util.Scanner;

public class Ej32{
  public static void main(String[] args) {
    // scanner
      Scanner s=new Scanner(System.in);

      System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitud=s.nextInt();

    /***************************************/

    // definir el ancho del sendero y las variables para su generación
      int anchoSendero=6;
      int direccion=1;// empieza yendo hacia la derecha
      int posicion=(anchoSendero-1)/2;// empieza en el centro del sendero

    /***************************************/

    // generar el sendero y mostrarlo en la consola
      for(int i=0; i<longitud; i++){
        // imprimir los bordes del sendero
          System.out.print("|");

        for(int j=1; j<anchoSendero-1; j++){
          if(j==posicion){
            // pintar obstáculo aleatorio en el centro del sendero
              int obstaculo=(int)(Math.random()*2);

              if(obstaculo==0){
                System.out.print("*");
              }else{
                System.out.print("O");
              }
          }else{
            System.out.print(" ");
          }
        }

        System.out.print("|");
          System.out.println();

        /*******************/

        // actualizar la dirección y la posición del sendero
          int cambio=(int)(Math.random()*3)-1;// -1, 0, 1

          direccion+=cambio;

          if(direccion<0){
            direccion=0;
          }else if(direccion>2){
            direccion=2;
          }

          posicion+=direccion-1;

          if(posicion<1){
            posicion=1;
          }else if(posicion>anchoSendero-2){
            posicion=anchoSendero-2;
          }
      }
  }
}