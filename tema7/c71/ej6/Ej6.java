/*
  @author: Christian Millán Soria
  info: ejercicio 6
*/

package tema7.c71.ej6;

import java.util.Scanner;

public class Ej6{
  public static void main(String[] args){
    // array
      // creación
        int[] n=new int[15];

      // asignación de valores
        // scanner
          Scanner s=new Scanner(System.in);

        // obtención de los valores
          for(int i=0; i<15; i++){
            System.out.print("Introduce un número: ");
              n[i]=s.nextInt();
          }

        // cierre scanner
          s.close();

    /**********************************************************/

    // rotación
      // variable auxiliar
        int aux=n[14];
      
      /****************************/

        for(int i=14; i>0; i--){
          n[i]=n[i-1];
        }
        n[0]=aux;

    /**********************************************************/
    
    // contenido final
      for(int i=0; i<15; i++){
        System.out.print("| "+n[i]+" |");
      }
  }
}