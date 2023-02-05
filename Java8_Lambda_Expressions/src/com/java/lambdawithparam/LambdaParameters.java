package com.java.lambdawithparam;


interface addable{
	int addition(int a, int b);
}
/*class addableimpl implements addable{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}
	 
 }*/
public class LambdaParameters {
	
	public static void main(String[] args) {
		/* lamda with paramter
		 * addable addable = (int a, int b)->{ return (a+b); }; int res =
		 * addable.addition(1, 2); System.out.println(res);
		 */
		 addable addable = (int a, int b)->{
			 int c= (a+b);
			 return c;
		 };
	}

}
