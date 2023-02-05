package com.java.MethodReferenceObj;

// example of object::instance method name
@FunctionalInterface
interface printable {
	void print(String s);
}

public class MethodReferenceObjInstanceExample {
	public void display(String s) {
		s = s.toUpperCase();
		System.out.println(s);
	}

	public static void main(String[] args) {

		MethodReferenceObjInstanceExample m = new MethodReferenceObjInstanceExample();

		/*
		 * // lambda expression printable printable = (s) -> m.display(s);
		 * printable.print("haiiii");
		 */
		
		printable printable = m::display;
		printable.print("hello vino");
		
		
		
	}

}
