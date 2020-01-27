package service;

import java.util.List;

public class CalculatorService_List {

	private List<Integer> valueList;

	public void setValueList(List<Integer> valueList) {
		this.valueList = valueList;
	}

	@Override
	public String toString() {
		return "CalculatorService_List [valueList=" + valueList + "]";
	}
}
