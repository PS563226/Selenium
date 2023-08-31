package Logical_Problems;

import java.util.Scanner;

public class Accept_Input_From_User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num 1:");
		int Num1 = sc.nextInt();
		
		System.out.println("Enter Num 2:");
		int Num2 = sc.nextInt();
		
		System.out.println(Num1+Num2);
	}
}
