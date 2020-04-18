<%-- 
    Document   : index
    Created on : 18/04/2020, 14:45:16
    Author     : User
--%>
<%@page import="bean.Aluno"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="erro.jsp"%>
<%@include file="cabecalho.jsp"%>
<%@include file="rodape.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%String msg = "Olá Mundo!";%>
        <h1><%=msg%></h1>
        <h2><%Date data = new Date();%></h2>
        <p><%=data%></p>




        <jsp:useBean id="aluno" class="bean.Aluno"/>
        <jsp:setProperty name="aluno" property="matricula" value="2016100"/>
        <jsp:setProperty name="aluno" property="nome" value="JOSE"/>
        <p>Os atributos do bean Aluno são: 
            <jsp:getProperty name="aluno" property="matricula"/> e 
            <jsp:getProperty name="aluno" property="nome"/></p>




    </body>
</html>
