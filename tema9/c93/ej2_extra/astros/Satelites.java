/**
  @author: Christian Millán Soria
  @file: Satelites.java
  @info: clase "Satelites"
*/

package tema9.c93.ej2_extra.astros;

public class Satelites extends Astros{
  // atributos
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private Planetas planeta;

  /********************************************/

  // constructor
    public Satelites(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, String nombre, double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planeta){
      super(radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad, nombre);

      this.distanciaAlPlaneta=distanciaAlPlaneta;
      this.orbitaPlanetaria=orbitaPlanetaria;
      this.planeta=planeta;
    }

  /********************************************/

  // métodos
    /**
      @name: muestra
      @info: muestra toda la información de la que se dispone sobre el satélite
    */
      @Override
      public String muestra(){
        String muestra=("\n---------SATÉLITE---------");
          muestra+="\n- Nombre: "+getNombre();
          muestra+="\n- Radio ecuatorial: "+getRadioEcuatorial()+" km";
          muestra+="\n- Rotación sobre su eje: "+getRotacionSobreSuEje()+" horas";
          muestra+="\n- Masa: "+getMasa()+" kg";
          muestra+="\n- Temperatura media: "+getTemperaturaMedia()+" ºC";
          muestra+="\n- Gravedad: "+getGravedad()+" m/s^2";
          muestra+="\n- Distancia al planeta: "+this.distanciaAlPlaneta+" km";
          muestra+="\n- Órbita alrededor del planeta: "+this.orbitaPlanetaria+" días";
          muestra+="\n- Planeta: "+this.planeta.getNombre();

        return muestra;
      }
}