package com.objis.spring.demodomaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Classe Formation
 *
 *
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */

@Entity
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String theme;
    public Date dateDebut;
    public Integer duree;
    public String description;

    public Formation(String theme, Date dateDebut, Integer duree, String description) {
        this.theme = theme;
        this.dateDebut = dateDebut;
        this.duree = duree;
        this.description = description;
    }

    public Formation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
