<%--
  Created by IntelliJ IDEA.
  User: nmassella
  Date: 08/02/2018
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Afficher client</title>
</head>
<body>
<jsp:useBean id="client" class="com.adneom.tp.beans.Client" scope="request" />

    <%
        //out.println((Boolean) request.getAttribute("error"));
        if ((Boolean) request.getAttribute("error")) {
            out.println("Erreur, des champs sont manquants");
            out.println("<a href='creerClient.jsp'>retour</a> ");
        }
    %>
    <p>${client.nom}</p>
    <p>${client.prenom}</p>
    <p>${client.adresse}</p>
    <p>${client.mail}</p>
    <p>${client.telephone}</p>
</body>
</html>
