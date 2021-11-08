package com.libraryUsage.Lib.controller;

import com.libraryUsage.Lib.model.Person;
import com.libraryUsage.Lib.service.PersonService;
import com.libraryUsage.Lib.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping("/add-person")
    public String showAddPage(ModelMap model) {
        model.addAttribute("person", new Person(0,"",  "", "", "", "",""));
        return "person";
    }

    @GetMapping("/list-users")
    public String showAll(ModelMap model) {
        model.put("people", service.findAll());
        return "list-users";
    }

    @PostMapping("/add-person")
    public String add(ModelMap model, @ModelAttribute("person") Person zm, BindingResult result) {
        ValidationService vs = new ValidationService();
        if(vs.isPhoneValid(zm.getNumber()) && vs.isEmailValid(zm.getEmail()) && vs.isPassValid(zm.getPassword())) {
            service.add(zm);
            return "redirect:/list-users";
        }
        else{
            return "error";
        }
    }

    @GetMapping("/update-person/{zmogausId}")
    public String showUpdatePage(ModelMap model, @PathVariable int zmogausId) {
        model.addAttribute("person", service.findById(zmogausId));
        return "person";
    }

    @PostMapping("/update-person/{zmogausId}")
    public String update(ModelMap model, @ModelAttribute("person") Person zm, BindingResult result) {
        ValidationService vs = new ValidationService();
        if(vs.isPhoneValid(zm.getNumber()) && vs.isEmailValid(zm.getEmail()) && vs.isPassValid(zm.getPassword())) {
            service.update(zm);
            return "redirect:/list-users";
        }
        else{
            return "error";
        }
    }

    @GetMapping("/delete-person/{zmogausId}")
    public String delete(@PathVariable int zmogausId) {
        service.deleteById(zmogausId);
        return "redirect:/list-users";
    }

}
