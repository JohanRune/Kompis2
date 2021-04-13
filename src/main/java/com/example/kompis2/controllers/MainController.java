package com.example.kompis2.controllers;

import com.example.kompis2.models.Kompis;
import com.example.kompis2.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Johan Rune
 * Date: 2021-04-12
 * Time: 17:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

@Controller
@RequestMapping(path="/demo") //ska det vara demo?
public class MainController {

    @Autowired
    private KompisRepository kompisRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewKompis (@RequestParam String name, @RequestParam String email,
                         @RequestParam String mobile ) {
        Kompis n = new Kompis();
        n.setNamn(name);
        n.setEpost(email);
        n.setTelefonnummer(mobile);
        kompisRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Kompis> getAllKompisar() {
        return kompisRepository.findAll();
    }


}
