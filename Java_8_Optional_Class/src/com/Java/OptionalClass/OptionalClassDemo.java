package com.Java.OptionalClass;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args) {

		// create optional object - of,Empty,ofNullable

		// empty object with optional class - Empty
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		// of method
		//String email = "vino@gmail.com";
		String email = null;
		/*
		 * Optional<String> emailOptional = Optional.of(email);
		 * System.out.println(emailOptional);
		 */

		// ofNullableMethod - it wont throw null pointer exception - returns empty
		// object of optional class
		Optional<String> stringOptional = Optional.ofNullable(email);
		//orElse method
		String k = stringOptional.orElse("vimal@gmail.com");
		System.out.println(k);
		
		
		
		// Practically(realtime) - IsPresent usage----------------------------------------------------------------------------------------------------
		System.out.println(stringOptional.isPresent());// returns false
		if(stringOptional.isPresent()) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
		//orElseGet method
		String h=stringOptional.orElseGet(()->"karthik@gmail.com");
		System.out.println(h);
		
		//orElseThrow method
		/*
		 * String exception = stringOptional.orElseThrow(()->new
		 * IllegalArgumentException("email not found")); System.out.println(exception);
		 */
		
		//ifPresent method
		Optional<String> gender = Optional.of("Male");
		Optional<String> empPtional = Optional.empty();
		 gender.ifPresent((String)->System.out.println("value exist"));
		 empPtional.ifPresent((String)->System.out.println("no value exist"));
		
		//.filter method ******************************************
		 String res= "abc";
		 if(res != null && res.contains(" a bc ")) {
			 System.out.println(res);
		 }
		
		 Optional<String> obj = Optional.of("abc");
		 obj.filter(ob ->ob.contains("abc")).ifPresent((ob)->System.out.println(ob));
		     
		//Map Method- in Optional provides a way to transform value in optional from one type to another.
		 obj.filter(ob ->ob.contains("abc")).map(String::trim).ifPresent((ob)->System.out.println(ob));
	}
}
