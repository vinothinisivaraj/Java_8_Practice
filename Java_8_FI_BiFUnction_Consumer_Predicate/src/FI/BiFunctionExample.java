package FI;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample implements BiFunction<Integer, Integer, Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {

		return (t + u);
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf = new BiFunctionExample();
		System.out.println(bf.apply(2, 6));
		System.out.println(bf.apply(20, 60));
		
		//only lambda expression**************************
		BiFunction<Integer, Integer, Integer> bfs = (t, u) -> (t+u);
		System.out.println(bfs.apply(2, 6));
		System.out.println(bfs.apply(20, 60));
		
		//only lambda sub****************************************
		BiFunction<Integer,Integer,Integer> bff = (t,u)->t*u;
		System.out.println(bff.apply(2, 6));
		System.out.println(bff.apply(20, 60));
		
		
		////////and then to change working function
		Function<Integer,Integer> func = (num)-> num*num;
		System.out.println(bf.andThen(func).apply(10, 20));
	}
}
