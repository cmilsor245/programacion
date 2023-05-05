/*
  @author: Christian Millán Soria
  description: Tema 6 - Ejercicio 1
*/

package tema6.c62.ej1;

import java.util.Scanner;

public class Ejercicio1{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);
    
    //Tirar dados¿?
      System.out.print("¿Quieres tirar los 3 dados (S/N)? -> ");
        String c=s.nextLine();
          c=c.toLowerCase();

    //Comprobación
      if(c.equals("s")){
        //Tirada
          int tirada;

        //Suma de las tiradas
          int suma=0;

        //Bucle para tirar 3 veces
          for(int i=1; i<=3; i++){
            //Generación de las tiradas
              tirada=(int)((Math.random()*6)+1);

            //Impresión por pantalla
              System.out.println(tirada);

            //Operación de suma
              suma+=tirada;
          }

        //Impresión por pantalla
          System.out.print("La suma de las 3 tiradas mostradas arriba es "+suma+".");
      }else{
        if(c.equals("n")){
          //No se ejecuta el programa
            System.out.print("Los dados no se han tirado.");
        }else{
          //Valor incorrecto
            System.out.print("El valor introducido no es correcto.");
        }
      }
    
    //Cierre de Scanner
      s.close();
  }
}