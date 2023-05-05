/*
  @author: Christian Millán Soria
  info: ejercicio 8
*/

package tema7.c71.ej8;

import java.util.Scanner;

public class Ej8{
  public static void main(String[] args){
    // arrays
      // meses
        String[] mes={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

      // temperaturas
        // nº elementos
          int x=12;
          
        // creación
          int[] temp=new int[x];

    // barras
      char c='*';

    /****************************/

    // temperaturas
      // scanner
        Scanner s=new Scanner(System.in);

      // obtención
        for(int i=0; i<x; i++){
          System.out.print("Introduce la temperatura del mes de "+mes[i]+": ");
            temp[i]=s.nextInt();
        }

        System.out.println();

      // cierre de scanner
        s.close();

    /****************************/

    // gráfico
      for(int i=0; i<x; i++){
        System.out.print(mes[i]+" -> "+temp[i]+"º -> ");

        if(temp[i]==0){
          System.out.println("0º");
        }else{
          for(int j=0; j<temp[i]; j++){
            System.out.print(c);

            if(j==(temp[i]-1)){
              System.out.println();
            }
          }
        }
      }
  }
}