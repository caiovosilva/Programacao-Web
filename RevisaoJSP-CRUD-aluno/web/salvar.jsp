<%-- 
    Document   : salvar
    Created on : Aug 12, 2018, 8:47:50 PM
    Author     : caiovosilva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <form action="AlunoController" method="POST">
            <table>
                <tr>
                    <td>
                        Nome: <input type="text" name="nome">
                    </td>              
                </tr>
                <tr>
                    <td>
                        Matricula: <input type="text" name="matricula">
                    </td>
                </tr>
                <tr>
                    <td>
                        Endereco: <input type="text" name="endereco">
                    </td>
                </tr>
            </table>
            <input type="submit" value="Salvar" name="acao">
        </form>
        
        <
    </body>
</html>
