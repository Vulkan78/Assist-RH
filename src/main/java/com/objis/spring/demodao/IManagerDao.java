package com.objis.spring.demodao;
import com.objis.spring.demodomaine.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */

public interface IManagerDao extends JpaRepository<Manager, Integer> {

    List<Manager> findByNomContaining(String keyword);
}
