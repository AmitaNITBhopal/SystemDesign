package com.systemdesign.BasicLOS.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.systemdesign.BasicLOS.dto.CustomerDto;

@Controller
public class DocUploadController {

	@Value("${uploadPath}")
	private String uploadPath;
	
	@PostMapping("/fileupload")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model
			, @RequestParam(value="action", required=true) String action) {
		System.out.println("Inside handleFileUpload");
		
		String uploadError = "";
		String message = file.getOriginalFilename();
		String validationMessage = validate(file);
		if(validationMessage.isEmpty()) {
			uploadError = upload(file);
			if(uploadError.isEmpty()) {
				message = message + " Upload Successful";
			} else {
				message = message + " " + uploadError;
			}
			
		} else {
			message = message + " " + validationMessage;
		}
		
		System.out.println("message " + message);
		
		switch (action) {
			case "Upload File1":
				
				model.addAttribute("message1", message + "!");
				break;
			case "Upload File2":
				
				model.addAttribute("message2", message + "!");
				break;
			case "Upload File3":
				
				model.addAttribute("message3", message + "!");
				break;
			case "Upload File4":
				
				model.addAttribute("message4", message + "!");
				break;
			default:
				//nothing
		}
		
		return "DocUploadPage";
		//return "redirect:/";
	}
	
	
	public String validate(MultipartFile file) {
		String ret = "";
		System.out.println("Name of file is : " + file.getOriginalFilename());
		
		//check file type and size
		if(file.getSize() > 5000000) {
			return "File Size is greater than 5 Mb";
		} else {
			String name = file.getOriginalFilename();
			if (name == null) {
				ret = "Empty file name";
		        return ret;
		    }
			
		    int dotIndex = name.lastIndexOf(".");
		    if (dotIndex > 0) {
		        String suffix = name.substring(dotIndex + 1);
		        System.out.println("suffix of file is : " + suffix);
		        if(suffix.equalsIgnoreCase("pdf")
		        		|| suffix.equalsIgnoreCase("jpg")
		        		|| suffix.equalsIgnoreCase("png")
		        		|| suffix.equalsIgnoreCase("jpeg")) {
		        	ret = "";
		        } else {
		        	ret = "This file type is not allowed";
		        }
		    } else {
		    	ret = "Please enter a valid file";
		    }
		}
		
		return ret;
	}
	
	public String upload(MultipartFile file) {
		
		String response = "";
		
		String uploadFileName = "";
	    String fileName = file.getOriginalFilename();
	    try {
	    	uploadFileName = uploadPath + fileName;
	    	System.out.println("File name: " + uploadFileName);
	    	file.transferTo( new File(uploadFileName));
	    } catch (Exception e) {
	      return "Failed to upload file";
	    } 
	    return "";
	}

	@PostMapping("/page1")
	public String CaptureDocuments(Model model) {
		System.out.println("\n Inside CaptureDocuments :\n");
		
		return "PaymentsPage";
	}

}
