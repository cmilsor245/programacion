/**
  @author: Christian Millán Soria
  @file: TestEj5Arrays.java
  @info: programa principal del ejercicio 5 de arrays
*/

package tema9.c92.ej5_arrays;

import java.util.Scanner;

public class TestEj5Arrays{
  public static void main(String[] args){
    // array
      // tamaño
        int t=500;

      /**************/

      // creación
        Gestisimal[] productos=new Gestisimal[t];

    /***********************************************/

    // variables necesarias
      Scanner input=new Scanner(System.in);

      int primeraLibre;
      String codigo;

      String codigoIntroducido;

      int coincidencia;

      String descripcionIntroducida;
      String precioCompraIntroducido;
      String precioVentaIntroducido;
      String stockIntroducido;

      int stock;

    /***********************************************/

    // menú
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");

      // scanner
        System.out.print("\nElige una opción: ");
          int opcion=input.nextInt();

    /***********************************************/

    // inicialización de los huecos del array
      for(int i=0; i<t; i++){
        productos[i]=new Gestisimal();
      }

    /***********************************************/

    // switch para las opciones
      switch(opcion){
        case 1:// listado
          System.out.println("\nListado");

          for(int i=0; i<t; i++){
            if(!productos[i].getCodigo().equals("libre")){
              System.out.println(productos[i]);
            }
          }
        break;

        /******************/

        case 2:// alta
          System.out.println("Dar de alta nuevo artículo");

          // primer hueco libre en el array
            primeraLibre=0;// reseteo a 0 (primer elemento del array)
            codigo=productos[primeraLibre].getCodigo();// reseteo de la variable "codigo" a la del primer elemento del array

            /**************/

            // conversión de "primeraLibre" y "codigo" a los del primer elemento libre
              while((primeraLibre<t)&&(!codigo.equals("libre"))){
                primeraLibre++;

                if(primeraLibre<t){
                  codigo=productos[primeraLibre].getCodigo();
                }
              }

            /**************/

            // comprobación de si hay espacio en el almacén
              if(primeraLibre==t){
                System.out.println("No hay espacio en el almacén para nuevos artículos.");
              }else{
                System.out.println("Introduce los datos del nuevo artículo.");
                  // código
                    System.out.print("Código: ");
                      codigoIntroducido=input.next();

                      // comprobación de la existencia del código introducido
                        for(int i=0; i<t; i++){
                          if(productos[i].getCodigo().equals(codigoIntroducido)){
                            System.out.println("El código introducido ya existe.");
                            break;
                          }else{
                            productos[i].setCodigo(codigoIntroducido);

                            // descripción
                              System.out.print("Descripción: ");
                                productos[i].setDescripcion(input.next());

                            // precio de compra
                              System.out.print("Precio de compra: ");
                                productos[i].setPrecioCompra(input.nextDouble());

                            // precio de venta
                              System.out.print("Precio de venta: ");
                                productos[i].setPrecioVenta(input.nextDouble());

                            // stock
                              System.out.print("Stock: ");
                                productos[i].setStock(input.nextInt());//! el "case 2" no funciona correctamente: después de introducir el stock no vuelve al menú principal
                          }
                        }
              }
        break;

        /******************/

        case 3:// baja
          System.out.println("Dar de baja un artículo");
          System.out.print("Introduce el código del artículo que que se va a dar de baja: ");
            codigoIntroducido=input.next();

          coincidencia=-1;
          codigo="";

          // se busca el artículo en el array
            do{
              coincidencia++;

              if(coincidencia<t){// mientras la posición actual en el array sea menor que el tamaño máximo...
                codigo=productos[coincidencia].getCodigo();// ...se cambia el valor de "codigo" al código perteneciente al elemento actual del array
              }
            }while(!(codigo.equals(codigoIntroducido))&&(coincidencia<t));

          // si el artículo no existe, se muestra un mensaje de error
            if(coincidencia==t){
              System.out.println("El código introducido no existe.");//! pasa lo mismo que con el "case 2"
            }else{// si existe, se elimina del array de productos
              productos[coincidencia].setCodigo("libre");

              System.out.println("El artículo ha sido dado de baja.");
            }
        break;

        /******************/

        case 4:// modificación
          System.out.println("Modificación de un artículo");
          System.out.print("Introduce el código del artículo que que se va a modificar: ");
            codigoIntroducido=input.next();

          coincidencia=-1;

          // buscando el artículo en el array
            do{
              coincidencia++;
            }while(!((productos[coincidencia].getCodigo()).equals(codigoIntroducido)));

          // proceso de modificación
            System.out.println("Introduce los cambios en los datos del artículo o pulsa INTRO para dejarlos igual.");
              // código
                System.out.println("Código actual: "+productos[coincidencia].getCodigo());
                System.out.print("Nuevo código: ");
                  codigoIntroducido=input.next();

                  // si no se cambia, no se establece de nuevo
                    if(!codigoIntroducido.equals("")){
                      productos[coincidencia].setCodigo(codigoIntroducido);
                    }

              /***************/

              // descripción
                System.out.println("Descripción actual: "+productos[coincidencia].getDescripcion());
                System.out.print("Nuevo descripción: ");
                  descripcionIntroducida=input.next();

                  // si no se cambia, no se establece de nuevo
                    if(!descripcionIntroducida.equals("")){
                      productos[coincidencia].setDescripcion(descripcionIntroducida);
                    }

              /***************/

              // precio de compra
                System.out.println("Precio de compra actual: "+productos[coincidencia].getPrecioCompra());
                System.out.print("Nuevo precio de compra: ");
                  precioCompraIntroducido=input.next();

                  // si no se cambia, no se establece de nuevo
                    if(!precioCompraIntroducido.equals("")){
                      productos[coincidencia].setPrecioCompra(Double.parseDouble(precioCompraIntroducido));
                    }

              /***************/

              // precio de venta
                System.out.println("Precio de venta: " + productos[coincidencia].getPrecioVenta());
                System.out.print("Nuevo precio de venta: ");
                  precioVentaIntroducido=input.next();

                  // si no se cambia, no se establece de nuevo
                    if(!precioVentaIntroducido.equals("")){
                    productos[coincidencia].setPrecioVenta(Double.parseDouble(precioVentaIntroducido));
                    }

              /***************/

              // stock
                System.out.println("Stock: " + productos[coincidencia].getStock());
                System.out.print("Nuevo stock: ");
                  stockIntroducido=input.next();

                  // si no se cambia, no se establece de nuevo
                    if(!stockIntroducido.equals("")){
                    productos[coincidencia].setStock(Integer.parseInt(stockIntroducido));
                    }
        break;

        /******************/

        case 5:// entrada de mercancía
          System.out.println("Entrada de mercancía");
          System.out.print("Introduce el código del artículo: ");
            codigoIntroducido=input.next();

          coincidencia=-1;
          codigo="";

          // se busca el artículo en el array
            do{
              coincidencia++;

              if(coincidencia<t){// mientras la posición actual en el array sea menor que el tamaño máximo...
                codigo=productos[coincidencia].getCodigo();// ...se cambia el valor de "codigo" al código perteneciente al elemento actual del array
              }
            }while(!(codigo.equals(codigoIntroducido))&&(coincidencia<t));

          // si el artículo no existe, se muestra un mensaje de error
            if(coincidencia==t){
              System.out.println("El código introducido no existe.");
            }else{// si existe, se altera el stock
              System.out.println("Entrada de mercancía del siguiente artículo:");
                System.out.print(productos[coincidencia]);
              System.out.print("Introduce el número de unidades que se añaden al stock de este artículo: ");
                stockIntroducido=input.next();

              productos[coincidencia].setStock(productos[coincidencia].getStock()+Integer.parseInt(stockIntroducido));
                System.out.println("La mercancía ha sido añadida.");
            }
        break;

        /******************/

        case 6:// salida de mercancía
          System.out.println("Salida de mercancía");
          System.out.print("Introduce el código del artículo: ");
            codigoIntroducido=input.next();

          coincidencia=-1;
          codigo="";

          // se busca el artículo en el array
            do{
              coincidencia++;

              if(coincidencia<t){// mientras la posición actual en el array sea menor que el tamaño máximo...
                codigo=productos[coincidencia].getCodigo();//...se cambia el valor de "codigo" al código perteneciente al elemento actual del array
              }
            }while(!(codigo.equals(codigoIntroducido))&&(coincidencia<t));

          // si el artículo no existe, se muestra un mensaje de error
            if(coincidencia==t){
              System.out.println("El código introducido no existe.");
            }else{// si existe, se altera el stock
              System.out.println("Salida de mercancía del siguiente artículo:");
                System.out.print(productos[coincidencia]);
              System.out.print("Introduce el número de unidades que se eliminan del stock de este artículo: ");
                stockIntroducido=input.next();
                  stock=Integer.parseInt(stockIntroducido);

                // comprobación de que no se saca más mercancía de la que hay
                  if(productos[coincidencia].getStock()-stock>0){
                    productos[coincidencia].setStock(productos[coincidencia].getStock()-stock);
                      System.out.println("La mercancía ha sido sacada del almacén.");
                  }else{
                    System.out.println("No hay mercancía suficiente.");
                  }
            }
        break;
      }while(opcion!=7);
  }
}