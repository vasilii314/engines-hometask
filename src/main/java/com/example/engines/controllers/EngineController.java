package com.example.engines.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.engines.annotations.FuelExceptionHandler;
import com.example.engines.exceptions.FuelTypeException;
import com.example.engines.services.EngineService;

@RestController
public class EngineController {
	
	private EngineService dieselEngineService;
	private EngineService petrolEngineService;
	
	@Autowired
	public EngineController(@Qualifier("diesel") EngineService dieselEngineService,
			@Qualifier("petrol") EngineService petrolEngineService) {
		this.dieselEngineService = dieselEngineService;
		this.petrolEngineService = petrolEngineService;
	}


	@GetMapping("/mvc/fuel/check")
	@FuelExceptionHandler
	public String getEngineType(@RequestParam String type) {
		type = type.toLowerCase().trim();
		if (type.equals("diesel")) {
			return dieselEngineService.powerUp();
		} else if (type.equals("petrol")) {
			return petrolEngineService.powerUp();
		} else {
			throw new FuelTypeException("Invalid engine type");
		}
	}
}
