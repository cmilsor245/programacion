/**
  @author: Christian Millán Soria
  @file: Ej17Func.java
  @info: ejercicio 17 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej17Func{
  public static void main(String[] args){
    // variable para el número a leer
      int num=1;

    /**********************************************/

    // números mientras no sea un 0
      // scanner
        Scanner s=new Scanner(System.in);

      // bucle
        do{
          // obtención
            System.out.print("Introduce un número: ");
              num=s.nextInt();

          /******************************/

          // comprobación de si es primo
            if(Varias.esPrimo(num)){
              System.out.println("El número "+num+" es primo.");
            }else{
              System.out.println("El número "+num+" no es primo.");
            }
        }while(num!=0);

      // cierre de scanner
        s.close();

    /**********************************************/

    // el bucle termina
      System.out.print("\nEl número introducido es un 0, por lo que termina el programa.");
  }
}