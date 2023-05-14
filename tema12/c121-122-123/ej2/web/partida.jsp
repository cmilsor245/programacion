<!--
  @author: Christian Millán Soria
  @file: index.jsp
  @info: página principal
-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>

<%@ page import="classes.Personajes" %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>EJERCICIO 2</title>
    <style>
      body{
        font-family: 'Arial', sans-serif;
        margin: 0;
        padding: 20px;
        background-color: #f4f4f4;
        text-align: center;
      }

      h1{
        color: #333;
        font-size: 28px;
        margin-bottom: 30px;
      }

      .jugador1, .jugador2{
        display: inline-block;
        padding: 10px 20px;
        border-radius: 4px;
        font-weight: bold;
        text-transform: uppercase;
      }

      .jugador1{
        color: #ff0040;
        background-color: #fcecec;
        border: 2px solid #ff0040;
      }

      .jugador2{
        color: #0095ff;
        background-color: #e8f5ff;
        border: 2px solid #0095ff;
      }

      .empate{
        color: #666;
        font-weight: bold;
        font-style: italic;
        margin-bottom: 20px;
      }

      img{
        max-width: 200px;
        margin-top: 20px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      }
    </style>
  </head>
  <body>
    <%
      Personajes jugador1=new Personajes("Jugador 1", "1.png");
      Personajes jugador2=new Personajes("Jugador 2", "2.png");

      int puntosJugador1=0;
      int puntosJugador2=0;

      while(puntosJugador1<5&& puntosJugador2<5){
        // generar jugada aleatoria para cada jugador
          int jugadaJugador1=(int)(Math.random()*3)+1;// 1: piedra, 2: papel, 3: tijera
          int jugadaJugador2=(int)(Math.random()*3)+1;

        // determinar ganador de la ronda
          if(jugadaJugador1==jugadaJugador2){
            out.println("<span class='empate'>Empate. Ambos jugadores eligieron la misma opción.</span><br>");
          }else if((jugadaJugador1==1&&jugadaJugador2==3)||(jugadaJugador1==2&&jugadaJugador2==1)||(jugadaJugador1==3&&jugadaJugador2==2)){
            // jugador 1 gana la ronda
              puntosJugador1++;
              out.println("<span class='jugador1'>Jugador 1 gana la ronda. Puntos: "+puntosJugador1+"</span><br>");
          }else{
            // jugador 2 gana la ronda
              puntosJugador2++;
              out.println("<span class='jugador2'>Jugador 2 gana la ronda. Puntos: "+puntosJugador2+"</span><br>");
          }
      }

      // determinar ganador de la partida
        if(puntosJugador1==5){
          out.println("<h1 class='jugador1'>Jugador 1 gana la partida!</h1><br>");
          out.println(jugador1.mostrarImagen()+"<br>");
        }else{
          out.println("<h1 class='jugador2'>Jugador 2 gana la partida!</h1><br>");
          out.println(jugador2.mostrarImagen()+"<br>");
        }
    %>
  </body>
</html>