/*
  @author: Christian Millán Soria
  info: ejercicio 10
*/

package tema7.c71.ej10;

public class Ej10{
  public static void main(String[] args){
    // creación del array
      // número de elementos
        int t=20;

      // creación
        int[] n=new int[t];

    /*************************************/

    // auxiliares
      // pares
        int[] pares=new int[t];
        int par=0;

      // impares
        int[] impares=new int[t];
        int impar=0;

    /*************************************/

    // asignación de valores aleatorios entre 0-100
      for(int i=0; i<t; i++){
        n[i]=(int)(Math.random()*101);

        // separación
          // pares -> a un array diferente
            if((n[i]%2)==0){
              pares[par++]=n[i];
            }else{
              // impares -> a un array diferente
                impares[impar++]=n[i];
            }
      }

    /*************************************/

    // array original
      for(int i=0; i<t; i++){
        System.out.print("| "+n[i]+" |");
      }
      System.out.println();

    /*************************************/

    // reordenamiento
      // pares a las primeras posiciones
        for(int i=0; i<par; i++){
          n[i]=pares[i];
        }

      // impares a las posiciones restantes
        for(int i=par; i<t; i++){
          n[i]=impares[i-par];
        }

    /*************************************/

    // debug
      for(int i=0; i<t; i++){
        System.out.print("| "+n[i]+" |");
      }
  }
}