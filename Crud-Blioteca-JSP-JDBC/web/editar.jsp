<%-- 
    Document   : editar
    Created on : Aug 7, 2018, 3:34:56 PM
    Author     : caiovosilva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editando</title>
    </head>
    <body>
        <jsp:useBean id="biblioteca" class="negocio.Biblioteca" scope="session"/>
        <jsp:setProperty name="biblioteca" property="*"/>
        <%  biblioteca.setSelecetdLivro();%>
            
        <form action="ControleBiblioteca" method="POST">
            Titulo: <input type="text" name="titulo" value="<jsp:getProperty name="biblioteca" property="titulo"/>"/><br>
            Autor: <input type="text" name="autor" value="<jsp:getProperty name="biblioteca" property="autor"/>"/><br>  
            Editora: <input type="text" name="editora" value="<jsp:getProperty name="biblioteca" property="editora"/>"/><br>
            ISBN: <input type="text" name="isbn" value="<jsp:getProperty name="biblioteca" property="isbn"/>"/><br>
            Avaliação: <input type="text" name="avaliacao" value="<jsp:getProperty name="biblioteca" property="avaliacao"/>"/> (Obrigatório)<br>         
            Páginas: <input type="text" name="paginas" value="<jsp:getProperty name="biblioteca" property="paginas"/>"/> (Obrigatório)<br>
            <br>
            <input type="submit" name="acao" value="Atualizar"/><br><br>
            <input type="submit" name="acao" value="Apagar"/><br><br>
            <a href="index.html">VOLTAR</a>
        </form>
            
        <h1></h1>
    </body>
</html>