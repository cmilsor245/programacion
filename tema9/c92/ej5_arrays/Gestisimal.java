/**
  @author: Christian Millán Soria
  @file: Gestisimal.java
  @info: clase "Gestisimal" - ejercicio 5 de arrays
*/

package tema9.c92.ej5_arrays;

public class Gestisimal{
  // atributos
    private String codigo="libre";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

  /*********************************************/

  // métodos
    // getter para el código
      public String getCodigo(){
        return codigo;
      }

    // setter para el código
      public void setCodigo(String codigo){
        this.codigo=codigo;
      }

    /*******************/

    // getter para la descripción
      public String getDescripcion(){
        return descripcion;
      }

    // setter para la descripción
      public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
      }

    /*******************/

    // getter para el precio de compra
      public double getPrecioCompra(){
        return precioCompra;
      }

    // setter para el precio de compra
      public void setPrecioCompra(double precioCompra){
        this.precioCompra=precioCompra;
      }

    /*******************/

    // getter para el precio de venta
      public double getPrecioVenta(){
        return precioVenta;
      }

    // setter para el precio de venta
      public void setPrecioVenta(double precioVenta){
        this.precioVenta=precioVenta;
      }

    /*******************/

    // getter para el stock
      public int getStock(){
        return stock;
      }

    // setter para el stock
      public void setStock(int stock){
        this.stock=stock;
      }

    /*******************/

    // toString
      public String toString(){
        String info="\n------------------------------";
          info+="\n- Código: "+this.codigo;
          info+="\n- Descripción: "+this.descripcion;
          info+="\n- Precio de compra: "+this.precioCompra;
          info+="\n- Precio de venta: "+this.precioVenta;
          info+="\n- Stock: "+this.stock;
          info+="\n------------------------------";

        return info;
      }
}