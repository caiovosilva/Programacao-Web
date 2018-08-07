<%-- 
    Document   : apagar
    Created on : Aug 7, 2018, 4:09:27 PM
    Author     : caiovosilva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apagando</title>
    </head>
    <body>
        <body>
        <jsp:useBean id="biblioteca" class="negocio.Biblioteca" scope="session"/>
        <jsp:setProperty name="biblioteca" property="*"/>
        <h1><% 
            out.println(biblioteca.apagarLivro()); 
        %></h1>
       
         <a href="index.html">VOLTAR</a>
    </body>
    </body>
</html>
