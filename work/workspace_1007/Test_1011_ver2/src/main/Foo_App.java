package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.b.Foo;


public class Foo_App {

	public static void main(String[] args) {


//		Resource resource = new ClassPathResource("./config/applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		

		ApplicationContext factory = new ClassPathXmlApplicationContext("./config/applicationContext.xml");
		
		Foo foo = (Foo)factory.getBean("foo");
		
		System.out.println(foo);
		foo.start();
		foo.stop();
		
	}

}
