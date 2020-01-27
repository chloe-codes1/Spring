package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.CalculatorService_List;

public class List_Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("./config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		CalculatorService_List service = (CalculatorService_List)factory.getBean("calculator");
		System.out.println(service);
	}

}
