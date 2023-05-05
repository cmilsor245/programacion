/**
  @author: Christian Millán Soria
  @file: Vehiculo.java
  @info: clase "Vehiculo" - ejercicio 2
*/

package tema9.c91.ej2_poo;

public abstract class Vehiculo{
  // atributos de clase
    private static int kmTotales=0;

  /***************************************/

  // atributos de instancia
    private int kmRecorridos;
    private static int numVehiculos=0;

  /***************************************/

  // @info: constructor de la clase "Vehiculo"
    public Vehiculo(){
      // inicializa el atributo "kmRecorridos" del objeto actual a 0
        this.kmRecorridos=0;

      numVehiculos++;
    }

  /*****************/

  // métodos
    /**
      @info: obtiene la distancia recorrida por el vehículo
      @return this.kmRecorridos: distancia recorrida por el vehículo
    */
      public int getKmRecorridos(){
        return this.kmRecorridos;
      }

    /*****************/

    /**
      @info: obtiene el número total de vehículos
      @return this.numVehiculos: número de vehículos
    */
      public int getNumVehiculos(){
        return this.numVehiculos;
      }

    /*****************/

    /**
      @info: obtiene el número total de kilómetros recorridos por todos los vehículos
      @return Vehiculo.kmTotales: número total de kilómetros recorridos por todos los vehículos
    */
      public static int getKmTotales(){
        return Vehiculo.kmTotales;
      }

    /*****************/

    /**
      @info: recorre una distancia determinada en kilómetros
      @param k: kilómetros a recorrer
    */
      public void recorre(int k){
        this.kmRecorridos+=k;

        Vehiculo.kmTotales+=k;
      }

    /*****************/

    // método "pinta"
      public abstract void pinta();
}