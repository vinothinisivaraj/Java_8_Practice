package com.java.FuntionalInterfaceWithAnnotation;

/* example of polymorphism into functional programming using lambda expression*/
@FunctionalInterface
interface shape {
	void draw();
}

class rect implements shape {

	@Override
	public void draw() {
		System.out.println("Rect draw method");
	}

}

public class LambdaExampleWithFunctionalInterfaceAnno {
	public static void main(String[] args) {

		shape rect = ()->System.out.println("Rect draw method");
		rect.draw();
		
		
	}
}
