<%-- 
    Document   : add
    Created on : 30/07/2018, 16:24:36
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <jsp:useBean id="agenda" class="model.Agenda" scope="page"/>
        <jsp:setProperty name="agenda" property="nome" param="nome"/>
        <jsp:setProperty name="agenda" property="cpf" param="cpf"/>
        <jsp:setProperty name="agenda" property="telefone" param="telefone"/>
        
        <h1>
            <jsp:getProperty name="agenda" property="persistirPessoa"/>
        </h1>

         <a href="index.html">VOLTAR</a>
    
</html>
