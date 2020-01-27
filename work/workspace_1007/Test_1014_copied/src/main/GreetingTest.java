package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GreetingService;
import service.GreetingServiceImpl;

public class GreetingTest {

	public static void main(String[]args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./config/applicationContext.xml"); 
		
		GreetingServiceImpl bean1=(GreetingServiceImpl)ctx.getBean("greeting"); 
		try {
			bean1.sayHello("김민서");
		} catch (Exception e) {
			e.printStackTrace();
		}//AOP적용되어 실행됨 
		bean1.sayGoodbye("김민서");//AOP적용 안됨
		}
	
}
