package com.objis.spring.demodomaine;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe Salarie qui hérite de la classe Personne
 * Le salarie est géré par le Manager via la classe SalarieService
 *
 *
 */

@Entity
public class Salarie extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    //public Manager manager;


/*    public Salarie(String nom, String prenom, String mail, String adresse, String fonction, Date dateEmbauche, String password, Manager manager) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.fonction = fonction;
        this.dateEmbauche = dateEmbauche;
        this.password = password;
        this.manager = new Manager();
    }*/

    public Salarie(String nom, String prenom, String mail, String adresse, String fonction, Date dateEmbauche, String password) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.fonction = fonction;
        this.dateEmbauche = dateEmbauche;
        this.password = password;
    }

    public Salarie(String nom, String prenom, String mail, String adresse, String fonction, Date dateEmbauche) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.fonction = fonction;
        this.dateEmbauche = dateEmbauche;
    }

    public Salarie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




}
