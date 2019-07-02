package com.objis.spring.demodomaine;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe FormationPersonne
 * Correspond aux demandes des salariés
 * Elle lie un salarié à une formation. Le manager devra valider la demande.
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */

@Entity
public class FormationPersonne implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    @OneToOne
    public Salarie salarie;
    @OneToOne
    public Formation formation;
    public String statutDemande;
    public Date dateDemande;
    public Integer evaluation;

    public FormationPersonne(Salarie salarie, Formation formation, String statutDemande, Date dateDemande, Integer evaluation) {
        this.salarie = salarie;
        this.formation = formation;
        this.statutDemande = statutDemande;
        this.dateDemande = dateDemande;
        this.evaluation = evaluation;
    }

    public FormationPersonne() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Salarie getSalarie() {
        return salarie;
    }

    public void setSalarie(Salarie salarie) {
        this.salarie = salarie;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public String getStatutDemande() {
        return statutDemande;
    }

    public void setStatutDemande(String statutDemande) {
        this.statutDemande = statutDemande;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }


}
