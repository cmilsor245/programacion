/**
  @author: Christian Millán Soria
  @file: TestEj1Arrays.java
  @info: programa principal del ejercicio 1 de arrays
*/

package tema9.c92.ej1_arrays;

import java.util.Scanner;

public class TestEj1Arrays{
  public static void main(String[] args){
    // array
      // creación
        Gato[] gatos=new Gato[4];

      /******************/

      // generación de instancias
        // scanner
          Scanner input=new Scanner(System.in);
            String color;// color que se le aplica a cada gato
            String raza;// raza que se le aplica a cada gato
            String sexo;// sexo que se le aplica a cada gato
            int edad;// edad que se le aplica a cada gato
            double peso;// peso que se le aplica a cada gato

        // bucle
          for(int i=0; i<4; i++){
            System.out.print("Color del nuevo gato: ");
              color=input.next();

            System.out.print("Raza del nuevo gato: ");
              raza=input.next();

            System.out.print("Sexo del nuevo gato (macho/hembra): ");
              sexo=input.next();

            System.out.print("Edad del nuevo gato (en años): ");
              edad=input.nextInt();

            System.out.print("Peso del nuevo gato (en kilogramos): ");
              peso=input.nextDouble();

            System.out.println("\n-------------------------------------------------------------");
            System.out.println();

            gatos[i]=new Gato(color, raza, sexo, edad, peso);
          }

      /*************************************/

      // info de todos los gatos
        for(int i=0; i<4; i++){
          System.out.println(gatos[i].toString(i+1));
        }
  }
}