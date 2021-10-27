package com.infernalwhaler.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 27/10/2021
 */

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
