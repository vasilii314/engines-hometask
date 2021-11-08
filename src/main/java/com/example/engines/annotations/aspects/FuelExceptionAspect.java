package com.example.engines.annotations.aspects;

import java.io.IOException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class FuelExceptionAspect {
	

	@AfterThrowing(value = "@annotation(com.example.engines.annotations.FuelExceptionHandler)", throwing = "e")
	public String handleFuelException(JoinPoint joinPoint, Exception e) throws IOException {
		System.out.println("Something went wrong");
		return "error";
	}
} 
