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
                    <div class="btn-group" role="group"><a class="btn btn-outline-dark info-tab" role="button" href="rh-formation.html">Gestion des formations</a><a class="btn btn-dark info-tab current" role="button" href="#" style="margin-right:0.1em;margin-left:0.1em;">Plan de formation</a>
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
                <div class="col outline" style="padding:2em;"></div>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/script.min.js"></script>
</body>

</html>