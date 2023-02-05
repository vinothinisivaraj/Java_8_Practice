package FI;

import java.util.function.BiPredicate;

public class BiPredicateExample implements BiPredicate<String, String> {

	@Override
	public boolean test(String t, String u) {
		return t.equals(u);
	}
	
	public static void main(String[] args) {
		//using lambda expression
		BiPredicate<String,String> bp = (t,u)->(t.equals(u));
		System.out.println(bp.test("square", "squar"));
		
		BiPredicate<Integer,Integer> bp2=(x,y)->(x>y);
		BiPredicate<Integer,Integer> bp3=(x,y)->(x==y);
		
		System.out.println(bp2.test(12,8));
		System.out.println(bp3.test(8, 8));
		
		///*****************logical AND operation********
		System.out.println("hrrlrlrlr");
		System.out.println(bp2.and(bp3).test(3, 2));
		//******************logical OR Operation ********
		System.out.println(bp2.or(bp3).test(3, 2));
	}
	

}
