package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import test.Bar;
import test.Foo;


public class Foo_Test {

	public static void main(String[] args) {


		Resource resource = new ClassPathResource("./config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo foo = (Foo)factory.getBean("foo");
		
		foo.doBar();
	}

}
