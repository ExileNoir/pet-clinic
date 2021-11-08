package com.infernalwhaler.petclinic.controllers;

import com.infernalwhaler.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 27/10/2021
 */

@Controller
public class VetController {

    private final VetService vetService;


    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets", "/vets/index", "vets/index.html", "/vets.html"})
    public String listVets(final Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
