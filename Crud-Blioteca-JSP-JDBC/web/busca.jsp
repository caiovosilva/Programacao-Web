<%-- 
    Document   : busca
    Created on : Aug 7, 2018, 3:07:55 PM
    Author     : caiovosilva
--%>

<%@page import="model.Livro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscando</title>
    </head>
    <body>
        <jsp:useBean id="biblioteca" class="negocio.Biblioteca" scope="page"/>
        <jsp:setProperty name="biblioteca" property="*"/>
        
        <table align="center" border="1">
            <tr>
                <td>Id</td>
                <td>Titulo</td>
            </tr>
             <% 
                List lista;
                if(biblioteca.getTitulo() == null || biblioteca.getTitulo().isEmpty())
                    lista = biblioteca.getLivros();
                else
                    lista = biblioteca.getLivrosByNome();
                for (int i = 0; i < lista.size(); i++) {
                    Livro l=(Livro)lista.get(i);
             %>       
            <tr>
                <td><%=l.getId()%></td>
                <td><a href="ControleBiblioteca?acao=editar&id=<%=l.getId()%>"> <%=l.getTitulo()%></a></td>
  
            </tr>
            <%  }
             %>
        </table>
        
        <a href="index.html">VOLTAR</a>
    </body>
</html>