package com.test.project;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("HelloController")
public class HelloController {
	
	@RequestMapping(method={RequestMethod.GET}, value="/data/hello.do")
	public String add(DataDTO dto, HttpServletRequest request) {
		
		dto.setName("Hello World!");
		String name = dto.getName();
		
		request.setAttribute("name", name);
		
		return "helloWorld";
		
	}
	
	
}