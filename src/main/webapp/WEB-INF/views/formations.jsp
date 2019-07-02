<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Catalogue de formations</title>
</head>

<!------ Body ---------->
<body>

<!------ Tableau infos : Titres ---------->
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Thème</th>
        <th scope="col">Date de début</th>
        <th scope="col">Durée</th>
        <th scope="col">Description</th>
    </tr>
    </thead>

    <!------ Tableau infos : Données ---------->
    <tbody>
    <c:forEach items="${formationList}" var="formation">
    <tr>
        <td>${formation.id}</td>
        <td>${formation.theme}</td>
        <td>${formation.dateDebut}</td>
        <td>${formation.duree}</td>
        <td>${formation.description}</td>

        <td><a class="glyphicon glyphicon-pencil" href="update.html?id=${formation.id}"/></td>
        <td><a class="glyphicon glyphicon-align-justify" href="comptes.html"/></td>
        <td><a class="glyphicon glyphicon-sort" href="virement.html"/></td>
        <td><a class="glyphicon glyphicon-trash" href="delete.html?id=${formation.id}"/></td>

    </tr>
    <tr>
        </c:forEach>
    </tbody>
</table>

<a href="demandes_salarie.html">Demandes en cours</a>
<a href="historique.html">Historique</a>
</body>
</html>
