package com.objis.spring.service;

import com.objis.spring.demodao.IFormationDao;
import com.objis.spring.demodomaine.Formation;
import com.objis.spring.demodomaine.FormationPersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Services de la classe Formation
 * CRUD
 *
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */
@Service
public class FormationService {

    @Autowired
    private IFormationDao iFormationDao;

    /**
     * Recupère les formations en base
     *
     * @return Une liste de Formations
     */
    public List<Formation> getAll(Date date) {
        return iFormationDao.findByDateDebutAfter(date);
    }

    /**
     * Injecte la formation en base
     *
     * @param newformation
     */
    public void createFormation(Formation newformation) {
        iFormationDao.save(newformation);
    }

    /**
     * Supprime leaformation de la base
     *
     * @param id ID du formation
     */
    public void deleteFormation(Integer id) {
        iFormationDao.deleteById(id);
    }

    /**
     * Récupère la formation de la base à mettre à jour
     *
     * @param id ID de la formation
     * @return Formation
     */
    public Formation updateFormation(Integer id) {
        return iFormationDao.getOne(id);
    }

    /**
     * Met à jour la formation dans la base
     *
     * @param formation
     */
    public Formation valideUpdateFormation(Formation formation) {
        return this.iFormationDao.save(formation);
    }

    public List<Formation> findFormation(String keyword) {
        List<Formation> results = new ArrayList<Formation>();
        String[] keywords = keyword.split("[ -]");
        for(String word: keywords) {
            results.addAll(this.iFormationDao.findByThemeContaining(word));
        }
        return results;
    }

    /**
     * Récupère la formation de la base à mettre à jour
     * @param id
     *              ID de la formation
     * @return Formation
     */
    public Formation getFormation(Integer id){
        return iFormationDao.getOne(id);
    }


}