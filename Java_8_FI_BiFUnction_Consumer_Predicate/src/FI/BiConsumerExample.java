package FI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<Integer,Integer>{

	@Override
	public void accept(Integer t, Integer u) {
		System.out.println(t+u);
	}
	
	public static void main(String[] args) {
		System.out.println();
		BiConsumer<Integer, Integer> bc = new BiConsumerExample();
		bc.accept(5, 8);
		
		BiConsumer<Integer, Integer> bcc = (Integer u , Integer t)-> System.out.println(t+u);
		bcc.accept(5, 7);
		
		Map<Integer, String> mp = new LinkedHashMap<>();
		mp.put(1,"Java");
		mp.put(2,"C++");
		mp.put(3,"html");
		mp.put(4,"CSS");
		
		mp.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		

}
}
