<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Catalogue de formations</title>
</head>

<!------ Body ---------->
<body>

<h2>Catalogue</h2>
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

    <!------ Tableau infos : Catalogue ---------->
    <tbody>
    <c:forEach items="${formationList}" var="formation">
    <td>
        <td>${formation.id}</td>
        <td>${formation.theme}</td>
        <td>${formation.dateDebut}</td>
        <td>${formation.duree} j</td>
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

<h2>Demandes en cours</h2>

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Salarie</th>
        <th scope="col">Formation</th>
        <th scope="col">Date demande</th>
        <th scope="col">Statut demande</th>
    </tr>
    </thead>

    <!------ Tableau infos : Demandes en cours ---------->
    <tbody>
    <c:forEach items="${formationPersonneListStatut}" var="formationPersonneListStatut">
    <tr>
        <td>${formationPersonneListStatut.salarie}</td>
        <td>${formationPersonneListStatut.formation}</td>
        <td>${formationPersonneListStatut.dateDemande}</td>
        <td>${formationPersonneListStatut.statutDemande}</td>

<%--        <c:forEach var="splt" items="${fn:split(param.arr1,',')}">
            ${splt}
        </c:forEach>--%>

        <td><a class="glyphicon glyphicon-pencil" href="update.html?id=${formation.id}"/></td>
        <td><a class="glyphicon glyphicon-align-justify" href="comptes.html"/></td>
        <td><a class="glyphicon glyphicon-sort" href="virement.html"/></td>
        <td><a class="glyphicon glyphicon-trash" href="delete.html?id=${formation.id}"/></td>
    </tr>
    <tr>
        </c:forEach>
    </tbody>
</table>
<h2>Historique</h2>

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Salarie</th>
        <th scope="col">Formation</th>
        <th scope="col">Date demande</th>
        <th scope="col">Statut demande</th>
    </tr>
    </thead>

    <!------ Tableau infos : Historique ---------->
    <tbody>
    <c:forEach items="${formationPersonneList}" var="formationPersonneList">
    <tr>
        <td>${formationPersonneList.salarie}</td>
        <td>${formationPersonneList.formation}</td>
        <td>${formationPersonneList.dateDemande}</td>
        <td>${formationPersonneList.statutDemande}</td>

        <td><a class="glyphicon glyphicon-pencil" href="update.html?id=${formation.id}"/></td>
        <td><a class="glyphicon glyphicon-align-justify" href="comptes.html"/></td>
        <td><a class="glyphicon glyphicon-sort" href="virement.html"/></td>
        <td><a class="glyphicon glyphicon-trash" href="delete.html?id=${formation.id}"/></td>
    </tr>
    <tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
