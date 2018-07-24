<%-- 
    Document   : DivisaoConta
    Created on : 24-Jul-2018, 5:37:46 PM
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
        <jsp:useBean id="calculo" class="negocio.CalculoConta" scope="page"/>
        <jsp:setProperty name="calculo" property="*"/>
        <h1>
            <jsp:getProperty name="calculo" property="resposta"/>
        </h1>
    </body>
</html>
