/**
  @author: Christian Millán Soria
  @file: Palabras.java
  @info: programa principal
*/

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

import functions.Funciones;

public class Palabras{
  public static void main(String[] args){
    // comprobación de si se ha especificado un archivo
      String archivo=Funciones.comprobarArchivo(args);

      if(archivo==null){
        return;
      }

    /**********************************************************************/

    // leer el archivo y contar coincidencias
      ArrayList<String> palabras=null;// declaración del arraylist de palabras

      try{
        // separación del contenido del archivo en líneas y palabras
          palabras=Funciones.leerArchivo(archivo);

        // escaneo de los argumentos introducidos y ejecución de sus respectivas acciones
          Funciones.manejarArgumentos(args, palabras, archivo);
      }catch(FileNotFoundException e){
        System.out.println("Archivo no encontrado.");
        return;
      }catch(IOException e){
        System.out.println("Error al leer el archivo.");
        return;
      }
  }
}