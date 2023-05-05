/*
  @author: Christian Millán Soria
  description: Tema 6 - Ejercicio 6
*/

package tema6.c62.ej6;

import java.util.Scanner;

public class Ejercicio6{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);

    //Número introducido
    int num=0;

    //Estado
      boolean acertado=false;

    //Número generado
      int numGene=(int)(Math.random()*101);

    //Número de oportunidades
      int oport=5;

    //Impresión por pantalla
      System.out.println("Adivina el número.");

      while (!acertado&&(oport>0)){
        System.out.print("Introduce un número: ");
          num=s.nextInt();
          
          oport--;
          
          if((num>numGene)&&(oport>0)){
            System.out.println("El número es menor que "+num);
            System.out.println("Te quedan "+oport+" oportunidades.");
          }

          if((num<numGene)&&(oport>0)){
            System.out.println("El número es mayor que "+num);
            System.out.println("Te quedan "+oport+" oportunidades.");
          }

          if(num==numGene){
            acertado=true;
            System.out.println("¡Has acertado el número!");
          }
        }

        if(!acertado){
          System.out.println("No has acertado. El número era el "+numGene);
        }

    //Cierre de Scanner
      s.close();
  }
}