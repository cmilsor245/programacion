/**
  @author: Christian Millán Soria
  @file: Ej15.java
  @info: ejercicio 15
*/

package tema6.c63.ej15;

public class Ej15{
  public static void main(String[] args){
    // declaración de variables y constantes
      final String[] notas={"do", "re", "mi", "fa", "sol", "la", "si"};
      int notasMelodia=((int)(Math.random()*7)+1)*4;
      int compases=notasMelodia/4;
      String melodia="";

    /*******************************/

    // generación aleatoria de la melodía
      for(int i=1; i<=notasMelodia; i++){
        melodia+=notas[(int)(Math.random()*7)]+" ";

        // separación de los compases mediante la barra vertical
          if(i%4==0&&i!=notasMelodia){
            melodia+=" | ";
          }
      }

    /*******************************/

    // añade la última nota igual que la primera
      melodia+=" "+melodia.substring(0, 2);

    /*******************************/

    // imprime la melodía generada
      System.out.println(melodia+" ||");
  }
}