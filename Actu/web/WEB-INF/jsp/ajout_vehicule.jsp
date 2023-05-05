<%-- 
    Document   : ajout_vehicule
    Created on : 3 mai 2023, 20:41:49
    Author     : Kanto
--%>
<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Type> listType = (ArrayList<Type>) request.getAttribute("listType");
    ArrayList<Marque> listMarque = (ArrayList<Marque>) request.getAttribute("listMarque");
    ArrayList<Modele> listModele = (ArrayList<Modele>) request.getAttribute("listModele");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout_Vehicule</title>
    </head>
    <body>
        <form action="insertVehicule" method="post">
            <h1>Ajout vehicule</h1>
            <p>Immatriculation: <input type="text" name="numero"></p>
            <p>
                Marque:<select name="marque">
                    <% for(int i=0;i<listMarque.size();i++){%>
                    <option value="<%= listMarque.get(i).getId()%>"><%= listMarque.get(i).getMarque()%></option>
                    <%}%>
                </select>
            </p>
            <p>
                Modele:<select name="modele">
                    <%for(int j=0;j<listModele.size();j++){%>
                    <option value="<%= listModele.get(j).getId()%>"><%= listModele.get(j).getModele()%></option>
                    <%}%>
                </select>
            </p>
            <p>
                Type:<select name="type">
                    <%for(int y=0;y<listType.size();y++) {%>
                    <option value="<%= listType.get(y).getId()%>"><%= listType.get(y).getType()%></option>
                    <%}%>
                </select>
            </p>
            <p><input type="submit" value="Ajouter"></p>
        </form>
    </body>
</html>
