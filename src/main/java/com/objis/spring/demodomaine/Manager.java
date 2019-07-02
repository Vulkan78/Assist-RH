package com.objis.spring.demodomaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe Manager qui hérite de la classe Personne
 * Le manager valide les demandes de formations des salariés
 * Le manager est géré via la classe ManagerService
 *
 */

@Entity
public class Manager extends Personne {

    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public ArrayList<Salarie> listeSalarie;

    public Manager(String nom, String prenom, String mail, String adresse, String fonction, Date dateEmbauche, ArrayList<Salarie> listeSalarie, String password) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.fonction = fonction;
        this.dateEmbauche = dateEmbauche;
        this.listeSalarie = listeSalarie;
        this.password = password;
    }

    public Manager(String nom, String prenom, String mail, String adresse, String fonction, Date dateEmbauche) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.fonction = fonction;
        this.dateEmbauche = dateEmbauche;
    }

    public Manager() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Salarie> getListeSalarie() {
        return listeSalarie;
    }

    public void setListeSalarie(ArrayList<Salarie> listeSalarie) {
        this.listeSalarie = listeSalarie;
    }
}
