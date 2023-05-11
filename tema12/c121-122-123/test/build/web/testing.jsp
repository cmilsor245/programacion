<%-- 
    Document   : index
    Created on : May 11, 2023, 11:39:36 AM
    Author     : Christian Millán Soria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%out.print("<b><i>"); %>Esta línea se ha puesto en negrita y cursiva mediante Java.<% out.print("</i></b>");%>
        
        
        
        <%
          for(int i=1; i<7; i++)
            out.println("<h"+(7-i)+">"+i+"</h"+(7-i)+">");
        %>
        
        
        
        <%int x=3;%>
        <h<%out.print(x); %>>hola</h<%out.print(x);%>>
        
        
        
        <%
          out.print("Fabricante de Java: "+System.getProperty("java.vendor"));
          out.print("<br>Url del fabricante: "+System.getProperty("java.vendor.url"));
          out.print("<br>Versión: "+System.getProperty("java.version"));
          out.print("<br>Sistema operativo: "+System.getProperty("os.name"));
          out.print("<br>Usuario: "+System.getProperty("user.name"));
        %>
        
        
        
        <h1>Ejemplo de tabla</h1>

        <table border="2">
          <tr>
            <td>Número</td><td>Cuadrado</td>
          </tr>

          <%
            for(int i=0; i<10; i++){
              out.println("<tr>");
              out.println("<td>" + i + "</td>");
              out.println("<td>");
              out.println(i * i);
              out.println("</td></tr>");
            }
          %>
    </body>
</html>