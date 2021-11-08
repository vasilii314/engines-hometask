package com.example.engines.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.engines.services.EngineService;

@Service
@Qualifier("petrol")
public class PetrolEngineService implements EngineService {

	@Override
	public String powerUp() {
		return "Petrol Engine";
	}

}
