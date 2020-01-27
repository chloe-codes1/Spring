package myspring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class MethodBeforeLogAdvice implements MethodBeforeAdvice{
	
	@Override
	public void before(Method method, Object[]args, Object target){ 
			System.out.println("[Log] METHOD Before: " +method.getName()+" on "+ target.getClass() +" calling");
	}
}
