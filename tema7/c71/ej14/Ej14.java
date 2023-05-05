/*
  @author: Christian Millán Soria
  info: ejercicio 14
*/

// este ejercicio no funciona

package tema7.c71.ej14;

import java.util.Scanner;

public class Ej14{
  public static void main(String[] args){
    // array
      // número de elementos
        int t=8;

      // creación
        String[] n=new String[t];

    /*****************************/

    // array para los colores predeterminados
      String[] colores={"rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    // array auxiliar
      String[] aux={};
      int j=0;

    /*****************************/

    // elementos
      // scanner
        Scanner s=new Scanner(System.in);

      // palabras
        for(int i=0; i<t; i++){
          System.out.print("Introduce una palabra: ");
            n[i]=s.nextLine();

          // a minúsculas
            for(int k=0; k<t; k++){
              n[k]=n[k].toLowerCase();
            }

          // comprobación de si es un color
            for(String c:colores){
              if(n[i].equals(c)){
                aux[j++]=c;
              }
            }
        }

      // cierre scanner
        s.close();

    /*****************************/

    // resto de palabras
      for(int i=0; i<t; i++){
        boolean esColor=false;

        for(String c:colores){
          if(n[i].equals(c)){
            esColor=true;
          }
        }

        if(!esColor){
          aux[j++]=n[i];
        }
      }

      /*****************************/

      // debug
        for(int i=0; i<t; i++){
          System.out.print("| "+aux[i]+" |");
        }
  }
}