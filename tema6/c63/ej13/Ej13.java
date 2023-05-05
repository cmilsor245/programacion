/**
  @author: Christian Millán Soria
  @file: Ej13.java
  @info: ejercicio 13
*/

package tema6.c63.ej13;

public class Ej13{
  public static void main(String[] args){
    // declaración de variables y constantes
      final int limiteDados=6;
      int dado1, dado2, contador=0;

    /*******************************/

    // tirada de los dados hasta que tengan el mismo valor
      do{
        // generación aleatoria de los valores de los dos dados
          dado1=(int)(Math.random()*limiteDados)+1;
          dado2=(int)(Math.random()*limiteDados)+1;

        // imprime los valores obtenidos en la tirada
          System.out.println("Tirada "+(++contador)+": dado 1 = "+dado1+", dado 2 = "+dado2);// "++contador" para que la primera tirada que aparece sea la 1 y no la 0
      }while(dado1!=dado2);

    /*******************************/

    // imprime el número total de tiradas necesarias para conseguir el resultado
      System.out.print("¡Han salido el mismo valor ("+dado1+") en la tirada "+contador+"!");
  }
}