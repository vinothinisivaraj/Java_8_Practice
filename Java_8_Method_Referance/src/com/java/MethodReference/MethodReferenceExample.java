package com.java.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

//method reference class::StaticMethodname

public class MethodReferenceExample {

	
	  public static int addition(int a, int b) { return (a + b); }
	 
	public static void main(String[] args) {

		/*
		 * Function <Integer,Double> function = (input) ->Math.sqrt(input);
		 * System.out.println(function.apply(5));
		 */

		// method reference of the code from 8-11
		Function<Integer, Double> function = Math::sqrt;
		System.out.println(function.apply(25));
		
		/*//lambda expression//
		 * BiFunction<Integer, Integer, Integer> bifunction = (a, b) ->
		 * MethodReferenceExample.addition(a, b);
		 * System.out.println(bifunction.apply(10, 20));
		 */

		//using method reference of static method - replacement of the code-ln no.24-28
		
		BiFunction<Integer, Integer, Integer> bifunction = MethodReferenceExample::addition;
		System.out.println(bifunction.apply(3, 6));
		
	}
}
