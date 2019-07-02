package com.objis.spring.controller;
import com.objis.spring.demodao.IFormationPersonneDao;
import com.objis.spring.demodomaine.FormationPersonne;
import com.objis.spring.demodomaine.Manager;
import com.objis.spring.demodomaine.Salarie;
import com.objis.spring.service.FormationPersonneService;
import com.objis.spring.service.SalarieService;
import com.objis.spring.service.ManagerService;
import com.objis.spring.service.FormationService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@Transactional
@Controller
public class AppController {

    @Autowired
    private SalarieService salarieService;

    @Autowired
    private FormationService formationService;

    @Autowired
    private IFormationPersonneDao iFormationPersonneDao;

    /**
     * Affiche la page d'authentification
     */
    @RequestMapping({"/", "/connexion"})
    public ModelAndView connexion (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("connexion");
        return MAV;
    }

    /**
     * Affiche la page d'accueil
     */
    @RequestMapping({"/index"})
    public ModelAndView index (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("index");
        return MAV;
    }

    /**
     * Affiche le module de formation
     */
    @RequestMapping({"/formation-catalogue"})
    public ModelAndView formationCatalogue (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-catalogue");
        //Premier onglet
        MAV.addObject("formationList",this.formationService.getAll());
        return MAV;
    }

    @RequestMapping({"/formation-demandes"})
    public ModelAndView formationDemandes (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-demandes");
        Salarie salarie = this.salarieService.getSalarie(2); //A récupérer en dynamique après connexion
        //Deuxieme onglet
        List<FormationPersonne> listeFormationPersonne = this.iFormationPersonneDao.findBySalarieAndStatutDemande(salarie, "Demandée");
        MAV.addObject("formationPersonneListStatut",listeFormationPersonne);
        return MAV;
    }

    @RequestMapping({"/formation-historique"})
    public ModelAndView formationHistorique (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-historique");
        Salarie salarie = this.salarieService.getSalarie(2); //A récupérer en dynamique après connexion
        //Troisième onglet
        MAV.addObject("formationPersonneList",this.iFormationPersonneDao.findBySalarieAndStatutDemandeNot(salarie, "Demandée"));
        return MAV;
    }

}
