package service;

public class GreetingServiceImpl {
	
	private String greeting;
	private String greeting2;
	
	private int loopCount;
	
	
	public void name(int ...a) {
	}
	
	public void x() {
		name();
		name(2);
		name(4,3);
		int [] tt = {3,4,5};
		name(tt);
	}
	
	
	
	public GreetingServiceImpl() {
		super();
	}

	
	
	public GreetingServiceImpl(String greeting, int loopCount) {
		this.greeting = greeting;
		this.loopCount = loopCount;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setGreeting2(String greeting2) {
		this.greeting2 = greeting2;
	}

	public String loopCount() {
		return greeting + loopCount;
	}
	
	@Override
	public String toString() {
		return "GreetingServiceImpl [greeting=" + greeting + ", greeting2=" + greeting2 + "]";
	}
	
}
