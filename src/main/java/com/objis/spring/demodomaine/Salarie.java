package com.objis.spring.demodomaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Classe Salarie qui hérite de la classe Personne
 * Le salarie est géré par le Manager via la classe SalarieService
 *
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */

@Entity
public class Salarie extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

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
