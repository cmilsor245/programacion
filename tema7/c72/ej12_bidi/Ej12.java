/*
  @author: Christian Millán Soria
  info: ejercicio 12 bidimensionales
*/

package tema7.c72.ej12_bidi;

public class Ej12{
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
                array[i][j]=(int)(Math.random()*401+500);
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
          // máximo, mínimo

            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;

          /*******************/
        
          // variable para que no imprima todas las columnas
            int cont=0;

          // debug
            for(int i=9; i>-1; i--){
              cont=1;

              for(int j=0; j<columnas; j++){
                if(cont==1){
                  System.out.printf("| %-3d ", array[i][9-i]);

                  cont++;

                  // máximo
                    if(array[i][9-i]>max){
                      max=array[i][9-i];
                    }

                  // mínimo
                    if(array[i][9-i]<min){
                      min=array[i][9-i];
                    }
                }
              }
            }

            System.out.println("|");

            // máximo y mínimo
              System.out.print("\nEl valor máximo de entre los valores de la diagonal es el "+max+" y el mínimo es el "+min+".");
  }
}