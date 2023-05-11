<%-- 
    Document   : index
    Created on : May 11, 2023, 7:01:50 PM
    Author     : Christian Millán Soria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ej 1 Christian Millán Soria</title>
    </head>
    <body>
        <h1>Gatos con clase</h1>
        <hr>
        <%
            Gato gato1=new Gato("Pepe", "gato.jpg");
            Gato gato2=new Gato("Garfield", "garfield.jpg");
            Gato gato3=new Gato("Tom", "tom.png");
            out.println(gato1);
            out.println(gato2);
            out.println(gato3);
            out.println(gato1.maulla());
            out.println(gato2.come("sardinas"));
        %>
    </body>
</html>