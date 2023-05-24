package Funciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Daniel García Mesa
 * @author Óscar Mateo
 * @since 24/04/2023
 * 
 *        Clase que contiene funciones que modifican el texto
 * 
 */
public class FuncionesTexto {
   /**
  * Función que borra la aparicion de una palabra FUNCIONA
  */
  public static void borrarPalabra(ArrayList<String> texto, String palabra) {
    for(int i=0;i<texto.size();i++){
      if(texto.get(i).toLowerCase().equals(palabra.toLowerCase())){
        texto.remove(i);//Elimina la palabra
      }
    }
  }
      /**
  * Función que borra la aparicion "n" de una palabra NO FUNCIONA BIEN
  */
  public static void borraPalabraNum(ArrayList<String> texto, int num, String palabra){
    int cuenta=0;
    for(int i=0;i<texto.size();i++){
      if(texto.get(i).equalsIgnoreCase(palabra)){
        cuenta++;
            if (cuenta == num) {
                texto.remove(i);
                i--;
            }
      }
    }
  }
  /**
   * Función que pasa el contenido del archivo a minúscula
   */
  public static ArrayList<String> minuscula(ArrayList<String> texto) {
    ArrayList<String> texto1 = new ArrayList<String>();
    for (int i = 0; i < texto.size(); i++) {
      texto1.add(texto.get(i).toLowerCase());
    }
    return texto1;
  }
  /**
  * Función que pasa el contenido del archivo a mayuscula
  */
  public static ArrayList<String> mayuscula(ArrayList<String> texto){

    System.out.println("El texto pasado a mayuscula es: ");
    ArrayList<String> texto1 = new ArrayList<String>();
    for (int i = 0; i < texto.size(); i++) {
      texto1.add(texto.get(i).toUpperCase());
    }
    return texto1;
  }

  /**
   * Función que cuenta las ocurrencias de una palanbra
   */
  public static int contarPalabras(ArrayList<String> texto, String palabra) {
    int ocurrencias = 0;
    for (int i = 0; i < texto.size(); i++) {
      if (palabra.toLowerCase().equals(texto.get(i).toLowerCase())) {
        ocurrencias++;
      }
    }
    return ocurrencias;
  }

  /**
   * Función que cuenta cuantas veces se repite cada palabra distinta del texto
   * 
   * @param texto
   */
  public static void contarCadaPalabra(ArrayList<String> texto) {
    ArrayList<String> palabrasUsadas = new ArrayList<String>();
    for (int i = 0; i < texto.size(); i++) {
      if (!palabrasUsadas.contains(texto.get(i))) {
        System.out
            .println("La palabra " + texto.get(i) + " aparece " + contarPalabras(texto, texto.get(i)) + " veces.");
        palabrasUsadas.add(texto.get(i));
      }
    }
  }

  /**
   * Función que cuenta cuantas veces se repite cada palabra distinta del texto
   * ordenando por su cantidad
   * 
   * @param texto
   */
  public static void contarCadaPalabraCant(ArrayList<String> texto) {
    ArrayList<String> palabrasUsadas = new ArrayList<String>();
    ArrayList<Integer> cantidad = new ArrayList<Integer>();
    for (int i = 0; i < texto.size(); i++) {
      if (!palabrasUsadas.contains(texto.get(i).toLowerCase())) {
        cantidad.add(contarPalabras(texto, texto.get(i).toLowerCase()));
        palabrasUsadas.add(texto.get(i).toLowerCase());
      }
    }
    // Ordenar ambos arrays a partir de las cantidades
    boolean cambiado = true;
    while (cambiado) {
      cambiado = false;
      for (int i = 0; i < cantidad.size() - 1; i++) {
        if (cantidad.get(i) < cantidad.get(i + 1)) {
          int auxApariciones = cantidad.get(i);
          cantidad.set(i, cantidad.get(i + 1));
          cantidad.set(i + 1, auxApariciones);

          String auxPalabra = palabrasUsadas.get(i);
          palabrasUsadas.set(i, palabrasUsadas.get(i + 1));
          palabrasUsadas.set(i + 1, auxPalabra);

          cambiado = true;
        }
      }
    }
    // Imprimir
    for (int i = 0; i < palabrasUsadas.size(); i++) {
      System.out.println("La palabra " + palabrasUsadas.get(i) + " aparece " + cantidad.get(i) + " veces.");
    }
  }

