package com.objis.spring.service;
import com.objis.spring.demodao.IFormationPersonneDao;
import com.objis.spring.demodomaine.Formation;
import com.objis.spring.demodomaine.FormationPersonne;
import com.objis.spring.demodomaine.Salarie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * Services de la classe FormationPersonnePersonne (demandes de formation)
 * CRUD
 *
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */
@Service
public class FormationPersonneService {

    @Autowired
    private IFormationPersonneDao iFormationPersonneDao;

    /**
     * Recupère les demandes (formationPersonne) en base
     *
     * @return Une liste des demandes (FormationPersonne)
     */
    public List<FormationPersonne> getAll() {
        return iFormationPersonneDao.findAll();
    }

    /**
     * Injecte la demande (formationPersonne) en base
     *
     * @param newformationPersonne
     */
    public void createFormationPersonne(FormationPersonne newformationPersonne) {
        iFormationPersonneDao.save(newformationPersonne);
    }

    /**
     * Récupère la demande de formation de la base à mettre à jour
     * @param id
     *              ID de la demande
     * @return FormationPersonne
     */
    public FormationPersonne getFormationPersonne(Integer id){
        return iFormationPersonneDao.getOne(id);
    }

    /**
     * Supprime la demande (formationPersonne) de la base
     *
     * @param id ID de formationPersonne
     */
    public void deleteFormationPersonne(Integer id) {
        iFormationPersonneDao.deleteById(id);
    }

    /**
     * Récupère la demande(formationPersonne) de la base à mettre à jour
     *
     * @param id ID de la formationPersonne
     * @return FormationPersonne
     */
    public FormationPersonne updateFormationPersonne(Integer id) {
        return iFormationPersonneDao.getOne(id);
    }

    /**
     * Met à jour la demande (formationPersonne) dans la base
     *
     * @param formationPersonne
     */
    public FormationPersonne valideUpdateFormationPersonne(FormationPersonne formationPersonne) {
        return this.iFormationPersonneDao.save(formationPersonne);
    }

    public FormationPersonne getBySalarieFormation(Salarie salarie, Formation formation){
        return this.iFormationPersonneDao.findBySalarieAndFormation(salarie, formation);
    }

    public FormationPersonne findbyId(Integer id) {
        return iFormationPersonneDao.getOne(id);
    }


    /*public ArrayList<Formation> getFormationsSalarie(Salarie salarie){
        ArrayList<Formation> listeFormations = this.findBySalarie(salarie);
        return listeFormations;

    }

    public ArrayList<Formation> getFormationsSalarie(Salarie salarie)
    {
        Query query = em.createQuery("select salarie from FormationPersonne salarie " +
                "where salarie.id = :id") ;

        ArrayList<Formation> listeFormations = query.getResultList() ;
        return listeFormations;
    }*/

    /*public List<FormationPersonne> findFormationPersonne(String keyword) {
        List<FormationPersonne> results = new ArrayList<FormationPersonne>();
        String[] keywords = keyword.split("[ -]");
        for(String word: keywords) {
            results.addAll(this.iFormationPersonneDao.findByNomContaining(word));
        }
        return results;
    }*/

}