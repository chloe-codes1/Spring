package main;

import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.CalculatorService_Properties;

public class Properties_Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("./config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		CalculatorService_Properties service = (CalculatorService_Properties)factory.getBean("calculator3");
		System.out.println(service);
		
		Properties p = new Properties();
	
		
		p.put("server", "192.168.1.100");
		p.put("timeout", "5000");
		System.out.println(p.getProperty("server"));
		System.out.println(p.getProperty("timeout"));
		
	}
}
