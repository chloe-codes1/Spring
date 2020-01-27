package com.spring.board.controller;

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
						// -> ���� ��ȣ �ȿ��� ���� Mapping {} �� method parameter���� �ٸ����� ����!
		                // -> �׷��� ���� �Ƚᵵ ��!
	
		model.addAttribute("name", "Hi, " + name );
		return "/pathVariableTest";
		
		// -> �̰� �����ų ����
		//    http://localhost:8000/gangnam/path/��μ�
		//     => PathVariable�� name�� �����Ͽ��� ������ ����ǥ ���� ���� �־��ָ� �ȴ�
}
	
	@RequestMapping("/path")
	public String home2 (String name, Model model){
		
		model.addAttribute("name", "Hi, " + name );
		return "/pathVariableTest";
		
		// -> �̰� �����Ű����
		//    http://localhost:8000/gangnam/path?name=��μ�
		//     => ? �Ἥ name�� ���� �־������
		
	}
	
	
	@RequestMapping("/path/view/{id}/{v2}/{v3}")
	public String getPath(@PathVariable String id, @PathVariable String v2, @PathVariable String v3, Model model) {
		
		model.addAttribute("id", "id => " + id);
		model.addAttribute("v2", "v2 => " + v2);
		model.addAttribute("v3", "v3 => " + v3);
		
		
		return "path/pathView" + id;
	}
	
}
