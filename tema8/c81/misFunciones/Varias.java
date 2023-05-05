package tema8.c81.misFunciones;

import java.util.Scanner;

public class Varias{
  /**
    @info: función para realizar la multiplicación de 2 números
    @param:
      - "a": primer número
      - "b": segundo número
    @return result: resultado de la multiplicación
  */
    public static double multiplica(double a, double b){
      return a*b;

      /*
        otra forma de hacerlo es almacenar el resultado en una variable:
          // resultado
            double result=a*b;

          // return
            return result;
      */
    }

  /***************************************************/

  /**
    @info: función para sacar el menor de entre dos valores
    @param:
      - "a": primer número
      - "b": segundo número
    @return:
      - "a": el primer número es el menor
      - "b": el segundo número es el menor
  */
    public static int minimo(int a, int b){
      if(a<b){
        return a;
      }else{
        return b;
      }
    }

  /***************************************************/

  /**
    @info: función para averiguar el signo de un número
    @param a: primer número
    @return signo:
      - "-1": el número es negativo
      - "0": el número es igual a 0
      - "1": el número es positivo
  */
    public static int dimeSigno(int a){
      // variable para el signo
        int signo;

      /******************/

      // comprobación
        if(a<0){
          signo=-1;
        }else if(a==0){
          signo=0;
        }else{
          signo=1;
        }

      /******************/

      // return
        return signo;
    }

  /***************************************************/

  /**
    @info: función para números capicúa
    @param x: número
    @return:
      - "true": el número es capicúa
      - "false": el número no es capicúa
  */
    public static boolean esCapicua(int x){
      // variable auxiliar
        int aux=x;

      /****************/

      // número invertido
        int rev=0;

      /****************/

      // volteo
        while(aux!=0) {
            rev=rev*10+aux%10;
            aux/=10;
        }

      /****************/

      // comprobación
        if(x==rev){
          return true;
        }else{
          return false;
        }
    }

  /***************************************************/

  /**
    @info: función para números primos
    @param x: número
    @return:
      - "true": el número es primo
      - "false": el número no es primo
  */
    public static boolean esPrimo(int x){
      // si es 1 o menor, no es primo
        if(x<=1){
          return false;
        }

      /********************/
    
      // comprobación de divisores
        for(int i=2; i<=x/2; i++){
          if(x%i==0){
            return false;
          }
        }

      /********************/

      // de forma predeterminada es "true"
        return true;
    }

  /***************************************************/

  /**
    @info: función para el siguiente número primo
    @param x: número
    @return num: variable que contiene el siguiente número primo
  */
    public static int siguientePrimo(int x){
      // siguiente número
        int num=x+1;

      /*********************/

      // bucle infinito
      while(true){
        // de forma predeterminada, el número es primo
          boolean primo=true;

        /**************/

        // comprobación de si es primo
          for(int i=2; i<=(num/2); i++){
            // si no es primo, se acaba el bucle "for" y se sigue ejecutando el bucle "while"
              if(num%i==0){
                primo=false;

                break;
              }
          }

        /**************/

        // si el número sacado del "for" es primo, se devuelve al "main"
          if(primo){
            return num;
          }

        /**************/

        // si no es primo, no se devuelve al "main" y se aumenta en 1 unidad
          num++;
      }
    }

  /***************************************************/

  /**
    @info: función para obtener la potencia
    @param:
      - "x": base
      - "y": exponente
    @return resultado: resultado de la potencia de la base y el exponente introducidos por teclado
  */
    public static int potencia(int x, int y){
      // variable acumulador
        int acu=1;

      /*************/

      // se realiza tantas veces como indica el exponente
        for(int i=0; i<y; i++){
          acu*=x;
        }

      /*************/

      // return
        return acu;
    }

  /***************************************************/

  /**
    @info: función para número de dígitos
    @param x: número
    @return numDigi: número de dígitos que tiene el número introducido
  */
    public static int digitos(int x){
      // variable para el total de dígitos
        int numDigi=0;

      /***************/

      // conteo
        // bucle
          while(x>0){
            x/=10;

            numDigi++;
          }

      /***************/

      /*
        alternativa: convertirlo a string y sacar su longitud:
          numDigi=String.valueOf(x).length();
      */

      /***************/

      // return
        return numDigi;
    }

  /***************************************************/

  /**
    @info: función para número invertido
    @param x: número
    @return rev: número invertido
  */
    public static int voltea(int x){
      // variable auxiliar
        int aux=x;

      /***************/

      // número invertido
        int rev=0;

      /***************/

      // volteo
        while(aux!=0){
          rev=rev*10+aux%10;
          aux/=10;
        }

      /***************/

      // return
        return rev;
    }

  /***************************************************/

