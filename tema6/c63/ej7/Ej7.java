/**
  @author: Christian Millán Soria
  @file: Ej7.java
  @info: ejercicio 7
*/

package tema6.c63.ej7;

public class Ej7{
  public static void main(String[] args){
    // columnas
      int columnas=3;

    /*************************************/

    // Generar las apuestas para cada partido
      for(int fila=1; fila<=14; fila++){
          // imprimir el número de fila
            System.out.printf("%2d. |", fila);

          /*********************/

          // generar las columnas de apuestas para este partido
            for(int apuesta=1; apuesta<=columnas; apuesta++){
              // generar un número aleatorio entre 1 y 3 para el resultado del partido
                int resultadoPartido=(int)(Math.random()*3)+1;

              // convertir el resultado en una cadena que representa la apuesta
                String resultado="";

                if(resultadoPartido==1){
                  resultado="1  |";
                }else if(resultadoPartido==2){
                  resultado="  2|";
                }else{
                  resultado=" X |";
                }

              // imprimir la apuesta
                System.out.print(resultado);
            }

          /*********************/

          // imprimir un salto de línea para pasar a la siguiente fila
            System.out.println();
      }

    /*************************************/

    // generar el pleno al 15
      System.out.print("\nPleno al 15 - Local...");

    /*******************/

    // generar un número aleatorio entre 0 y 3 para los goles del equipo local
      int golesLocal=(int)(Math.random()*4);

    /*******************/

    // asignar el valor correspondiente a la variable golesLocalString
      String golesLocalString="";

      if(golesLocal<3){
        golesLocalString=Integer.toString(golesLocal);
      }else{
        golesLocalString="M";
      }

      // imprimir los goles o "M" si no se marcaron más de 2 goles
        System.out.print(golesLocalString);

      System.out.print("   Visitante...");

    // generar un número aleatorio entre 0 y 3 para los goles del equipo visitante
      int golesVisitante=(int)(Math.random()*4);

    /*******************/

    // asignar el valor correspondiente a la variable golesVisitanteString
      String golesVisitanteString="";

      if(golesVisitante<3){
        golesVisitanteString=Integer.toString(golesVisitante);
      }else{
        golesVisitanteString="M";
      }

      // imprimir los goles o "M" si no se marcaron más de 2 goles
        System.out.print(golesVisitanteString);
  }
}