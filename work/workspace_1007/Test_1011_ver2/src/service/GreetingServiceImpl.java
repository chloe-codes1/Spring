package service;

public class GreetingServiceImpl {
	
	public String greeting;
	public String greeting2;
	
	public void setGreeting(String x, String y) {
		this.greeting = x;
		this.greeting2 = x;
	}

	public void setGreeting2(String greeting2) {
		this.greeting2 = greeting2;
	}

	@Override
	public String toString() {
		return "GreetingServiceImpl [greeting=" + greeting + ", greeting2=" + greeting2 + "]";
	}
	
}
