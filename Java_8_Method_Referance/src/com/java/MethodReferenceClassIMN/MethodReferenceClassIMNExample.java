package com.java.MethodReferenceClassIMN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceClassIMNExample {
	public static void main(String[] args) {
		/*
		 * //lambda Function<String, String> function = (String v) -> v.toLowerCase();
		 * System.out.println(function.apply("HAI VINO"));
		 */

		// replacement of 8-11
		Function<String, String> function = String::toLowerCase;
		System.out.println(function.apply("HAI VINO"));

		String[] strArray = { "O", "I", "E", "U", "A" };

		// lambda
		Arrays.sort(strArray, (s1, s2) -> s1.toString().compareToIgnoreCase(s2.toString()));
		// Collections.sort(strArray,(String s1, String s2)->s2.compareTo(s1));
		System.out.println(Arrays.toString(strArray));

		// using method reference
		Arrays.sort(strArray, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(strArray));

	}
}
