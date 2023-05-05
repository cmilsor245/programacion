/**
  @author: Christian Millán Soria
  @file: Inventario.java
  @info: clase "Inventario"
*/

package tema9.c93.ej3_extra.classes;

public class Inventario{
  // atributos
    private Animal[] animales;

  /****************************************/

  // constructor
    public Inventario(){
      this.animales=new Animal[0];
    }

  /****************************************/

  // métodos
    /**
      @name: mostrarListaAnimales
      @info: muestra una lista completa de todos los animales
    */
      public void mostrarListaAnimales(){
        for(Animal animal:animales){
          System.out.println(animal.getTipo()+" - "+animal.getNombre());
        }
      }

    /**************/

    /**
      @name: mostrarDatosAnimal
      @info: muestra los datos de un animal
      @param nombre: nombre del animal del que se muestran los datos
    */
      public void mostrarDatosAnimal(String nombre){
        for(Animal animal:animales){
          if(animal.getNombre().equals(nombre)){
            System.out.println(animal.toString());
            return;
          }
        }

        System.out.println("El animal con nombre "+nombre+" no existe en el inventario.");
      }

    /**************/

    /**
      @name: mostrarDatosTodosAnimales
      @info: muestra los datos de todos los animales
    */
      public void mostrarTodosDatosAnimales(){
        for(Animal animal:animales){
          System.out.println(animal.toString());
        }
      }

    /**************/

    /**
      @name: insertarAnimal
      @info: inserta un nuevo animal
      @param animal: animal a insertar
    */
      public void insertarAnimal(Animal animal){
        Animal[] nuevosAnimales=new Animal[animales.length+1];

        for (int i=0; i<animales.length; i++){
          nuevosAnimales[i]=animales[i];
        }

        nuevosAnimales[animales.length]=animal;
        animales=nuevosAnimales;
      }

    /**************/

    /**
      @name: eliminarAnimal
      @info: eliminar un animal
      @param nombre: nombre del animal a eliminar
    */
      public void eliminarAnimal(String nombre){
        int indiceEliminar=-1;

        for(int i=0; i<animales.length; i++){
          if(animales[i].getNombre().equals(nombre)){
            indiceEliminar=i;
            break;
          }
        }

        if(indiceEliminar != -1){
          Animal[] nuevosAnimales=new Animal[animales.length-1];

          int j=0;

          for(int i=0; i<animales.length; i++){
            if(i!=indiceEliminar){
              nuevosAnimales[j]=animales[i];

              j++;
            }
          }

          animales=nuevosAnimales;
        }else{
          System.out.println("El animal con nombre "+nombre+" no existe en el inventario.");
        }
      }

    /**************/

    /**
      @name: vaciarInventario
      @info: vacía el inventario
    */
      public void vaciarInventario(){
        animales=new Animal[0];
      }
}