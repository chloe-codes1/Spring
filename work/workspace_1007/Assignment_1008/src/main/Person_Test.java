package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import person.Employee;
import person.Genie;
import person.Person;
import person.Student;
import person.Teacher;


public class Person_Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Person person = (Person) factory.getBean("person");
		Employee employee = (Employee) factory.getBean("employee");
		Student student = (Student) factory.getBean("student");
		Teacher teacher = (Teacher) factory.getBean("teacher");
		Genie genie = (Genie)factory.getBean("genie");
		
		person.setAge(25);
		person.setName("김주현");
		
		person.print();
		System.out.println();
		
		student.print(person);
		
		person.setAge(40);
		person.setName("임주현");
		teacher.print(person);
		
		person.setAge(30);
		person.setName("박주현");
		employee.print(person);
		
		person.setAge(23);
		person.setName("김민서");
		genie.print(person);
		
	}
}
