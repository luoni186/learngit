package com.aisino.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SystemAspect {

	@Pointcut("within(com.aitss.rest.*) && "
			+ "@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	private void log() {
		System.out.println("======log");
	}
	@Before("log()")
	public void before(JoinPoint joinPoint) {
		System.out.println("======before");
	}
	@AfterReturning(pointcut="log()", returning="result")
	public void returning(Object result) {
		System.out.println("成功返回");
	}
	@AfterThrowing(pointcut="log()", throwing="ex")
	public void throwing(JoinPoint joinPoint, Exception ex) {
		System.out.println("发生意外");
	}
}
