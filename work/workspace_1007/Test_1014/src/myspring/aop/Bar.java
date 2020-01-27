package myspring.aop;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	private Foo foo;
	
	public Bar() {
		System.out.println("나는 생성자야...");
		// -> 생성자가 먼저 호출되는 것 확인 가능
	}
	
	@Required
	@Resource
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public void doBar() {
		foo.doFoo();
	}
	
}
