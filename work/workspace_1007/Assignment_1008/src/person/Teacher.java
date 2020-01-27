package person;
public class Teacher  {

	private Person person;
	private String subject;
	
	public Teacher() {}
	
	public Teacher(Person person, String subject) {
		super();
		this.person = person;
		this.subject = subject;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print(Person person) {
		System.out.print("[ Teacher ] ");
		person.print();
		System.out.println("담당과목 : " + subject);
	}
}