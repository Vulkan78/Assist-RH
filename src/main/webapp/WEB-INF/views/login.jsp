<!DOCTYPE html>
<html lang="en">

<!------ Head ---------->
<head>
    <title>Connexion</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<!------ Body ---------->
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-login">
                <div class="panel-heading">
                    <div class="row">
                    </div>
                    <hr>
                </div>
                <!------ Logo ---------->
                <img src="https://www.proxi-bnk.com/content/PA_esf-ca-app-content/content/pws/rbwm/static/images/layout/logo-fb.gif" class="img-responsive center-block" >
                <h2 style="text-align:center">Se connecter :</h2>

                <!------ Id / Mot de passe ---------->
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">

                            <!------ Début formulaire ---------->
                            <form id="login-form" action="index.html" method="post" role="form" style="display: block;">

                                <!------ Id ---------->
                                <div class="form-group">
                                    <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Identifiant" value="">
                                </div>

                                <!------ Mot de passe ---------->
                                <div class="form-group">
                                    <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Mot de passe">
                                </div>

                                <!------ Boutton connexion ---------->
                                <div class="form-group text-center">
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col text-center" >
                                            <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="btn btn-primary" value="Connexion">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="text-center">
                                                <!-- <a href="https://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a> -->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>