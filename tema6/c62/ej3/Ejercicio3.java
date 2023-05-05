/*
  @author: Christian Millán Soria
  description: Tema 6 - Ejercicio 3
*/

package tema6.c62.ej3;

public class Ejercicio3{
  public static void main(String[] args){
    //Palo
      String palo="";

      int numPalo;

      //Generación del palo aleatorio y su correspondencia
        numPalo=(int)((Math.random()*4)+1);

        switch(numPalo){
          //Oros
            case 1:
              palo="Oros";
            break;

          //Copas
            case 2:
              palo="Copas";
            break;

          //Espadas
            case 3:
              palo="Espadas";
            break;

          //Bastos
            case 4:
              palo="Bastos";
            break;

          //Default
            default:
              palo=String.valueOf(numPalo);
        }

    //Carta
      String carta="";

      int numCarta;

      //Generación de la carta aleatoria y su correspondencia
        numCarta=(int)((Math.random()*10)+1);

        switch(numCarta){
          //As
            case 1:
              carta="As";
            break;

          //Sota
            case 8:
              carta="Sota";
            break;

          //Caballo
            case 9:
              carta="Caballo";
            break;

          //Rey
            case 10:
              carta="Rey";
            break;

          //Default
            default:
              carta=String.valueOf(numCarta);
        }

      //Impresión por pantalla
        System.out.print("Carta aleatoria: "+carta+" de "+palo+".");
  }
}