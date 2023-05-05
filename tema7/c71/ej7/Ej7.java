/*
  @author: Christian Millán Soria
  info: ejercicio 7
*/

package tema7.c71.ej7;

import java.util.Scanner;

public class Ej7{
  public static void main(String[] args){
    // array
      // tamaño
        int t=100;

      // creación
        int[] n=new int[t];

    /**************************************/

    // generación de números
      for(int i=0; i<t; i++){
        n[i]=(int)(Math.random()*21);
      }

    /**************************************/

    // 100 primeros números
      for(int i=0; i<t; i++){
        System.out.print(n[i]+" ");
      }

    /**************************************/

    // obtención de los dos números
      // scanner
        Scanner s=new Scanner(System.in);

      // primer número
        System.out.print("\nIntroduce un primer número: ");
          int first=s.nextInt();

      // segundo número
        System.out.print("Introduce un segundo número: ");
          int second=s.nextInt();

      // cierre de scanner
        s.close();

      /**************************************/

      // cambio
        for(int i=0; i<t; i++){
          if(n[i]==first){
            n[i]=second;

            System.out.print("\""+n[i]+"\" ");
          }else{
            System.out.print(n[i]+" ");
          }
        }
  }
}