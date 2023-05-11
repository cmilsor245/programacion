<!--
  @author: Christian Millán Soria
  @file: index.jsp
  @info: página principal
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="index.css">
    <title>EJERCICIO 1</title>
  </head>
  <body>
    <h1>DATOS REQUERIDOS</h1>

    <hr>

    <form method="post" action="conversacion.jsp">
      <p>Introduce el nombre de los 3 participantes:</p>

      <input id="name-input1" type="text" autofocus name="nombre1" placeholder="Luke Skywalker">
      <input id="name-input2" type="text" name="nombre1" placeholder="Rey Skywalker">
      <input id="name-input3" type="text" name="nombre1" placeholder="BB-8">

      <input type="submit" value="CONFIRMAR">
    </form>
  </body>
</html>