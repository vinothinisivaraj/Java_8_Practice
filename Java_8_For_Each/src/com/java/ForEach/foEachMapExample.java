package com.java.ForEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class foEachMapExample {
	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(1, new Person("ramesh", 29));
		map.put(2, new Person("suresh", 20));
		map.put(3, new Person("dinesh", 25));

		// foEach Loop
		for (Entry<Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
		}

		// forEach+Lambda Method
		map.forEach((k, v) -> {
			System.out.println(k+" "+v.getAge());
			System.out.println(v.getName());
		});

	}
}
