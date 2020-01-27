package myspring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceCheckAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation)throws Throwable { 
		String methodName =invocation.getMethod().getName(); 
		long startTime =System.nanoTime(); 
		
		System.out.println("[Log]METHOD Before-->" +methodName+"timecheckstart"); 
		Object obj =null; 
		try{ 
			obj=invocation.proceed(); 
			}catch(Exception e){ 
				System.out.println("[Log]METHOD error-->"+methodName); 
				}
	long endTime =System.nanoTime(); 
	System.out.println("[Log]METHOD After-->"+methodName+"timecheckend"); 
	System.out.println("[Log]"+methodName +"Processingtimeis"+(endTime - startTime)+"ns"); 
	return obj;

  }
}