    /**
      @info: función para calcular la suma desde 1 a "n"
      @param n: número "n"
      @return suma: suma de los enteros de 1 a "n"
    */
      public static int suma1aN(int n){
        // variable acumuladora
          int suma=0;

        /***************/

        // bucle
          for(int i=1; i<=n; i++){
            suma+=i;
          }

        /***************/

        // return
          return suma;
      }

  /***************************************************/

    /**
      @info: función para calcular el producto de los factoriales desde 1 a "n"
      @param n: número "n"
      @return producto: producto resultante de todos los factoriales de 1 a "n"
    */
      public static int producto1aN(int n){
        // variable para el resultado
          int producto=1;

        // bucle para obtener el resultado
          for(int i=1; i<=n; i++){
            producto*=i;
          }

        // return
          return producto;
      }

  /***************************************************/

    /**
      @info: función para obtener el valor intermedio entre 1 y "n"
      @param n: número "n"
      @return intermedio: valor intermedio de los enteros de 1 a "n"
    */
      public static double intermedio1aN(int n){
        // diferencia (números que se deben sumar a 1 para llegar a "n")
          int dif=0;

        /*************/

        // cálculo de la diferencia
          for(int i=1; i<n; i++){
            dif++;
          }

        /*************/

        // diferentes casos
          if(dif==0){
            return 0;
          }else if(dif==1){
            return 1;
          }else{
            // valor intermedio
              double intermedio=(1+n)/2.0;

            // return
              return intermedio;
          }
      }

  /***************************************************/

    /**
    @info: función para sacar el mayor de entre dos valores
    @param:
      - "a": primer número
      - "b": segundo número
    @return:
      - "a": el primer número es el mayor
      - "b": el segundo número es el mayor
  */
    public static int maximo(int a, int b){
      if(a>b){
        return a;
      }else{
        return b;
      }
    }

  /***************************************************/

  /**
    @info: función para tabla de multiplicar
    @param x: número del que se sca la tabla de multiplicar
  */
    public static void tablaMultiplicar(int x){
      // variable auxiliar para resetear el valor
        int aux=x;

      /***************/

      // bucle de 10 elementos
        for(int i=1; i<=10; i++){
          System.out.println("- "+x+"*"+i+"= "+(x*=i));

          // reseteo
            x=aux;
        }
    }

  /***************************************************/

  /**
    @info: función para imprimir un triángulo de n líneas
    @param:
      - "c": carácter a utilizar
      - "n": número de líneas
  */
    public static void printTiangulo(char c, int n){
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
          System.out.print(" ");
        }

        for(int j=1; j<=2*i-1; j++){
          System.out.print(c);
        }

        System.out.println();
      }
    }

  /***************************************************/

  /**
    @info: función para averiguar la letra correspondiente a un dni
    @param x: dni
    @return letra: letra correspondiente
  */
    public static char obtenerLetra(int dni){
      // resto del dni
        int resto = dni % 23;

      /***************/

      // variable para la letra
        char letra;

      /***************/

      // switch para cada letra
        switch(resto){
          case 0:
            letra='T';
          break;

          case 1:
            letra='R';
          break;

          case 2:
            letra='W';
          break;

          case 3:
            letra='A';
          break;

          case 4:
            letra='G';
          break;

          case 5:
            letra='M';
          break;

          case 6:
            letra='Y';
          break;

          case 7:
            letra='F';
          break;

          case 8:
            letra='P';
          break;

          case 9:
            letra='D';
          break;

          case 10:
            letra='X';
          break;

          case 11:
            letra='B';
          break;

          case 12:
            letra='N';
          break;

          case 13:
            letra='J';
          break;

          case 14:
            letra='Z';
          break;

          case 15:
            letra='S';
          break;

          case 16:
            letra='Q';
          break;

          case 17:
            letra='V';
          break;

          case 18:
            letra='H';
          break;

          case 19:
            letra='L';
          break;

          case 20:
            letra='C';
          break;

          case 21:
            letra='K';
          break;

          case 22:
            letra='E';
          break;

          default:
            letra=' ';
        }

      /***************/

      // return
        return letra;
    }

  /***************************************************/

  /**
    @info: función para imprimir un menú de dos opciones ("circunferencia" y "área")
    @return opcion: opción seleccionada
  */
    public static int menu(){
      // menú
        System.out.println("1. Circunferencia");
        System.out.println("2. Area");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        System.out.print("\nElige una opción: ");

      /******************/

      // obtención de la opción
        Scanner opcionScanner=new Scanner(System.in);
          int opcion=opcionScanner.nextInt();

      /******************/

      // return
        return opcion;
    }

  /***************************************************/

  /**
    @info: función para obtener un radio y retornarlo
    @return radio: radio introducido
  */
    public static double pideRadio(){
      // print
        System.out.print("Introduce el radio: ");

      /******************/

      // obtención
        Scanner radioScanner=new Scanner(System.in);
          double radio=radioScanner.nextDouble();

      /******************/

      // return
        return radio;
    }
}