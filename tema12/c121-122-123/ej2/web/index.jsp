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
    <title>EJERCICIO 2</title>
    <style>
      body{
        font-family: 'Arial', sans-serif;
        margin: 0;
        padding: 20px;
        background-color: #f4f4f4;
      }

      h1{
        text-align: center;
        color: #333;
        margin-bottom: 30px;
      }

      form{
        max-width: 400px;
        margin: 0 auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        animation: slideIn 0.5s ease;
        display: flex;
        flex-direction: column;
      }

      @keyframes slideIn{
        from{
          transform: translateY(-20px);
          opacity: 0;
        }to{
          transform: translateY(0);
          opacity: 1;
        }
      }

      p{
        margin-bottom: 10px;
      }

      input[type="text"]{
        display: block;
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: none;
        border-bottom: 2px solid transparent;
        background-color: #f9f9f9;
        transition: border-bottom-color 0.3s ease;
        box-sizing: border-box;
      }

      input[type="text"]:focus{
        outline: none;
        border-bottom-color: #007bff;
        animation: slideRight 0.3s ease;
      }

      @keyframes slideRight{
        from {
          width: 0;
          opacity: 0;
        }to{
          width: 100%;
          opacity: 1;
        }
      }

      input[type="submit"]{
        display: block;
        width: 100%;
        padding: 10px;
        border: none;
        background-color: #007bff;
        color: #fff;
        font-weight: bold;
        cursor: pointer;
        border-radius: 4px;
        transition: background-color 0.3s ease;
      }

      input[type="submit"]:hover{
        background-color: #0056b3;
        transform: translateY(-2px);
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
      }

      hr{
        margin-top: 20px;
        margin-bottom: 30px;
        border: none;
        border-top: 1px solid #ccc;
      }
    </style>
  </head>
  <body>
    <h1>DATOS REQUERIDOS</h1>

    <hr>

    <form method="post" action="partida.jsp">
      <p>Introduce el nombre de los 2 jugadores:</p>

      <input type="text" autofocus name="nombre1" placeholder="Kylo Ren" autocomplete="off">
      <input type="text" name="nombre2" placeholder="Sheev Palpatine" autocomplete="off">

      <input type="submit" value="CONFIRMAR">
    </form>
  </body>
</html>