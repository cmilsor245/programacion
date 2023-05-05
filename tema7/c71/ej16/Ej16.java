/*
  @author: Christian Millán Soria
  info: ejercicio 16
*/

package tema7.c71.ej16;

import java.util.Scanner;

public class Ej16{
  public static void main(String[] args){
    // array
      // número de elementos
        int t=20;

      // creación
        int[] n=new int[t];

    /*******************************/

    // asignación de valores aleatorios entre 0-400
      for(int i=0; i<t; i++){
        n[i]=(int)(Math.random()*401);
      }

    /************************************************/

    // se muestra el array
      for(int i=0; i<t; i++){
        System.out.print("| "+n[i]+" |");
      }
      System.out.println();

    // múltiplos de 5 o de 7
      // scanner
      Scanner s=new Scanner(System.in);

      // opción
        System.out.print("¿Quieres resaltar los múltiplos de 5 o de 7? -> ");
          int opt=s.nextInt();

      // cierre de scanner
        s.close();

    /************************************************/

    // múltiplos de 5
      if(opt==5){
        for(int i=0; i<t; i++){
          if((n[i]%5)==0){
            System.out.print("| ["+n[i]+"] |");
          }else{
            System.out.print("| "+n[i]+" |");
          }
        }
      }else if(opt==7){
        for(int i=0; i<t; i++){
          if((n[i]%7)==0){
            System.out.print("| ["+n[i]+"] |");
          }else{
            System.out.print("| "+n[i]+" |");
          }
        }
      }else{
        System.out.print("La opción elegida no es correcta.");
      }
  }
}