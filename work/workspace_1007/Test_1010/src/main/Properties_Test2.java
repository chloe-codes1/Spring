package main;

import java.util.Enumeration;
import java.util.Properties;

public class Properties_Test2 {

	public static void main(String[] args) {

		Properties property = new Properties();
		
		property.setProperty("server", "192.168.0.134");
		property.setProperty("time", "5000");
		
		Enumeration p = property.propertyNames();

		while(p.hasMoreElements()) {

			String prop = (String)p.nextElement();

			System.out.println(prop+" : "+property.getProperty(prop));

		}
		
		
	}

}
