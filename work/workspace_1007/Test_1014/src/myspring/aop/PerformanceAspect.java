package myspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.cglib.core.Signature;

public class PerformanceAspect {

	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s=(Signature) joinPoint.getSignature(); 
		String methodName =s.getName(); 
		long startTime =System.nanoTime(); 
		
		System.out.println("[Log]METHODBefore:"+methodName+"timecheckstart");
		Object obj =null; 
		
		try{ 
			obj =joinPoint.proceed(); 
			}catch(Exception e){ 
				System.out.println("[Log]METHODerror:"+methodName); 
				}
		long endTime =System.nanoTime(); 
		System.out.println("[Log]METHODAfter:"+methodName+"timecheckend"); 
		System.out.println("[Log]"+methodName +"Processingtimeis"+(endTime - startTime)+"ns"); 
		return obj; 
		
	}
	
}
