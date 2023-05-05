/**
  @author: Christian Millán Soria
  @file: Ej27.java
  @info: ejercicio 27
*/

package tema6.c63.ej27;

import java.util.Scanner;

public class Ej27{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

      System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugadaUsuario=s.nextLine().toLowerCase();

    /******************************/

    // jugada válida(?)
      if(jugadaUsuario.equals("piedra")||jugadaUsuario.equals("papel")||jugadaUsuario.equals("tijera")){
          // la jugada del usuario es válida - generación de la jugada del ordenador
            int jugadaOrdenador=(int)(Math.random()*3);// "0"="piedra", "1"="papel", "2"="tijera"
            String jugadaOrdenadorTexto="";

            // switch
              switch(jugadaOrdenador){
                  case 0:
                    jugadaOrdenadorTexto="piedra";
                  break;

                  case 1:
                    jugadaOrdenadorTexto="papel";
                  break;

                  case 2:
                    jugadaOrdenadorTexto="tijera";
                  break;
              }

          /**********************/

          // mostrar la jugada del ordenador
            System.out.println("Turno del ordenador: "+jugadaOrdenadorTexto);

          /**********************/

          // determinar quién gana
            if(jugadaUsuario.equals(jugadaOrdenadorTexto)){
              System.out.println("Empate");
            }else if((jugadaUsuario.equals("piedra")&&jugadaOrdenadorTexto.equals("tijera"))||(jugadaUsuario.equals("papel")&&jugadaOrdenadorTexto.equals("piedra"))||(jugadaUsuario.equals("tijera")&&jugadaOrdenadorTexto.equals("papel"))){
              System.out.println("Gana el jugador");
            }else{
              System.out.println("Gana el ordenador");
            }
      }else{
        // la jugada del usuario no es válida
          System.out.println("Jugada no válida.");
      }
  }
}