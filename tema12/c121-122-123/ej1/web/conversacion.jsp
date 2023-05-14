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