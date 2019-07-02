package com.objis.spring.service;

import com.objis.spring.demodao.IManagerDao;
import com.objis.spring.demodomaine.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Services de la classe Manager
 * CRUD
 *
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */
@Service
public class ManagerService {

    @Autowired
    private IManagerDao iManagerDao;

    /**
     * Recupère les managers en base
     * @return Une liste de Manager
     */
    public List<Manager> getAll(){
        return iManagerDao.findAll();
    }

    /**
     * Injecte le manager en base
     * @param newmanager
     */
    public void createManager(Manager newmanager){
        iManagerDao.save(newmanager);
    }

    /**
     * Supprime le manager de la base
     * @param id
     *              ID du manager
     */
    public void deleteManager(Integer id){
        iManagerDao.deleteById(id);
    }

    /**
     * Récupère le manager de la base à mettre à jour
     * @param id
     *              ID du manager
     * @return Manager
     */
    public Manager updateManager(Integer id){
        return iManagerDao.getOne(id);
    }

    /**
     * Met à jour le manager dans la base
     * @param manager
     *
     */
    public Manager valideUpdateManager(Manager manager) {
        return this.iManagerDao.save(manager);
    }

    /*public List<Manager> findManager(String keyword) {
        List<Manager> results = new ArrayList<Manager>();
        String[] keywords = keyword.split("[ -]");
        for(String word: keywords) {
            results.addAll(this.iManagerDao.findByNomContaining(word));
        }
        return results;
    }*/
}
