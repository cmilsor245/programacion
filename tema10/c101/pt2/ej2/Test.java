/**
  @author: Christian Millán Soria
  @file: Test.java
  @info: programa principal
*/

package tema10.c101.pt2.ej2;

import tema10.c101.pt2.ej2.classes.*;

import java.util.Scanner;

import java.util.ArrayList;

public class Test{
  public static void main(String[] args){
    // creación de instancias
      // planetas
        ArrayList<Planetas> planetas=new ArrayList<>();// arraylist de los 8 planetas del sistema solar

        // agrego todos los planetas con sus datos al arraylist
          planetas.add(new Planetas(2439.7, 1408, 33011, 167, 3.7, "Mercurio", 57.91, 87.97));
          planetas.add(new Planetas(6051.8, 5832.5, 48675, 462, 8.87, "Venus", 108.2, 224.7));
          planetas.add(new Planetas(6371, 24, 5.972e24, 15, 9.81, "Tierra", 149.6, 365.24));
          planetas.add(new Planetas(3389.5, 24.6, 6.4171e23, -63, 3.71, "Marte", 227.9, 686.98));
          planetas.add(new Planetas(69911, 9.9, 1.8982e27, -108, 24.79, "Júpiter", 778.5, 4332.59));
          planetas.add(new Planetas(58232, 10.7, 5.6834e26, -139, 10.44, "Saturno", 1.4e9, 10759.22));
          planetas.add(new Planetas(25362, 17.2, 8.681e25, -197, 8.87, "Urano", 2.87e9, 30688.5));
          planetas.add(new Planetas(24622, 16.1, 1.0243e26, -201, 11.15, "Neptuno", 4.5e9, 60182));

      /*********************/

      // satélites
        ArrayList<Satelites> satelites=new ArrayList<>();// arraylist de los 15 satélites de los más conocidos del sistema solar

        // agrego todos los satélites con sus datos al arraylist
          satelites.add(new Satelites(1737.5, 27.3, 7.342, -20, 1.62, "La Luna", 384.400, 27.3, planetas.get(2)));
            planetas.get(2).agregarSatelite(satelites.get(0));
          satelites.add(new Satelites(11.1, 7.66, 1.08e+16, -40, 0.0084, "Fobos", 9378, 7.66, planetas.get(3)));
            planetas.get(3).agregarSatelite(satelites.get(1));
          satelites.add(new Satelites(6.2, 30.3, 2.4e+15, -40, 0.003, "Deimos", 23460, 1.26, planetas.get(3)));
            planetas.get(3).agregarSatelite(satelites.get(2));
          satelites.add(new Satelites(1821.3, 42.5, 8.94e+22, -143, 1.796, "Ío", 421700, 1.77, planetas.get(4)));
            planetas.get(4).agregarSatelite(satelites.get(3));
          satelites.add(new Satelites(1560.8, 85.2, 4.8e+22, -161, 1.314, "Europa", 671034, 3.55, planetas.get(4)));
            planetas.get(4).agregarSatelite(satelites.get(4));
          satelites.add(new Satelites(2634.1, 171, 1.48e+23, -163, 1.428, "Ganímedes", 1070400, 7.16, planetas.get(4)));
            planetas.get(4).agregarSatelite(satelites.get(5));
          satelites.add(new Satelites(2410.3, 16.69, 1.08e+23, -139, 1.235, "Calisto", 1883000, 16.69, planetas.get(4)));
            planetas.get(4).agregarSatelite(satelites.get(6));
          satelites.add(new Satelites(198.2, 22.6, 3.75e+19, -181, 0.063, "Mimas", 185540, 0.94, planetas.get(5)));
            planetas.get(5).agregarSatelite(satelites.get(7));
          satelites.add(new Satelites(252.1, 1.370218, 1.08e+20, -198, 0.113, "Encélado", 238037, 1.37, planetas.get(5)));
            planetas.get(5).agregarSatelite(satelites.get(8));
          satelites.add(new Satelites(2575, 15.94542, 1.35e+23, -179, 1.352, "Titán", 1221870, 15.95, planetas.get(5)));
            planetas.get(5).agregarSatelite(satelites.get(9));
          satelites.add(new Satelites(235.8, 34.2, 6.59e+19, -187, 0.079, "Miranda", 129390, 1.41, planetas.get(6)));
            planetas.get(6).agregarSatelite(satelites.get(10));
          satelites.add(new Satelites(1353.4, 5.876854, 2.14e+22, -235, 0.779, "Tritón", 354760, 5.88, planetas.get(7)));
            planetas.get(7).agregarSatelite(satelites.get(11));
          satelites.add(new Satelites(210, 1.122315, 5.02e+19, -200, 0.064, "Proteo", 117647, 1.12, planetas.get(7)));
            planetas.get(7).agregarSatelite(satelites.get(12));
          satelites.add(new Satelites(606, 6.387230, 1.586e+21, -230, 0.273, "Caronte", 19570, 6.39, planetas.get(7)));
            planetas.get(7).agregarSatelite(satelites.get(13));
          satelites.add(new Satelites(40, 38.2021, 4.2e+16, 0, 9.8, "Hydra", 64749, 38.2, planetas.get(7)));
            planetas.get(7).agregarSatelite(satelites.get(14));

    /*************************************************/

    // menú
      String opcion;
      int opcionNum;

      do{
        System.out.println("\n\n\n----------------------PLANETAS----------------------");
        System.out.println("1. Mercurio");
        System.out.println("2. Venus");
        System.out.println("3. Tierra");
        System.out.println("4. Marte");
        System.out.println("5. Júpiter");
        System.out.println("6. Saturno");
        System.out.println("7. Urano");
        System.out.println("8. Neptuno");

        System.out.println("\n----------------------SATÉLITES----------------------");
        System.out.println("9. La Luna");
        System.out.println("10. Fobos");
        System.out.println("11. Deimos");
        System.out.println("12. Ío");
        System.out.println("13. Europa");
        System.out.println("14. Ganímedes");
        System.out.println("15. Calisto");
        System.out.println("16. Mimas");
        System.out.println("17. Encélado");
        System.out.println("18. Titán");
        System.out.println("19. Miranda");
        System.out.println("20. Tritón");
        System.out.println("21. Proteo");
        System.out.println("22. Caronte");
        System.out.println("23. Hydra");

        System.out.println("\n24. Terminar programa");

        System.out.print("\nIntroduce el número correspondiente al astro del que quieres obtener información: ");
          Scanner input=new Scanner(System.in);
            opcion=input.next();

            try{
              opcionNum=Integer.parseInt(opcion);
            }catch(NumberFormatException e){
              opcionNum=0;
            }

        /*************************/

        // switch
          switch(opcionNum){
            // planetas
              case 1:// mercurio
                System.out.print(planetas.get(0).muestra());
              break;

              case 2:// venus
                System.out.print(planetas.get(1).muestra());
              break;

              case 3:// tierra
                System.out.print(planetas.get(2).muestra());
              break;

              case 4:// marte
                System.out.print(planetas.get(3).muestra());
              break;

              case 5:// júpiter
                System.out.print(planetas.get(4).muestra());
              break;

              case 6:// saturno
                System.out.print(planetas.get(5).muestra());
              break;

              case 7:// urano
                System.out.print(planetas.get(6).muestra());
              break;

              case 8:// neptuno
                System.out.print(planetas.get(7).muestra());
              break;

            /****************/

            // satélites
              case 9:// la luna
                System.out.print(satelites.get(0).muestra());
              break;

              case 10:// fobos
                System.out.print(satelites.get(1).muestra());
              break;

              case 11:// deimos
                System.out.print(satelites.get(2).muestra());
              break;

              case 12:// ío
                System.out.print(satelites.get(3).muestra());
              break;

              case 13:// europa
                System.out.print(satelites.get(4).muestra());
              break;

              case 14:// ganímedes
                System.out.print(satelites.get(5).muestra());
              break;

              case 15:// calisto
                System.out.print(satelites.get(6).muestra());
              break;

              case 16:// mimas
                System.out.print(satelites.get(7).muestra());
              break;

              case 17:// encélado
                System.out.print(satelites.get(8).muestra());
              break;

              case 18:// titán
                System.out.print(satelites.get(9).muestra());
              break;

              case 19:// miranda
                System.out.print(satelites.get(10).muestra());
              break;

              case 20:// tritón
                System.out.print(satelites.get(11).muestra());
              break;

              case 21:// proteo
                System.out.print(satelites.get(12).muestra());
              break;

              case 22:// caronte
                System.out.print(satelites.get(13).muestra());
              break;

              case 23:// hydra
                System.out.print(satelites.get(14).muestra());
              break;

              default:
                System.out.print("\nOpción inválida.");
          }
      }while(opcionNum!=24);
  }
}