  /**
   * Función que cuenta cuantas veces se repite cada palabra distinta del texto en
   * orden alfabético
   * 
   * @param texto
   */
  public static void contarCadaPalabraAlfa(ArrayList<String> texto) {
    ArrayList<String> palabrasUsadas = new ArrayList<String>();
    Collections.sort(texto);
    for (int i = 0; i < texto.size(); i++) {
      if (!palabrasUsadas.contains(texto.get(i).toLowerCase())) {
        System.out
            .println("La palabra " + texto.get(i) + " aparece " + contarPalabras(texto, texto.get(i).toLowerCase()) + " veces.");
        palabrasUsadas.add(texto.get(i).toLowerCase());
      }
    }
  }

  /**
   * Devuelve la posición en el texto de cada aparición de la palabra
   * que se pasa por parámetro, con los números separados por comas.
   * 
   * @param texto
   * @param palabra
   * 
   * 
   */
  public static void posicionesPalabra(ArrayList<String> texto, String palabra) {
    System.out.println("Las posiciones en las que aparece " + palabra + " son:");
    for (int i = 0; i < texto.size(); i++) {
      if (palabra.toLowerCase().equals(texto.get(i).toLowerCase())) {
        System.out.print(i + ", ");
      }
    }
    System.out.println("");
  }

  /**
   * Devuelve el número de línea en la que se encuentra
   * cada aparición de la palabra que se pasa por parámetro.
   * 
   * @param texto
   * @param palabra
   * 
   */
  public static void lineaPalabra(ArrayList<String> texto, String palabra) {
    int numLinea = 0;
    System.out.print("Las lineas en las que aparece " + palabra + " son: ");
    for (int i = 0; i < texto.size(); i++) {
      if (texto.get(i) == "\n") {
        numLinea++;
      }
      if (palabra.toLowerCase().equals(texto.get(i).toLowerCase())) {
        System.out.print(numLinea + "  ");
      }
    }
    System.out.println("");
  }
  /**
   * Función que desordena el texto introducido
   * 
   * @param texto sin desordenar
   * @return el texto desordenado
   */
  public static ArrayList<String> textoRandom(ArrayList<String> texto) {
    Collections.shuffle(texto);
    return texto;
  }

  /**
   * Función que desordena por lineas el texto introducido
   * 
   * @param texto sin desordenar
   * @return el texto desordenado por lineas
   */
  public static ArrayList<String> lineaRandom(ArrayList<String> texto) {

    ArrayList<String> random = new ArrayList<>();
    ArrayList<String> linea = new ArrayList<>();

    for (String palabra : texto) {
      if (palabra != "\n") {
        linea.add(palabra);
      } else {
        Collections.shuffle(linea);
        random.addAll(linea);
        random.add("\n");
        linea.clear();
      }
    }
    return random;
  }
  /**
   * Función que escribe el texto en un archivo nuevo
   * 
   * @param texto el texto que se escribe al archivo
   * @param nombre el nombre que se le da al archivo
   * 
   */
  public static void nuevoArchivo(ArrayList<String> texto, String nombre){
    try{
      FileWriter writer = new FileWriter(nombre);
      BufferedWriter wr = new BufferedWriter(writer);

    for (String palabra : texto) {
      wr.write(palabra);
      wr.write(" ");
    }
      wr.close();
    }catch(java.io.IOException e){
      System.out.print("Archivo no encontrado");
    }
    
  }
}
