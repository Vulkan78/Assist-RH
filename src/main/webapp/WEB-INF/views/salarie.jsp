<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<!------ Head ---------->
<head>
    <title>Salarie</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<!------ Body ---------->
<body>

<!------ Bar de menu ---------->
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <!------ Logo ---------->
            <img src="https://www.proxi-bnk.com/content/PA_esf-ca-app-content/content/pws/rbwm/static/images/layout/logo-fb.gif" alt="Responsive image" style="width:60%">
        </div>
        <ul class="nav navbar-nav">
            <li><a href="index.html"><span class="glyphicon glyphicon-home"></a></li>

            <li> <a href="salarie.html">Nouveau salarie</a></li>
            <li><a href="conseiller.html">Nouveau conseiller</a></li>
        </ul>
        <!------ Déconnexion ---------->
        <ul class="nav navbar-nav navbar-right">
            <li><a href="login.html"><span class="glyphicon glyphicon-off"></span> Se déconnecter</a></li>
        </ul>
    </div>
</nav>

<!------ Contenu onglet Edition ---------->

<div>

    <!------ Début formulaire ---------->
    <form method="post">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="nom">Nom</label>
                <input type="text" class="form-control" id="nom" name="nom" value="${empty updateSalarie ? '' : updateSalarie.nom}">
            </div>

            <div class="form-group col-md-6">
                <label for="prenom">Prénom</label>
                <input type="text" class="form-control" name="prenom" id="prenom" value="${empty updateSalarie ? '' : updateSalarie.prenom}">
            </div>

        </div>
        <div class="form-group col-md-6">
            <label for="adresse">Adresse</label>
            <input type="text" class="form-control" name="adresse" id="adresse" value="${empty updateSalarie ? '' : updateSalarie.adresse}">
        </div>

        <div class="form-group col-md-6">
            <label for="codePostal">Code postal</label>
            <input type="number" class="form-control" name="codePostal" id="codePostal" value="${empty updateSalarie ? '' : updateSalarie.codePostal}">
        </div>

        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="ville">Ville</label>
                <input type="text" class="form-control" name="ville" id="ville" value="${empty updateSalarie ? '' : updateSalarie.ville}">
            </div>

            <div class="form-group col-md-6">
                <label for="mail">Adresse e-mail</label>
                <input type="email" class="form-control" name="mail" id="mail" value="${empty updateSalarie ? '' : updateSalarie.mail}">
            </div>

            <div class="form-group col-md-6">
                <label for="telephone">Téléphone</label>
                <input type="text" class="form-control" name="telephone" id="telephone" value="${empty updateSalarie ? '' : updateSalarie.telephone}">
            </div>

            <div class="form-group col-md-6">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="gridCheck">
                    <label class="form-check-label" for="gridCheck">
                        Entreprise
                    </label>
                </div>
            </div>
        </div>

        <div class="form-group text-center">
            <button style ="text-align:center" type="submit" class="btn btn-primary">Créer un salarie</button>
    </form>
</div>

<!------ Fin onglet Edition ---------->

</body>
</html>