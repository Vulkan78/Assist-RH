package com.objis.spring.demodao;
import com.objis.spring.demodomaine.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IManagerDao extends JpaRepository<Manager, Integer> {

    List<Manager> findByNomContaining(String keyword);
    List<Manager> findByMail(String mail);
}
