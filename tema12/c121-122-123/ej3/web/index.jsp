<!--
  @author: Christian Millán Soria
  @file: index.jsp
  @info: página principal del ejercicio 20 del tema 12
-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>EJERCICIO 3</title>
  <style>
      table{
        border-collapse: collapse;
      }

      td{
        width: 50px;
        height: 50px;
        text-align: center;
        font-weight: bold;
      }

      .negra{
        background-color: #000000;
        color: #ffffff;
      }

      .blanca{
        background-color: #ffffff;
        color: #000000;
      }

      .piece{
        font-size: 30px;
      }
  </style>
</head>
<body>
  <table>
    <thead>
      <tr>
        <!-- cabeceras para las letras de cada casilla -->
          <th></th>
          <th>A</th>
          <th>B</th>
          <th>C</th>
          <th>D</th>
          <th>E</th>
          <th>F</th>
          <th>G</th>
          <th>H</th>
      </tr>
    </thead>

    <!--*******************************************************-->

    <tbody>
      <% 
        String[] letras={"A", "B", "C", "D", "E", "F", "G", "H"};
        String[][] tablero=new String[8][8];// array bidimensional para todas las posiciones posibles en el tablero
        String[] piezas={"&#9815;", "&#9816;"};// los siguientes códigos los he sacado de https://symbl.cc/es/collections/chess-symbols/ - he copiado el código html de las piezas que necesito, aunque he probado algunas otras y funcionan perfectamente con el css

        // generación de posición aleatoria para el alfil y el caballo
          int alfilFila=(int)(Math.random()*8);
          int alfilCol=(int) (Math.random()*8);
          int caballoFila, caballoCol;

        // asegurarse de que el caballo no se coloque en la misma casilla que el alfil
          do{
            caballoFila=(int)(Math.random()*8);
            caballoCol=(int)(Math.random()*8);
          } while(caballoFila==alfilFila&&caballoCol==alfilCol);// comprobación de coincidencia de fila y columna de las dos piezas

        // construir el tablero
          for(int fila=0; fila<8; fila++){
            for(int col=0; col<8; col++){
              if((fila + col)%2==0){
                tablero[fila][col]="negra";
              }else{
                tablero[fila][col]="blanca";
              }
            }
          }
      %>

      <% for(int fila=0; fila<8; fila++){ %>
        <tr>
          <th><%= 8-fila %></th>
          <% for(int col=0; col<8; col++){ %>
            <% if(fila==alfilFila&&col==alfilCol){ %>
              <td class="<%= tablero[fila][col] %> piece"><%= piezas[0] %></td>
            <% }else if(fila==caballoFila&&col==caballoCol){ %>
              <td class="<%= tablero[fila][col] %> piece"><%= piezas[1] %></td>
            <% }else{ %>
              <td class="<%= tablero[fila][col] %>"></td>
            <% } %>
          <% } %>
          <th><%= 8-fila %></th>
        </tr>
      <% } %>
    </tbody>

    <!--*******************************************************-->

    <tfoot>
      <tr>
        <th></th>
        <% for (int i=0; i<8; i++){ %>
          <th><%= letras[i] %></th>
        <% } %>
      </tr>
    </tfoot>
  </table>
</body>
</html>