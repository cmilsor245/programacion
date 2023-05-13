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
    .personajes-container, .conversacion-container{
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
    var personaje1, personaje2, personaje3;

    function mostrarPersonajes(){
      personaje1='<%=new Personajes(request.getParameter("nombre1"), "1.png").toString(request.getParameter("saludo1"))%>';
      personaje2='<%=new Personajes(request.getParameter("nombre2"), "2.png").toString(request.getParameter("saludo2"))%>';
      personaje3='<%=new Personajes(request.getParameter("nombre3"), "3.png").toString(request.getParameter("saludo3"))%>';

      setTimeout(function(){
        var personaje1Element=document.getElementById("personaje1");
        personaje1Element.innerHTML=personaje1;
        personaje1Element.classList.add("fade-in");
      }, 1000);

      setTimeout(function(){
        var personaje2Element=document.getElementById("personaje2");
        personaje2Element.innerHTML=personaje2;
        personaje2Element.classList.add("fade-in");
      }, 2500);

      setTimeout(function(){
        var personaje3Element=document.getElementById("personaje3");
        personaje3Element.innerHTML=personaje3;
        personaje3Element.classList.add("fade-in");
      }, 3500);

      setTimeout(cambiarSaludo, 5000);

      setTimeout(function(){
        var personajes=document.querySelectorAll(".fade-in");

        personajes.forEach(function(personaje){
          personaje.classList.remove("fade-in");
        });
      }, 4500);
    }

    /*********************************************************************/

    var conver1;

    function generarConversacion(){
      conver1=<%=%>;
    }
  </script>
</head>
<body onload="mostrarPersonajes()">
  <h1>CONVERSACIÓN</h1>

  <hr>

  <div class="personajes-container">
    <div id="personaje1" class="personaje">
      <%Personajes personaje1=new Personajes(request.getParameter("nombre1"), "1.png");%>
      <%=personaje1.toString(request.getParameter("saludo1"))%>
    </div>
    <div id="personaje2" class="personaje"></div>
    <div id="personaje3" class="personaje"></div>
  </div>

  <div class="conversacion-container">
    <%
      String[] conversacionesAlAzar=new String[3];

      int opcionConversacion=(int)(Math.random()*conversacionesAlAzar.length);

      String mensaje1=personaje1.conversacionAleatoria(opcionConversacion, 1);
    %>

    <div id="conver1" class="personaje"></div>
  </div>
</body>
</html>