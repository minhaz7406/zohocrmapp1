 package com.zohocrmapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
	@PostMapping("/sendMail")
	public String getEmailId(@RequestParam("email")String email,Model model) {
		model.addAttribute("email", email);
		return "compose_email";
	}

}
