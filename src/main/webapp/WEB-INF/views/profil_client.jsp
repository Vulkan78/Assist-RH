<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<!------ Head ---------->
<head>
    <title>Profil</title>
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


<!------ Barre de recherche ---------->

<div class="container">

    <div class="col-sm-5">
        <label for="srch-term">Rechercher un salarie :</label>
    </div>

    <div class="col-sm-9">
        <div class="input-group-btn">
            <form class="navbar-form" role="search">
                <div class="input-group add-on">

                    <input class="form-control" placeholder="Rechercher" name="srch-term" id="srch-term" type="text">

                    <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                </div>
        </div>
        </form>
    </div>
</div>


<!------ Onglet ---------->
<ul class="nav nav-tabs" id="myTab" role="tablist">


    <!------ Edition ---------->
    <li class="nav-item">
        <a class="nav-link active" id="edition-tab" data-toggle="tab" href="#edition" role="tab" aria-controls="edition" aria-selected="true">Edition</a>
    </li>

    <!------ Comptes ---------->
    <li class="nav-item">
        <a class="nav-link" id="compte-tab" data-toggle="tab" href="#compte" role="tab" aria-controls="compte" aria-selected="false">Compte(s)</a>
    </li>

    <!------ Virement ---------->
    <li class="nav-item">
        <a class="nav-link" id="virement-tab" data-toggle="tab" href="#virement" role="tab" aria-controls="virement" aria-selected="false">Faire un virement</a>
    </li>

    <!------ Transactions ---------->
    <li class="nav-item">
        <a class="nav-link" id="transaction-tab" data-toggle="tab" href="#transaction" role="tab" aria-controls="transaction" aria-selected="false">Transactions</a>
    </li>
</ul>

<!------ Contenu onglet Edition ---------->
<div class="tab-content" id="myTabContent">
    <div class="tab-pane fade" id="edition" role="tabpanel" aria-labelledby="edition-tab">

        <!------ Début formulaire ---------->
        <form method="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="nom">Nom</label>
                    <input type="text" class="form-control" id="nom" name="nom" value="${empty updateClient ? '' : updateClient.nom}">
                </div>

                <div class="form-group col-md-6">
                    <label for="prenom">Prénom</label>
                    <input type="text" class="form-control" name="prenom" id="prenom" value="${empty updateClient ? '' : updateClient.prenom}">
                </div>

            </div>
            <div class="form-group col-md-6">
                <label for="adresse">Adresse</label>
                <input type="text" class="form-control" name="adresse" id="adresse" value="${empty updateClient ? '' : updateClient.adresse}">
            </div>

            <div class="form-group col-md-6">
                <label for="codePostal">Code postal</label>
                <input type="number" class="form-control" name="codePostal" id="codePostal" value="${empty updateClient ? '' : updateClient.codePostal}">
            </div>

            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="ville">Ville</label>
                    <input type="text" class="form-control" name="ville" id="ville" value="${empty updateClient ? '' : updateClient.ville}">
                </div>

                <div class="form-group col-md-6">
                    <label for="mail">Adresse e-mail</label>
                    <input type="email" class="form-control" name="mail" id="mail" value="${empty updateClient ? '' : updateClient.mail}">
                </div>

                <div class="form-group col-md-6">
                    <label for="telephone">Téléphone</label>
                    <input type="text" class="form-control" name="telephone" id="telephone" value="${empty updateClient ? '' : updateClient.telephone}">
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
                <button style ="text-align:center" type="submit" class="btn btn-primary">Enregistrer les modifications</button>
        </form>
    </div>
</div>
<!------ Fin onglet Edition ---------->



<!------ Contenu onglet Compte ---------->
<div class="tab-pane fade" id="compte" role="tabpanel" aria-labelledby="compte-tab">


    <!------ Tableau infos : Titres ---------->
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Numéro</th>
            <th scope="col">Type</th>
            <th scope="col">Date d'ouverture</th>
            <th scope="col">Solde</th>
            <th scope="col">Découvert Max</th>
            <th scope="col">Taux</th>
        </tr>
        </thead>

        <!------ Tableau infos : Données ---------->
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>23456789</td>
            <td>E</td>
            <td>01/01/2019</td>
            <td>198 276 726 €</td>
            <td>Non autorisé<td>
            <td>1.6%</td>
        </tr>
        <tr>
        </tbody>
    </table>
</div>
<!------ Fin onglet Comptes ---------->



<!------ Contenu onglet Virement ---------->
<div class="tab-pane fade" id="virementcontenu" role="tabpanel" aria-labelledby="virement-tab">
    <div class="container-fluid">


        <!------ Compte débiteur ---------->
        <div class="row">
            <span class="border border-dark"></span>
            <div class="col-sm-6">
                <div class="panel panel-default">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col" style="text-align:center; background-color:grey; color:white" >Compte débieur :</th>
                        </tr>
                        </thead>
                        <tbody>

                        <!------ Nom ---------->
                        <tr>
                            <th scope="row" style="text-align:center">Nom</th>
                        </tr>
                        <tr>
                            <th>
                                <select class=form-control>
                                    <option value=un>Blazz</option>
                                </select>
                            </th>
                        </thead>
                        <tbody>
                        </tr>

                        <!------ Num compte ---------->
                        <tr>
                            <th scope="row" style="text-align:center">Compte</th>
                        <tr>
                        <tr>
                            <th>
                                <select class=form-control>
                                    <option value=un>Num</option>
                                </select>
                        </tr>
                        </th>
                        </thead>
                        <tbody>

                        <!------ Montant ---------->
                        <tr>
                            <th scope="row" style="text-align:center">Montant en €</th>
                        </tr>
                        <tr>
                            <th>
                                <input type="text" class="form-control" aria-label="">
                            </th>
                        </tr>
                        </tbody>
                    </table>
                </div>
        </div>
    </div>

    <!------ Compte créditeur ---------->
    <div class="row">
        <span class="border border-dark"></span>
        <div class="col-sm-6">
            <div class="panel panel-default">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col" style="text-align:center; background-color:grey; color:white" >Compte créditeur :</th>
                    </thead>
                    <tbody>

                    <!------ Nom ---------->
                    <tr>
                        <th scope="row" style="text-align:center">Nom</th>
                    </tr>
                    <tr>
                        <th>
                            <select class=form-control>
                                <option value=un>Blazz</option>
                            </select>
                        </th>
                    </tr>

                    <!------ Num compte ---------->
                    <tr>
                        <th scope="row" style="text-align:center">Compte</th>
                    <tr>
                    <tr>
                        <th>
                            <select class=form-control>
                                <option value=un>Num</option>
                            </select>
                    </tr>
                    </tbody>
                </table>
            </div>

            <!------ Contenu onglet Transaction ---------->


            <div class="text-center">
                <button type="submit" class="btn btn-primary">Effectuer le virement</button>
            </div>

</body>
</html>
