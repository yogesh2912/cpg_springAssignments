package com.cg.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Account;
import com.cg.entity.TransferBean;
import com.cg.exception.AccountException;
import com.cg.service.AccountService;

@RestController
public class HomeController {
	
	@Autowired
	private AccountService service;
	
	
	@CrossOrigin
	@GetMapping("/viewall")
	public List<Account> getAccounts() {
		
		return service.viewAccount();
	}
	
	
	@CrossOrigin
	@PostMapping("/add")
	public String addAccount(@Valid @RequestBody Account account,BindingResult br) throws AccountException {
		String err="";
		if(br.hasErrors()) {
			List<FieldError> errors=br.getFieldErrors();
			for(FieldError  error:errors) {
				err+=error.getDefaultMessage()+"<br/>";
			}
			throw new AccountException(err);
			
		}
		try {
			service.addAccount(account);
			return "Accout Added Successfully";
		}
		catch(DataIntegrityViolationException ex) {
			throw new AccountException("ID already exists");
		}
	}
	
	
	@CrossOrigin
	@PostMapping("/transfer")
	public String transferMoney(@Valid @RequestBody TransferBean transferBean,BindingResult br)throws AccountException  {
		String err="";
		if(br.hasErrors()) {
			List<FieldError> errors=br.getFieldErrors();
			for(FieldError  error:errors) {
				err+=error.getDefaultMessage()+"<br/>";
			}
			throw new AccountException(err);
			
		}
	
			service.transferFund(transferBean.getFormAccountId(), transferBean.getToAccountId(), transferBean.getAmt());
			return "Amount Transfered";
			
		
	}

}
