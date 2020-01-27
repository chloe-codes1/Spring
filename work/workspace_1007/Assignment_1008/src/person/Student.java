package person;
public class Student {

	private Person person;
	private int id;
	
	public Student() {}
	
	public Student(Person person, int id) {
		super();
		this.person = person;
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print(Person person) {
		System.out.print("[ Student ] ");
		person.print();
		System.out.println("학  번 : " + id);
	}
	
	
}
