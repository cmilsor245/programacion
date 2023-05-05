/**
  @author: Christian Millán Soria
  @file: TestEj9.java
  @info: clase "TestEj9" - ejercicio 9
*/

package tema9.c91.ej9_poo;

public class TestEj9{
  public static void main(String[] args){
    // instancias
      Movil m1=new Movil("678 11 22 33", "rata");
      Movil m2=new Movil("644 74 44 69", "mono");
      Movil m3=new Movil("622 32 89 09", "bisonte");

    /***************************************/

    // output
      System.out.println(m1.toString());
      System.out.println(m2.toString());

      // aumento del tiempo de conversación del primer, segundo y tercer móvil
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);

      System.out.println(m1.toString());
      System.out.println(m2.toString());
      System.out.print(m3.toString());
  }
}