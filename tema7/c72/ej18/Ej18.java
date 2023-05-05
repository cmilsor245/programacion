/*
  @author: Christian Millán Soria
  info: ejercicio 18
*/

package tema7.c72.ej18;

public class Ej18{
  public static void main(String[] args){
    // mayores y menores que 100
      int auxiliares=10;

      int[] mayores=new int[auxiliares];
      int[] menores=new int[auxiliares];

      int mayoresCont=0;
      int menoresCont=0;

    /*************************************/

    // creación del array
      // número de elementos
        int t=10;

      // creación
        int[] array=new int[t];

    /*************************************/

    // asignación de valores aleatorios entre 0-100
      for(int i=0; i<t; i++){
        array[i]=(int)(Math.random()*201);

        // menores o iguales que 100 a un array diferente
          if(array[i]<=100){
            menores[menoresCont]=array[i];

            menoresCont++;
          }else{
            // mayores que 100 a un array diferente
              mayores[mayoresCont]=array[i];

              mayoresCont++;
          }
      }

    /*************************************/

    // índice
      int indice=0;

    /*************************************/

    // array original
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Indice ");

      for(int i=0; i<10; i++){
        System.out.printf("| %-3d ", indice);

        indice++;
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Valor  ");

      for(int i=0; i<10; i++){
        System.out.printf("| %-3d ", array[i]);
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.println();
      System.out.println();
      System.out.println();

    /*************************************/

    // reordenamiento
      // array final
        int[] arrayFinal=new int[t];

      // usados
        int mayoresUsados=0;
        int menoresUsados=0;

      // asignación de valores intercalados
        for(int i=0; i<t; i++){
          if(mayoresUsados<mayoresCont&&menoresUsados<menoresCont){
            // par=mayores que 100
            if(i%2==0){
              arrayFinal[i]=mayores[mayoresUsados];

              mayoresUsados++;
            }else{// impar=menores o iguales que 100
              arrayFinal[i]=menores[menoresUsados];

              menoresUsados++;
            }
          }else if(mayoresUsados<mayoresCont){// si ya no se cumple la anterior, es que un array está vacío
            arrayFinal[i]=mayores[mayoresUsados];

            mayoresUsados++;
          }else if(menoresUsados<menoresCont){
            arrayFinal[i]=menores[menoresUsados];

            menoresUsados++;
          }
        }

    /*************************************/

    // debug
      indice=0;

      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Indice ");

      for(int i=0; i<10; i++){
        System.out.printf("| %-3d ", indice);

        indice++;
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Valor  ");

      for(int i=0; i<10; i++){
        System.out.printf("| %-3d ", arrayFinal[i]);
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
  }
}