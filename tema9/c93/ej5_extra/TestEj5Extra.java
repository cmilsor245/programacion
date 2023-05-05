/**
  @author: Christian Millán Soria
  @file: TestEj5Extra.java
  @info: programa principal
*/

package tema9.c93.ej5_extra;

import java.util.Scanner;

import tema9.c93.ej5_extra.classes.Empleado;
import tema9.c93.ej5_extra.classes.Empresa;

public class TestEj5Extra{
  public static void main(String[] args){
    // array de empleados
      int t=13;
      Empleado[] arrayEmpleados=new Empleado[t];

      for(int i=0; i<t; i++){
        arrayEmpleados[i]=new Empleado("", "", 0);
        arrayEmpleados[i].setDisponibilidad("disponible");
      }

    // array de empresas
      int u=13;
      Empresa[] arrayEmpresas=new Empresa[u];

      for(int i=0; i<u; i++){
        arrayEmpresas[i]=new Empresa("", 'a');
        arrayEmpresas[i].setDisponibilidad("disponible");
      }

    /*********************************************************************/

    // menú
      Scanner input=new Scanner(System.in);
      int opcion=0;
      do{
        System.out.println("1. Listado de empleados");
        System.out.println("2. Listado de empresas");
        System.out.println("3. Crear empleado");
        System.out.println("4. Crear empresa");
        System.out.println("5. Mostrar toda la información de un empelado");
        System.out.println("6. Mostrar toda la información de una empresa");
        System.out.println("7. Añadir empleado a una empresa");
        System.out.println("8. Eliminar empleado de una empresa");
        System.out.println("9. Calcular sueldo neto de un empleado");
        System.out.println("10. Mostrar total de sueldos brutos y netos de una empresa");
        System.out.println("11. Terminar programa");

        System.out.print("\nIntroduce la opción que quieres utilizar: ");
          try{
            opcion=Integer.parseInt(input.next());
          }catch(NumberFormatException e){// si el valor introducido no coincide con int, se muestra un mensaje de error
            System.out.println("\nError: el valor introducido debe coincidir con una de las opciones del menú.");
          }

        /***********************************/

        int posicion;
        int existentesEmpleados;
        int existentesEmpresas;

        switch(opcion){
          case 1:// listado de empleados
            posicion=1;
            existentesEmpleados=0;

            for(int i=0; i<t; i++){
              if(!arrayEmpleados[i].getDisponibilidad().equals("disponible")){
                arrayEmpleados[i].nombreEmpleado(posicion);
                posicion++;
                existentesEmpleados++;
              }
            }

            if(existentesEmpleados==0){
              System.out.println("\nNo existe ningún empleado todavía.\n");
            }
          break;

          /**********************/

          case 2:// listado de empresas
            posicion=1;
            existentesEmpresas=0;

            for(int i=0; i<u; i++){
              if(!arrayEmpresas[i].getDisponibilidad().equals("disponible")){
                arrayEmpresas[i].nombreEmpresa(posicion);
                posicion++;
                existentesEmpresas++;
              }
            }

            if(existentesEmpresas==0){
              System.out.println("\nNo existe ninguna empresa todavía.\n");
            }
          break;

          /**********************/

          case 3:// crear empleado
            // obtención del primer hueco libre en el array
              int primeroDisponible=0;
              String disponibilidadEmpleado=arrayEmpleados[primeroDisponible].getDisponibilidad();

              while((primeroDisponible<t)&&(!disponibilidadEmpleado.equals("disponible"))){
                primeroDisponible++;

                if(primeroDisponible<t){
                  disponibilidadEmpleado=arrayEmpleados[primeroDisponible].getDisponibilidad();
                }
              }

            // comprobación de si hay espacio para más empleados
              if(primeroDisponible==t){
                System.out.println("No se pueden crear más empleados.");
              }else{
                System.out.println("\nCreación de un nuevo empleado...\n");

                  // nombre
                    System.out.print("Introduce el nombre del nuevo empleado: ");
                      String nombre=input.nextLine();//! si se introducen espacios de por medio se leen como varios inputs separados
                        nombre=input.nextLine();//* esta línea arregla lo anterior (o eso creo), pero no sé si es la mejor forma de hacerlo

                  /*************/

                  // dni
                    String dni;
                    String patron;
                    do{
                      System.out.print("Introduce el DNI del nuevo empleado: ");
                        dni=input.next();
                          // patrón para comprobar que el formato del dni es correcto
                            patron="^[0-9]{8}[A-Z]$";

                          if(!dni.matches(patron)){
                            System.out.println("El DNI introducido no tiene el formato correcto");
                          }
                    }while(!dni.matches(patron));

                  /*************/

                  // sueldo bruto mensual
                    System.out.print("Introduce el sueldo bruto mensual del nuevo empleado: ");
                      double sueldoBrutoMensual=Double.parseDouble(input.next());//! no sé cómo comprobar que el sueldo bruto mensual que se introduce es del tipo de dato correcto porque si lo hago se queda el programa congelado

                  /******************/

                  // creación del objeto
                    arrayEmpleados[primeroDisponible]=new Empleado(nombre, dni, sueldoBrutoMensual);

                  /******************/

                  // datos adicionales
                    String adicional;

                    // edad
                      System.out.print("\n¿Quieres introducir la edad del empleado? (S/N) -> ");
                        adicional=input.next().toLowerCase();
                          if(adicional.equals("s")){
                            System.out.print("Introduce la edad del nuevo empelado: ");
                              int edad=Integer.parseInt(input.next());//! no sé cómo comprobar que la edad que se introduce es del tipo de dato correcto porque si lo hago se queda el programa congelado
                                arrayEmpleados[primeroDisponible].setEdad(edad);
                          }

                    /**********/

                    // teléfono
                      System.out.print("\n¿Quieres introducir el teléfono del empleado? (S/N) -> ");
                        adicional=input.next().toLowerCase();
                          if(adicional.equals("s")){
                            System.out.print("Introduce el número de teléfono del nuevo empelado: ");
                              String telefono=input.nextLine();//! si se introducen espacios de por medio se leen como varios inputs separados
                                telefono=input.nextLine();//* esta línea arregla lo anterior (o eso creo), pero no sé si es la mejor forma de hacerlo
                                arrayEmpleados[primeroDisponible].setTelefono(telefono);
                          }

                      /**********/

                      // dirección
                        System.out.print("\n¿Quieres introducir la dirección del empleado? (S/N) -> ");
                        adicional=input.next().toLowerCase();
                          if(adicional.equals("s")){
                            System.out.print("Introduce la dirección del nuevo empelado: ");
                              String direccion=input.nextLine();//! si se introducen espacios de por medio se leen como varios inputs separados
                                direccion=input.nextLine();//* esta línea arregla lo anterior (o eso creo), pero no sé si es la mejor forma de hacerlo
                                arrayEmpleados[primeroDisponible].setDireccion(direccion);
                          }

                        System.out.println();
              }
          break;

          /**********************/

          case 4://crear empresa
            // obtención del primer hueco libre en el array
              int primeraDisponible=0;
              String disponibilidadEmpresa=arrayEmpresas[primeraDisponible].getDisponibilidad();

              while((primeraDisponible<u)&&(!disponibilidadEmpresa.equals("disponible"))){
                primeraDisponible++;

                if(primeraDisponible<u){
                  disponibilidadEmpresa=arrayEmpresas[primeraDisponible].getDisponibilidad();
                }
              }

            // comprobación de si hay espacio para más empleados
              if(primeraDisponible==u){
                System.out.println("No se pueden crear más empleados.");
              }else{
                System.out.println("\nCreación de una nueva empresa...\n");

                  // nombre
                    System.out.print("Introduce el nombre de la nueva empresa: ");
                      String nombre=input.nextLine();//! si se introducen espacios de por medio se leen como varios inputs separados
                        nombre=input.nextLine();//* esta línea arregla lo anterior (o eso creo), pero no sé si es la mejor forma de hacerlo

                  /*************/

                  // tipo de sociedad
                    System.out.print("Introduce el tipo de sociedad de la nueva empresa (A - Anónima [Predeterminada]/L - Limitada/C - Cooperativa): ");
                      String tipoSociedadIntroducida=input.next().toLowerCase();
                        char tipoSociedad='A';// valor por defecto
                          if(tipoSociedadIntroducida.equals("l")){
                            tipoSociedad='L';
                          }else if(tipoSociedadIntroducida.equals("c")){
                            tipoSociedad='C';
                          }

                  /**********************/

                  // creación del objeto
                    arrayEmpresas[primeraDisponible]=new Empresa(nombre, tipoSociedad);

                  /**********************/

                  // datos adicionales
                    String adicional;

                    // teléfono
                      System.out.print("\n¿Quieres introducir el teléfono de la empresa? (S/N) -> ");
                        adicional=input.next().toLowerCase();
                          if(adicional.equals("s")){
                            System.out.print("Introduce el número de teléfono de la nueva empresa: ");
                              String telefono=input.nextLine();//! si se introducen espacios de por medio se leen como varios inputs separados
                                telefono=input.nextLine();//* esta línea arregla lo anterior (o eso creo), pero no sé si es la mejor forma de hacerlo
                                arrayEmpresas[primeraDisponible].setTelefono(telefono);
                          }

                    /**********/

                    // dirección
                      System.out.print("\n¿Quieres introducir la dirección de la empresa? (S/N) -> ");
                        adicional=input.next().toLowerCase();
                          if(adicional.equals("s")){
                            System.out.print("Introduce la dirección de la nueva empresa: ");
                              String direccion=input.nextLine();//! si se introducen espacios de por medio se leen como varios inputs separados
                                direccion=input.nextLine();//* esta línea arregla lo anterior (o eso creo), pero no sé si es la mejor forma de hacerlo
                                arrayEmpresas[primeraDisponible].setDireccion(direccion);
                          }

                      System.out.println();
              }
          break;

          /**********************/

          case 5:// mostrar toda la información de un empleado
            System.out.print("\nIntroduce el número del empleado del que quieres imprimir su información: ");
              int empleadoSeleccionado=Integer.parseInt(input.next());

            arrayEmpleados[empleadoSeleccionado-1].imprimirInfo();
          break;

          /**********************/

          case 6:// mostrar toda la información de un empleado
            System.out.print("\nIntroduce el número de la empresa de la que quieres imprimir su información: ");
              int empresaSeleccionada=Integer.parseInt(input.next());

            arrayEmpresas[empresaSeleccionada-1].imprimirInfo();
          break;

          /**********************/

          case 7:// añadir a un empleado a una empresa
            // comprobación de la existencia de algún empleado
              int posicionEmpleados=1;
              existentesEmpleados=0;
                for(int i=0; i<t; i++){
                  if(!arrayEmpleados[i].getDisponibilidad().equals("disponible")){
                    posicionEmpleados++;
                    existentesEmpleados++;
                  }
                }

            /************/

            // comprobación de la existencia de alguna empresa
              int posicionEmpresas=1;
              existentesEmpresas=0;
                for(int i=0; i<u; i++){
                  if(!arrayEmpresas[i].getDisponibilidad().equals("disponible")){
                    posicionEmpresas++;
                    existentesEmpresas++;
                  }
                }

            /************/

            if(existentesEmpleados==0){
              System.out.println("\nNo existe ningún empleado todavía.\n");
            }else if(existentesEmpresas==0){
              if(existentesEmpresas==0){
                System.out.println("\nNo existe ninguna empresa todavía.\n");
              }
            }else{
              System.out.print("\nIntroduce el número del empleado que quieres añadir a una empresa: ");
                int empleadoAAnadir=Integer.parseInt(input.next());

              System.out.print("\nIntroduce el número de la empresa a la que se añadirá dicho empleado: ");
                int empresaDondeAnadir=Integer.parseInt(input.next());

              arrayEmpresas[empresaDondeAnadir-1].anadirEmpleado(arrayEmpleados[empleadoAAnadir-1]);

              System.out.println("\nEl empleado número "+empleadoAAnadir+" ha sido añadido a la empresa número "+empresaDondeAnadir+" con éxito.\n");
            }
          break;

          /**********************/

          case 8:// eliminar empleado de una empresa
            System.out.print("\nIntroduce el número del empleado que quieres eliminar de una empresa: ");
              int empleadoAEliminar=Integer.parseInt(input.next());

            System.out.print("\nIntroduce el número de la empresa a la que se le eliminará dicho empleado: ");
              int empresaDondeEliminar=Integer.parseInt(input.next());

            arrayEmpresas[empresaDondeEliminar-1].eliminarEmpleado(arrayEmpleados[empleadoAEliminar-1]);

            System.out.println("\nEl empleado número "+empleadoAEliminar+" ha sido eliminado de la empresa número "+empresaDondeEliminar+" con éxito.\n");
          break;

          /**********************/

          case 9:// calcular sueldo neto de un empleado
            System.out.print("\nIntroduce el número del empleado al que le quieres calcular el sueldo neto: ");
              int empleadoACalcular=Integer.parseInt(input.next());

              System.out.println("\nEl sueldo bruto anual de este empleado es de "+(arrayEmpleados[empleadoACalcular-1].getSueldoBrutoMensual())*12+" euros.");

            System.out.println("\nEl sueldo neto del empleado número "+empleadoACalcular+" es de "+arrayEmpleados[empleadoACalcular-1].calcularSueldoNeto()+" euros.\n");
          break;

          /**********************/

          case 10:// mostrar total de sueldos brutos y netos de una empresa
            existentesEmpresas=0;

            for(int i=0; i<u; i++){
              if(!arrayEmpresas[i].getDisponibilidad().equals("disponible")){
                existentesEmpresas++;
              }
            }

            if(existentesEmpresas==0){
              System.out.println("\nNo existe ninguna empresa todavía.\n");
            }else{
              System.out.print("\nIntroduce el número de la empresa de la cual quieres ver el total de sueldos brutos y netos: ");
                int empresaAConsultar=Integer.parseInt(input.next());

              System.out.println("\nLos sueldos brutos anuales totales de esta empresa confeccionan un total de "+arrayEmpresas[empresaAConsultar-1].brutosTotales()+" euros, mientras que los sueldos netos totales de esta misma empresan son de "+arrayEmpresas[empresaAConsultar-1].netosTotales()+" euros.\n");
            }
          break;

          /**********************/

          case 11:// terminar programa
            System.out.print("\nPrograma terminado\n\n");
          break;

          /**********************/

          default:
            System.out.println("\nEsa opción no es correcta.\n");
          break;
        }
      }while(opcion!=11);
  }
}