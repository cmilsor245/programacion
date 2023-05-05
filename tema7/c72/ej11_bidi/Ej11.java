/*
  @author: Christian Millán Soria
  info: ejercicio 11 bidimensionales
*/

package tema7.c72.ej11_bidi;

public class Ej11{
  public static void main(String[] args){
    // array
      // filas y columnas
        int filas=10;
        int columnas=10;

      // creación
        int[][] array=new int[filas][columnas];

      // asignación de valores
        for(int i=0; i<filas; i++){
          for(int j=0; j<columnas; j++){
            array[i][j]=(int)(Math.random()*101+200);
          }
        }

    /**********************************/

    // array original
      for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
          System.out.printf("| %-3d ", array[i][j]);
        }

        System.out.println("|");
      }

      System.out.println();
      System.out.println();

    /**********************************/

    // valores en la diagonal
      // máximo, mínimo y media
        int suma=0;

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int totalNums=0;

      /*******************/

      for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
          if(i==j){// debido a que las casillas que forma la diagonal siempre coinciden en el valor de fila y columna...
            System.out.printf("| %-3d ", array[i][j]);

            totalNums++;

            suma+=array[i][j];

            // máximo
              if(array[i][j]>max){
                max=array[i][j];
              }

            // mínimo
              if(array[i][j]<min){
                min=array[i][j];
              }
          }
        }
      }

      System.out.println("|");

      /*******************/

      // debug máximo, mínimo y media
        System.out.print("\nEl valor máximo de entre los que conforman la diagonal es el "+max+", el mínimo es el "+min+"y la media de todos estos valores da como resultado "+suma/totalNums+".");
  }
}