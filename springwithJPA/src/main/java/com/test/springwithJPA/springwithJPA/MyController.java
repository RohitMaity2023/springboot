package com.test.springwithJPA.springwithJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	
	
	@Autowired
	ProductService service;
	
	
	@RequestMapping("/")
	public String show(Model model)
	{
		List<Product> list=service.displayProduct();
		for(Product p:list)
		{
			System.out.println(p.getName()+" "+p.getCost());
		}
		model.addAttribute("data", list);
		
		
		//System.out.println(list);
		return "DISPLAYED";
	}
	
	
	

}
