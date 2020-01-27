package com.bit.gangnam.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileupLoadTestController {

	@RequestMapping("file/fileupLoad")
	public String fileupLoad() {
		
		return "file/fileupLoadTest";
	}
	
	@RequestMapping(value="file/fileupLoadProc", method = RequestMethod.POST)
	public String fileupLoadProc(@RequestParam("title") String title , 
			                     @RequestParam("file") MultipartFile file,
			                     HttpServletRequest request, Model model) {
		
		//Âï¾îº¸±â
		System.out.println(title);
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		
		String filename = "uploadtemp/" + file.getOriginalFilename();
		
		String rootdir = request.getSession().getServletContext().getRealPath("/"); 
		
		File dir = new File(rootdir +"uploadtemp");
		
		File uploadfile = new File(dir, file.getOriginalFilename());
		
		try {
			file.transferTo(uploadfile);

		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("filename", filename);
		
		model.addAttribute("result", file);
		
		return "file/fileupLoadResult";
	}
	
	
}
