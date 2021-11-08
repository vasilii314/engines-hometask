package com.example.engines.annotations.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class FuelExceptionAspect {
	
	@Pointcut("@annotation(com.example.engines.annotations.FuelExceptionHandler)")
    public void callWhenFueExceptionThrown() { }
	

	@Around("callWhenFueExceptionThrown()")
	public Object handleFuelException(ProceedingJoinPoint pjp) {
		try {
			System.out.println("Something went wrong");
			return pjp.proceed();
		} catch(Throwable e) {
			return "myerror";
		}
	}
} 
