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
    <title>EJERCICIO 1</title>
  </head>
  <body>
    <h1>CONVERSACIÓN</h1>

    <hr>

    <%
      Personajes personaje1=new Personajes(request.getParameter("nombre1"), "1.png");
      Personajes personaje2=new Personajes(request.getParameter("nombre2"), "2.png");
      Personajes personaje3=new Personajes(request.getParameter("nombre3"), "3.png");

      out.print(personaje1);
    %>
  </body>
</html>