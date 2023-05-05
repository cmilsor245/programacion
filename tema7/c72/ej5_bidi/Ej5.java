/*
  @author: Christian Millán Soria
  info: ejercicio 5 bidimensionales
*/

package tema7.c72.ej5_bidi;

public class Ej5{
  public static void main(String[] args){
    // máximo y mínimo
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;

      int auxMaxFila=0;
      int auxMaxColumna=0;

      int auxMinFila=0;
      int auxMinColumna=0;

    /*******************************/

    // array
      // filas y columnas
        int filas=6;
        int columnas=10;

      // creación
        int[][] array=new int[filas][columnas];

      // asignación de valores aleatorios
        for(int i=0; i<filas; i++){
          for(int j=0; j<columnas; j++){
            array[i][j]=(int)(Math.random()*1001);

            // comprobación
              if(array[i][j]>max){
                max=array[i][j];

                auxMaxFila=i;
                auxMaxColumna=j;
              }

              if(array[i][j]<min){
                min=array[i][j];

                auxMinFila=i;
                auxMinColumna=j;
              }
          }
        }

    /*******************************/

    // debug
      for(int i=0; i<filas; i++){
        for(int j=0; j<columnas; j++){
          System.out.printf("| %-4d ", array[i][j]);
        }

        System.out.print("|");
        System.out.println();
      }

      // para mostrar las filas y columnas tomando la primera fila como la fila 1 y la primera columna como la columna 1
        auxMaxFila+=1;
        auxMaxColumna+=1;

        auxMinFila+=1;
        auxMinColumna+=1;

      System.out.println("Valor máximo: "+max);
        System.out.println("  Fila: "+auxMaxFila);
        System.out.println("  Columna: "+auxMaxColumna);

      System.out.println();

      System.out.println("Valor mínimo: "+min);
        System.out.println("  Fila: "+auxMinFila);
        System.out.println("  Columna: "+auxMinColumna);
  }
}