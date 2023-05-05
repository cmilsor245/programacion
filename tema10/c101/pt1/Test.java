/**
  @author: Christian Millán Soria
  @file: Test.java
  @info: programa principal
*/

package tema10.c101.pt1;

import java.util.Scanner;

import tema10.c101.pt1.classes.Gestisimal;

import java.util.ArrayList;

public class Test{
  // arraylist
    static ArrayList<Gestisimal> productos=new ArrayList<Gestisimal>();// creación del arraylist utilizando la clase "Gestisimal"

  public static void main(String[] args){  
    // variables necesarias
      Scanner input=new Scanner(System.in);
      String codigoIntroducido;
      int coincidencia;

    /****************************************************/
    
    // menú
      String opcion;
      int opcionNum;

      do{
        System.out.println("\n\n1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");

        // scanner
          System.out.print("\nElige una opción: ");
            opcion=input.next();
              try{
                opcionNum=Integer.parseInt(opcion);
              }catch(Exception e){
                opcionNum=0;
              }

          switch(opcionNum){
            case 1:// listado
              System.out.println("\nListado");

              // recorrer el arraylist y mostrar la información de los elementos que existan
                for(int i=0; i<productos.size(); i++){// "size()" devuelve el número de elementos del arraylist, similar a "length"
                  System.out.println(productos.get(i));// método que obtiene un elemento dentro del arraylist creado anteriormente
                }
            break;

            /******************/

            case 2:// alta
              System.out.println("Dar de alta nuevo artículo");

              // comprobación de si hay espacio en el almacén
                if(productos.size()>=500){
                  System.out.println("No hay espacio en el almacén para nuevos artículos.");
                }else{
                  // código
                    System.out.print("Código: ");
                      codigoIntroducido=input.next();

                  // comprobación de la existencia del código introducido
                    coincidencia=-1;
                    for(int i=0; i<productos.size(); i++){
                      if(productos.get(i).getCodigo().equals(codigoIntroducido)){
                        System.out.println("El código introducido ya existe.");
                        coincidencia=i;
                        break;
                      }
                    }

                    if(coincidencia==-1){
                      Gestisimal nuevoProducto=new Gestisimal();
                      nuevoProducto.setCodigo(codigoIntroducido);

                      // descripción
                        System.out.print("Descripción: ");
                        nuevoProducto.setDescripcion(input.next());

                      // precio de compra
                        System.out.print("Precio de compra: ");
                        nuevoProducto.setPrecioCompra(input.nextDouble());

                      // precio de venta
                        System.out.print("Precio de venta: ");
                        nuevoProducto.setPrecioVenta(input.nextDouble());

                      // stock
                        System.out.print("Stock: ");
                        nuevoProducto.setStock(input.nextInt());
                        productos.add(nuevoProducto);// método que agrega un elemento dentro del arraylist
                    }
                }
            break;

            /******************/

            case 3:// baja
              System.out.println("Dar de baja un artículo");
              System.out.print("Introduce el código del artículo que que se va a dar de baja: ");
                codigoIntroducido=input.next();

              // se busca el artículo en el array
                buscar(codigoIntroducido, productos);

              // si el artículo no existe, se muestra un mensaje de error
                if(buscar(codigoIntroducido, productos)==-1){
                  System.out.println("El código introducido no existe.");
                }else{// si existe, se elimina del array
                  productos.remove(buscar(codigoIntroducido, productos));
                  System.out.println("Artículo eliminado.");
                }
            break;

            /******************/

            case 4:// modificación
              System.out.println("Modificar artículo");
              System.out.print("Introduce el código del artículo que quieres modificar: ");
                codigoIntroducido=input.next();

              // se busca el artículo en el array
                buscar(codigoIntroducido, productos);

              // si el artículo no existe, se muestra un mensaje de error
                if(buscar(codigoIntroducido, productos)==-1){
                  System.out.println("El código introducido no existe.");
                }else{// si existe, se modifica
                  Gestisimal producto=productos.get(buscar(codigoIntroducido, productos));

                  System.out.println("Introduce los nuevos datos del artículo (pulsar ENTER para no modificar un campo):");

                  // descripción
                    System.out.print("Descripción (" + producto.getDescripcion()+"): ");
                      String descripcion=input.next();

                    if(!descripcion.equals("")){
                      producto.setDescripcion(descripcion);
                    }

                  /***************/

                  // precio de compra
                    System.out.print("Precio de compra ("+producto.getPrecioCompra()+"): ");
                      String precioCompraStr=input.next();

                    if(!precioCompraStr.equals("")){
                      double precioCompra=Double.parseDouble(precioCompraStr);
                      producto.setPrecioCompra(precioCompra);
                    }

                  /***************/

                  // precio de venta
                    System.out.print("Precio de venta ("+producto.getPrecioVenta()+"): ");
                      String precioVentaStr=input.next();

                    if(!precioVentaStr.equals("")){
                      double precioVenta=Double.parseDouble(precioVentaStr);
                      producto.setPrecioVenta(precioVenta);
                    }

                  /***************/

                  // stock
                    System.out.print("Stock (" + producto.getStock() + "): ");
                      String stockStr=input.next();

                    if(!stockStr.equals("")){
                      int stock=Integer.parseInt(stockStr);
                      producto.setStock(stock);
                    }

                  productos.set(buscar(codigoIntroducido, productos), producto);// método que establece
                }
            break;

            /******************/

            case 5:// entrada de mercancía
              System.out.println("Entrada de mercancía");
              System.out.print("Introduce el código del artículo al que se le ha entrado mercancía: ");
              codigoIntroducido=input.next();

              // se busca el artículo en el array
                buscar(codigoIntroducido, productos);

              // si el artículo no existe, se muestra un mensaje de error
                if(buscar(codigoIntroducido, productos)==-1){
                  System.out.println("El código introducido no existe.");
                }else{// si existe, se aumenta el stock
                  Gestisimal producto=productos.get(buscar(codigoIntroducido, productos));

                  System.out.print("Introduce la cantidad de mercancía que ha entrado: ");
                    int cantidad=input.nextInt();

                  producto.setStock(producto.getStock()+cantidad);
                  productos.set(buscar(codigoIntroducido, productos), producto);
                }
            break;

            /******************/

            case 6:// salida de mercancía
              System.out.println("Salida de mercancía");
              System.out.print("Introduce el código del artículo del que se va a realizar la venta: ");
                codigoIntroducido=input.next();

              // se busca el artículo en el array
                buscar(codigoIntroducido, productos);

              // si el artículo no existe, se muestra un mensaje de error
                if(buscar(codigoIntroducido, productos)==-1){
                  System.out.println("El código introducido no existe.");
                }else{// si existe, se disminuye el stock y se calcula el beneficio
                  Gestisimal producto=productos.get(buscar(codigoIntroducido, productos));

                  System.out.print("Introduce la cantidad de mercancía que se va a vender: ");
                    int cantidad=input.nextInt();

                  if(cantidad<=producto.getStock()){
                    producto.setStock(producto.getStock()-cantidad);

                    productos.set(buscar(codigoIntroducido, productos), producto);

                    double beneficio=cantidad*(producto.getPrecioVenta()-producto.getPrecioCompra());

                    System.out.println("El beneficio obtenido por la venta es de "+beneficio+" euros.");
                  }else{
                    System.out.println("No hay suficiente stock para realizar la venta.");
                  }
                }
            break;

            /******************/

            case 7:
              System.out.print("\nSaliendo del programa...");
            break;

            /******************/

            default:
              System.out.println("\nLa opción elegida no es válida.");
          }
      }while(opcionNum!=7);
  }

  /************************************************************/

  /**
    @name: buscar
    @info: busca un artículo en el arraylist
  */
  private static int buscar(String codigo, ArrayList<Gestisimal> productos){
      int coincidencia=-1;

      for(int i=0; i<productos.size(); i++){
        if(productos.get(i).getCodigo().equals(codigo)){
          coincidencia=i;
          break;
        }
      }

      return coincidencia;
    }
}