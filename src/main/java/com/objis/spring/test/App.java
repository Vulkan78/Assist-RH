package com.objis.spring.test;
import com.objis.spring.demodao.ISalarieDao;
import com.objis.spring.demodomaine.Salarie;
import com.objis.spring.service.SalarieService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {

    public SalarieService salarieService = new SalarieService();
    private ISalarieDao springDao;
    public Salarie salarie;
    private ClassPathXmlApplicationContext appContext;

    /**
     *
     *  Methode qui instancie un salarie
     *
     */
    @Before
    public void setUp() throws Exception {
        salarie = new Salarie("nom", "prenom", "mail", "adresse", "fonction", new Date());;
        appContext = new ClassPathXmlApplicationContext("src/main/webapp/WEB-INF/application-servlet.xml");
        springDao = (ISalarieDao) appContext.getBean("ISalarieDao");
    }

    /**
     * Injection du salarie en base
     */
    @Test
    public void createSalarie() {
        salarieService.create(salarie);
        System.out.println("Salarie ajouté en base : " + salarie.toString());
    }

    /**
     * Modification du salarie en base
     */
    @Test
    public void updateSalarie() {
        salarie.setNom("testUpdate");
        salarieService.valideUpdate(salarie);
        System.out.println("Salarie modifié en base : " + salarie.toString());
    }

    /**
     * Suppression du salarie en base
     */
    @Test
    public void deleteSalarie() {
        Integer id = salarie.getId();
        salarieService.deleteSalarie(id);
        System.out.println("Salarie supprimé en base.");
    }
}

