package com.systemdesign.BasicLOSOnAzure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class paymentscontroller {

	@PostMapping("/page2")
	public String CapturePayments(Model model) {
		System.out.println("\n Inside CapturePayments :\n");
		
		return "AppForm";
	}

}
