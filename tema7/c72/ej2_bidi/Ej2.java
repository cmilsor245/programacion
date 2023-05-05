/*
  @author: Christian Millán Soria
  info: ejercicio 2 bidimensionales
*/

package tema7.c72.ej2_bidi;

import java.util.Scanner;

public class Ej2{
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

      // asignación de valores
        // scanner para obtenerlos
          Scanner s=new Scanner(System.in);

        // obtención
          for(int filas=0; filas<f; filas++){
            for(int columnas=0; columnas<c; columnas++){
              System.out.print("Introduce un número: ");
                array[filas][columnas]=s.nextInt();
            }
          }

        // cierre scanner
          s.close();

    /*********************************************************/

    // debug
      // filas
        for(int i=0; i<f; i++){
          for(int j=0; j<c; j++){
            sumaFilas+=array[i][j];

            System.out.printf("| %-6d ", array[i][j]);
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