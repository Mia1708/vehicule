/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EmployeDAO;
import dao.FonctionGeneralise;
import dao.HibernateDao;
import dao.MarqueDAO;
import dao.ModeleDAO;
import dao.TypeDAO;
import dao.VehiculeDAO;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Fanjava
 */
@Controller
public class InsertionController {

    @Autowired
    HibernateDao dao;
    EmployeDAO employeDAO = new EmployeDAO();

    MarqueDAO marqueDAO = new MarqueDAO();

    ModeleDAO modeleDAO = new ModeleDAO();

    TypeDAO typeDAO = new TypeDAO();

    VehiculeDAO vehiculeDAO = new VehiculeDAO();

    FonctionGeneralise fonction = new FonctionGeneralise();

    @RequestMapping(value = "/")
    public ModelAndView formulaireLogin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nom = request.getParameter("nom");
        String mdp = request.getParameter("mdp");
        int login = employeDAO.loginDAO(nom, mdp);
        int idEmploye = employeDAO.getIdEmploye(nom, mdp);
        HttpSession session = request.getSession();
        session.setAttribute("idEmploye", idEmploye);
        if (login == 1) {
            mv.setViewName("acceuil");
        } else {
            mv.setViewName("login");
        }
        return mv;
    }

    @RequestMapping(value = "/formulaireInsertVehicule")
    public ModelAndView formulaireInsertVehicule() throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<Marque> listMarque = marqueDAO.listeMarque();
        ArrayList<Modele> listModele = modeleDAO.listeModele();
        ArrayList<Type> listType = typeDAO.listeType();
        mv.addObject("listType", listType);
        mv.addObject("listModele", listModele);
        mv.addObject("listMarque", listMarque);
        mv.setViewName("ajout_vehicule");
        return mv;
    }

    @RequestMapping(value = "/insertVehicule")
    public ModelAndView insertVehicule(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        String numero = request.getParameter("numero");
        int type = Integer.parseInt(request.getParameter("type"));
        int marque = Integer.parseInt(request.getParameter("marque"));
        int modele = Integer.parseInt(request.getParameter("modele"));
        Vehicule vehicule = new Vehicule();
        vehicule.setIdmarque(marque);
        vehicule.setIdmodele(modele);
        vehicule.setNumerovehicule(numero);
        vehicule.setIdtype(type);
        vehicule.insertVehicule(fonction, vehicule);
        mv.setViewName("acceuil");
        return mv;
    }

    @RequestMapping(value = "/formulaireTrajet")
    public ModelAndView formulaireTrajet() throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<Vehicule> listVehicule = vehiculeDAO.listeVehicule();
        mv.addObject("listVehicule", listVehicule);
        mv.setViewName("ajout_trajet");
        return mv;
    }

    @RequestMapping(value = "/insertTrajet")
    public ModelAndView insertTrajet(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        Date dateDepart = Date.valueOf(request.getParameter("dateDepart"));
        Time heureDepart = Time.valueOf(request.getParameter("heureDepart"));
//        Date dateDepart = Date.valueOf(request.getParameter("dateDepart"));
//        Time heureDepart = Time.valueOf(request.getParameter("heureDepart"));
        HttpSession session = request.getSession();
        int idEmploye = (int) session.getAttribute("idEmploye");
        
        mv.setViewName("acceuil");
        return mv;
    }

//    @RequestMapping(value="/")
//    public ModelAndView index(){
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("login");
//        return mv;
//    }
//    @RequestMapping(value="/home")
////    @RequestMapping(value="/home",method = RequestMethod.GET)
//    public String home(HttpServletRequest req){
////        req.getParameter(string)
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("regions");
//        mv.addObject("regions",dao.findAll(Parametrage.class));
//        
//        return "home";
//    }
}
