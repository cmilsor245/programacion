/**
  @author: Christian Millán Soria
  @file: Empleados.java
  @info: clase "Empleados"
*/

package tema9.c93.ej5_extra.classes;

public class Empleado{
  // atributos
    private final String nombre;
    private final String dni;
    private double sueldoBrutoMensual;
    private int edad;
    private String telefono;
    private String direccion;
    private String disponibilidad;
    private static final double primerIrpf=0.2;
    private static final double segundoIrpf=0.3;
    private static final double tercerIrpf=0.4;

  /****************************************/

  // constructor
    public Empleado(String nombre, String dni, double sueldoBrutoMensual){
      this.nombre=nombre;
      this.dni=dni;
      this.sueldoBrutoMensual=sueldoBrutoMensual;
      this.disponibilidad="ocupado";
    }

  /****************************************/

  // métodos
    // setter para el atributo "edad"
      public void setEdad(int edad){
        this.edad=edad;
      }

    // setter para el atributo "telefono"
      public void setTelefono(String telefono){
        this.telefono=telefono;
      }

    // setter para el atributo "direccion"
      public void setDireccion(String direccion){
        this.direccion=direccion;
      }

    // setter para el atributo "disponibilidad"
      public void setDisponibilidad(String disponibilidad){
        this.disponibilidad=disponibilidad;
      }

    /******************/

    // getter para el atributo "nombre"
      public String getNombre(){
        return this.nombre;
      }

    // getter para el atributo "dni"
      public String getDni(){
        return this.dni;
      }

    // getter para el atributo "sueldoBrutoMensual"
      public double getSueldoBrutoMensual(){
        return this.sueldoBrutoMensual;
      }

    // getter para el atributo "edad"
      public int getEdad(){
        return this.edad;
      }

    // getter para el atributo "telefono"
      public String getTelefono(){
        return this.telefono;
      }

    // getter para el atributo "direccion"
      public String getDireccion(){
        return this.direccion;
      }

    // getter para el atributo "disponibilidad"
      public String getDisponibilidad(){
        return this.disponibilidad;
      }

    /******************/

    /**
      @name: nombreEmpleado
      @info: muestra el nombre y el número del empleado
      @param numeroEmpleado: posición del empleado en el array
    */
      public void nombreEmpleado(int numeroEmpleado){
        System.out.println("\n------------------------------------------");
        System.out.println("- Empleado número "+numeroEmpleado);
        System.out.println("- Nombre: "+getNombre());
        System.out.println("------------------------------------------\n");
      }

    /******************/

    /**
      @name:imprimirInfo
      @info: imprime la información de los atributos del objeto
    */
      public void imprimirInfo(){
        System.out.println("\n-------------------------------------------------------");
        System.out.println("- Nombre: "+getNombre());
        System.out.println("- DNI: "+getDni());
        System.out.println("- Sueldo bruto mensual: "+getSueldoBrutoMensual()+" euros");

        if(getEdad()!=0){
          System.out.println("- Edad: "+getEdad()+" años");
        }

        if(getTelefono()!=null){
          System.out.println("- Teléfono: "+getTelefono());
        }

        if(getDireccion()!=null){
          System.out.println("- Dirección: "+getDireccion());
        }
        System.out.println("-------------------------------------------------------\n");
      }

    /******************/

    /**
      @name: calcularSueldoNeto
      @info: calcula el sueldo neto (sueldo bruto anual-porcentaje de irpf)
      @return sueldoNetoAnual: sueldo neto del empelado
    */
      public double calcularSueldoNeto(){
        double impuestoIrpf;
        double sueldoNetoAnual=this.sueldoBrutoMensual*12;

        if(this.sueldoBrutoMensual<12000){// sueldo bruto anual por debajo de los 12000 €
          impuestoIrpf=(sueldoBrutoMensual*12)*Empleado.primerIrpf;

          sueldoNetoAnual-=impuestoIrpf;

          return sueldoNetoAnual;
        }else if(this.sueldoBrutoMensual>12000&&this.sueldoBrutoMensual<=25000){// sueldo bruto anual por encima de los 12000 € y por debajo de los 25000 €
          impuestoIrpf=(sueldoBrutoMensual*12)*Empleado.segundoIrpf;

          sueldoNetoAnual-=impuestoIrpf;

          return sueldoNetoAnual;
        }else{// sueldo bruto anual por encima de los 25000 €
          impuestoIrpf=(sueldoBrutoMensual*12)*Empleado.tercerIrpf;

          sueldoNetoAnual-=impuestoIrpf;

          return sueldoNetoAnual;
        }
      }
}