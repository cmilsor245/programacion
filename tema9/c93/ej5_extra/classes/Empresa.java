/**
  @author: Christian Millán Soria
  @file: Empresa.java
  @info: clase "Empresa"
*/

package tema9.c93.ej5_extra.classes;

public class Empresa{
  // atributos
    private final String nombre;
    private final String cif;
      private char tipoSociedad;
    private String telefono;
    private String direccion;
    private String disponibilidad;
    static int t=20;
    private Empleado[] empleadosCorrespondientes;
    private int numEmpleados;

  /**************************************************/

  // constructor
    public Empresa(String nombre, char tipoSociedad){
      this.nombre=nombre;
      this.tipoSociedad=tipoSociedad;
        this.cif=generarCif();
      this.disponibilidad="ocupada";
      this.empleadosCorrespondientes=new Empleado[t];
        this.numEmpleados=0;
    }

  /**************************************************/

  // métodos
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
  
    /********************/

    // getter para el atributo "nombre"
      public String getNombre(){
        return this.nombre;
      }

    // getter para el atributo "cif"
      public String getCif(){
        return this.cif;
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

    /********************/

    /**
      @name: generarCif
      @info: genera un cif de forma aleatoria para la nueva empresa creada
    */
      public String generarCif(){
        String prefijo=tipoSociedad+"-";
        String cifNumerico="";
        for(int i=0; i<8; i++){
          int digito=(int)(Math.random()*10);

          cifNumerico+=digito;
        }

        return prefijo+cifNumerico;
      }

    /********************/

    /**
      @name: nombreEmpresa
      @info: muestra el nombre y el número de la empresa
      @param numeroEmpresa: posición de la empresa en el array
    */
    public void nombreEmpresa(int numeroEmpresa){
      System.out.println("\n------------------------------------------");
      System.out.println("- Empresa número "+numeroEmpresa);
      System.out.println("- Nombre: "+getNombre());
      System.out.println("------------------------------------------\n");
    }

    /********************/

    /**
      @name: anadirEmpleado
      @info: añade un empleado al array de empleados del objeto empresa
      @param empleado: empleado a añadir
    */
      public void anadirEmpleado(Empleado empleado){
        if(this.numEmpleados<this.empleadosCorrespondientes.length){
          this.empleadosCorrespondientes[this.numEmpleados]=empleado;

          this.numEmpleados++;
        }else{
          System.out.println("No se pueden añadir más empleados, la plantilla está llena.");
        }
      }

    /********************/

    /**
      @name:imprimirInfo
      @info: imprime la información de los atributos del objeto
    */
      public void imprimirInfo(){
        System.out.println("\n-------------------------------------------------------");
        System.out.println("- Nombre: "+getNombre());
        System.out.println("- CIF: "+generarCif());

        if(getTelefono()!=null){
          System.out.println("- Teléfono: "+getTelefono());
        }

        if(getDireccion()!=null){
          System.out.println("- Dirección: "+getDireccion());
        }

        System.out.print("- Empleados: ");
          if(this.numEmpleados==0){
            System.out.print("Esta empresa no tiene empleados todavía");
          }else{
            for(int i=0; i<this.empleadosCorrespondientes.length; i++){
              if(this.empleadosCorrespondientes[i]!=null){
                System.out.print("\n  - "+this.empleadosCorrespondientes[i].getNombre());
              }
            }
          }
        System.out.println("\n-------------------------------------------------------\n");
      }

    /********************/

    /**
      @name: eliminarEmpleado
      @info: elimina un empleado del array de empleados del objeto empresa
      @param empleado: empleado a eliminar
    */
      public void eliminarEmpleado(Empleado empleado){
        for(int i=0; i<t; i++){
          if(empleadosCorrespondientes[i]!=null&&empleado.getDni().equals(empleadosCorrespondientes[i].getDni())){
            empleadosCorrespondientes[i]=new Empleado("", "", 0);
            empleadosCorrespondientes[i].setDisponibilidad("disponible");

            if(empleadosCorrespondientes[i].getEdad()!=0){
              empleadosCorrespondientes[i].setEdad(0);
              empleadosCorrespondientes[i].setTelefono(null);
              empleadosCorrespondientes[i].setDireccion(null);
            }

            this.numEmpleados--;

            break;
          }
        }
      }

    /********************/

    /**
      @name: brutosTotales
      @info: calcula el total de sueldos brutos de todos los empleados de la empresa
      @return totalBrutos: total de sueldos brutos
    */
      public double brutosTotales(){
        double totalBrutos=0;

        for(int i=0; i<numEmpleados; i++){
          totalBrutos+=(empleadosCorrespondientes[i].getSueldoBrutoMensual())*12;
        }

        return totalBrutos;
      }

      /********************/

      /**
        @name: netosTotales
        @info: calcula el total de sueldos netos de todos los empleados de la empresa
        @return totalNetos: total de sueldos netos
      */
        public double netosTotales(){
          double totalNetos=0;

          for(int i=0; i<numEmpleados; i++){
            totalNetos+=(empleadosCorrespondientes[i].calcularSueldoNeto());
          }

          return totalNetos;
        }
}