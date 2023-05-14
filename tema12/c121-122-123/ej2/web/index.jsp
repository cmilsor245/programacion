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
      body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 20px;
      }
    
      h1 {
        text-align: center;
        color: #333;
      }
    
      form {
        max-width: 400px;
        margin: 0 auto;
      }
    
      p {
        margin-bottom: 10px;
      }
    
      input[type="text"] {
        display: block;
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
      }
    
      input[type="submit"] {
        display: block;
        width: 100%;
        padding: 10px;
        border: none;
        background-color: #007bff;
        color: #fff;
        font-weight: bold;
        cursor: pointer;
        border-radius: 4px;
      }
    
      input[type="submit"]:hover {
        background-color: #0056b3;
      }
    
      hr {
        margin-top: 20px;
        margin-bottom: 20px;
        border: 0;
        border-top: 1px solid #ccc;
      }
    </style>
  </head>
  <body>
    <h1>DATOS REQUERIDOS</h1>

    <hr>

    <form method="post" action="partida.jsp">
      <p>Introduce el nombre de los 2 jugadores:</p>

      <input type="text" autofocus name="nombre1" placeholder="Kylo Ren">
      <input type="text" name="nombre2" placeholder="Sheev Palpatine">

      <input type="submit" value="CONFIRMAR">
    </form>
  </body>
</html>