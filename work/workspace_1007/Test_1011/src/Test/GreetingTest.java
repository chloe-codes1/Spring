package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GreetingServiceImpl;

public class GreetingTest {

	public static void main(String[] args) {

		
		ApplicationContext factory = new ClassPathXmlApplicationContext("./config/applicationContext.xml");
		
		GreetingServiceImpl bean = (GreetingServiceImpl)factory.getBean("greeting");
		
		System.out.println(bean);
	}

}
