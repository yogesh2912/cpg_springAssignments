package com.cpg.web;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cpg.entity.Emp;

@Controller
public class EmpController {
	
	@GetMapping("/calform")
	public String displayCalForm() {
		return "SalformPage";
	}

	
	@GetMapping("/calsubmit")
	public String displaySubmit(@ModelAttribute("emodel") Emp emp,Model model) {
		double pf=emp.getSal()*0.12;
		double al=emp.getSal()*0.4;
		
		model.addAttribute("pf", pf);
		model.addAttribute("al", al);
		return "SalSubmitPage";
	}
}
