package com.mvcpattern.drill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {

	@RequestMapping("/sample")
	public ModelAndView mtdEx() {
		// 방법1. ModelAndView mav = new ModelAndView("temp");
		// 방법2. 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("temp");;
		// View 지정(=JSP 파일지정)
		// V/N => temp.jsp
		
		return mav;
	}
	
}
