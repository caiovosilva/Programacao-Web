<%-- 
    Document   : cadastro
    Created on : Aug 6, 2018, 8:11:17 PM
    Author     : caiovosilva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <jsp:useBean id="biblioteca" class="negocio.Biblioteca" scope="session"/>
        <jsp:setProperty name="biblioteca" property="*"/>
        <h1><% 
            out.println(biblioteca.addLivro()); 
        %></h1>
       
         <a href="index.html">VOLTAR</a>
    
</html>
