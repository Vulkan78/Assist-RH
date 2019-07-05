# Assist-RH
Logiciel de Gestion Ressources Humaines
Guide d'installation / d'utilisation de l'application Java Assit-RH

Vérifiez que le livrable est composé des éléments suivants :
- Dossier "src" : code source de l'application
- Dossier "UML" : contient les diagrammes UML suivant : classes, déploiement, et cas d'utilisation, d’activité, séquence + intégration continue + le sitemap
- Dossier "Javadoc"

Technologies et version utilisées :
- Java : 1.8
- Hibernate 5.4.2
- Junit : 4.12
- Maven 3.5.2
- MySQL : 8.0.11
- Tomcat : 8.5.24
- PhpMyAdmin
- Spring Boot : 2.1.3
- Spring Cloud : 2.1.3
- Spring Data : 2.1.3
- Angula : 7
- Bootstrap : 3.4

Pré-requis:
- **Installez le JDK 8** sur la machine cible,
- Téléchargez le depuis: *http://www.oracle.com/technetwork/java/javase/downloads/index.html*

Accès au site : 
http://assistrh-env-1.wmteyrppjf.us-east-1.elasticbeanstalk.com/connexion.html

Générer le .war:
- A partir de votre IDE, lancez la commande "mvn clean install"
- Un dossier target est crée avec le .war
- Déposez le .war dans le dossier "Webapp" de votre serveur Tomcat
- Démarez votre server Tomcat
- Ouvrir votre navigateur et entrez l'url suivante : http://localhost:8080

Connexion:
Login salarié: r.tourrou@ensup.eu / password : password
Login Manager : a.darabid@ensup.eu / password : password

