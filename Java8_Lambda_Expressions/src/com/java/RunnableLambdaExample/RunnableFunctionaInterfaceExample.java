package com.java.RunnableLambdaExample;

//runnable is a functional interface

public class RunnableFunctionaInterfaceExample {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("thread starts"));
		thread.start();
	}
}
