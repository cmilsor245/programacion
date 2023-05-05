/**
  @author: Christian Millán Soria
  @file: Ej31.java
  @info: ejercicio 31
*/

package tema6.c63.ej31;

import java.util.Scanner;

public class Ej31{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

      System.out.print("Introduce la cantidad de dinero que quieres apostar en euros: ");
        double dineroApostado=s.nextDouble();

    /*****************************************/

    // tirada inicial
      int dado1=(int)(Math.random()*6)+1;
      int dado2=(int)(Math.random()*6)+1;
        int sumaDados=dado1+dado2;

      System.out.println("Tirada de los dados: "+dado1+" + "+dado2+" = "+sumaDados);

    /*****************************************/

    // comprobación de si el jugador ha ganado
      if(sumaDados==7||sumaDados==11){
        double dineroGanado = dineroApostado;

        System.out.printf("¡Enhorabuena! Has ganado %.2f euros y ahora tienes un total de %.2f euros.", dineroGanado, dineroApostado + dineroGanado);
      }else if(sumaDados==2||sumaDados==3||sumaDados==12){
        System.out.printf("Lo siento, has perdido todo tu dinero. Ahora tienes un total de %.2f euros.", 0.0);
      }else{
        int punto=sumaDados;
          System.out.println("Punto establecido en "+punto);

        int nuevaSumaDados=0;

        // segunda etapa
          do{
            dado1=(int)(Math.random()*6)+1;
            dado2=(int)(Math.random()*6)+1;
              nuevaSumaDados=dado1+dado2;

            System.out.println("Tirada de los dados: "+dado1+" + "+dado2+" = "+nuevaSumaDados);
          }while(nuevaSumaDados!=7&&nuevaSumaDados!=punto);

        // comprobación de si el jugador ha ganado
          if(nuevaSumaDados==7){
            System.out.printf("Lo siento, has perdido toda tu apuesta de %.2f euros. Ahora tienes un total de %.2f euros.", dineroApostado, 0.0);
          } else {
            double dineroGanado=dineroApostado;
              System.out.printf("¡Enhorabuena! Has ganado %.2f euros y ahora tienes un total de %.2f euros.", dineroGanado, dineroApostado+dineroGanado);
          }
      }
  }
}