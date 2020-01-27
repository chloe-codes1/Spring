package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GreetingService;
import service.GreetingServiceImpl;

public class GreetingTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./config/applicationContext2.xml");

		GreetingServiceImpl bean = (GreetingServiceImpl) ctx.getBean("greetingTarget");
		try {
			bean.sayHello("김주현");
		} catch (Exception e) {
			e.printStackTrace();
		} // AOP적용되어 실행됨
		bean.sayGoodbye("김민서");// AOP적용 안됨
	}

}
