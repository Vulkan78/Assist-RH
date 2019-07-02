package com.objis.spring.service;

import com.objis.spring.demodao.ISalarieDao;
import com.objis.spring.demodomaine.Salarie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Services de la classe Salarie
 * CRUD
 *
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */
@Service
public class SalarieService implements Serializable {

    @Autowired
    private ISalarieDao iSalarieDao;

    /**
     * Recupère les salariés en base
     * @return Une liste de Salariés
     */
    public List<Salarie> getAll(){
        return iSalarieDao.findAll();
    }

    /**
     * Injecte le salarié en base
     * @param newsalarie
     */
    public void create(Salarie newsalarie){
        iSalarieDao.save(newsalarie);
    }

    /**
     * Supprime le salarié de la base
     * @param id
     *              ID du salarié
     */
    public void deleteSalarie(Integer id){
        iSalarieDao.deleteById(id);
    }

    /**
     * Récupère le salarie de la base à mettre à jour
     * @param id
     *              ID du salarié
     * @return Salarie
     */
    public Salarie getSalarie(Integer id){
        return iSalarieDao.getOne(id);
    }

    /**
     * Met à jour le salarie dans la base
     * @param salarie
     *
     */
    public Salarie valideUpdate(Salarie salarie) {
        return this.iSalarieDao.save(salarie);
    }

    /*public List<Salarie> find(String keyword) {
        List<Salarie> results = new ArrayList<Salarie>();
        String[] keywords = keyword.split("[ -]");
        for(String word: keywords) {
            results.addAll(this.iSalarieDao.findByNomContaining(word));
        }
        return results;
    }*/
}


