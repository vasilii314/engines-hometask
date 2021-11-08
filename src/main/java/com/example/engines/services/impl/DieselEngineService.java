package com.example.engines.services.impl;

import org.springframework.stereotype.Service;

import com.example.engines.services.EngineService;

@Service("diesel")
public class DieselEngineService implements EngineService {

	@Override
	public String powerUp() {
		return "Diesel engine";
	}
	
}
