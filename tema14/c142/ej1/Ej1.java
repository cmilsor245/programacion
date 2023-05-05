/**
  @author: Christian Millán Soria
  @file: Ej1.java
  @info: programa principal
*/

package tema14.c142.ej1;

import java.util.Scanner;

public class Ej1{
  public static void main(String[] args){
    // variables
      int maximoActual=Integer.MIN_VALUE;
      Scanner input=new Scanner(System.in);
        int numeroIntroducido=0;

    /************************************/

    // pedida de los 6 números
      for(int i=0; i<=5; i++){
        boolean esNumero=false;// comprobante

        // comprobación
          do{
            try{
              System.out.print("Introduce un número: ");
                numeroIntroducido=Integer.parseInt(input.next());

                esNumero=true;
            }catch(Exception e){
              System.out.println("El dato introducido no es un número. Prueba otra vez.");
            }
          }while(!esNumero);

        /*****************/

        // comprobación/conversión del valor máximo
          if(numeroIntroducido>maximoActual){
            maximoActual=numeroIntroducido;
          }
      }

      // muestra del valor máximo
        System.out.print("El valor máximo es: "+maximoActual);

    /************************************/

    // cierre de scanner
      input.close();
  }
}