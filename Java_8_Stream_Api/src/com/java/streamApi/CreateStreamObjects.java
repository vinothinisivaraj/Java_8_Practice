package com.java.streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {
	public static void main(String[] args) {
		Stream<String> str = Stream.of("a", "b", "c");
		str.forEach(System.out::println); // method referance

		// create a stream from sources - Collection
		Collection<String> col = Arrays.asList("hello", "vino", "hi");
		Stream<String> strs = col.stream();
		strs.forEach(System.out::println);

		// create a stream from List
		List<String> lis = Arrays.asList("hi", "vino", "hell");
		Stream<String> strss = lis.stream();
		strss.forEach(System.out::println);

		// create a stream from set
		Set<String> set = new HashSet<>(lis);
		Stream<String> strst = set.stream();
		strst.forEach(System.out::println);

		// Stream from Arrays
		String[] arr = {"a","b","c"};
		Stream<String> strr = Arrays.stream(arr);
		strr.forEach(System.out::println);
		
	}
}
