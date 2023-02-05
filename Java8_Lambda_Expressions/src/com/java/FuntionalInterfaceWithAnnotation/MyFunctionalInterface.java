package com.java.FuntionalInterfaceWithAnnotation;

@FunctionalInterface
public interface MyFunctionalInterface {
	void print(String message);
}

/*
 * this is optional annotation - Functional interface contains only on abstract method, can
 * contain many number of static and default methods.
 */