/*
  @author: Christian Millán Soria
  info: ejemplo 2
*/

package tema7.c72.ejemplo2;

public class Ejemplo2{
  public static void main(String[] args){
    // array
      // filas y columnas
        int f=6;
        int c=4;

      // valor para cada elemento del array
        int aux=1;

      // creación
        int[][] array=new int[f][c];

      // asignación de valores
        for(int columna=0; columna<c; columna++){
          for(int fila=0; fila<f; fila++){
            array[fila][columna]=aux;

            aux+=1;
          }
        }

      // contenido del array
        System.out.println("+----+----+----+----+");

        for(int fila=0; fila<f; fila++){
          for(int columna=0; columna<c; columna++){
            System.out.printf("| %-2d ", array[fila][columna]);
          }

          System.out.println("|");
          System.out.print("+----+----+----+----+");
          System.out.println();
        }
  }
}