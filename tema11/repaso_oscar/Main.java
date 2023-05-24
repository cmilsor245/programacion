import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import Funciones.FuncionesTexto;

/**
 * @author Daniel García Mesa
 * @author Óscar Mateo
 * @since 20/04/2023
 * 
 *        Programa java que utiliza funciones importadas  
 *        de la clase FuncionesTexto, cuales se ejecutan se decide
 *        introduciendo flags por línea de comandos al ejecutar 
 *        el programa
 * 
 */
public class Main {
  public static void main(String[] args){


    //Declaración de variables

    String nombreFichero="";
    String nombreNuevoFichero="";
    String palabra="ficheros";
    int num=0;
    ArrayList <String> argsList = new ArrayList<String>();
    ArrayList <String> texto = new ArrayList<String>();
    ArrayList <String> textoCopia = new ArrayList<String>();


    //Bucle que recorre args y lo copia en un arraylist, a la vez
    //comprueba si se pasan algunos flags para escribir algunas variables
    for(int i =0;i<args.length;i++){
      argsList.add(args[i]);
      if(args[i].equals("-f")){
        nombreFichero=args[i+1];
      }
      if(args[i].equals("-w")){
        nombreNuevoFichero=args[i+1];
      }
      if(args[i].equals("-n")){
        num=Integer.parseInt(args[i+1]);
      }
    }
    //Pasa el contenido del fichero leído a un arrayList

    texto=leerTodoFichero(nombreFichero);

    //Realiza una copia del texto en caso de querer restaurarlo

    textoCopia=texto;

    //En caso de que se pase -m como argumento, se ejecuta la función minuscula
    if(argsList.contains("-m")){
      texto=FuncionesTexto.minuscula(texto);
    }
    //En caso de que se pase -M como argumento, se ejecuta la función mayuscula
    if(argsList.contains("-M")){
      texto=FuncionesTexto.mayuscula(texto);
    }
    //En caso de que se pase -a como argumento, se ejecuta la función contarCadapalabraCant
    if(argsList.contains("-a")){
      FuncionesTexto.contarCadaPalabraCant(texto);
    }
    //En caso de que se pase -A como argumento, se ejecuta la función contarCadapalabraAlfa
    if(argsList.contains("-A")){
      FuncionesTexto.contarCadaPalabraAlfa(texto);
    }
    //En caso de que se pase -r como argumento, se ejecuta la función lineaRandom
    if(argsList.contains("-r")){
      texto=FuncionesTexto.lineaRandom(texto);
    }
    //En caso de que se pase -R como argumento, se ejecuta la función textoRandom
    if(argsList.contains("-R")){
      texto=FuncionesTexto.textoRandom(texto);
    }
    //En caso de que se pase -c como argumento, se ejecuta la función contarPalabras 
    if(argsList.contains("-c")){
      System.out.println("El número de apariciones de la palabra: "+palabra+" es:"+FuncionesTexto.contarPalabras(texto,palabra));
    }
    //En caso de que se pase -p como argumento, se ejecuta la función posicionesPalabra
    if(argsList.contains("-p")){
      FuncionesTexto.posicionesPalabra(texto, palabra);
    }
    //En caso de que se pase -l como argumento, se ejecuta la función lineaPalabra
    if(argsList.contains("-l")){
      FuncionesTexto.lineaPalabra(texto, palabra);
    }
    //En caso de que se pasen -a y -b como argumentos, se ejecuta la función borraPalabraNum
    if((argsList.contains("-b"))&&(argsList.contains("-n"))){
      FuncionesTexto.borraPalabraNum(texto,num, palabra);
    }//En caso de que se pase solo -b como argumento, se ejecuta la función borraPalabra
    else if(argsList.contains("-b")){
      FuncionesTexto.borrarPalabra(texto, palabra);
    }
    //En caso de que se pase -o como argumento, devuelve el texto a su estado original
    if(argsList.contains("-o")){
      texto=textoCopia;
    }
    //En caso de que se pase -w como argumento, se ejecuta la función nuevoArchivo
    if(argsList.contains("-w")){
      FuncionesTexto.nuevoArchivo(texto, nombreNuevoFichero);
    }

    //Finalmente imprime el contenido del arraylist texto

    imprimir(texto);
    
  }
  private static ArrayList<String> leerTodoFichero(String nombreFichero) {
    ArrayList<String> textoLeido = new ArrayList<>();
    try {
        BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
        String linea = br.readLine();
        while (linea != null) {
            String[] palabras = linea.split(" "); //Separa por espacios
            for(String palabra : palabras) {
                textoLeido.add(palabra);
            }
            textoLeido.add("\n");
            linea = br.readLine();
        }
        br.close();
    } catch (IOException e) {
        System.out.println("Error en fichero: " + e.getMessage());
    }
    return textoLeido;
}
private static void imprimir (ArrayList<String> texto) {
  for (String p: texto) {
    if(p.equals("\n")){
      System.out.print("\n");
    }else{
      System.out.print(p+" ");
    }
      
  }
}
}