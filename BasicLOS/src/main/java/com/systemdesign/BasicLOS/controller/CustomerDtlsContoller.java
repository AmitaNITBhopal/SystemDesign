package com.systemdesign.BasicLOS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.systemdesign.BasicLOS.dto.CustomerDto;
import com.systemdesign.BasicLOS.service.CustomerService;



@Controller
public class CustomerDtlsContoller {
	
	
	public CustomerDtlsContoller(CustomerService cs) {
		customerService = cs;
	}
	
	private CustomerService customerService;

	@PostMapping("/submit")
	public String CaptureCustomerDtls(@ModelAttribute CustomerDto customerInfo, BindingResult bindingResult, Model model) {
		System.out.println("\n Inside CaptureCustomerDtls :\n");
		
		if (bindingResult.hasErrors()) {
	        return "AppForm";
	    }
		
		System.out.println("customerInfo :\n");
		System.out.println(customerInfo.getName()); 
		
		if(customerInfo.getName().isEmpty()) {
			model.addAttribute("txt", "Failure!");
		} else {
			
			customerService.createCustomer(customerInfo);
			System.out.println("Success!");
			model.addAttribute("txt", "Success!");
		}
		
		return "DocUploadPage";
	}
	
	@GetMapping("/") 
	public String ShowIndexHTML(Model model) {
		System.out.println("\n Inside ShowIndexHTML :\n");
		CustomerDto info = new CustomerDto();
		info.setName("amita");
		String str = "abc";
		model.addAttribute("customerInfo",info);
		 
		 
		return "Index";
	}
}
