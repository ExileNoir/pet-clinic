package com.infernalwhaler.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 26/10/2021
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notImplemented";
    }
}
