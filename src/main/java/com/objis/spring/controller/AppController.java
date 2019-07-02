package com.objis.spring.controller;
import com.objis.spring.demodomaine.FormationPersonne;
import com.objis.spring.demodomaine.Manager;
import com.objis.spring.demodomaine.Salarie;
import com.objis.spring.demodomaine.Formation;
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

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * @author Jimmy Rakotoson, José-Alexandre Giry
 *
 */

@SpringBootApplication
@Transactional
@Controller
public class AppController {

    @Autowired
    private SalarieService salarieService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private FormationService formationService;

    @Autowired
    private FormationPersonneService formationPersonneService;

    /**
     * Affiche la page d'authentification
     */
    @RequestMapping({"/", "/login"})
    public ModelAndView login (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("login");
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
    @RequestMapping({"/formations"})
    public ModelAndView formations (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formations");
        MAV.addObject("formationList",this.formationService.getAll());
        //MAV.addObject("formationPersonneList",this.formationPersonneService.findBySalarie(Salarie salarie));
        return MAV;
    }

    /**
     *  Affiche la liste des salaries
     */
    @RequestMapping({"/salaries"})
    public ModelAndView salaries (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("salaries");
        MAV.addObject("salarieList",this.salarieService.getAll());
        return MAV;
    }

    /**
     * Affiche la page de creation d'un salarie
     */
    @RequestMapping("/salarie")
    public ModelAndView showClient(){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("salarie");
        return MAV;
    }

    /**
     *  Affiche le profil du salarie
     */
    @RequestMapping("/profil_salarie")
    public ModelAndView updateClient(){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("profil_salarie");
        return MAV;
    }

    /**
     * Valide la création du salarie et l'injecte dans la base
     */
    @RequestMapping(method = RequestMethod.POST, path = "/salarie")
    public String validateClient(Integer id, @RequestParam(name="nom") String nom,
                                 @RequestParam(name="prenom") String prenom,
                                 @RequestParam(name="adresse") String adresse,
                                 @RequestParam(name="mail") String mail){
        final Salarie newSalarie = new Salarie(nom, prenom, mail, adresse, "fonction", new Date()); //, String fonction, Date dateEmbauche);
        this.salarieService.create(newSalarie);
        //return this.index();
        return "redirect:/salaries.html";
    }

    /**
     * Supprime le salarie de la base
     */
    @GetMapping("/delete")
    public String delete(Integer id){
        this.salarieService.deleteSalarie(id);
        //return this.index();
        return "redirect:/salaries.html";
    }

    /**
     * Récupère les informations du salarie et les affiche dans le profil afin de pouvoir les modifier
     */
    @GetMapping("/update")
    public ModelAndView update(Integer id){
        ModelAndView mav = new ModelAndView("profil_salarie");
        Salarie salarie = this.salarieService.updateSalarie(id);
        Hibernate.initialize(salarie);
        mav.addObject("updateClient", salarie);
        //return this.index();
        return mav;
    }

    /**
     * Valide les modifications du profil du salarie
     */
    @PostMapping("/update")
    public String valideUpdate(Salarie salarie){
        this.salarieService.valideUpdate(salarie);
        return "redirect:/salaries.html";
    }


    @RequestMapping({"/search"})
    public ModelAndView search (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("search");
        return MAV;
    }

   /* @PostMapping("/search")
    ModelAndView validateSearch(@RequestParam String keyword) {
        final ModelAndView mav = new ModelAndView("search");
        mav.addObject("formationList",
                this.salarieService.find(keyword));
        return mav;
    }*/

    /** Manager salarie */

    @RequestMapping("/manager")
    public ModelAndView showManager(){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("manager");
        return MAV;
    }

    /**
     *  Affiche la liste des managers
     */
    @RequestMapping({"/managers"})
    public ModelAndView managers (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("managers");
        MAV.addObject("managerList",this.managerService.getAll());
        return MAV;
    }

    /**
     * Valide la création du manager et l'injecte dans la base
     */
    @RequestMapping(method = RequestMethod.POST, path = "/manager")
    public String validateManager(Integer id, @RequestParam(name="nom") String nom,
                                     @RequestParam(name="prenom") String prenom,
                                     @RequestParam(name="adresse") String adresse,
                                     @RequestParam(name="ville") String fonction,
                                     @RequestParam(name="mail") String mail){
        final Manager newManager = new Manager(nom, prenom, mail, adresse, fonction, new Date()); //, Date dateEmbauche, ArrayList<Salarie> listeSalarie);
        this.managerService.createManager(newManager);
        //return this.index();
        return "redirect:/managers.html";
    }

    /**
     * Récupère les informations du salarie et les affiche dans le profil afin de pouvoir les modifier
     */
    @GetMapping("/updateManager")
    public ModelAndView updateManager(Integer id){
        ModelAndView mav = new ModelAndView("manager");
        Manager manager = this.managerService.updateManager(id);
        Hibernate.initialize(manager);
        mav.addObject("updateManager",manager);
        //return this.index();
        return mav;
    }

    /**
     * Valide les modifications du profil du manager
     */
    @PostMapping("/updateManager")
    public String valideUpdate(Manager manager){
        this.managerService.valideUpdateManager(manager);
        return "redirect:/managers.html";
    }

    /**
     * Supprime le manager de la base
     */
    @GetMapping("/deleteManager")
    public String deleteManager(Integer id){
        this.managerService.deleteManager(id);
        //return this.index();
        return "redirect:/managers.html";
    }

}
