package test;

public class Output {
	String name;
	int age;

	public Output(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Output() {
		System.out.println("output()호출");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Output [name=" + name + ", age=" + age + "]";
	}

}
