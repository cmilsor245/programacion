/**
  @author: Christian Millán Soria
  @file: Funciones.java
  @info: clase para las funciones importadas en el programa principal
*/

package functions;

import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class Funciones{
  /**
    @name: comprobarArchivo
    @info: comprueba si se ha especificado un archivo del que sacará información más adelante
    @param args: array con la lista de argumentos introducidos por teclado en la ejecución del programa
    @return archivo: variable que contiene el nombre del archivo con el que se va a trabajar
  */
    public static String comprobarArchivo(String[] args){
      boolean encontradaF=false;
      String archivo="";

      for(int i=0; i<args.length; i++){
        if(args[i].equals("-f")){
          encontradaF=true;

          if(i==args.length-1){// si la posición del elemento que contiene el argumento -f es igual a la última posición del array, no se ha especificado el nombre del archivo con el que se va a trabajar
            System.out.print("El argumento -f necesita un parámetro adicional. Uso correcto: java Palabras -f <archivo>");
            return null;
          }else{
            archivo=args[++i];
          }
        }
      }

      if(!encontradaF){// si no es ha introducido el argumento -f
        System.out.print("El argumento -f es obligatorio. Uso correcto: java Palabras -f <archivo>");
        return null;
      }
      
      return archivo;
    }

  /******************************************************************************************/

  /**
    @name: leerArchivo
    @info: almacena el contenido de un archivo y lo divide en líneas y palabras
    @param archivo: fichero del que se sacan las coincidencias con la palabra especificada
    @return palabras: arraylist que contiene las palabras separadas
  */
    public static ArrayList<String> leerArchivo(String archivo) throws IOException{
      ArrayList<String> palabras=new ArrayList<String>();
      BufferedReader br=new BufferedReader(new FileReader(archivo));
      String linea;

      /****************************************************************************************************************************/

      // bucle para separar la línea en palabras y almacenarlas en un arraylist
        while((linea=br.readLine())!=null){
          String[] palabrasLinea=linea.split(" ");

          for(String palabra:palabrasLinea){// for-each para recorrer en array
            palabras.add(palabra.toLowerCase());
          }

          palabras.add("\n");//* esta línea produce que se cuenten los saltos de línea al utilizar el argumento -a
        }

      /****************************************************************************************************************************/

      // cierre del buffer
        br.close();

      /****************************************************************************************************************************/

      return palabras;
    }

  /******************************************************************************************/

  /**
    @name:manejarArgumentos
    @info: switch de control para los argumentos introducidos por línea de comandos
    @param:
      - args: array que contiene todos los argumentos
      - palabras: arraylist de las palabras separadas
  */
    public static void manejarArgumentos(String[] args, ArrayList<String> palabras, String archivo){
      File archivoOriginalBackup=new File(archivo);// copia de seguridad para poder restaurar el archivo en el case del argumento -o

      for(int i=0; i<args.length; i++){
        switch(args[i]){
          case "-c":// palabra a contar
            // almacenaje de la palabra especificada
              String palabraAContar=Funciones.obtenerPalabraAContar(args, i);

            /******************/

            // almacenaje del número de coincidencias
              int coincidencias=Funciones.contarCoincidencias(palabras, palabraAContar);

            /******************/

            // comprobación de existencia e imprimir resultado
              Funciones.imprimirResultado(palabraAContar, coincidencias);
          break;

          /****************************************************************************************************************************/

          case "-a":// lista de palabras con sus coincidencias, ordenadas por coincidencias
            // arraylist para almacenar todas las palabras distintas del arraylist "palabras"
              ArrayList<String> palabrasDistintas=new ArrayList<String>();

            // arraylist para almacenar las veces que aparece cada palabra de "palabrasDistintas" en "palabras"
              ArrayList<Integer> contadorPalabras=new ArrayList<Integer>();

            /**********************/

            // recorrido del arrayList "palabras"
              for(String palabra:palabras){
                // si la palabra ya está en "palabrasDistintas", se suma una aparición en su contador correspondiente
                  if(palabrasDistintas.contains(palabra)){
                    int index=palabrasDistintas.indexOf(palabra);
                    int count=contadorPalabras.get(index);
                    contadorPalabras.set(index, count+1);
                  }else{// si la palabra no está en "palabrasDistintas", se le añade con un contador de una aparición
                    palabrasDistintas.add(palabra);
                    contadorPalabras.add(1);
                  }
              }

            /**********************/

            // se ordenan las palabras y sus contadores por el número de apariciones
              for(int j=0; j<contadorPalabras.size(); j++){
                  for(int k=0; k<contadorPalabras.size()-k-1; k++){
                    if(contadorPalabras.get(k)<contadorPalabras.get(k+1)){
                      int tempCount=contadorPalabras.get(k);

                      contadorPalabras.set(k, contadorPalabras.get(k+1));
                      contadorPalabras.set(k+1, tempCount);

                      String tempPalabra=palabrasDistintas.get(k);

                      palabrasDistintas.set(k, palabrasDistintas.get(k+1));
                      palabrasDistintas.set(k+1, tempPalabra);
                    }
                  }
              }

            /**********************/

            // se imprimen las palabras y sus contadores en orden descendente
              for(int l=0; l<palabrasDistintas.size(); l++){
                System.out.println(palabrasDistintas.get(l)+": "+contadorPalabras.get(l));
              }
          break;

          /****************************************************************************************************************************/

          case "-A":// lista de palabras con sus coincidencias, ordenadas alfabéticamente
            // variable y arrays necesarios
              String[] palabrasDiferentes=new String[palabras.size()];
              int[] contadorDePalabras=new int[palabras.size()];
              int numPalabrasDistintas=0;

            /*************************/

            // recorrido del arraylist "palabras"
              for(int j = 0; j<palabras.size(); j++){
                String palabra=palabras.get(j);

                // si la palabra ya está en "palabrasDiferentes", se suma una aparición en su contador correspondiente
                  int index=-1;
                  for(int k=0; k<numPalabrasDistintas; k++){
                    if(palabrasDiferentes[k].equals(palabra)){
                      index=k;
                      break;
                    }
                  }

                /**************/

                if(index>=0){
                  contadorDePalabras[index]++;
                }else{// si la palabra no está en "palabrasDiferentes", se le añade con un contador de una aparición
                  palabrasDiferentes[numPalabrasDistintas]=palabra;
                  contadorDePalabras[numPalabrasDistintas]=1;
                  numPalabrasDistintas++;
                }
              }

            /*************************/

            // se ordenan alfabéticamente las palabras y sus contadores
              for(int j=0; j<numPalabrasDistintas; j++){
                for(int k=j+1; k<numPalabrasDistintas; k++){
                  if(palabrasDiferentes[j].compareTo(palabrasDiferentes[k])>0){
                    String tempPalabra=palabrasDiferentes[j];
                    palabrasDiferentes[j]=palabrasDiferentes[k];
                    palabrasDiferentes[k]=tempPalabra;

                    int tempCount=contadorDePalabras[j];
                    contadorDePalabras[j]=contadorDePalabras[k];
                    contadorDePalabras[k]=tempCount;
                  }
                }
              }

            /*************************/

            // se imprimen las palabras y sus contadores en orden alfabético
              for(int j=0; j<numPalabrasDistintas; j++){
                System.out.println(palabrasDiferentes[j]+": "+contadorDePalabras[j]);
              }
          break;

          /****************************************************************************************************************************/

          case "-p":// posición en el texto de cada coincidencia de la palabra especificada//! funciona casi perfecto, pero no cuenta bien las coincidencias de la palabra especificada siempre
            // variables para buscar la palabra especificada después del argumento -c
              String palabraContada=null;
              boolean cEncontrado=false;

            // buscar la palabra a contar en los argumentos
              for(int j=0; j<args.length; j++){
                if(args[j].equals("-c")){
                  // almacenar la palabra a contar
                    palabraContada=args[j+1];
                    cEncontrado=true;
                    break;
                }
              }

            /******************/

            // validar si se encontró la palabra a contar
              if(!cEncontrado){
                System.out.println("Error: falta especificar la palabra a contar con el argumento -c");
                return;
              }

            // recorrer el archivo de texto línea por línea
              try{
                // variables necesarias
                  BufferedReader reader=new BufferedReader(new FileReader(archivo));
                  String linea=reader.readLine();
                  int posicion=0;
                  int lineaActual=1;

                /*****************/

                // mostrar la posición de cada coincidencia de la palabra especificada
                  while(linea!=null){
                    // buscar la palabra en la línea
                      if (linea.contains(palabraContada)){//! utilizo "contains" pero aún así no saca todas las coincidencias, solo las que no tienen nada alrededor
                        // obtener la posición de la palabra en la línea
                          int posicionPalabra=posicion+linea.indexOf(palabraContada);

                        // imprimir la posición de la palabra
                          System.out.println("La palabra \""+palabraContada+"\" aparece en la posición "+posicionPalabra+" de la línea "+lineaActual);
                      }

                    // sumar la longitud de la línea y el salto de línea siguiente
                      posicion+=linea.length()+1;
                      lineaActual++;

                    // leer la siguiente línea
                      linea=reader.readLine();
                  }

                /*****************/

                // cierre del buffer
                  reader.close();
              }catch(IOException e){
                System.out.println("Error al leer el archivo: "+e.getMessage());
              }
          break;

          /****************************************************************************************************************************/

          case "-l":// número de la línea de cada coincidencia de la palabra especificada//! me pasa algo parecido al case del argumento -p
            // buscar la palabra a contar
              String palabraContadaAdicional="";

              for (int j=0; j<args.length; j++){
                if(args[j].equals("-c")){
                  if(j+1<args.length){
                    palabraContadaAdicional=args[j+1];
                  }else{
                    System.out.println("Error: falta especificar la palabra a contar con el argumento -c");
                    return;
                  }

                  break;
                  }
              }

            /*****************/

            // recorrer el archivo de texto línea por línea
              try{
                // variables necesarias
                  BufferedReader reader=new BufferedReader(new FileReader(archivo));
                  String linea=reader.readLine();
                  int numLinea=1;

                /****************/

                // muestra del número de línea de cada coincidencia de la palabra especificada
                  while(linea!=null){
                    // dividir la línea en palabras
                      String[] palabrasLinea=linea.split(" ");

                    // buscar la palabra en la línea
                      for(int j=0; j<palabrasLinea.length; j++){
                        if(palabrasLinea[j].equals(palabraContadaAdicional)){
                          // imprimir el número de línea de la palabra
                            System.out.println("La palabra \""+palabraContadaAdicional+"\" aparece en la línea "+numLinea);
                        }
                      }

                      /***************/

                      // sumar 1 al número de línea
                        numLinea++;

                      /***************/

                      // leer la siguiente línea
                        linea=reader.readLine();
                  }

                /****************/

                // cierre del buffer
                  reader.close();
              }catch(IOException e){
                System.out.println("Error al leer el archivo: "+e.getMessage());
              }
          break;

          /****************************************************************************************************************************/

          case "-r":// desordena todas las palabras de cada línea aleatoriamente (cambio permanente)
            try{// comprobación de posibles errores a la hora de escribir en el archivo especificado en el argumento -f
              // variables necesarias
                BufferedReader reader=new BufferedReader(new FileReader(archivo));
                BufferedWriter writer=new BufferedWriter(new FileWriter(archivo+".temp"));// creación de un archivo temporal
                String linea;

              /******************/

              // recorrer el archivo de texto línea por línea
                while((linea=reader.readLine())!=null){
                  // dividir la línea en palabras
                    String[] palabrasLinea=linea.split(" ");

                  /************/

                  // desordenar aleatoriamente las palabras de la línea
                    for(int j=0; j<palabrasLinea.length; j++){
                      int k=(int)(Math.random()*palabrasLinea.length);// posición aleatoria dentro del tamaño de la línea actual
                      String temp=palabrasLinea[k];
                      palabrasLinea[k]=palabrasLinea[k];
                      palabrasLinea[k]=temp;
                    }

                  /************/

                  // escribir la línea desordenada en el archivo temporal
                    for(int k=0; k<palabrasLinea.length; k++){
                      writer.write(palabrasLinea[k]);

                      if(i!=palabrasLinea.length-1){
                        writer.write(" ");// hueco
                      }
                    }

                    writer.write("\n");// salto de línea
                }

              /******************/

              // cierre de los buffers
                reader.close();
                writer.close();

              // renombrar el archivo temporal como el archivo original
                File archivoOriginal=new File(archivo);
                archivoOriginal.delete();// se elimina el archivo original
                File archivoTemporal=new File(archivo+".temp");
                archivoTemporal.renameTo(archivoOriginal);// y se cambia el nombre al archivo temporal

              System.out.println("Las palabras en el archivo han sido desordenadas aleatoriamente.");
            }catch(IOException e){
              System.out.println("Error al leer o escribir el archivo: "+e.getMessage());
            }
          break;

          /****************************************************************************************************************************/

          case "-R":// desordena todas las palabras del texto completo aleatoriamente (cambio permanente)//! tengo problemas con los saltos de línea, no se mantienen correctamente como en el original, aunque no se si es el objetivo
            try{// comprobación de posibles errores a la hora de escribir en el archivo especificado en el argumento -f
              // leer el archivo y almacenar el contenido
                FileReader fileReader=new FileReader(archivo);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                String linea;
                ArrayList<String> arraylistDePalabras=new ArrayList<>();
                int numLineas=0;

                while((linea=bufferedReader.readLine())!=null){
                  numLineas++;
                  String[] palabrasLinea=linea.split(" ");

                  for(String palabra:palabrasLinea){
                    arraylistDePalabras.add(palabra);
                  }

                  arraylistDePalabras.add("\n");// añade un salto de línea justo donde está en el archivo original
                }

                bufferedReader.close();

              /******************/

              // desordenar las palabras
                for(int j=0; j<arraylistDePalabras.size(); j++){
                  int randomIndexToSwap=(int)(Math.random()*arraylistDePalabras.size());// posición completamente aleatoria
                  String temp=arraylistDePalabras.get(randomIndexToSwap);

                  arraylistDePalabras.set(randomIndexToSwap, arraylistDePalabras.get(j));
                  arraylistDePalabras.set(j, temp);
                }

              /******************/

              // escribir el archivo
                FileWriter fileWriter=new FileWriter(archivo);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                int numLineasEscritas=0;

                for(String palabra:arraylistDePalabras){
                  if(palabra.equals("\n")){
                    numLineasEscritas++;
                  }

                  bufferedWriter.write(palabra);
                }

                bufferedWriter.close();

                System.out.println("Se ha reordenado aleatoriamente el archivo.");
                System.out.println("Se mantuvieron " + numLineas + " líneas y se escribieron " + numLineasEscritas + " líneas.");// confirmación de que no se han eliminado saltos de línea originales
            }catch(IOException e){
              System.out.println("Error al leer o escribir el archivo: "+e.getMessage());
            }
          break;

          /****************************************************************************************************************************/

          case "-b":// borra cada aparición de la palabra especificada
            try{// comprobación de posibles errores a la hora de escribir en el archivo especificado en el argumento -f
              // leer el archivo
                FileReader fileReader=new FileReader(archivo);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                ArrayList<String> lineas=new ArrayList<>();
                String linea;

                while((linea=bufferedReader.readLine())!=null){
                  lineas.add(linea);
                }

                bufferedReader.close();

              /*****************/

              // buscar y reemplazar las ocurrencias
                String palabraABorrar="";

                for(int j=0; j<args.length; j++){
                  if(args[j].equals("-c")&&j<args.length-1){
                    palabraABorrar=args[j+1];
                    break;
                  }
                }

                for(int j=0; j<lineas.size(); j++){
                  String lineaActual=lineas.get(j);
                  lineaActual=lineaActual.replaceAll(palabraABorrar, "");// método para reemplazar todas las coincidencias con un string vacío, que simula que se borra la palabra

                  lineas.set(j, lineaActual);
                }

            /*****************/

              // escribir el archivo
                FileWriter fileWriter=new FileWriter(archivo);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

                for(String lineaModificada:lineas){
                  bufferedWriter.write(lineaModificada);
                  bufferedWriter.newLine();// método para nueva línea
                }

                bufferedWriter.close();

              System.out.println("Se ha borrado la palabra \""+palabraABorrar+"\" del archivo.");
            }catch(IOException e){
              System.out.println("Error al leer o escribir el archivo: "+e.getMessage());
            }
          break;

          /****************************************************************************************************************************/

          case "-n":// borra la coincidencia número n (n-ésima) de la palabra especificada en el argumento -b
            try{// comprobación de posibles errores a la hora de escribir en el archivo especificado en el argumento -f
              // leer el archivo
                FileReader fileReader=new FileReader(archivo);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                ArrayList<String> lineas=new ArrayList<>();
                String linea;

                while((linea=bufferedReader.readLine())!=null){
                  lineas.add(linea);
                }

                bufferedReader.close();

              /***************+**/

              // buscar y reemplazar la n-ésima ocurrencia de la palabra
                String palabraABorrar="";
                int n=0;

                for(int j=0; j<args.length; j++){
                  if(args[j].equals("-c")&&j<args.length-1){
                    palabraABorrar=args[j+1];
                  }else if(args[j].equals("-n")&&j<args.length-1){
                    n=Integer.parseInt(args[j+1]);
                  }
                }

                int ocurrenciasEncontradas=0;

                for(int j=0; j<lineas.size(); j++){
                  String lineaActual=lineas.get(j);
                  int posicionPalabra=lineaActual.indexOf(palabraABorrar);

                  while(posicionPalabra!=-1){// mientras se sigan encontrando ocurrencias de la palabra
                    ocurrenciasEncontradas++;

                    if(ocurrenciasEncontradas==n){// si se encuentra la n-ésima ocurrencia
                      lineaActual=lineaActual.substring(0, posicionPalabra)+lineaActual.substring(posicionPalabra+palabraABorrar.length());// se borra la n-ésima ocurrencia de la palabra

                      lineas.set(j, lineaActual);// guardar el cambio en la lista de líneas
                      break;
                    }

                    posicionPalabra=lineaActual.indexOf(palabraABorrar, posicionPalabra+1);// buscar la siguiente ocurrencia de la palabra
                  }
                }

                /***************+**/

                // escribir el archivo
                  FileWriter fileWriter=new FileWriter(archivo);
                  BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

                  for(String lineaModificada:lineas){
                    bufferedWriter.write(lineaModificada);
                    bufferedWriter.newLine();// método para nueva línea
                  }

                  bufferedWriter.close();

                /***************+**/

                if(ocurrenciasEncontradas<n){// si no se encontraron suficientes ocurrencias de la palabra
                  System.out.println("Solo se encontraron "+ocurrenciasEncontradas+" ocurrencias de la palabra \""+palabraABorrar+"\" en el archivo.");
                }else{
                  System.out.println("Se ha borrado la " + n + "-ésima ocurrencia de la palabra \"" + palabraABorrar + "\" del archivo.");
                }
            }catch(IOException e){
              System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
            }
          break;

          /****************************************************************************************************************************/

          case "-o":// restaura el texto a su estado original//! no me funciona correctamente, la idea del código es leer el contenido original del archivo desde un backup y reemplazar el contenido actual del archivo con este contenido original para restaurarlo a su estado original, sin embargo, al ejecutar el programa, el archivo no se restaura correctamente y el contenido original no se escribe en el archivo
            try{
              // leer el archivo de backup
                BufferedReader bufferedReader=new BufferedReader(new FileReader(archivoOriginalBackup));
                String linea;
                String contenidoBackup="";
        
                while((linea=bufferedReader.readLine())!=null){
                  contenidoBackup+=linea+"\n";// salto de línea
                }
        
                bufferedReader.close();
        
              /******************/
        
              // escribir el contenido del backup en el archivo original
                FileWriter fileWriter=new FileWriter(archivo);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

                bufferedWriter.write(contenidoBackup);
                bufferedWriter.close();
        
              /******************/
        
              System.out.println("El archivo ha sido restaurado a su estado original.");
            }catch(IOException e){
              System.out.println("Error al restaurar el archivo: "+e.getMessage());
            }
          break;

          /****************************************************************************************************************************/

          case "-w":// imprime el resultado de un argumento anterior y lo escribe en un nuevo archivo
            // se busca el siguiente argumento que será el nombre del archivo a crear
              String nuevoArchivo=args[i+1];

            /*********************/

            // escritura en el nuevo archivo
              try{
                // Creamos un FileWriter con el nombre del archivo
                  FileWriter fw = new FileWriter(nuevoArchivo);

                /*************/

                // recorre los argumentos anteriores al -w y se escriben en el nuevo archivo
                  for(int j=0; j<i; j++){
                    fw.write(args[j]+" ");
                    System.out.print(args[j]+" ");// imprime por pantalla el argumento para confirmar lo que se va a escribir
                  }

                /*************/

                // cierre del filewriter
                  fw.close();

                /*************/

                System.out.println("\nArchivo creado correctamente: "+nuevoArchivo);
              }catch(IOException e){
                System.err.println("Error al crear el archivo: "+e.getMessage());
              }
          break;
        }
      }
    }

  /******************************************************************************************/

  /**
    @name: obtenerPalabraAContar
    @info: obtiene el string que contiene la palabra especificada por línea de comandos en la ejecución del programa, almacenada en el array del main
    @param:
      - args: array del main
      - index: posición del elemento que coincide con el argumento -c
    @return args[index+1]: string almacenado en la posición siguiente a la posición del argumento -c
  */
    public static String obtenerPalabraAContar(String[] args, int index){
      if(index==args.length-1){
        System.out.print("El argumento -c necesita un parámetro adicional. Uso correcto: java Palabras -f <archivo> -c <palabra>");
        System.exit(0);
      }

      return args[index+1];
    }

  /******************************************************************************************/

  /**
    @name: contarCoincidencias
    @info: realiza un conteo de las coincidencias de la palabra especificada en un arraylist que contiene el contenido de un archivo
    @param:
      - palabras: arraylist de palabras del archivo
      - palabraAContar: palabra especificada
    @return contador: número de coincidencias de la palabra especificada
  */
    public static int contarCoincidencias(ArrayList<String> palabras, String palabraAContar){
      int contador=0;

      for(String palabra:palabras){
        if(palabra.contains(palabraAContar)){
          contador++;
        }
      }

      return contador;
    }

  /******************************************************************************************/

  /**
    @name: imprimirResultado
    @info: comprueba el número de coincidencias de la palabra especificada e imprime un resultado u otro según el conteo
    @param:
      - palabraAContar: palabra especificada
      - coincidencias: número contado de coincidencias de la palabra con el contenido de un archivo
  */
    public static void imprimirResultado(String palabraAContar, int coincidencias){
      if(coincidencias==0){
        System.out.println("La palabra \""+palabraAContar+"\" no se encontró en el archivo.");
      }else if(coincidencias==1){
        System.out.println("La palabra \""+palabraAContar+"\" se encontró en el archivo una única vez.");
      }else{
        System.out.println("La palabra \""+palabraAContar+"\" se encontró "+coincidencias+" veces en el archivo.");
      }
    }
}