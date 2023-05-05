/**
  @author: Christian Millán Soria
  @file: TestEj3.java
  @info: test ejercicio 3
*/

package tema9.c91.ej3_poo;

public class TestEj3{
  public static void main(String[] args){
    // instancia de las clases creadas
      Mamifero mamifero1=new Mamifero("Firulais", 2);
      Ave ave1=new Ave("Piolín", 5);
      Gato gato1=new Gato("Garfield", 7);
      Perro perro1=new Perro("Toby", 4);
      Pinguino pinguino1=new Pinguino("Tux", 3);
      Lagarto lagarto1=new Lagarto("Godzilla", 50);

    /*****************************************/

    // interacciones
      // mamífero
        System.out.println("--- Métodos de la clase \"Mamifero\" ---");
        mamifero1.amamantar();
        mamifero1.correr();
        System.out.println("Nombre del mamífero: "+mamifero1.getNombre());
        System.out.println("Edad del mamífero: "+mamifero1.getEdad());

      // ave
        System.out.println("\n--- Métodos de la clase \"Ave\" ---");
        ave1.volar();
        ave1.picotear();
        System.out.println("Nombre de la ave: "+ave1.getNombre());
        System.out.println("Edad de la ave: "+ave1.getEdad());

      /******************/

      // gato
        System.out.println("\n--- Métodos de la clase \"Gato\" ---");
        gato1.maullar();
        gato1.arañar();
        System.out.println("Nombre del gato: "+gato1.getNombre());
        System.out.println("Edad del gato: "+gato1.getEdad());

      /******************/

      // perro
        System.out.println("\n--- Métodos de la clase \"Perro\" ---");
        perro1.ladrar();
        perro1.morder();
        System.out.println("Nombre del perro: "+perro1.getNombre());
        System.out.println("Edad del perro: "+perro1.getEdad());

      /******************/

      // pingüino
        System.out.println("\n--- Métodos de la clase Pinguino ---");
        pinguino1.nadar();
        pinguino1.deslizarse();
        System.out.println("Nombre del pingüino: "+pinguino1.getNombre());
        System.out.println("Edad del pingüino: "+pinguino1.getEdad());

      /******************/

      // lagarto
        System.out.println("\n--- Métodos de la clase Lagarto ---");
        lagarto1.tomarElSol();
        lagarto1.cazar();
        System.out.println("Nombre del lagarto: "+lagarto1.getNombre());
        System.out.println("Edad del lagarto: "+lagarto1.getEdad());
  }
}