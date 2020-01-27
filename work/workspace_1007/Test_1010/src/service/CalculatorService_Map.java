package service;

import java.util.Map;

import test.Bar;
import test.Bar2;

public class CalculatorService_Map {
	
	private Map<String, Bar> valueMap;
	private Map<String, Bar2> valueMap2;

	public void setValueMap(Map<String, Bar> valueMap) {
		this.valueMap = valueMap;
	}

	public void setValueMap2(Map<String, Bar2> valueMap2) {
		this.valueMap2 = valueMap2;
	}

	@Override
	public String toString() {
		return "CalculatorService [valueMap=" + valueMap + ", valueMap2=" + valueMap2 + "]";
	}
	
}
