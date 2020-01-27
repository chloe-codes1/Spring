package myspring.aop;

public class LogAspect {

	public void beforeLogging() {
		System.out.println("method 호출 전");
	}
	
	public void afterLogging(Object returnValue) {
		System.out.println("method 호출 후");
	}
	
	public void throwingLogging(Exception ex) {
		System.out.println("예외 발생! " + ex.getMessage());
	}
	
	public void alwaysLogging() {
		System.out.println("항상 실행");
		
	}
}
