package com.java.FunctionFunctionalInterface;

import java.util.function.Function;

class functionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}

}

public class FunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {
		/*
		 * Function<String, Integer> function = new functionImpl();
		 * System.out.println(function.apply("vinothini"));
		 */
		//instead if code from line no. 5-12
		Function<String, Integer> function = (String t)->t.length();
		System.out.println(function.apply("vinothini"));		
		
		
	}
}
