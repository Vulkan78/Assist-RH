<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assist-RH</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/styles.min.css">
</head>

<body>
    <div class="modal fade" role="dialog" tabindex="-1" id="create-formation">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Ajouter une formation</h4><button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button></div>
                <div class="modal-body">
                    <form>
                        <div class="form-row">
                            <div class="col" style="padding:2em;">
                                <div class="form-group"><label>Thème</label><input class="form-control form-control-sm" type="text" name="theme" required=""></div>
                                <div class="form-group"><label>Durée</label><input class="form-control form-control-sm" type="text" name="duree" required=""></div>
                                <div class="form-group"><label>Téléphone</label><input class="form-control form-control-sm" type="tel" name="telephone" required=""></div>
                            </div>
                            <div class="col" style="padding:2em;">
                                <div class="form-group"><label>Date de début</label><input class="form-control form-control-sm" type="text" name="date-debut" required=""></div>
                                <div class="form-group"><label>Description</label><textarea class="form-control" name="description" style="height:7em;"></textarea>
                                    <div class="btn-group float-right" role="group" style="margin-top:1em;"><button class="btn btn-dark float-right" type="button" data-dismiss="modal">Retour</button><button class="btn btn-secondary d-inline-block float-right" type="submit" style="margin-left:0.1em;">Ajouter</button></div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div>
        <div class="container">
            <div class="row" style="margin-top:2em;">
                <div class="col"><img class="float-right noselect" src="assets/img/Assist-RH.png" id="logo-xs" style="width:115px;"><a class="btn btn-success btn-rh" role="button" href="connexion.html">Déconnexion</a></div>
            </div>
        </div>
    </div>
    <div>
        <div class="container">
            <div class="row">
                <div class="col-md-12"><a class="btn btn-dark back" role="button" href="rh-accueil.html"><i class="fa fa-chevron-left fa-sm"></i></a>
                    <h3 class="d-inline page-title" style="margin:0;margin-left:0.3em;"><strong>Formation &amp; compétences</strong></h3>
                </div>
            </div>
        </div>
    </div>
    <div style="margin-top:4em;">
        <div class="container">
            <div class="row">
                <div class="col-md-12" style="padding-bottom:0.05em;">
                    <div class="btn-group" role="group"><a class="btn btn-dark info-tab current" role="button" href="#">Gestion des formations</a><a class="btn btn-outline-dark info-tab" role="button" href="rh-plan.html" style="margin-right:0.1em;margin-left:0.1em;">Plan de formation</a>
                        <a
                            class="btn btn-outline-dark info-tab" role="button" href="rh-competences.html" style="margin-left:0px;">Validation des compétences</a>
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
                                        <th>Durée</th>
                                        <th>Description</th>
                                        <th></th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>837481</td>
                                        <td>Comptabilité analytique<br></td>
                                        <td>12 sept. 2019<br></td>
                                        <td>5j</td>
                                        <td>Étude de la rentabilité d’une entreprise.</td>
                                        <td><a href="#"><i class="fa fa-pencil-square fa-lg"></i></a></td>
                                        <td><a href="#"><i class="fa fa-remove fa-lg"></i></a></td>
                                    </tr>
                                    <tr>
                                        <td>837482</td>
                                        <td>Opérations de change</td>
                                        <td>28 sept. 2019</td>
                                        <td>2j</td>
                                        <td>Produits et règles de base des opérations. </td>
                                        <td><a href="#"><i class="fa fa-pencil-square fa-lg"></i></a></td>
                                        <td><a href="#"><i class="fa fa-remove fa-lg"></i></a></td>
                                    </tr>
                                    <tr>
                                        <td>837483</td>
                                        <td>Développement JAVA</td>
                                        <td>03 oct. 2019</td>
                                        <td>4j</td>
                                        <td>Initiation au développements logiciels via le langage Java. </td>
                                        <td><a href="#"><i class="fa fa-pencil-square fa-lg"></i></a></td>
                                        <td><a href="#"><i class="fa fa-remove fa-lg"></i></a></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div><a class="btn btn-dark float-left d-flex ml-auto" role="button" href="javascript:$('#create-formation').modal()">Ajouter</a>
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