<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Recherche</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm">
        <h1>Recherche</h1><a href="index.html"><h3>Accueil</h3></a>
        <a href="salarie.html"><h3>Nouveau</h3></a>
        <form method="post" class="form">
            <div class="form-row">
                <div class="col">
                    <input type="text" placeholder="Mots-clés" name="keyword" class="form-control">
                </div>
                <div class="col">
                    <input type="submit" class="btn btn-primary">
                </div>
            </div>
        </form>
        <ul class="list-group">
            <c:forEach items="${clientList}" var="salarie">
                <li class="list-group-item">
                    <p>ID : ${salarie.id}/ nom : ${salarie.nom}/ prenom : ${salarie.prenom}
                        <a href="delete.html?id=${salarie.id}">
                            <img src="images/delete.png" style="width:20px">
                        </a>
                        <a href="update.html?id=${salarie.id}">
                            <img src="images/update.png" style="width:20px">
                        </a>
                    </p>
                </li>
            </c:forEach>
        </ul>
        </div>
    </div>
</div>
</body>
</html>
