/*
  @author: Christian Millán Soria
  info: ejercicio 4
*/

package tema7.c71.ej4;

public class Ej4{
  public static void main(String[] args){
    // arrays
      // primero
        int[] numero=new int[20];

      // segundo
        int[] cuadrado=new int[20];

      // tercero
        int[] cubo=new int[20];

    /*****************************************/

    // valores del array "numero"
      for(int i=0; i<20; i++){
        numero[i]=(int)(Math.random()*101);
      }

    /*****************************************/

    // valores del array "cuadrado"
      for(int i=0; i<20; i++){
        cuadrado[i]=(int)(Math.pow((numero[i]), 2));
      }

    /*****************************************/

    // valores del array "cubo"
      for(int i=0; i<20; i++){
        cubo[i]=(int)(Math.pow((numero[i]), 3));
      }

    /*****************************************/

    // debug
      for(int i=0; i<20; i++){
        System.out.println("| "+numero[i]+" || "+cuadrado[i]+" || "+cubo[i]+" |");
      }
  }
}