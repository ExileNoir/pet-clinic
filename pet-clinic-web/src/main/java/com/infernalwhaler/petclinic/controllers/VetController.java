package com.infernalwhaler.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 27/10/2021
 */

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
