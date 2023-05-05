/*
  @author: Christian Millán Soria
  info: ejercicio 19
*/

package tema7.c72.ej19;

import java.util.Scanner;

public class Ej19{
  public static void main(String[] args){
    // array original
      // número de elementos
        int t=12;

      // creación
        int[] array=new int[t];

      // asignación de valores aleatorios
        for(int i=0; i<t; i++){
          array[i]=(int)(Math.random()*201);
        }

      /*****************************************/

      // muestra array original
        int indice=0;

        System.out.print("Indice ");
        for(int i=0; i<12; i++){
          System.out.printf(" %3d ", indice);
  
          indice++;
        }

        System.out.print("\nValor  ");
        for(int i=0; i<12; i++){
          System.out.printf(" %3d ", array[i]);
        }

      /*****************************************/

      // valor a insertar
        // scanner
          Scanner s=new Scanner(System.in);

        // número
          System.out.print("\n\nIntroduce el número que quieres insertar: ");
            int num=s.nextInt();

        // posición
        System.out.print("Introduce la posición donde lo quieres insertar (0-11): ");
          int pos=s.nextInt();

        // cierre scanner
          s.close();

      /*****************************************/

      // comprobación de posición válida
        if(pos<0||pos>11){
          System.out.print("\nLa posición introducida no es válida.");
        }else{
          // mover hacia la derecha
            for(int i=11; i>pos; i--){
              array[i]=array[i-1];
            }

          /***************/

          // inserción del número
            array[pos]=num;

          /***************/

          // debug
            indice=0;

            System.out.print("\nIndice ");
            for(int i=0; i<12; i++){
              System.out.printf(" %3d ", indice);
      
              indice++;
            }
    
            System.out.print("\nValor  ");
            for(int i=0; i<12; i++){
              System.out.printf(" %3d ", array[i]);
            }
        }
  }
}