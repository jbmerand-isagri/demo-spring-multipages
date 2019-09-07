package dev.demospringmultipages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthentificationController {

    @GetMapping("/auth-statut")
    public ModelAndView reqAfficherStatutAuthentification() {
        ModelAndView mv = new ModelAndView();
        List<String> liste = new ArrayList<>();
            liste.add("matricule = " + "M1145");
            liste.add("email = " + "collegue@mail.com");
            liste.add("nom = " + "Dupuis");
            liste.add("prenoms = " + "Charles, Edouard");

            mv.addObject("utilisateurConnecte", liste);

        mv.setViewName("jsp/authentification-statut");
        return mv;
    }

    @GetMapping("/auth")
    public String reqAfficherVueAuthentification() {
        return "jsp/authentification";
    }
}
