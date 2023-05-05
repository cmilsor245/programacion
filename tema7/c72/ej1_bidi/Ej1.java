/*
  @author: Christian Millán Soria
  info: ejercicio 1 bidimensionales
*/

package tema7.c72.ej1_bidi;

public class Ej1{
  public static void main(String[] args){
    // creación del array
      // nº elementos
        // filas
          int f=3;
          int fila;

        // columnas
          int c=6;
          int columna;

      /****************/

      // creación
        int[][] array=new int[f][c];

    /***********************************/

    // asignación de valores
      // fila 0
        array[0][0]=0;
        array[0][1]=30;
        array[0][2]=2;
        array[0][5]=5;

      // fila 1
        array[1][0]=75;
        array[1][4]=0;

      // fila 2
        array[2][2]=-2;
        array[2][3]=9;
        array[2][5]=11;

    /***********************************/

    // contenido del array
      System.out.println("+----+----+----+----+----+----+");

      for(fila=0; fila<f; fila++){
        for(columna=0; columna<c; columna++){
          System.out.printf("| %-2d ", array[fila][columna]);
        }

        System.out.println("|");
        System.out.print("+----+----+----+----+----+----+");
        System.out.println();
      }
  }
}