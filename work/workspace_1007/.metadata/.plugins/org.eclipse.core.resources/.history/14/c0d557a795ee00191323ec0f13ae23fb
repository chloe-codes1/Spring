package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.aop.Bar;
import myspring.aop.Foo;

public class AnnoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ApplicationContext context= new ClassPathXmlApplicationContext(new
		 * String[]{"config/anno.xml"}); Bar bar =(Bar)context.getBean("bar");
		 * bar.doBar();
		 */
		GenericXmlApplicationContext appCtx = 
				new GenericXmlApplicationContext();
		appCtx.load("classpath:config/anno.xml");

		appCtx.refresh();

		Foo bean = appCtx.getBean("foo", Foo.class);

		appCtx.registerShutdownHook();
		// appCtx.close();

	}

}
