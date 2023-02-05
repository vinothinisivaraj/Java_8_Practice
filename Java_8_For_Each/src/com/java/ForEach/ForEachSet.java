package com.java.ForEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachSet {
	public static void main(String[] args) {
		Set<Person> per = new HashSet<Person>();
		per.add(new Person("hari",45));
		per.add(new Person("ravi",40));
		per.add(new Person("viji",15));
		per.add(new Person("viki",65));
		
		//forEach method+ lambda
		per.forEach((p)->{
			System.out.println(p.getName());
			System.out.println(p.getAge());
			//System.out.println("no.18");
		});
		
		
		//using stream with forEach method
		per.stream().forEach((p)-> {
			System.out.println(p.getName());
			System.out.println(p.getAge());
			//System.out.println("no.27");
		});
		
		
		
		
		
		
		
	}

}
