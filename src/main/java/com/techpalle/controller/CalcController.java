package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //It is used to mark a class as a controller component that handles HTTP requests and produces responses in a web application.
public class CalcController {
	
	@RequestMapping(value="calc",params="btnAdd") //value can makes the form action and params can makes the button control.
	public ModelAndView getAdd(String fno,String sno) 
	{
		ModelAndView mv = new ModelAndView();
		
		int fn = Integer.parseInt(fno);	//It can converts the string to integer.
		int sn = Integer.parseInt(sno);
		
		int res = fn + sn;	//We can add the above two numbers and store it in as variable. 
		 
		mv.addObject("result", res); //Put the result in ModelAndView
	
		mv.setViewName("calculator.jsp");	//Redirect to calculator.jsp
		
		return mv;	
	}
	
	@RequestMapping(value="calc",params="btnSub")
	public ModelAndView getSub(String fno,String sno) 
	{
		ModelAndView mv = new ModelAndView();
		
		int fn = Integer.parseInt(fno);
		int sn = Integer.parseInt(sno);
		
		int res = fn - sn;
		
		mv.addObject("result", res);
		
		mv.setViewName("calculator.jsp");
	
		return mv;
		
	}
}
