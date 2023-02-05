package com.java.ConsumerFunctionalInterface;

import java.util.function.Consumer;

//Consumer Interface accepts input but it doesnt return anything
/*class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}*/

public class ConsumerFunctionalInterfaceDemo {
  public static void main(String[] args) {
		/*
		 * Consumer<String>consumer = new ConsumerImpl(); consumer.accept("hi");
		 */
	  //replacement of code on line no.6-13
	  Consumer<String> consumer = (String t)->System.out.println(t);
	  consumer.accept("hi");
  }
}
