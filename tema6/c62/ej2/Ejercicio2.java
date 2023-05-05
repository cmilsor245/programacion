/*
  @author: Christian Millán Soria
  description: Tema 6 - Ejercicio 2
*/

package tema6.c62.ej2;

public class Ejercicio2{
  public static void main(String[] args){
    //Palo
      String nombrePalo="";

      int numPalo;

      //Generación del número de palo y su correspondencia
        numPalo=(int)((Math.random()*4)+1);

        switch(numPalo){
          //Picas
            case 1:
              nombrePalo="Picas";
            break;

          //Corazones
            case 2:
              nombrePalo="Corazones";
            break;

          //Diamantes
            case 3:
              nombrePalo="Diamantes";
            break;

          //Tréboles
            case 4:
              nombrePalo="Tréboles";
            break;
        }

    //Carta
      String carta="";

      int numCarta;

      //Generación del número de carta y su correspondencia
        numCarta=(int)((Math.random()*13)+1);

        switch(numCarta){
          //As
            case 1:
              carta="As";
            break;

          //J
            case 11:
              carta="J";
            break;

          //Q
            case 12:
              carta="Q";
            break;

          //K
            case 13:
              carta="K";
            break;

          //Default
            default:
              carta=String.valueOf(numCarta);
        }

    //Impresión por pantalla
      System.out.print("Carta aleatoria: "+carta+" de "+nombrePalo+".");
  }
}