<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Site</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/styles.min.css">
</head>

<body>
<div>
    <div class="container">
        <div class="row" style="margin-top:2em;">
            <div class="col"><img class="float-right noselect" src="assets/img/Assist-RH.png" id="logo-xs" style="width:115px;"><a class="btn btn-warning" role="button" href="connexion.html">Déconnexion</a></div>
        </div>
    </div>
</div>
<div>
    <div class="container">
        <div class="row">
            <div class="col-md-12"><a class="btn btn-dark back" role="button" href="index.html"><i class="fa fa-chevron-left fa-sm"></i></a>
                <h3 class="d-inline page-title" style="margin:0;margin-left:0.3em;"><strong>Formation</strong></h3>
            </div>
        </div>
    </div>
</div>

<!------ Contenu onglet Edition ---------->

<div>

    <!------ Début formulaire ---------->
    <form method="post" action="">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="nom">Nom</label>
                <input type="text" class="form-control" id="nom" name="nom" value="${empty updateFormation ? '' : updateFormation.theme}">
            </div>

            <div class="form-group col-md-6">
                <label for="prenom">Prénom</label>
                <input type="text" class="form-control" name="prenom" id="prenom" value="${empty updateFormation ? '' : updateFormation.description}">
            </div>

        </div>
        <div class="form-group col-md-6">
            <label for="adresse">Adresse</label>
            <input type="text" class="form-control" name="adresse" id="adresse" value="${empty updateFormation ? '' : updateFormation.dateDebut}">
        </div>

        <div class="form-group col-md-6">
            <label for="codePostal">Code postal</label>
            <input type="date" class="form-control" name="codePostal" id="codePostal" value="${empty updateFormation ? '' : updateFormation.duree}">
        </div>

        <div class="form-group text-center">
            <button style ="text-align:center" type="submit" class="btn btn-primary">Créer une formation</button>
        </div>
    </form>
</div>

<!------ Fin onglet Edition ---------->

</body>
</html>