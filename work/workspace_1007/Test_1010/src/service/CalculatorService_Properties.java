package service;

import java.util.Properties;

public class CalculatorService_Properties {

	private Properties valueProperties;

	public void setValueProperties(Properties valueProperties) {
		this.valueProperties = valueProperties;
	}
	
	
	@Override
	public String toString() {
		return "CalculatorService_Properties [valueProperties=" + valueProperties + "]";
	}

}
