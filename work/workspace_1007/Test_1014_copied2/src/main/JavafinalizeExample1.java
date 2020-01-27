package main;

public class JavafinalizeExample1 {
	public static void main(String[] args) {
		
		JavafinalizeExample1 obj = new JavafinalizeExample1();
		System.out.println(obj);
		obj = null;
		// calling garbage collector
		System.gc();
		System.out.println("end of garbage collection");
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}