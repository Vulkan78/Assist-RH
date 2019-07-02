package com.objis.spring.demodomaine;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Jimmy Rakotoson, José-Alexandre Giry
 * Classe mère des classes Salarie et Manager
 */

@MappedSuperclass
public abstract class Personne {


    public String nom;
    public String prenom;
    public String mail;
    public String adresse;
    public String fonction;
    public Date dateEmbauche;
    public String password;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom ;
    }
}
