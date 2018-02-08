<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: nmassella
  Date: 08/02/2018
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="genius" class="com.qtn.beans.Genius" scope="request"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello, World!</h1>
    <p>
        <%
            String attribut = (String) request.getAttribute("test");
            out.println(attribut);
            for(int j = 0; j <3 ; j++) {
                out.println(j);
            }
        %>
    </p>
    <h2>
        <%
            String auteur = ((String)request.getAttribute("auteur"));
            if (auteur != null) {
                out.println("Bonjour " + auteur);
            }
        %>

    </h2>
    <p>
        Récupération du Bean
        <%
            //com.qtn.beans.Genius bean = (com.qtn.beans.Genius)request.getAttribute("genius");
            out.println(genius.getName());
        %>
        <br>
        <%
            out.println(genius.getAge());
        %>
    </p>

    <p>
        Test de la technologie EL
        ${4+4};
        ${genius.name}
    </p>

    <p>
        Test d'une liste
        <%
            java.util.ArrayList myList = new ArrayList();
            myList.add("quentin");
            myList.add("anthony");
            myList.add("ethan");
            out.println(myList.get(0));
        %>

    </p>
    <p>
        affichage du premier element de la liste
        <%
            out.println(myList.get(0));
        %>
    </p>

    <h2>
        ${ param.auteur }
    </h2>
</body>
</html>
