package myspring.aop;

import javax.annotation.*;

import org.springframework.stereotype.Component;

@Component()
public class Foo {

	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	

	public void doFoo() {
		System.out.println("[Foo] - doFoo");
	}

	@PostConstruct
	public void start() {
		System.out.println("[Foo] - start~!");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("[Foo] - stop!!!!");
	}

	
}
