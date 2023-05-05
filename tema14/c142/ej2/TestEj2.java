/**
  @author: Christian Millán Soria
  @file: TestEj2.java
  @info: programa principal
*/

package tema14.c142.ej2;

import java.util.Scanner;

import tema14.c142.ej2.classes.Gato;
import tema14.c142.ej2.exceptions.ExcepcionApareamientoImposible;

public class TestEj2{
  public static void main(String[] args){
    // scanner
      Scanner input=new Scanner(System.in);

    /************************************/

    // creación de los dos gatos a aparear y la posible nueva cría
      Gato gato1=null, gato2=null, cria;// no se especifica un sexo para los padres por ahora

    /************************************/

    // controlador de si se pueden aparear
      boolean apareados=false;

    /************************************/

    // bucle de petición de los datos de los posibles padres
      while(!apareados){
        // captura de posibles excepciones
          try{
            // petición de los datos del primer gato
              System.out.println("Introduce los datos del primer gato:");
                System.out.print("Color: ");
                  String color=input.nextLine();

                System.out.print("Raza: ");
                  String raza=input.nextLine();

                System.out.print("Sexo (macho/hembra): ");
                  String sexo=input.nextLine();

                System.out.print("Edad: ");
                  int edad=input.nextInt();

                System.out.print("Peso: ");
                  double peso=input.nextDouble();

                input.nextLine();// salto de línea

            /******************/

            // creación del primer gato
              gato1=new Gato(sexo);
              gato1.setColor(color);
              gato1.setRaza(raza);
              gato1.setEdad(edad);
              gato1.setPeso(peso);

            /******************/

            // petición de los datos del segundo gato
              System.out.println("\nIntroduce los datos del segundo gato:");
                System.out.print("Color: ");
                  color=input.nextLine();

                System.out.print("Raza: ");
                  raza=input.nextLine();

                System.out.print("Sexo (macho/hembra): ");
                  sexo=input.nextLine();

                System.out.print("Edad: ");
                  edad=input.nextInt();

                System.out.print("Peso: ");
                  peso=input.nextDouble();

                input.nextLine();// salto de línea

            /******************/

            // creación del segundo gato
              gato2=new Gato(sexo);
              gato2.setColor(color);
              gato2.setRaza(raza);
              gato2.setEdad(edad);
              gato2.setPeso(peso);

            /******************/

            // intento de aparear los gatos
              cria=gato1.apareaCon(gato2);
              apareados=true;

            /******************/

            // información del gato creado
              System.out.println("\nSe ha creado el siguiente gato:");
              System.out.println("Color: "+cria.getColor());
              System.out.println("Raza: "+cria.getRaza());
              System.out.println("Sexo: "+cria.getSexo());
              System.out.println("Edad: "+cria.getEdad());
              System.out.println("Peso: "+cria.getPeso());
          }catch(ExcepcionApareamientoImposible e){
            // se ha producido la excepción, se muestra el mensaje de error personalizado y se vuelven a pedir los datos de los gatos
              System.out.println("Error: "+e.getMessage()+"\n");
          }
      }
  }
}