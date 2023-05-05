/**
  @author: Christian Millán Soria
  @file: TestEj2Extra.java
  @info: programa principal
*/

package tema9.c93.ej2_extra;

import tema9.c93.ej2_extra.astros.Planetas;

import tema9.c93.ej2_extra.astros.Satelites;

import java.util.Scanner;

public class TestEj2Extra{
  public static void main(String[] args){
    // creación de instancias
      // planetas
        Planetas[] arrayPlanetas=new Planetas[8];// los 8 planetas del sistema solar

        arrayPlanetas[0]=new Planetas(2439.7, 1408, 33011, 167, 3.7, "Mercurio", 57.91, 87.97);
        arrayPlanetas[1]=new Planetas(6051.8, 5832.5, 48675, 462, 8.87, "Venus", 108.2, 224.7);
        arrayPlanetas[2]=new Planetas(6371, 24, 5.972e24, 15, 9.81, "Tierra", 149.6, 365.24);
        arrayPlanetas[3]=new Planetas(3389.5, 24.6, 6.4171e23, -63, 3.71, "Marte", 227.9, 686.98);
        arrayPlanetas[4]=new Planetas(69911, 9.9, 1.8982e27, -108, 24.79, "Júpiter", 778.5, 4332.59);
        arrayPlanetas[5]=new Planetas(58232, 10.7, 5.6834e26, -139, 10.44, "Saturno", 1.4e9, 10759.22);
        arrayPlanetas[6]=new Planetas(25362, 17.2, 8.681e25, -197, 8.87, "Urano", 2.87e9, 30688.5);
        arrayPlanetas[7]=new Planetas(24622, 16.1, 1.0243e26, -201, 11.15, "Neptuno", 4.5e9, 60182);

      /*********************/

      // satélites
        Satelites[] arraySatelites=new Satelites[15];// 15 satélites de los más conocidos del sistema solar

        arraySatelites[0]=new Satelites(1737.5, 27.3, 7.342, -20, 1.62, "La Luna", 384.400, 27.3, arrayPlanetas[2]);
          arrayPlanetas[2].agregarSatelite(arraySatelites[0]);
        arraySatelites[1]=new Satelites(11.1, 7.66, 1.08e+16, -40, 0.0084, "Fobos", 9378, 7.66, arrayPlanetas[3]);
          arrayPlanetas[3].agregarSatelite(arraySatelites[1]);
        arraySatelites[2]=new Satelites(6.2, 30.3, 2.4e+15, -40, 0.003, "Deimos", 23460, 1.26, arrayPlanetas[3]);
          arrayPlanetas[3].agregarSatelite(arraySatelites[2]);
        arraySatelites[3]=new Satelites(1821.3, 42.5, 8.94e+22, -143, 1.796, "Ío", 421700, 1.77, arrayPlanetas[4]);
          arrayPlanetas[4].agregarSatelite(arraySatelites[3]);
        arraySatelites[4]=new Satelites(1560.8, 85.2, 4.8e+22, -161, 1.314, "Europa", 671034, 3.55, arrayPlanetas[4]);
          arrayPlanetas[4].agregarSatelite(arraySatelites[4]);
        arraySatelites[5]=new Satelites(2634.1, 171, 1.48e+23, -163, 1.428, "Ganímedes", 1070400, 7.16, arrayPlanetas[4]);
          arrayPlanetas[4].agregarSatelite(arraySatelites[5]);
        arraySatelites[6]=new Satelites(2410.3, 16.69, 1.08e+23, -139, 1.235, "Calisto", 1883000, 16.69, arrayPlanetas[4]);
          arrayPlanetas[4].agregarSatelite(arraySatelites[6]);
        arraySatelites[7]=new Satelites(198.2, 22.6, 3.75e+19, -181, 0.063, "Mimas", 185540, 0.94, arrayPlanetas[5]);
          arrayPlanetas[5].agregarSatelite(arraySatelites[7]);
        arraySatelites[8]=new Satelites(252.1, 1.370218, 1.08e+20, -198, 0.113, "Encélado", 238037, 1.37, arrayPlanetas[5]);
          arrayPlanetas[5].agregarSatelite(arraySatelites[8]);
        arraySatelites[9]=new Satelites(2575, 15.94542, 1.35e+23, -179, 1.352, "Titán", 1221870, 15.95, arrayPlanetas[5]);
          arrayPlanetas[5].agregarSatelite(arraySatelites[9]);
        arraySatelites[10]=new Satelites(235.8, 34.2, 6.59e+19, -187, 0.079, "Miranda", 129390, 1.41, arrayPlanetas[6]);
          arrayPlanetas[6].agregarSatelite(arraySatelites[10]);
        arraySatelites[11]=new Satelites(1353.4, 5.876854, 2.14e+22, -235, 0.779, "Tritón", 354760, 5.88, arrayPlanetas[7]);
          arrayPlanetas[7].agregarSatelite(arraySatelites[11]);
        arraySatelites[12]=new Satelites(210, 1.122315, 5.02e+19, -200, 0.064, "Proteo", 117647, 1.12, arrayPlanetas[7]);
          arrayPlanetas[7].agregarSatelite(arraySatelites[12]);
        arraySatelites[13]=new Satelites(606, 6.387230, 1.586e+21, -230, 0.273, "Caronte", 19570, 6.39, arrayPlanetas[7]);
          arrayPlanetas[7].agregarSatelite(arraySatelites[13]);
        arraySatelites[14]=new Satelites(40, 38.2021, 4.2e+16, 0, 9.8, "Hydra", 64749, 38.2, arrayPlanetas[7]);
          arrayPlanetas[7].agregarSatelite(arraySatelites[14]);

    /*************************************************/

    // menú
      int opcion;

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
            opcion=input.nextInt();

        /*************************/

        // switch
          switch(opcion){
            // planetas
              case 1:// mercurio
                System.out.print(arrayPlanetas[0].muestra());
              break;

              case 2:// venus
                System.out.print(arrayPlanetas[1].muestra());
              break;

              case 3:// tierra
                System.out.print(arrayPlanetas[2].muestra());
              break;

              case 4:// marte
                System.out.print(arrayPlanetas[3].muestra());
              break;

              case 5:// júpiter
                System.out.print(arrayPlanetas[4].muestra());
              break;

              case 6:// saturno
                System.out.print(arrayPlanetas[5].muestra());
              break;

              case 7:// urano
                System.out.print(arrayPlanetas[6].muestra());
              break;

              case 8:// neptuno
                System.out.print(arrayPlanetas[7].muestra());
              break;

            /****************/

            // satélites
              case 9:// la luna
                System.out.print(arraySatelites[0].muestra());
              break;

              case 10:// fobos
                System.out.print(arraySatelites[1].muestra());
              break;

              case 11:// deimos
                System.out.print(arraySatelites[2].muestra());
              break;

              case 12:// ío
                System.out.print(arraySatelites[3].muestra());
              break;

              case 13:// europa
                System.out.print(arraySatelites[4].muestra());
              break;

              case 14:// ganímedes
                System.out.print(arraySatelites[5].muestra());
              break;

              case 15:// calisto
                System.out.print(arraySatelites[6].muestra());
              break;

              case 16:// mimas
                System.out.print(arraySatelites[7].muestra());
              break;

              case 17:// encélado
                System.out.print(arraySatelites[8].muestra());
              break;

              case 18:// titán
                System.out.print(arraySatelites[9].muestra());
              break;

              case 19:// miranda
                System.out.print(arraySatelites[10].muestra());
              break;

              case 20:// tritón
                System.out.print(arraySatelites[11].muestra());
              break;

              case 21:// proteo
                System.out.print(arraySatelites[12].muestra());
              break;

              case 22:// caronte
                System.out.print(arraySatelites[13].muestra());
              break;

              case 23:// hydra
                System.out.print(arraySatelites[14].muestra());
              break;
          }
      }while(opcion!=24);
  }
}