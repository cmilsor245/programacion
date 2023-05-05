/**
  @author: Christian Millán Soria
  @file: Ej10.java
  @info: ejercicio 10
*/

package tema6.c63.ej10;

public class Ej10{
  public static void main(String[] args){
    // array con los caracteres admitidos
      String[] caracteres={"*", "-", "=", ".", "|", "@"};

    /*******************************/

    // longitud máxima de cada línea
      int longitudMaxima=40;

    /*******************************/

      for(int i=1; i<=10; i++){
        // genera un carácter aleatorio
          String caracter=caracteres[(int)(Math.random()*caracteres.length)];

        // genera una longitud aleatoria entre 1 y "longitudMaxima"
          int longitud=(int)(Math.random()*longitudMaxima)+1;

        // Pinta la línea con el carácter y longitud generados
          for(int j=1; j<=longitud; j++){
            System.out.print(caracter);
          }
            System.out.println();
      }
  }
}