package com.objis.spring.demodomaine;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe Formation
 *
 *
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

    public String getDateDebut() {
        SimpleDateFormat formater = null;
        formater = new SimpleDateFormat("dd/MM/yyyy");
        String newDate = formater.format(dateDebut);
        return newDate;
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

    public String toString() {
        return this.theme+ "+" + this.getDateDebut()+ "+" + this.duree+ "+" + this.description;
    }
}
