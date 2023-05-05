<%-- 
    Document   : ajout_trajet
    Created on : 3 mai 2023, 21:44:03
    Author     : Kanto
--%>
<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Vehicule> listVehicule = (ArrayList<Vehicule>) request.getAttribute("listVehicule");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout_Trajet</title>
    </head>
    <body>
        <form action="insertTrajet" method="post">
            <h1>Ajout trajet</h1>
            <p>
                Vehicule:<select name="vehicule">
                    <%for(int i=0;i<listVehicule.size();i++){%>
                    <option value="<%= listVehicule.get(i).getId()%>"><%= listVehicule.get(i).getNumerovehicule()%></option>
                    <%}%>
                </select>
            </p>
            <p>-Depart</p>
            <p>Date: <input type="date" name="dateDepart">
                Heure: <input type="time" name="heureDepart">
                Kilometrage: <input type="number" name="kilometrageDebut">
            </p>
            <p>-Arrivee</p>
            <p>Date: <input type="date" name="dateArrive">
                Heure: <input type="time" name="heureArrive">
                Kilometrage: <input type="number" name="kilometrageArrive">
            </p>
            <p>-Carburant</p>
            <p>
                Montant:<input type="number" name="montant">
                Quantite:<input type="number" name="quantite">
            </p>
            <p>Motif:<input type="textarea" name="motif"></p>
            <p><input type="submit" value="Ajouter"></p>
        </form>
    </body>
</html>
