/*
  @author: Christian Millán Soria
  info: ejercicio 3
*/

package tema7.c71.ej3;

import java.util.Scanner;

public class Ej3{
  public static void main(String[] args){
    // array auxiliar
      int[] aux=new int[10];
    
    // array final
      int[] finalArray=new int[10];

    // contador auxiliar
      int cont=0;

    /***********************************************/

    // números
      // scanner
        Scanner s=new Scanner(System.in);

      // obtención
        for(int i=0; i<10; i++){
          System.out.print("Introduce un número: ");
            aux[i]=s.nextInt();
        }

      // cierre de scanner
        s.close();

      // reordenamiento
        for(int i=9; i>=0; i--){
          finalArray[i]=aux[cont];
            cont++;
        }

    /***********************************************/

    // contenido final
      for(int i=0; i<10; i++){
        System.out.print("| "+finalArray[i]+" |");
      }
  }
}