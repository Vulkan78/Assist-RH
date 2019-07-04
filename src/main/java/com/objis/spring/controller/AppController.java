package com.objis.spring.controller;
import com.objis.spring.demodao.IFormationDao;
import com.objis.spring.demodao.IFormationPersonneDao;
import com.objis.spring.demodao.IManagerDao;
import com.objis.spring.demodao.ISalarieDao;
import com.objis.spring.demodomaine.Formation;
import com.objis.spring.demodomaine.FormationPersonne;
import com.objis.spring.demodomaine.Manager;
import com.objis.spring.demodomaine.Salarie;
import com.objis.spring.service.FormationPersonneService;
import com.objis.spring.service.ManagerService;
import com.objis.spring.service.SalarieService;
import com.objis.spring.service.FormationService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private IFormationPersonneDao iFormationPersonneDao;
    @Autowired
    private IFormationDao iFormationDao;
    @Autowired
    private FormationPersonneService formationPersonneService;
    @Autowired
    private ISalarieDao iSalarieDao;
    @Autowired
    private IManagerDao iManagerDao;

    @PostMapping("/checklogin")
    public ModelAndView checklogin (@RequestParam(name="mail") String mail, @RequestParam(name="password") String password,
                                    HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        ModelAndView MAV = new ModelAndView();
        HttpSession session = request.getSession();
        List<Salarie> salaries = this.iSalarieDao.findByMail(mail);
        List<Manager> managers = this.iManagerDao.findByMail(mail);

        if(salaries.size() > 0) {
            Salarie salarie = salaries.get(0);
            if (password.equals(salarie.getPassword())) {

                session.setAttribute("id", salaries.get(0).getId());
                MAV.setViewName("index");
            } else {
                MAV.setViewName("connexion");
            }
        }
        else {

            if (managers.size() > 0) {
                Manager manager = managers.get(0);
                if (password.equals(manager.getPassword())) {

                    session.setAttribute("id", managers.get(0).getId());
                    MAV.setViewName("index-manager");
                } else {
                    MAV.setViewName("connexion");
                }
            } else {
                MAV.setViewName("connexion");
            }
        }
        return MAV;
    }

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
     * Affiche la page budget du service RH
     */
    @RequestMapping({"/rh-budget"})
    public ModelAndView rhBudget (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-budget");
        return MAV;
    }

    /**
     * Affiche la page depenses du service RH
     */
    @RequestMapping({"/rh-depenses"})
    public ModelAndView rhDepenses (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-depenses");
        return MAV;
    }

    /**
     * Affiche la page de gestion des compétences du service RH
     */
    @RequestMapping({"/rh-competences"})
    public ModelAndView rhCompetence (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-competences");
        //Premier onglet
        MAV.addObject("salarieList",this.salarieService.getAll());
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
     * Affiche le module de gestion de formation du service RH
     */
    @RequestMapping({"/rh-formation"})
    public ModelAndView rhFormation (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("rh-formation");
        //Premier onglet
        MAV.addObject("formationList",this.formationService.getAll(new Date()));
        return MAV;
    }

    /**
     * Affiche les résultats de la recherche du catalogue de formation du service RH
     */
    @PostMapping("/rh-search")
    ModelAndView validateSearchRh(@RequestParam String keyword) {
        final ModelAndView mav = new ModelAndView("rh-formation");
        mav.addObject("formationList", this.formationService.findFormation(keyword));
        return mav;
    }

    /**
     * Affiche le catalogue de formation
     */
    @RequestMapping({"/formation-catalogue"})
    public ModelAndView formationCatalogue (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-catalogue");
        //Premier onglet
        MAV.addObject("formationList",this.formationService.getAll(new Date()));
        return MAV;
    }

    /**
     * Affiche les résultats de la recherche du catalogue de formation
     */
    @PostMapping("/search")
    ModelAndView validateSearch(@RequestParam String keyword) {
        final ModelAndView mav = new ModelAndView("formation-catalogue");
        mav.addObject("formationList", this.formationService.findFormation(keyword));
        return mav;
    }

    /**
     * Affiche les demandes de formation en cours du salarié
     */
    @RequestMapping({"/formation-demandes"})
    public ModelAndView formationDemandes (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-demandes");
        HttpSession session = request.getSession(true);
        Integer id = (int)session.getAttribute("id");
        Salarie salarie = this.salarieService.getSalarie(id);
        //Deuxieme onglet
        List<FormationPersonne> listeFormationPersonne = this.iFormationPersonneDao.findBySalarieAndStatutDemande(salarie, "Demandée");
        MAV.addObject("formationPersonneListStatut",listeFormationPersonne);
        return MAV;
    }

    /**
     * Affiche l'historique des demandes de formation du salarié
     */
    @RequestMapping({"/formation-historique"})
    public ModelAndView formationHistorique (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("formation-historique");
        HttpSession session = request.getSession(true);
        Integer id = (int)session.getAttribute("id");
        Salarie salarie = this.salarieService.getSalarie(id);
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
    @GetMapping("/formation-detail")
    public ModelAndView formationDetail(Integer id, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        ModelAndView mav = new ModelAndView("formation-detail");
        HttpSession session = request.getSession(true);

        Integer idUser = (int)session.getAttribute("id");
        Salarie salarie = this.salarieService.getSalarie(idUser);
        Formation formation = this.formationService.getFormation(id);

        FormationPersonne demande = this.formationPersonneService.getBySalarieFormation(salarie, formation);
        ArrayList<Formation> formations = new ArrayList();
        formations.add(formation);

        ArrayList<FormationPersonne> demandes = new ArrayList();
        Hibernate.initialize(demande);
        demandes.add(demande);

        mav.addObject("formationDetail",formations);
        mav.addObject("demandeDetail",demandes);
        return mav;
    }

    /**
     *  Affiche les détails de la formation
     */
    @GetMapping("/catalogue-detail")
    public ModelAndView catalogueDetail(@RequestParam Integer id) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("catalogue-detail");
        //Premier onglet
        Formation formation = this.formationService.findById(id);
        ArrayList<Formation> formations = new ArrayList();
        formations.add(formation);
        System.out.println(formation);
        System.out.println(formations);
        mav.addObject("formationDetail",formations);
        return mav;
    }

    /**
     * Valide la création de la formation et l'injecte dans la base
     */
    @RequestMapping(method = RequestMethod.POST, path = "/rh-formation")
    public String validateFormation(@RequestParam(name="theme") String theme,
                                 @RequestParam(name="description") String description,
                                 @RequestParam(name="datedebut") String dateDebutStr,
                                 @RequestParam(name="duree") Integer duree) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDebut = formatter.parse(dateDebutStr);
        System.out.println(dateDebutStr);
        System.out.println(dateDebut);
        final Formation newFormation = new Formation(theme, dateDebut, duree, description);
        this.formationService.createFormation(newFormation);
        return "redirect:/rh-formation.html";
    }

    /**
     * Supprime la formation de la base
     */
    @GetMapping("/deleteformation")
    public String delete(Integer id){
        this.formationService.deleteFormation(id);
        //return this.index();
        return "redirect:/rh-formation.html";
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

    /**
     * Affiche la page de gestion des compétences du service RH
     */
    @RequestMapping({"/mg-salaries"})
    public ModelAndView mgSalarie (){
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("mg-salaries");
        //Premier onglet
        MAV.addObject("salarieList",this.salarieService.getAll());
        return MAV;
    }

    /**
     * Affiche les demandes de formation en cours du salarié
     */
    @RequestMapping({"/mg-demandes"})
    public ModelAndView managerDemandes (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("mg-demandes");
        HttpSession session = request.getSession(true);
        Integer id = (int)session.getAttribute("id");
        Salarie salarie = this.salarieService.getSalarie(id);
        //Deuxieme onglet
        List<FormationPersonne> listeFormationPersonne = this.iFormationPersonneDao.findBySalarieAndStatutDemande(salarie, "Demandée");
        MAV.addObject("formationPersonneListStatut",listeFormationPersonne);
        return MAV;
    }

    /**
     * Affiche l'historique des demandes de formation du salarié
     */
    @RequestMapping({"/mg-historique"})
    public ModelAndView managerHistorique (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        ModelAndView MAV = new ModelAndView();
        MAV.setViewName("mg-historique");
        HttpSession session = request.getSession(true);
        Integer id = (int)session.getAttribute("id");
        Salarie salarie = this.salarieService.getSalarie(id);
        //Troisième onglet
        MAV.addObject("formationPersonneList",this.iFormationPersonneDao.findBySalarieAndStatutDemandeNot(salarie, "Demandée"));
        return MAV;
    }


    /**
     *  Affiche les détails de la formation
     */
    @GetMapping("/mg-detail")
    public ModelAndView managerDetail(Integer id, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        ModelAndView mav = new ModelAndView("mg-detail");
        HttpSession session = request.getSession(true);
        Integer idUser = (int)session.getAttribute("id");
        Salarie salarie = this.salarieService.getSalarie(idUser);
        Formation formation = this.formationService.getFormation(id);

        FormationPersonne demande = this.formationPersonneService.getBySalarieFormation(salarie, formation);
        ArrayList<Formation> formations = new ArrayList();
        formations.add(formation);
        ArrayList<FormationPersonne> demandes = new ArrayList();
        Hibernate.initialize(demande);
        demandes.add(demande);

        mav.addObject("formationDetail",formations);
        mav.addObject("demandeDetail",demandes);
        return mav;
    }

    /**
     *  Affiche les détails de la formation
     */
    @PostMapping("/approuverformation")
    public ModelAndView approuverFormation(@RequestParam Integer id ,@RequestParam Integer idDemande, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        ModelAndView mav = new ModelAndView("mg-demandes");
        FormationPersonne demande = this.formationPersonneService.findbyId(id);
        demande.setStatutDemande("Approuvée");
        return mav;
    }
}
