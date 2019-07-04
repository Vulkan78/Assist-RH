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
                <h3 class="d-inline page-title" style="margin:0;margin-left:0.3em;"><strong>Salariés</strong></h3>
            </div>
        </div>
    </div>
</div>
<div style="margin-top:4em;">
    <div class="container">
        <div class="row">
            <div class="col-md-12" style="padding-bottom:0.05em;">
                <div class="btn-group" role="group"><a class="btn btn-outline-dark info-tab" role="button" href="mg-salaries.html">Salariés</a><a class="btn btn-outline-dark info-tab" role="button" href="mg-demandes.html" style="margin-right:0.1em;margin-left:0.1em;">Demande en cours</a>
                    <a
                            class="btn btn-outline-dark info-tab" role="button" href="mg-historique.html" style="margin-left:0px;">Historique</a><a class="btn btn-dark info-tab current" role="button" href="#" style="margin-left:0.1em;">839288 – Qualité de code</a></div>
            </div>
        </div>
    </div>
</div>
<div>
    <div class="container" style="padding-right:25px;padding-left:22px;">
        <c:forEach items="${formationDetail}" var="formationDetail">
            <c:forEach items="${demandeDetail}" var="demandeDetail">
                <form method="Post" action="approuverformation.html">
                    <div class="form-row outline">
                        <div class="col" style="padding:2em;">
                            <div class="form-group" style="margin-bottom:0.5em;"><label>Référence</label><input class="form-control form-control-sm" type="text" name="id" value="${formationDetail.id}" readonly=""></div>
                            <div class="form-group" style="margin-bottom:0.5em;"><input class="form-control form-control-sm" type="text" name="idDemande" value="${demandeDetail.id}" readonly="" hidden></div>
                            <div class="form-group" style="margin-bottom:0.5em;"><label>Thème</label><input class="form-control form-control-sm" type="text" name="theme" value="${formationDetail.theme}" readonly=""></div>
                            <div class="form-group" style="margin-bottom:0.5em;"><label>Description</label><textarea class="form-control form-control-lg" name="description" readonly="" style="font-size:14px;height:14em;">${formationDetail.description}</textarea></div>
                        </div>
                        <div class="col" style="padding:2em;">
                            <div class="form-group" style="margin-bottom:0.5em;"><label>Date de début</label><input class="form-control form-control-sm" type="text" name="dateDebut" value="${formationDetail.dateDebut}" readonly=""></div>
                            <div class="form-group" style="margin-bottom:0.5em;"><label>Date de demande</label><input class="form-control form-control-sm" type="text" name="dateDemande" value="${demandeDetail.dateDemande}" readonly=""></div>
                            <div class="form-group" style="margin-bottom:0.5em;"><label>Durée</label><input class="form-control form-control-sm" type="text" name="ville" value="${formationDetail.duree}" readonly=""></div>
                            <div class="form-group" style="margin-bottom:0.5em;"><label>Statut</label>
                                <c:choose>
                                <c:when test="${demandeDetail.statutDemande=='Approuvée'}">
                                <span class="badge badge-success">
                                        </c:when>
                                        <c:when test="${demandeDetail.statutDemande=='Réalisée'}">
                                        <span class="badge badge-primary">
                                        </c:when>
                                        <c:when test="${demandeDetail.statutDemande=='Demandée'}">
                                        <span class="badge badge-light">
                                        </c:when>
                                        <c:otherwise>
                                        <span class="badge badge-danger">
                                        </c:otherwise>
                                    </c:choose>
                                                ${demandeDetail.statutDemande}</span>
                            </div>
                            <div class="form-group" style="margin-bottom:0.5em;"><input type="submit" value="Accepter" ></div>
                        </div>
                    </div>
                </form>
            </c:forEach>
        </c:forEach>
    </div>
</div>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/script.min.js"></script>
</body>

</html>