/**
  @author: Christian Millán Soria
  @file: TestEj3Extra.java
  @info: programa principal
*/

package tema9.c93.ej4_extra;

import java.util.Scanner;

import tema9.c93.ej4_extra.cuentaBancaria.CuentaAhorro;
import tema9.c93.ej4_extra.cuentaBancaria.CuentaBancaria;
import tema9.c93.ej4_extra.cuentaBancaria.CuentaCorriente;

public class TestEj4Extra{
  public static void main(String[] args){
    // cuenta elegida
      int num;
      int emisora;
      int receptora;

    // dinero a ingresar/retirar/traspasar
      double dinero;

    /*************************************************************/

    // array de cuentas
      int t=4;

      CuentaBancaria[] cuentas=new CuentaBancaria[t];

      for(int i=0; i<t; i++){
        cuentas[i]=new CuentaCorriente(500+(int)(Math.random()*801+100));

        cuentas[i+=1]=new CuentaAhorro(500+(int)(Math.random()*801+100));
      }

    /*************************************************************/

    // scanner
      Scanner input=new Scanner(System.in);
        int opcion=0;

    /*************************************************************/

    // menú
      do{
        System.out.println("1. Listado");
        System.out.println("2. Mostrar información");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Retirar dinero");
        System.out.println("5. Traspasar dinero");
        System.out.println("6. Calcular el interés");
        System.out.println("7. Salir");

        System.out.print("Selecciona una opción: ");
          try{
            opcion=Integer.parseInt(input.next());
          }catch(NumberFormatException e){// si el valor introducido no coincide con int, se muestra un mensaje de error
            System.out.println("\nError: el valor introducido debe coincidir con una de las opciones del menú.");
          }

        /*******************************/

        switch(opcion){
          case 1:// listado
            for(int i=0; i<t; i++){
              System.out.println(cuentas[i].toString(i+1));
            }
          break;

          /*********************/

          case 2:// mostrar información
            System.out.print("Número de la cuenta sobre la que quieres obtener información: ");
              num=input.nextInt();

            System.out.println(cuentas[num-=1].informacionCuenta());
          break;

          /*********************/

          case 3:// ingresar dinero
            System.out.print("¿En qué cuenta quieres ingresar dinero? -> ");
              num=input.nextInt();

            System.out.print("¿Cuánto dinero quieres ingresar? -> ");
              dinero=input.nextDouble();

            cuentas[num-=1].ingresar(dinero);

            System.out.println("\nEl dinero ha sido ingresado. Puedes obtener la información de la cuenta número "+(num+=1)+" en la opción número 2 del menú principal.\n");
          break;

          /*********************/

          case 4:// retirar dinero
            System.out.print("¿En qué cuenta quieres retirar dinero? -> ");
              num=input.nextInt();

            System.out.print("¿Cuánto dinero quieres retirar? -> ");
              dinero=input.nextDouble();

            cuentas[num-=1].retirar(dinero);

            System.out.println("\nEl dinero ha sido retirado. Puedes obtener la información de la cuenta número "+(num+=1)+" en la opción número 2 del menú principal.\n");
          break;

          /*********************/

          case 5:// traspasar dinero
            System.out.print("Desde qué cuenta quieres traspasar dinero? -> ");
              emisora=input.nextInt();

            System.out.print("¿Y a qué cuenta quieres traspasar el dinero? -> ");
              receptora=input.nextInt();

            System.out.print("¿Cuánto dinero quieres traspasar? -> ");
              dinero=input.nextDouble();

            cuentas[emisora-=1].traspaso(cuentas[receptora-=1], dinero);

            System.out.println("\nEl dinero ha sido traspasado desde la cuenta número "+(emisora+=1)+" a la cuenta número "+(receptora+=1)+". Puedes obtener la información de estas cuentas en la opción número 2 del menú principal.\n");
          break;

          /*********************/

          case 6:// calcular interés
            System.out.print("¿De qué cuenta quieres calcular el interés? -> ");
              num=input.nextInt();

            if(cuentas[num-=1]instanceof CuentaCorriente){
              cuentas[num].calcularIntereses();
            }else{
              cuentas[num].calcularIntereses();
            }
          break;

          /*********************/

          case 7:
            System.out.println();
          break;

          /*********************/

          default:
            System.out.println("\nEsa opción no es correcta.\n");
          break;
        }
      }while(opcion!=7);
  }
}