<!--
  @author: Christian Millán Soria
  @file: index.jsp
  @info: página principal
-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>EJERCICIO 3</title>
    <style>

    </style>
  </head>
  <body>
    <h1>DATOS REQUERIDOS</h1>

    <hr>

    <form method="post" action="partida.jsp">
      <p>Introduce el nombre de los 3 personajes:</p>

      <input type="text" autofocus name="nombre1" placeholder="Kylo Ren">
      <input type="text" name="nombre2" placeholder="Sheev Palpatine">

      <input type="submit" value="CONFIRMAR">
    </form>
  </body>
</html>