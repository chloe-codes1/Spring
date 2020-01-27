package service;

public class GreetingService {
	String greetingTarget;

	public void setGreetingTarget(String greetingTarget) {
		this.greetingTarget = greetingTarget;
	}
	public void sayHello(String name) throws Exception{ 
		if(name==null) {
			throw new Exception();
		}
		System.out.println("sayHello :"+greetingTarget+":"+name); 
		}
	public void sayGoodbye(String name){ 
		System.out.println("sayGoodbye :"+greetingTarget+":"+name); 
	}
}
