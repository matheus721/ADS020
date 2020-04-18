<%-- 
    Document   : erro
    Created on : 18/04/2020, 16:25:42
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Deu Ruim!</h1>
        <p>Mensagem do erro: <%=exception.getMessage()%></p>
    </body>
</html>
