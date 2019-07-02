package com.objis.spring.controller;
import com.objis.spring.demodao.IFormationPersonneDao;
import com.objis.spring.demodomaine.Formation;
import com.objis.spring.demodomaine.FormationPersonne;
import com.objis.spring.demodomaine.Manager;
import com.objis.spring.demodomaine.Salarie;
import com.objis.spring.service.FormationPersonneService;
import com.objis.spring.service.SalarieService;
import com.objis.spring.service.ManagerService;
import com.objis.spring.service.FormationService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
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
     * Affiche la page d'accueil du service RH
     */
    @RequestMapping({"/rh-accueil"})
    public ModelAndView rhAccueil (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-accueil");
        return MAV;
    }

    /**
     * Affiche les 4 modules du service RH
     */
    @RequestMapping({"/rh-accueil-4-modules"})
    public ModelAndView rhAccueil4modules (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-accueil-4-modules");
        return MAV;
    }

    /**
     * Affiche la page de gestion des compétences du service RH
     */
    @RequestMapping({"/rh-competences"})
    public ModelAndView rhCompetences (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-competences");
        return MAV;
    }

    /**
     * Affiche la page d'accueil du service RH
     */
    @RequestMapping({"/rh-plan"})
    public ModelAndView rhPlan (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-plan");
        return MAV;
    }

    /**
     * Affiche le module de formation du service RH
     */
    @RequestMapping({"/rh-formation"})
    public ModelAndView rhFormation (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-formation");
        return MAV;
    }

    /**
     * Affiche le catalogue de formation
     */
    @RequestMapping({"/formation-catalogue"})
    public ModelAndView formationCatalogue (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-catalogue");
        //Premier onglet
        MAV.addObject("formationList",this.formationService.getAll());
        return MAV;
    }

    /**
     * Affiche les demandes de formation en cours du salarié
     */
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

    /**
     * Affiche l'historique des demandes de formation du salarié
     */
    @RequestMapping({"/formation-historique"})
    public ModelAndView formationHistorique (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-historique");
        Salarie salarie = this.salarieService.getSalarie(2); //A récupérer en dynamique après connexion
        //Troisième onglet
        MAV.addObject("formationPersonneList",this.iFormationPersonneDao.findBySalarieAndStatutDemandeNot(salarie, "Demandée"));
        return MAV;
    }

    /**
     * Affiche la page de creation d'un formation
     */
    @RequestMapping("/formation")
    public ModelAndView Formation(){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation");
        return MAV;
    }

    /**
     *  Affiche les détails de la formation
     */
    @RequestMapping("/detail_formation")
    public ModelAndView updateFormation(){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("detail_formation");
        return MAV;
    }

    /**
     * Valide la création de la formation et l'injecte dans la base
     */
    @RequestMapping(method = RequestMethod.POST, path = "/formation")
    public String validateFormation(Integer id, @RequestParam(name="nom") String theme,
                                 @RequestParam(name="prenom") String description,
                                 @RequestParam(name="adresse") Date dateDebut,
                                 @RequestParam(name="codePostal") Integer duree){
        final Formation newFormation = new Formation(theme, dateDebut, duree, description);
        this.formationService.createFormation(newFormation);
        //return this.index();
        return "redirect:/rh-formation.html";
    }

    /**
     * Supprime la formation de la base
     */
    @GetMapping("/delete")
    public String delete(Integer id){
        this.formationService.deleteFormation(id);
        //return this.index();
        return "redirect:/formations.html";
    }

    /**
     * Récupère les détails de la formation et les affiches dans le profil afin de pouvoir les modifier
     */
    @GetMapping("/update")
    public ModelAndView update(Integer id){
        ModelAndView mav = new ModelAndView("profil_formation");
        Formation formation = this.formationService.updateFormation(id);
        Hibernate.initialize(formation);
        mav.addObject("updateFormation",formation);
        //return this.index();
        return mav;
    }

    /**
     * Valide les modifications des détails de la formation
     */
    @PostMapping("/update")
    public String valideUpdate(Formation formation){
        this.formationService.valideUpdateFormation(formation);
        return "redirect:/formations.html";
    }

}
