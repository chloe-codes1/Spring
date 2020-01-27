package service;

import test.Output;

public class OutputService {
	Output output;

	public OutputService(Output output) {
		super();
		this.output = output;
	}

	@Override
	public String toString() {
		return "OutputService " + output;
	}



}
