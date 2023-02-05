package com.java.RunnableLambdaExample;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("run method called");
	}

}

public class RunnableLambdaExample {
	
	public static void mail(String[] args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		Thread threadLambda = new Thread(()->{
			System.out.println();
		});
		threadLambda.start();
	}

}
