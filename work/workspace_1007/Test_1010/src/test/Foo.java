package test;

public class Foo {

	private Bar bar;
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void doBar() {
		
		Bar bar = getBar();
		bar.dolt();
	}
	
	protected Bar getBar() {
		return null;
	}
}
