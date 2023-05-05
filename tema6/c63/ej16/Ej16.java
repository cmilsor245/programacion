/**
  @author: Christian Millán Soria
  @file: Ej16.java
  @info: ejercicio 16
*/

package tema6.c63.ej16;

public class Ej16{
  public static void main(String[] args){
    // declaración de variables y constantes
      final String[] figuras={"corazón", "diamante", "herradura", "campana", "limón"};
      String figura1, figura2, figura3;
      int monedas=0;

    /*******************************/

    // tirada de la tragaperras
      figura1=figuras[(int)(Math.random()*figuras.length)];
      figura2=figuras[(int)(Math.random()*figuras.length)];
      figura3=figuras[(int)(Math.random()*figuras.length)];

    /*******************************/

    // comprobar el resultado de la tirada
      if(figura1.equals(figura2)&&figura2.equals(figura3)){
        System.out.println(figura1+" "+figura2+" "+figura3);

        System.out.println("Enhorabuena, has ganado 10 monedas.");
          monedas=10;
      }else if(figura1.equals(figura2)||figura1.equals(figura3)||figura2.equals(figura3)){
        System.out.println(figura1+" "+figura2+" "+figura3);

        System.out.println("Bien, has recuperado tu moneda.");
          monedas=1;
      }else{
        System.out.println(figura1+" "+figura2+" "+figura3);

        System.out.println("Lo siento, has perdido.");
      }

    /*******************************/

    // imprimir el total de monedas
      System.out.print("Total de monedas: "+monedas+".");
  }
}