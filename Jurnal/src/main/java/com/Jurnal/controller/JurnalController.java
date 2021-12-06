package com.Jurnal.controller;

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

import com.Jurnal.model.Jurnal;
import com.Jurnal.service.JurnalService;

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
	    
	    
	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("jurnal", new Jurnal());
	        return "new";
	    }
	 
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveJurnal(@ModelAttribute("jurnal") Jurnal std) {
	        service.save(std);
	        return "redirect:/";
	    }
	 
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditJurnalPage(@PathVariable(name = "id") long id) {
	        ModelAndView mav = new ModelAndView("new");
	        Jurnal std = service.get(id);
	        mav.addObject("jurnal", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deletejurnal(@PathVariable(name = "id") long id) {
	        service.delete(id);
	        return "redirect:/";
	    }
}



