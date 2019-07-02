<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<!------ Head ---------->
<head>
    <title>Assist-RH</title>
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
            <li><a href="manager.html">Nouveau manager</a></li>
        </ul>
        <!------ Déconnexion ---------->
        <ul class="nav navbar-nav navbar-right">
            <li><a href="login.html"><span class="glyphicon glyphicon-off"></span> Se déconnecter</a></li>
        </ul>
    </div>
</nav>

<!------ Page ---------->
<div class="container-fluid">
    <h1 style="text-align:center">Que voulez-vous faire ?</h1>

    <!------ Choix ---------->
    <div class="row">
        <div class="col-sm-6">
            <a href="formations.html"><button type="button" class="btn btn-primary btn-lg btn-block">Formations</button></a>
        </div>
    </div>
</div>









