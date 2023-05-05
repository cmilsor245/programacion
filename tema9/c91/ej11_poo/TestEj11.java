/**
  @author: Christian Millán Soria
  @file: TestEj11.java
  @info: clase "TestEj11" - ejercicio 11
*/

package tema9.c91.ej11_poo;

public class TestEj11{
  public static void main(String[] args){
    // instancias
      TarjetaRegalo t1=new TarjetaRegalo(100);
      TarjetaRegalo t2=new TarjetaRegalo(120);

    /********************************************/

    // output 1
      System.out.println(t1);
      System.out.println(t2);

      // método "gasta" para quitar saldo a las tarjetas
        t1.gasta(45.90);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55);

      System.out.println(t1);
      System.out.println(t2);

    /********************************************/

    // output 2
      // nueva instancia
      TarjetaRegalo t3=t1.fusionaCon(t2);

      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
  }
}