package com.cpg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmiController {
	
	@GetMapping("/emiform")
	public String displayEmiForm() {
		return "EmiformPage";
	}
	
	@GetMapping("/emisubmit")
	public String displayEmiForm(@RequestParam("txtawt") double amt,@RequestParam("txtyears") int years,Model model) {
		double ci=amt*Math.pow((1+0.1), years);
		double emi=ci/(years*12);
		model.addAttribute("totalAmount", ci);
		model.addAttribute("monthlyAmount",emi);
		
		
		return "EmiSubmitPage";
		
	}

}
