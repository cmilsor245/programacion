/**
  @author: Christian Millán Soria
  @file: Ej11.java
  @info: ejercicio 11
*/

package tema6.c63.ej11;

public class Ej11{
  public static void main(String[] args){
    // arrays para las notas y los contadores
      String[] notas={"suspenso", "suficiente", "bien", "notable", "sobresaliente"};
      int[] contador={0, 0, 0, 0, 0};

    /*************************************/

      for(int i=1; i<=20; i++){
        // genera una nota aleatoria
          String nota=notas[(int)(Math.random()*notas.length)];

        // muestra la nota en pantalla
          System.out.println("Nota "+i+": "+nota);

        // incrementa el contador correspondiente
          switch(nota){
              case "suspenso":
                contador[0]++;
              break;

              case "suficiente":
                contador[1]++;
              break;

              case "bien":
                contador[2]++;
              break;

              case "notable":
                contador[3]++;
              break;

              case "sobresaliente":
                contador[4]++;
              break;
          }
      }

    /*************************************/

    // Muestra el número de notas de cada tipo
      System.out.println("\nSuspensos: "+contador[0]);
      System.out.println("Suficientes: "+contador[1]);
      System.out.println("Bien: "+contador[2]);
      System.out.println("Notables: "+contador[3]);
      System.out.print("Sobresalientes: "+contador[4]);
  }
}