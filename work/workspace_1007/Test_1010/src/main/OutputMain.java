package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.OutputService;

public class OutputMain {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("./config/appOutput.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		OutputService o = (OutputService) factory.getBean("OutputService");
		System.out.println(o);
	}
}
