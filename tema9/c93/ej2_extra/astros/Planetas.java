/**
  @author: Christian Millán Soria
  @file: Planetas.java
  @info: clase "Planetas"
*/

package tema9.c93.ej2_extra.astros;

public class Planetas extends Astros{
  // atributos
    private double distanciaAlSol;
    private double orbitaAlSol;
    private Satelites[] satelites;// array para almacenar todos los satélites de cada planeta
    private int numSatelites;// número de satélites por planeta

  /****************************************/

  // constructor
    public Planetas(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, String nombre, double distanciaAlSol, double orbitaAlSol){
      super(radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad, nombre);

      this.distanciaAlSol=distanciaAlSol;
      this.orbitaAlSol=orbitaAlSol;

      this.satelites=new Satelites[20];
      this.numSatelites=0;// inicialización del contador de satélites
    }

  /****************************************/

  // métodos
    /**
      @name: muestra
      @info: muestra toda la información de la que se dispone sobre el planeta
    */
      @Override
        public String muestra(){
          String muestra=("\n---------PLANETA---------");
            muestra+="\n- Nombre: "+getNombre();
            muestra+="\n- Radio ecuatorial: "+getRadioEcuatorial()+" km";
            muestra+="\n- Rotación sobre su eje: "+getRotacionSobreSuEje()+" horas";
            muestra+="\n- Masa: "+getMasa()+" kg";
            muestra+="\n- Temperatura media: "+getTemperaturaMedia()+" ºC";
            muestra+="\n- Gravedad: "+getGravedad()+" m/s^2";
            muestra+="\n- Distancia al sol: "+this.distanciaAlSol+" km";
            muestra+="\n- Órbita alrededor del sol: "+this.orbitaAlSol+" días";
            muestra+="\n- Satélites: ";
              for(int i=0; i<this.satelites.length; i++){
                if(this.satelites[i]!=null){
                  muestra+="\n  - "+this.satelites[i].getNombre();
                }
              }

          return muestra;
        }

    /**********************/

    /**
      @name: agregarSatelite
      @info: agregar los satélites correspondientes a cada planeta
      @param satelite: satélite a agregar
    */
      public void agregarSatelite(Satelites satelite){
        if(this.numSatelites<this.satelites.length){
          this.satelites[this.numSatelites]=satelite;

          this.numSatelites++;
        }else{
          System.out.println("No se pueden agregar más satélites ya que el planeta no cuenta con más.");
        }
      }
}