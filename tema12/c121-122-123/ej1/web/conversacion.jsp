<!--
  @author: Christian Millán Soria
  @file: conversacion.jsp
  @info: página donde se genera la conversación
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.Personajes"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="conversacion.css">
    <style>
      .imagenes-container, .saludos-container{
        display: flex;
      }

      .imagenPersonaje, .saludoPersonaje{
        flex: 1;
        max-width: 33.3333%;
        margin-right: 10px;
      }

      .imagenPersonaje{
        margin-bottom: 20px;
      }

      .saludoPersonaje{
        margin-bottom: 40px;
      }

      #saludo1{
        position: relative;
        background-color: #fce8cd;
        color: #7f5624;
        padding: 12px;
        border-radius: 8px;
        font-family: "Comic Sans MS", cursive;
        font-size: 20px;
        font-weight: bold;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
        top: 10px;
        left: 10px;
      }

      #saludo1:before{
        content: '';
        position: absolute;
        top: -10px;
        left: 10px;
        border-style: solid;
        border-width: 0 10px 10px 10px;
        border-color: transparent transparent #fce8cd transparent;
      }

      #saludo2{
        position: relative;
        background-color: #e2f0cb;
        color: #40660d;
        padding: 14px;
        border-radius: 12px;
        font-family: "Courier New", monospace;
        font-size: 22px;
        font-weight: normal;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.3);
        top: 10px;
        left: 10px;
      }

      #saludo2:before{
        content: '';
        position: absolute;
        top: -10px;
        left: 10px;
        border-style: solid;
        border-width: 0 12px 12px 12px;
        border-color: transparent transparent #e2f0cb transparent;
      }

      #saludo3{
        position: relative;
        background-color: #d2e4f7;
        color: #1d428a;
        padding: 16px;
        border-radius: 10px;
        font-family: "Verdana", sans-serif;
        font-size: 18px;
        font-weight: bold;
        box-shadow: 0 1px 3px rgba(0, 0, 0, 0.4);
        top: 10px;
        left: 10px;
      }

      #saludo3:before{
        content: '';
        position: absolute;
        top: -10px;
        left: 10px;
        border-style: solid;
        border-width: 0 14px 14px 14px;
        border-color: transparent transparent #d2e4f7 transparent;
      }
    </style>
    <title>EJERCICIO 1</title>
  </head>
  <body>
    <h1>CONVERSACIÓN</h1>

    <hr>

    <div class="contenedor-principal">
      <div class="imagenes-container">
        <div class="imagenPersonaje">
          <% 
            Personajes personaje1 = new Personajes(request.getParameter("nombre1"), "1.png");
            out.print(personaje1.mostrarImagen());
          %>
        </div>    
        <div class="imagenPersonaje">
          <% 
            Personajes personaje2 = new Personajes(request.getParameter("nombre2"), "2.png");
            out.print(personaje2.mostrarImagen());
          %>
        </div>
        <div class="imagenPersonaje">
          <% 
            Personajes personaje3 = new Personajes(request.getParameter("nombre3"), "3.png");
            out.print(personaje3.mostrarImagen());
          %>
        </div>
      </div>

      <div class="saludos-container">
        <div id="saludo1" class="saludoPersonaje">
          <% out.print(personaje1.mostrarSaludo(request.getParameter("saludo1"))); %>
        </div>
        <div id="saludo2" class="saludoPersonaje">
          <% out.print(personaje2.mostrarSaludo(request.getParameter("saludo2"))); %>
        </div>
        <div id="saludo3" class="saludoPersonaje">
          <% out.print(personaje3.mostrarSaludo(request.getParameter("saludo3"))); %>
        </div>
      </div>
    </div>
  </body>
</html>