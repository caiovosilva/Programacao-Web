<%-- 
    Document   : atualizar
    Created on : Aug 7, 2018, 4:00:24 PM
    Author     : caiovosilva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizando</title>
    </head>
    <body>
        <jsp:useBean id="biblioteca" class="negocio.Biblioteca" scope="session"/>
        <jsp:setProperty name="biblioteca" property="*"/>
        <h1><% 
            out.println(biblioteca.atualizarLivro()); 
        %></h1>
       
         <a href="index.html">VOLTAR</a>
    </body>
</html>
