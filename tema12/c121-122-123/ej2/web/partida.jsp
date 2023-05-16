<!--
  @author: Christian Millán Soria
  @file: partida.jsp
  @info: página donde se ejecuta la partida
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
        margin-top: 20px;
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
        margin: 20px auto; /* Centra las imágenes horizontalmente */
        display: block; /* Añade esta línea para centrar verticalmente las imágenes */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      }

      .jugada{
        opacity: 0;
        transition: opacity 0.5s ease-in-out;
      }

      .jugadasContainer{
        display: flex;
        justify-content: center;
        margin-bottom: 20px;
      }

      .jugadaContainer{
        display: flex;
        flex-direction: column;
        align-items: center;
        margin-right: 20px;
      }

      .imagenJugador{
        width: 200px;
        height: auto;
        box-shadow: 0 0px 8px rgb(41, 41, 41);
        border-radius: 6px;
      }

      #contadorPuntos{
        position: absolute;
        top: 20px;
        left: 20px;
        display: flex;
        flex-wrap: wrap;
        align-items: center;
        justify-content: space-between;
        font-size: 24px;
        font-weight: bold;
        padding: 10px;
        background-color: #2c3e50;
        color: #fff;
        border-radius: 4px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      }

      #contadorPuntos .jugador1, #contadorPuntos .jugador2{
        display: flex;
        align-items: center;
        margin-bottom: 10px;
      }

      #contadorPuntos .jugador1 .nombre, #contadorPuntos .jugador2 .nombre{
        margin-right: 10px;
      }

      #contadorPuntos .jugador1 .puntos, #contadorPuntos .jugador2 .puntos{
        padding: 6px 10px;
        background-color: #ff5722;
        border-radius: 4px;
      }
    </style>
    <script>
      function getJugadaText(jugada){
        switch(jugada){
          case 1:
            return "Piedra";

          case 2:
            return "Papel";

          case 3:
            return "Tijera";

          default:
            return "";
        }
      }

      /*******************************************************************************************************/

      // iniciar la partida al cargar la página
        window.onload=function(){
          var jugador1={nombre: '<%= request.getParameter("nombre1") %>', imagen: "1.png", puntos: 0};
          var jugador2={nombre: '<%= request.getParameter("nombre2") %>', imagen: "2.png", puntos: 0};

          jugarRonda(jugador1, jugador2);
        };

      /*******************************************************************************************************/

      function jugarRonda(jugador1, jugador2) {
        // generar jugada aleatoria para cada jugador
          var jugadaJugador1=Math.floor(Math.random()*3)+1;// 1: piedra, 2: papel, 3: tijera
          var jugadaJugador2=Math.floor(Math.random()*3)+1;

          var resultado=document.getElementById('resultado');

        /******************************************/

        // contenido de la jugada actual
          var jugadaHtml="";
            jugadaHtml+="<div class='jugadaContainer'><img class='imagenJugador' src='"+jugador1.imagen+"'><br>";
            jugadaHtml+=jugador1.nombre+" ha sacado: "+getJugadaText(jugadaJugador1)+"</div>";
            jugadaHtml+="<div class='jugadaContainer'><img class='imagenJugador' src='"+jugador2.imagen+"'><br>";
            jugadaHtml+=jugador2.nombre+" ha sacado: "+getJugadaText(jugadaJugador2)+"</div>";

        /******************************************/

        // determinar ganador de la ronda
          var rondaResultado="";
          if (jugadaJugador1===jugadaJugador2){// los tres "=" comprueban el valor y el tipo de dato
            rondaResultado="<span class='empate'>Empate. Ambos jugadores han elegido la misma opción.</span>";
          }else if((jugadaJugador1===1&&jugadaJugador2===3)||(jugadaJugador1===2&&jugadaJugador2===1)||(jugadaJugador1===3&&jugadaJugador2===2)){
            // jugador 1 gana la ronda
              jugador1.puntos++;
              rondaResultado="<span class='jugador1'>"+jugador1.nombre+" gana la ronda. Puntos: "+jugador1.puntos+"</span>";
          }else{
            // jugador 2 gana la ronda
              jugador2.puntos++;
              rondaResultado="<span class='jugador2'>"+jugador2.nombre+" gana la ronda. Puntos: "+jugador2.puntos+"</span>";
          }

        /******************************************/

        // actualización del contador
          var contadorPuntos=document.getElementById('contadorPuntos');
          contadorPuntos.innerHTML=jugador1.nombre+" &rarr; "+jugador1.puntos+" - "+jugador2.puntos+" &larr; "+jugador2.nombre;

        /******************************************/

        // contenido completo con la jugada actual y el resultado de la ronda
          var contenidoHtml="<div class='jugada' style='opacity: 0;'>"+jugadaHtml+rondaResultado+"</div>";

        /******************************************/

        // actualizar el contenido del elemento "resultado"
          resultado.innerHTML=contenidoHtml;

        /******************************************/

        // obtener el elemento de la jugada actual para aplicar la transición - //! no me funciona, debería mostrar una pequeña animación entre jugada y jugada
          var jugadaActual=resultado.getElementsByClassName('jugada')[0];// el "[0]" devuelve el primer elemento con la clase "jugada", ya que la función "getElementsByClassName" devuelve una lista
          jugadaActual.style.opacity=1;

        /******************************************/

        // verificar si alguno de los jugadores ha llegado a 5 puntos, si es así, termino el programa
          if(jugador1.puntos===5){
            resultado.innerHTML+="<h1 class='jugador1'>¡"+jugador1.nombre+" gana la partida!</h1><br>";
            resultado.innerHTML+="<img src='"+jugador1.imagen+"'><br>";
          }else if(jugador2.puntos===5){
            resultado.innerHTML+="<h1 class='jugador2'>¡"+jugador2.nombre+" gana la partida!</h1><br>";
            resultado.innerHTML+="<img src='"+jugador2.imagen+"'><br>";
          }else{
            // continuar jugando
              setTimeout(function(){
                jugarRonda(jugador1, jugador2);// ejecuto una nueva ronda
              }, 2400);
          }
      }
    </script>
  </head>
  <body>
    <div id="contadorPuntos"></div>
    <div id="resultado"></div>
  </body>
</html>