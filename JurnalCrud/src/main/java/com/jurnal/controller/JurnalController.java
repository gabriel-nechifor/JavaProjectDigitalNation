package com.jurnal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jurnal.model.Jurnal;
import com.jurnal.service.JurnalService;


@Controller
public class JurnalController {

	@Autowired
    private JurnalService service;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Jurnal> listjurnal = service.listAll();
        model.addAttribute("listjurnal", listjurnal);
        System.out.print("Get / ");
        return "index";
    }
 	
	
}
