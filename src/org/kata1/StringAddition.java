package org.kata1;

public class StringAddition {
	public Integer [] parseString(String s) {
		String [] ints = s.split(",");
		Integer [] values = new Integer[ints.length];
		for (int i = 0; i < ints.length; i++) {
			values[i] = Integer.parseInt(ints[i]);
		}
		return values;
	}
}
