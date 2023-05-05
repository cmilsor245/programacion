/*
  @author: Christian Millán Soria
  info: ejercicio 2
*/

package tema7.c71.ej2;

public class Ej2{
  public static void main(String[] args){
    // creación del array
      char[] simbolo=new char[10];

      // asignación de valores
        simbolo[0]='a';
        simbolo[1]='x';
        simbolo[4]='@';
        simbolo[6]=' ';
        simbolo[7]='+';
        simbolo[8]='Q';

    // contenido de los elementos
      for(int i=0; i<10; i++){
        System.out.print("| "+simbolo[i]+" |");
      }
  }
}