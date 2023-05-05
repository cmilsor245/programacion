/**
  @author: Christian Millán Soria
  @file: Ej19.java
  @info: ejercicio 19
*/

package tema6.c63.ej19;

public class Ej19{
  public static void main(String[] args){
    // declaración de variables
      int num, maxPar=Integer.MIN_VALUE, minImpar=Integer.MAX_VALUE, suma=0, contador=0;

    /****************************************/

    // generar 50 números aleatorios
      for(int i=0; i<50; i++){
          num=(int)(Math.random()*301)-100;// números aleatorios entre -100 y 200
            System.out.print(num+" ");

          /**********************/

          // actualizar máximo de los pares y mínimo de los impares
            if(num%2==0&&num>maxPar){
              maxPar=num;
            }else if(num%2!=0&&num<minImpar){
              minImpar=num;
            }

          /**********************/

          // actualizar suma y contador para calcular la media
            suma+=num;
            contador++;
      }

    // calcular media
      double media=(double)suma/contador;

    /****************************************/

    // debug
      if(maxPar==Integer.MIN_VALUE){
        System.out.println("\n\nNo hay números pares");
      }else{
        System.out.println("\n\nMáximo de los pares: "+maxPar);
      }

      /***************/

      if(minImpar==Integer.MAX_VALUE){
        System.out.println("No hay números impares");
      }else{
        System.out.println("Mínimo de los impares: "+minImpar);
      }

      /***************/

      System.out.print("Media de los números generados: "+media);
  }
}