/**
  @author: Christian Millán Soria
  @file: TestEj6Extra.java
  @info: clase main
*/

package tema9.c93.ej6_extra;

import tema9.c93.ej6_extra.classes.Vehiculo;

import tema9.c93.ej6_extra.classes.terrestres.*;

import tema9.c93.ej6_extra.classes.acuaticos.*;

import tema9.c93.ej6_extra.classes.aereos.*;

public class TestEj6Extra{
  public static void main(String[] args){
    // array de vehículos
      int t=12;
      Vehiculo[] arrayVehiculos=new Vehiculo[t];

        int tipo=1;
        String matricula="";
        String modelo="";
        String color="";
        int numLetrasAcuatico;

        for(int i=0; i<t; i++){
          switch(tipo){
            case 1, 7:// coches
              matricula="";
              modelo="";
              for(int j=0; j<4; j++){
                matricula+=(int)(Math.random()*10);
              }

              char[] matriculaLetrasCoche=new char[3];
              String letrasPermitidasCoche="ABCDEFGHJKLMNÑPQRSTUVWXYZ";//* no estoy seguro de que todas las letras estén permitidas en una matrícula
              for(int k=0; k<3; k++){
                int index=(int)(Math.random()*letrasPermitidasCoche.length());

                matriculaLetrasCoche[k]=letrasPermitidasCoche.charAt(index);

                matricula+=matriculaLetrasCoche[k];
              }

              String[] modelosCoches={"Ford Mustang", "Toyota Camry", "Honda Civic", "Volkswagen Golf", "Jeep Wrangler", "Chevrolet Camaro", "BMW Serie 3", "Mercedes-Benz Clase C", "Audi A4", "Mazda CX-5", "Subaru Forester", "Nissan Altima", "Kia Optima", "Hyundai Sonata", "Volvo XC90"};
              int indexModelosCoches=(int)(Math.random()*modelosCoches.length);
              modelo=modelosCoches[indexModelosCoches];

              arrayVehiculos[i]=new Coche(matricula, modelo);
            break;

            case 2, 8:// motos
              matricula="";
              modelo="";
              for(int j=0; j<4; j++){
                matricula+=(int)(Math.random()*10);
              }

              char[] matriculaLetrasMoto=new char[3];
              String letrasPermitidasMoto="ABCDEFGHJKLMNÑPQRSTUVWXYZ";
              for(int k=0; k<3; k++){
                int index=(int)(Math.random()*letrasPermitidasMoto.length());

                matriculaLetrasMoto[k]=letrasPermitidasMoto.charAt(index);

                matricula+=matriculaLetrasMoto[k];
              }

              String[] modelosMotos={"Harley-Davidson Sportster", "Yamaha YZF-R6", "Honda CBR1000RR Fireblade", "Ducati Panigale V4", "Kawasaki Ninja ZX-6R", "Suzuki GSX-R1000", "Triumph Street Triple", "BMW S 1000 RR", "Aprilia RSV4", "KTM 1290 Super Duke R", "Indian Scout", "Victory Vegas", "Moto Guzzi V7", "Daelim S3", "Kymco Xciting 500", "SYM GTS 125", "Piaggio Beverly 300"};
              int indexModelosMotos=(int)(Math.random()*modelosMotos.length);
              modelo=modelosMotos[indexModelosMotos];

              String[] coloresMotos={"Rojo", "Azul", "Verde", "Amarillo", "Blanco", "Negro", "Gris", "Plateado", "Dorado", "Naranja"};
              int indexColoresMotos=(int)(Math.random()*coloresMotos.length);
              color=coloresMotos[indexColoresMotos];

              arrayVehiculos[i]=new Moto(matricula, modelo, color);
            break;

            case 3, 9:// barcos
              matricula="";
              modelo="";
              numLetrasAcuatico=(int)(Math.random()*8+3);

              char[] matriculaLetrasBarco=new char[numLetrasAcuatico];
              String letrasPermitidasBarco="ABCDEFGHJKLMNÑPQRSTUVWXYZ";
              for(int k=0; k<numLetrasAcuatico; k++){
                int index=(int)(Math.random()*letrasPermitidasBarco.length());

                matriculaLetrasBarco[k]=letrasPermitidasBarco.charAt(index);

                matricula+=matriculaLetrasBarco[k];
              }

              String[] modelosBarcos={"Titanic", "Queen Mary 2", "Symphony of the Seas", "Harmony of the Seas", "Allure of the Seas", "Oasis of the Seas", "MSC Grandiosa", "Costa Smeralda", "Norwegian Bliss", "Carnival Horizon", "Celebrity Edge", "Royal Princess", "Viking Sky", "Crystal Symphony", "Seabourn Ovation", "Azamara Pursuit", "Disney Dream"};
              int indexModelosBarcos=(int)(Math.random()*modelosBarcos.length);
              modelo=modelosBarcos[indexModelosBarcos];

              arrayVehiculos[i]=new Barco(matricula, modelo);
            break;

            case 4, 10:// submarinos
              matricula="";
              modelo="";
              numLetrasAcuatico=(int)(Math.random()*8+3);

              char[] matriculaLetrasSubmarino=new char[numLetrasAcuatico];
              String letrasPermitidasSubmarino="ABCDEFGHJKLMNÑPQRSTUVWXYZ";
              for(int k=0; k<numLetrasAcuatico; k++){
                int index=(int)(Math.random()*letrasPermitidasSubmarino.length());

                matriculaLetrasSubmarino[k]=letrasPermitidasSubmarino.charAt(index);

                matricula+=matriculaLetrasSubmarino[k];
              }

              String[] modelosSubmarinos={"Clase Virginia", "Clase Los Angeles", "Clase Seawolf", "Clase Ohio", "Clase Astute", "Clase Yasen", "Clase Barracuda", "Clase Rubis", "Clase Akula", "Clase Oscar", "Clase Tango", "Clase Kilo", "Clase Collins", "Clase Soryu", "Clase Gotland"};
              int indexModelosSubmarinos=(int)(Math.random()*modelosSubmarinos.length);
              modelo=modelosSubmarinos[indexModelosSubmarinos];

              arrayVehiculos[i]=new Submarino(matricula, modelo);
            break;

            case 5, 11:// aviones
              matricula="";
              modelo="";
              char[] matriculaLetrasAvion=new char[4];
              String letrasPermitidasAvion="ABCDEFGHJKLMNÑPQRSTUVWXYZ";
              for(int k=0; k<4; k++){
                int index=(int)(Math.random()*letrasPermitidasAvion.length());

                matriculaLetrasAvion[k]=letrasPermitidasAvion.charAt(index);

                matricula+=matriculaLetrasAvion[k];
              }

              for(int j=0; j<6; j++){
                matricula+=(int)(Math.random()*10);
              }

              String[] modelosAviones={"Boeing 747", "Airbus A380", "Boeing 737", "Airbus A320", "Boeing 777", "Embraer E190", "Bombardier CRJ900", "Cessna Citation Mustang", "Gulfstream G650", "Dassault Falcon 7X", "Lockheed Martin F-35 Lightning II", "McDonnell Douglas F/A-18 Hornet", "Boeing F/A-18E/F Super Hornet", "Eurofighter Typhoon", "Sukhoi Su-57"};
              int indexModelosAviones=(int)(Math.random()*modelosAviones.length);
              modelo=modelosAviones[indexModelosAviones];

              arrayVehiculos[i]=new Avion(matricula, modelo);
            break;

            case 6, 12:// helicópteros
              matricula="";
              modelo="";
              char[] matriculaLetrasHelicoptero=new char[4];
              String letrasPermitidasHelicoptero="ABCDEFGHJKLMNÑPQRSTUVWXYZ";
              for(int k=0; k<4; k++){
                int index=(int)(Math.random()*letrasPermitidasHelicoptero.length());

                matriculaLetrasHelicoptero[k]=letrasPermitidasHelicoptero.charAt(index);

                matricula+=matriculaLetrasHelicoptero[k];
              }

              for(int j=0; j<6; j++){
                matricula+=(int)(Math.random()*10);
              }

              String[] modelosHelicopteros={"Bell 407", "Eurocopter EC120", "AgustaWestland AW109", "Boeing CH-47 Chinook", "Sikorsky UH-60 Black Hawk", "Bell AH-1 Cobra", "Boeing AH-64 Apache", "AgustaWestland AW139", "Sikorsky S-76", "Eurocopter AS350", "Robinson R44", "McDonnell Douglas MD 900", "Kamov Ka-32", "Mil Mi-8", "Bell UH-1 Huey"};
              int indexModelosHelicopteros=(int)(Math.random()*modelosHelicopteros.length);
              modelo=modelosHelicopteros[indexModelosHelicopteros];

              arrayVehiculos[i]=new Helicoptero(matricula, modelo);
            break;
          }

          tipo++;
        }

    /***********************************************/

    // información de cada vehículo
      for(int i=0; i<t; i++){
        arrayVehiculos[i].imprimir();
      }
  }
}