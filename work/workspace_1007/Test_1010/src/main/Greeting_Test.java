package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.GreetingServiceImpl;

public class Greeting_Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("./config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// [ BeanFactory ]
		// : Bean 객체를 관리하고, 각 Bean 객체간의 의존 관계를 설정해주는 가장 단순한 컨테이너
		//   -> 대표적인 구현 Class = XmlBeanFactory
		
		GreetingServiceImpl bean=(GreetingServiceImpl)factory.getBean("greeting"); 
		GreetingServiceImpl bean2=(GreetingServiceImpl)factory.getBean("greeting");
		System.out.println(bean==bean2);
		
		GreetingServiceImpl bean3=(GreetingServiceImpl)factory.getBean("greeting2");
		GreetingServiceImpl bean4=(GreetingServiceImpl)factory.getBean("greeting2");
		System.out.println(bean3==bean4);
		
		GreetingServiceImpl bean5 = (GreetingServiceImpl) factory.getBean("greeting1");
		System.out.println(bean5.loopCount());

}
}