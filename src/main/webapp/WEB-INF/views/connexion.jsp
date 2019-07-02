<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/styles.min.css">
</head>

<body>
    <div>
        <div class="container">
            <div class="row">
                <div class="col-md-12" style="margin-top:8em;"><img class="d-block m-auto noselect" src="assets/img/Assist-RH.png" style="width:150px; box-shadow: 3px 3px 5px 1px rgba(0, 0, 0, .2);"></div>
            </div>
        </div>
    </div>
    <div>
        <div class="container">
            <div class="row">
                <div class="col-md-12 d-block mx-auto" style="margin-top:5em;width:auto;max-width:600px;padding-right:0px;padding-left:0px;">
                    <form action="index.html" method="post">
                        <div class="form-group"><label>Adresse e-mail</label><input class="form-control" type="email" value="r.tourrou@ensup.eu"></div>
                        <div class="form-group"><label>Mot de passe</label><input class="form-control" type="password" value="zefezrfezrf"></div><button class="btn btn-dark d-block ml-auto" type="submit" style="margin-top:2.5em;">Valider</button></form>
                </div>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/script.min.js"></script>
</body>

</html>