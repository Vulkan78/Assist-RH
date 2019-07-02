package com.objis.spring.demodao;

import com.objis.spring.demodomaine.Salarie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */

public interface ISalarieDao extends JpaRepository<Salarie, Integer> {

    List<Salarie> findByNomContaining(String keyword);

}