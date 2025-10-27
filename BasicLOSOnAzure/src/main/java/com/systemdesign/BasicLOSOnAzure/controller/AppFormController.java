package com.systemdesign.BasicLOSOnAzure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppFormController {

	@PostMapping("/page3")
	public String CaptureAppFormConfirmation(Model model) {
		System.out.println("\n Inside CaptureAppFormConfirmation :\n");
		
		return "LastPage";
	}
}
