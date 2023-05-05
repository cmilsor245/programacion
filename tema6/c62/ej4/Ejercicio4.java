/*
  @author: Christian Millán Soria
  description: Tema 6 - Ejercicio 4
*/

package tema6.c62.ej4;

public class Ejercicio4{
  public static void main(String[] args){
    //Impresión por pantalla
      System.out.print("Números enteros aleatorios entre 0 y 10 (ambos inclusive): ");

    //Generación de los números e impresión por pantalla
      //Variable para cada número
        int num;

      for(int i=1; i<=10; i++){
        //Generación
          num=(int)(Math.random()*11);

        //Impresión por pantalla
          System.out.print(num+" ");
      }
  }
}