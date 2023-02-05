package com.java.ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachListExample {
	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
        person.add(new Person("vino",24));
        person.add(new Person("vimal",39));
        person.add(new Person("sivaraj",53));
        person.add(new Person("shanthi",50));
        
        person.forEach(System.out::println);
        person.stream().forEach((perso)->{
        	System.out.println(perso.getName());
        	System.out.println(perso.getAge());
        	
        });
        
	}
}

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
