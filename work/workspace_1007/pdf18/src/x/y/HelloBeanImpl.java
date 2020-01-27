package x.y;

public class HelloBeanImpl implements HelloBean {

	@Override
	public void sayHello(String name) {

		System.out.println("안녕하세요 " + name + "씨");
	}

}
