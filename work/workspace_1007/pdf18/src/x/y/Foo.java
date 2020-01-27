package x.y;

public class Foo {

	private Bar bar;
	private Baz baz;
	
	
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}
	
	
	public void sayFoo(String name) {
		System.out.println("Say " +name);
	}


	@Override
	public String toString() {
		return "Foo [bar=" + bar + ", baz=" + baz + "]";
	}

	public void print() {
		System.out.println("Foo [bar=" + bar.PrintBar() + ", baz=" + baz.PrintBaz());
	}

}

