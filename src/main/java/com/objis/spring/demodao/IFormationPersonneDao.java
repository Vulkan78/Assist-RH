package com.objis.spring.demodao;
import com.objis.spring.demodomaine.Formation;
import com.objis.spring.demodomaine.FormationPersonne;
import com.objis.spring.demodomaine.Manager;
import com.objis.spring.demodomaine.Salarie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Id;
import java.util.List;


public interface IFormationPersonneDao extends JpaRepository<FormationPersonne, Integer> {

    List<FormationPersonne> findBySalarie(Salarie salarie);
    List<FormationPersonne> findBySalarieAndStatutDemande(Salarie salarie, String statut);
    List<FormationPersonne> findBySalarieAndStatutDemandeNot(Salarie salarie, String statut);
    FormationPersonne findBySalarieAndFormation(Salarie salarie, Formation formation);
}

