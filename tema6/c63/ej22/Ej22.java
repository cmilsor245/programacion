/**
  @author: Christian Millán Soria
  @file: Ej22.java
  @info: ejercicio 22
*/

package tema6.c63.ej22;

import java.util.Scanner;

public class Ej22{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

      System.out.print("Introduce la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud=s.nextInt();

    /**********************************/

      // dibujo de la cabeza
        System.out.println("            @");

    /**********************************/

      // dibujo del cuerpo
        int pos=13;

        for(int i=1; i<longitud; i++){
          int direccion=(int)(Math.random()*3)-1;

          pos+=direccion;

          for(int j=0; j<pos; j++){
            System.out.print(" ");
          }
            System.out.println("*");
        }
  }
}