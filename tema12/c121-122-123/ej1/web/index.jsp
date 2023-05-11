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
      <p>Introduce el nombre de los 3 personajes:</p>

      <input type="text" autofocus name="nombre1" placeholder="Luke Skywalker">
      <input type="text" name="nombre2" placeholder="Rey Skywalker">
      <input type="text" name="nombre3" placeholder="BB-8">

      <p>Selecciona una presentación para cada personaje:</p>

      <fieldset>
        <input type="radio" name="saludo1" id="saludo1-1" value="Hola">
        <label for="saludo1-1">1</label>

        <input type="radio" name="saludo1" id="saludo1-2" value="Buenos días">
        <label for="saludo1-2">2</label>

        <input type="radio" name="saludo1" id="saludo1-3" value="Buenas tardes">
        <label for="saludo1-3">3</label>
      </fieldset>

      <br><br>

      <fieldset>
        <input type="radio" name="saludo2" id="saludo2-1" value="Hola">
        <label for="saludo2-1">1</label>

        <input type="radio" name="saludo2" id="saludo2-2" value="Buenos días">
        <label for="saludo2-2">2</label>

        <input type="radio" name="saludo2" id="saludo2-3" value="Buenas tardes">
        <label for="saludo2-3">3</label>
      </fieldset>

      <br><br>

      <fieldset>
        <input type="radio" name="saludo3" id="saludo3-1" value="Hola">
        <label for="saludo3-1">1</label>

        <input type="radio" name="saludo3" id="saludo3-2" value="Buenos días">
        <label for="saludo3-2">2</label>

        <input type="radio" name="saludo3" id="saludo3-3" value="Buenas tardes">
        <label for="saludo3-3">3</label>
      </fieldset>

      <input type="submit" value="CONFIRMAR">
    </form>
  </body>
</html>