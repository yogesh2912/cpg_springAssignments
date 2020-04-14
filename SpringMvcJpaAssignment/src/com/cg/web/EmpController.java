package com.cg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.service.IEmpDao;

@Controller
public class EmpController {

	@Autowired
	private IEmpDao dao;
	
	@RequestMapping("/viewall")
	public String viewAll(Model model) {
		model.addAttribute("elist",dao.viewEmp());
		return "EmpviewPage";
	}
	
	@RequestMapping("/viewbyid")
	public String viewById() {
		return "ViewIdPage";
	}
	
	@RequestMapping("/searchbyid")
	public String searchById(@RequestParam("txtid")int eid ,Model model) {
		model.addAttribute("emodel",dao.viewEmp(eid));
		return "ViewIdPage";
	}
}
