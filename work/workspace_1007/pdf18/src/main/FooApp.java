package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.Foo;

public class FooApp {

	public static void main(String[] args) {

		Resource resource =new ClassPathResource("./config/applicationContext.xml"); 
		//-> 눈에 보이기엔 src이지만, 실제로 실행시키면 src는 없어지고 현재 classpath에서 경로를 가져온다
        // => [ 상대 경로 ]
		
		BeanFactory factory=new XmlBeanFactory(resource); 
		// -> xml을 이용해서 bean 만들기
		// -> 그걸 참조하는 "factory"에서 "foo"를 가져오기
		
		Foo foo=(Foo)factory.getBean("foo"); 
		// -> (Foo)로 casting 한 이유
		//    => sub class인 Foo가 Object보다 memory가 크기 때문에 =을 기준으로 양쪽을 맞춰주기 위해 casting함
		
		foo.sayFoo("김민서");
		foo.print();
		System.out.println(foo);
	}
}
