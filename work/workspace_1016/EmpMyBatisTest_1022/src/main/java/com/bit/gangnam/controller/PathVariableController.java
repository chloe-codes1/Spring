package com.bit.gangnam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * PathVariable Test
 */

@Controller
public class PathVariableController {

	
	@RequestMapping("/path/{name}")
	
	public String home (@PathVariable("name") String name, Model model){
						// -> 여기 괄호 안에는 위의 Mapping {} 와 method parameter명이 다를때만 써줌!
		                // -> 그래서 여기 안써도 됨!
	
		model.addAttribute("name", "Hi, " + name );
		return "/pathVariableTest";
		
		// -> 이걸 실행시킬 때는
		//    http://localhost:8000/gangnam/path/김민서
		//     => PathVariable로 name을 지정하였기 때문에 물음표 없이 값만 넣어주면 된다
}
	
	@RequestMapping("/path")
	public String home2 (String name, Model model){
		
		model.addAttribute("name", "Hi, " + name );
		return "/pathVariableTest";
		
		// -> 이걸 실행시키려면
		//    http://localhost:8000/gangnam/path?name=김민서
		//     => ? 써서 name에 값을 넣어줘야함
		
	}
	
	
	@RequestMapping("/path/view/{id}/{v2}/{v3}")
	public String getPath(@PathVariable String id, @PathVariable String v2, @PathVariable String v3, Model model) {
		
		model.addAttribute("id", "id => " + id);
		model.addAttribute("v2", "v2 => " + v2);
		model.addAttribute("v3", "v3 => " + v3);
		
		
		return "path/pathView" + id;
	}
	
}
