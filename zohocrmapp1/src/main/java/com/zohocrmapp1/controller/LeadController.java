package com.zohocrmapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zohocrmapp1.entities.Lead;
import com.zohocrmapp1.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	@GetMapping("/viewLeadPage")
       public String viewLead() {
    	   return "create_lead";
       }
	@PostMapping("/save")
	 public String saveLead(@ModelAttribute("lead")Lead lead,Model model) {
		 leadService.saveOneLead(lead);
		 model.addAttribute("lead", lead);
		 return "lead-info";
	 }
}
