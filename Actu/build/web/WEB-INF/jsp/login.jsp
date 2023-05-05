<%-- 
    Document   : login
    Created on : 3 mai 2023, 19:54:20
    Author     : Kanto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="login" method="post">
            <h1>Login</h1>
            <p>Nom: <input type="text" name="nom"></p>
            <p>Mdp: <input type="text" name="mdp"></p>
            <p><input type="submit" value="Login"></p>
        </form>
    </body>
</html>
