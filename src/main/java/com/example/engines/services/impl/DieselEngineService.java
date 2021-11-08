package com.example.engines.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.engines.services.EngineService;

@Service
@Qualifier("diesel")
public class DieselEngineService implements EngineService {

	@Override
	public String powerUp() {
		return "Diesel engine";
	}
	
}
