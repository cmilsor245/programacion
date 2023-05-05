/*
  @author: Christian Millán Soria
  description: Tema 6 - Ejercicio 5
*/

package tema6.c62.ej5;

public class Ejercicio5{
  public static void main(String[] args){
    //Impresión por pantalla
      System.out.print("Números enteros aleatorios entre 100 y 199 (ambos inclusive): ");

    //Número a mostrar
      int num;

    //Máximo  y mínimo predeterminados
      int max=100;

      int min=199;

    //Variable para la media
      int total=0;

    //Generación de los 50 números
      for(int i=1; i<=50; i++){
        //Generación de números
          num=(int)(Math.random()*100)+100;//Se generan números hasta el 100 (sin incluirse el 100) y se les suma 100 unidades

        //Impresión por pantalla
          System.out.print(num+" ");

        //Comprobación del máximo
          if(num>max){
            max=num;
          }

        //Comprobación del mínimo
          if(num<min){
            min=num;
          }

        //Incremento del total
          total+=num;
      }

    //Impresión por pantalla
      System.out.println("");

      System.out.print("El máximo de entre todos estos números es el "+max+" mientras que el mínimo es el "+min+", y la suma de todos estos números da como resultado "+total+".");
  }
}