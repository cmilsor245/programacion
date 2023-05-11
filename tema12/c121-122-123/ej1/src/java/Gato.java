/**
  @author: Christian Millán Soria
  @file: Gato.java
  @info: clase para objetos "Gato"
*/

public class Gato{
  // atributos
    private String nombre;
    private String imagen;

  /***********************************************/

  // constructor
    public Gato(String nombre, String imagen){
    this.nombre=nombre;
    this.imagen=imagen;
    }

  /***********************************************/

  // métodos
    public String getNombre(){
      return nombre;
    }

    public String getImagen(){
      return imagen;
    }

    @Override
      public String toString(){
        return "<img src='"+imagen+"' width='80'>Hola, soy "+nombre+"<br>";
      }

      public String maulla() {
        return "<img src='"+imagen+"' width='80'>Miauuuuuuuu<br>";
      }

      public String come(String comida){
        return "<img src='"+imagen+"' width='80'>Estoy comiendo "+comida+"<br>";
      }
}