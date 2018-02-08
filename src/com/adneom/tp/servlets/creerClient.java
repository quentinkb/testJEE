package com.adneom.tp.servlets;

import com.adneom.tp.beans.Client;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class creerClient extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        com.adneom.tp.beans.Client client = new Client();
        client.setNom(request.getParameter("nomClient"));
        client.setPrenom(request.getParameter("prenomClient"));
        client.setMail(request.getParameter("emailClient"));
        client.setTelephone(request.getParameter("telephoneClient"));
        client.setAdresse(request.getParameter("adresseClient"));
        if (request.getParameter("nomClient") == "" || request.getParameter("telephoneClient") == "" || request.getParameter("adresseClient") == "") {
            request.setAttribute("error",true);
        } else {
            request.setAttribute("error",false);
        }
        request.setAttribute("client",client);
        this.getServletContext().getRequestDispatcher("/WEB-INF/afficherClient.jsp").forward( request, response);
    }
}
