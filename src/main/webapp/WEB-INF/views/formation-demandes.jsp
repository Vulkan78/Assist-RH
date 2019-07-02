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
    <div style="margin-top:4em;">
        <div class="container">
            <div class="row">
                <div class="col-md-12" style="padding-bottom:0.05em;">
                    <div class="btn-group" role="group"><a class="btn btn-outline-dark info-tab" role="button" href="formation-catalogue.html">Catalogue</a><a class="btn btn-dark info-tab current" role="button" href="#" style="margin-right:0.1em;margin-left:0.1em;">Demande en cours</a>
                        <a
                            class="btn btn-outline-dark info-tab" role="button" href="formation-historique.html" style="margin-left:0px;">Historique</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div>
        <div class="container" style="padding-left:32px;padding-right:25px;">
            <div class="row outline">
                <div class="col outline" style="padding:2em;">
                    <form>
                        <div class="form-group d-flex"><input class="form-control squared-border-right" type="search" placeholder="Rechercher un thème..." style="max-width:20em;"><button class="btn btn-light" type="submit"><i class="fa fa-search"></i></button></div>
                        <div class="table-responsive">
                            <table class="table table-striped table-dark">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Thème</th>
                                        <th>Date de début</th>
                                        <th>Date de demande</th>
                                        <th>Durée</th>
                                        <th>Description</th>
                                        <th>Statut</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>837123</td>
                                        <td>Sécurité informatique<br></td>
                                        <td>09 sept. 2019<br></td>
                                        <td>01 juil. 2019<br></td>
                                        <td>4j</td>
                                        <td>Concepts et méthodes de pr…</td>
                                        <td><span class="badge badge-light">Attente</span></td>
                                        <td><a href="formation-detail.html"><i class="fa fa-pencil-square fa-lg"></i></a></td>
                                    </tr>
                                    <tr>
                                        <td>832499</td>
                                        <td>Gestion de projet</td>
                                        <td>14 sept. 2019</td>
                                        <td>01 juil. 2019<br></td>
                                        <td>3j</td>
                                        <td>Méthodes de gestion agile de… </td>
                                        <td><span class="badge badge-danger">Refusée</span></td>
                                        <td><a href="#"><i class="fa fa-pencil-square fa-lg"></i></a></td>
                                    </tr>
                                    <tr>
                                        <td>831233</td>
                                        <td>Analyse du besoin</td>
                                        <td>14 sept. 2019</td>
                                        <td>01 juil. 2019<br></td>
                                        <td>3j</td>
                                        <td>Rédaction du cahier des char… </td>
                                        <td><span class="badge badge-success">Acceptée</span></td>
                                        <td><a href="#"><i class="fa fa-pencil-square fa-lg"></i></a></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <nav>
                            <ul class="pagination">
                                <li class="page-item d-flex ml-auto"><a class="page-link" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
                                <li class="page-item active"><a class="page-link">1</a></li>
                                <li class="page-item"><a class="page-link" aria-label="Next"><span aria-hidden="true">»</span></a></li>
                            </ul>
                        </nav>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/script.min.js"></script>
</body>

</html>