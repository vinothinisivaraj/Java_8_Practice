package com.java.MethodReferenceClassNew;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceClassNewExample {
	public static void main(String[] args) {
		 //reference to a constructor -- className::New
		 List<String> fruits = new ArrayList<>();
		 fruits.add("Apple");
		 fruits.add("Mango");
		 fruits.add("Grapes");
		 
		      // lambda expresssion
		 Function<List<String>,Set<String>> setFunction = (fruitsList)->new HashSet<>(fruitsList);
		 System.out.println(setFunction.apply(fruits));
		      //method reference
		 Function<List<String>,Set<String>> setFunc = HashSet::new;
		 System.out.println(setFunction.apply(fruits));
	}
}
