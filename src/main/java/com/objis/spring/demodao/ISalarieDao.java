package com.objis.spring.demodao;

import com.objis.spring.demodomaine.Salarie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ISalarieDao extends JpaRepository<Salarie, Integer> {

    List<Salarie> findByNomContaining(String keyword);

}