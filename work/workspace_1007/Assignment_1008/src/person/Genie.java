package person;

public class Genie {
	public Person person;
	public String hobby;
	
	public Genie() {}
	
	public Genie(Person person, String hobby) {
		super();
		this.person = person;
		this.hobby = hobby;
	}
	
	public void print(Person person) {
		System.out.print("[ Genie ]   ");
		person.print();
		System.out.println("취    미: " + hobby);
	}
	
}
