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
    .personajes-container{
      display: flex;
    }

    .personaje{
      flex: 1;
      max-width: 33.3333%;
      margin-right: 10px;
    }
  </style>
  <title>EJERCICIO 1</title>
  <script>
      personaje1='<%Personajes personaje1=new Personajes(request.getParameter("nombre1"), "1.png");%>';
      personaje2='<%Personajes personaje2=new Personajes(request.getParameter("nombre2"), "2.png");%>';
      personaje3='<%Personajes personaje3=new Personajes(request.getParameter("nombre3"), "3.png");%>';

    function mostrarPersonajes(){
      var personaje1Element=document.getElementById("personaje1");
      personaje1Element.innerHTML=personaje1;

      var personaje2Element=document.getElementById("personaje2");
      personaje2Element.innerHTML=personaje2;

      var personaje3Element=document.getElementById("personaje3");
      personaje3Element.innerHTML=personaje3;
    }
  </script>
</head>
<body onload="mostrarPersonajes()">
  <h1>CONVERSACIÓN</h1>

  <hr>

  <div class="personajes-container">
    <div id="personaje1" class="personaje"></div>
    <div id="personaje2" class="personaje"></div>
    <div id="personaje3" class="personaje"></div>
  </div>

  <div class="personajes-container">
    <div id="conver1" class="personaje">
      <%
        int opcionConversacion=(int)(Math.random()*3+1);

        personaje1.conversacionAleatoria(opcionConversacion, 1);
      %>
    </div>
    <div id="conver2" class="personaje"></div>
    <div id="conver3" class="personaje"></div>
  </div>
</body>
</html>