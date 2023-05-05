/*
  @author: Christian Millán Soria
  info: ejercicio 3 bidimensionales
*/

package tema7.c72.ej3_bidi;

public class Ej3{
  public static void main(String[] args){
    // array
      // nº elementos
        // filas
          int f=4;

        // columnas
          int c=5;

        // sumas
          int sumaFilas=0;
          int sumaColumnas=0;
          int total=0;

      /******************/

      // creación
        int[][] array=new int[f][c];

      /******************/

      // generación aleatoria de valores
        for(int filas=0; filas<f; filas++){
          for(int columnas=0; columnas<c; columnas++){
            array[filas][columnas]=(int)(Math.random()*801+100);
          }
        }

    /*********************************************************/

    // debug
      // filas
        for(int i=0; i<f; i++){
          for(int j=0; j<c; j++){
            sumaFilas+=array[i][j];

            System.out.printf("| %-8d ", array[i][j]);
          }

          total+=sumaFilas;
          System.out.println("| **"+sumaFilas+"** |");
          sumaFilas=0;
        }

      // columnas
        for(int i=0; i<c; i++){
          sumaColumnas=0;

          for(int j=0; j<f; j++){
            sumaColumnas+=array[j][i];
          }

          System.out.printf("| **%-2d** ", sumaColumnas);
        }

        System.out.printf("| **%-2d** |", total);
  }
}