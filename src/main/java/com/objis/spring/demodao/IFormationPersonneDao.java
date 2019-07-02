package com.objis.spring.demodao;
import com.objis.spring.demodomaine.FormationPersonne;
import com.objis.spring.demodomaine.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */

public interface IFormationPersonneDao extends JpaRepository<FormationPersonne, Integer> {

    @Query("from FormationPersonne fp where fp.salarie.id = :salarieId")
    List<FormationPersonne> findAllBySalarie(@Param("salarieId") Integer salarieId);
}
