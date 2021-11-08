package com.example.engines.services.impl;

import org.springframework.stereotype.Service;

import com.example.engines.services.EngineService;

@Service("petrol")
public class PetrolEngineService implements EngineService {

	@Override
	public String powerUp() {
		return "Petrol Engine";
	}

}
