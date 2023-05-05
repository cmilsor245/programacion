package tema8.c81.misFunciones;

public class Geometria{
  /**
    @info: función para calcular el perímetro de un rectángulo
    @param:
      - "ancho": ancho del rectángulo
      - "alto": alto del rectángulo
    @return perimetro: perímetro del rectángulo
  */
    public static double perimetroRectangulo(double ancho, double alto){
      // variable para el perímetro
        double perimetro=(ancho*=2)+(alto*=2);

      /***************/

      // return
        return perimetro;
    }

  /***************************************************/

  /**
    @info: función para calcular el área de un rectángulo
    @param:
      - "ancho": ancho del rectángulo
      - "alto": alto del rectángulo
    @return area: área del rectángulo
  */
    public static double areaRectangulo(double ancho, double alto){
      // variable para el perímetro
        double area=ancho*alto;

      /***************/

      // return
        return area;
    }

  /***************************************************/

  /**
    @info: función para calcular la circunferencia dado un radio
    @param radio: radio introducido
    @return circunferencia: circunferencia del radio
  */
    public static double circunferencia(double radio){
      // constantes para pi
        final double pi=3.14;

      /*****************/

      // cálculo de la circunferencia
        double circunferencia=2*pi*radio;

      /*****************/

      // return
        return circunferencia;
    }

  /***************************************************/

  /**
    @info: función para calcular el área dado un radio
    @param radio: radio introducido
    @return area: área del radio
  */
    public static double area(double radio){
      // constantes para pi
        final double pi=3.14;

      /*****************/

      // cálculo del área
        double area=pi*Math.pow(radio, 2);

      /*****************/

      // return
        return area;
    }

  /***************************************************/

  /**
    @info: función para calcular el volumen dado un radio
    @param radio: radio introducido
    @return volumen: volumen del radio
  */
    public static double volumen(double radio){
      // constantes para pi
        final double pi=3.14;

      /*****************/

      // cálculo del área
        double volumen=(4/3)*pi*Math.pow(radio, 3);

      /*****************/

      // return
        return volumen;
    }
}