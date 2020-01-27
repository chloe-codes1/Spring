package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.CalculatorService_Map;


public class Map_Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("./config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		CalculatorService_Map service = (CalculatorService_Map)factory.getBean("calculator2");
		System.out.println(service);
	}

}
