package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.b.Bar;

public class AnnoMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config/anno.xml"});
																	// -> anonymous instance
																	// -> xml 여러개면 , 로 이어서 쓰면 된다
		
		
		Bar bar = (Bar)context.getBean("bar");
		bar.doBar();
		
	}
}
