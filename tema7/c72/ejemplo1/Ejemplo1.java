/*
  @author: Christian Millán Soria
  info: ejemplo 1
*/

package tema7.c72.ejemplo1;

public class Ejemplo1{
  public static void main(String[] args){
    // array
      // filas y columnas
        int f=4;
        int c=6;

      // auxiliar
        int aux=1;

      // creación
        int[][] array=new int[f][c];

      // asignación de valores
        for(int fila=0; fila<f; fila++){
          for(int columna=0; columna<c; columna++){
            array[fila][columna]=aux;

            aux+=1;
          }
        }

      // contenido del array
        System.out.println("+----+----+----+----+----+----+");

        for(int fila=0; fila<f; fila++){
          for(int columna=0; columna<c; columna++){
            System.out.printf("| %-2d ", array[fila][columna]);
          }

          System.out.println("|");
          System.out.print("+----+----+----+----+----+----+");
          System.out.println();
        }
  }
}