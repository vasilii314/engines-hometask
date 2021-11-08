package com.example.engines.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.engines.annotations.FuelExceptionHandler;
import com.example.engines.exceptions.FuelTypeException;
import com.example.engines.services.EngineService;

@Controller
public class EngineController {
	
	private ApplicationContext context;
	
	@Autowired
	public EngineController(ApplicationContext context) {
		this.context = context;
	}
	
	@GetMapping("/mvc/fuel/check")
	@FuelExceptionHandler
	public String getEngineType(@RequestParam String type, Model model) {
		type = type.toLowerCase().trim();
		try {
			EngineService service = (EngineService) context.getBean(type);
			model.addAttribute("message", service.powerUp());
			return "index";
		} catch (Exception e) {
			throw new FuelTypeException("Invalid engine type");
		}
	}
}
