package Logical_Problems;

public class Swap_Number_Without_Third_Variable {

	public static void main(String[] args) {
		
		int a = 500;
		int b = 300;
		
		System.out.println("a is " + a + " and b is " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping, a is " + a + " and b is " + b);
	}
}
