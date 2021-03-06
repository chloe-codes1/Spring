package service;

public class GreetingServiceImpl {
	
	private String greeting;
	
	public void setGreeting(String greeting){ 
		this.greeting = greeting; 
		}
	
	public void sayHello(String name){ 
		System.out.println("sayHello :"+greeting+":"+name); 
		}
	
	public void sayGoodbye(String name){ 
		System.out.println("sayGoodbye :"+greeting+":"+name); 
	}

	@Override
	public String toString() {
		return "GreetingServiceImpl [greeting=" + greeting + "]";
	}
	
}
