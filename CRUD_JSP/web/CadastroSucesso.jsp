<%-- 
    Document   : CRUDView
    Created on : 25-Jul-2018, 7:12:05 PM
    Author     : caiov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="contato" class="negocio.Contato" scope="page"/>
        <jsp:setProperty name="contato" property="*"/>
        <form action ="CRUDController" method="POST">
            <table align="center">
                <tr>
                    <td><h1>            
                        <jsp:getProperty name="contato" property="salvarContato"/>                   
                    </h1></td>
                </tr>              
                <tr>
                    <td><input type="button" name="bt" value="VOLTAR"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
