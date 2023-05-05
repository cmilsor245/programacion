/*
  @author: Christian Millán Soria
  info: ejercicio 13 bidimensionales
*/

package tema7.c72.ej13_bidi;

public class Ej13{
  public static void main(String[] args){
    // array países
      // creación
        String[] pais={"España", "Rusia", "Japón", "Australia"};

    /**********************************************/

    // array estaturas
      // dimensiones
        int f=4;
        int c=10;

      // creación
        int[][] estatura=new int[f][c];

      // asignación de valores
        for(int i=0; i<f; i++){
          for(int j=0; j<c; j++){
            estatura[i][j]=(int)(Math.random()*71+140);
          }
        }

    /**********************************************/

    // debug
      // máximo, mínimo y media
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int suma=0;

      String indice="MED MIN MAX";

      System.out.println("                                                                "+indice);

      for(int i=0; i<f; i++){
        System.out.printf("%9s:", pais[i]);

        for(int j=0; j<c; j++){
          System.out.printf(" %-3d ", estatura[i][j]);

          suma+=estatura[i][j];

          // máximo
            if(estatura[i][j]>max){
              max=estatura[i][j];
            }

          // mínimo
            if(estatura[i][j]<min){
              min=estatura[i][j];
            }
        }

        System.out.printf(" |  %-3d %-3d %-3d", suma/c, min, max);

        suma=0;

        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;

        System.out.println();
      }
  }
}