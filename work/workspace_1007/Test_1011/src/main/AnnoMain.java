package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.b.Bar;

public class AnnoMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config/anno.xml"});
																	// -> anonymous instance
																	// -> xml 여러개면 , 로 이어서 쓰면 된다
		
		// [ ApplicationContext ]
		// : BeanFactory Interface를 상속받은 하위 Interface
		//   -> BeanFactory의 Bean 관리 기능 이외에 추가된 기능
		//      1) 메세지의 국제화 (다국어 지원)
		//      2) Resource로의 Access 수단 간편화
		//      3) Event 처리
		
		Bar bar = (Bar)context.getBean("bar");
		bar.doBar();
		
	}
}
