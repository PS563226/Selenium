package Logical_Problems;

public class Palindrome_and_Reverse {
	
	public static void main(String[] args) {
		
		//civic, radar, level, rotor, kayak, madam, and refer
		// redivider, kinnikinnik and tattarrattat
		
		String S1 = "level";
		String Reverse = "";
		int StringLength = S1.length();
		
		for(int i = (StringLength-1); i>=0; --i) {
			Reverse = Reverse + S1.charAt(i);
		}
		System.out.println("Original String:" + S1);//Original String:Level
		System.out.println("Reverse String:" + Reverse);//Reverse String:leveL
		
		if(S1.equals(Reverse)) {
			System.out.println(S1 + " is a Palindrome String.");//level is a Palindrome String.
		}
		else {
			System.out.println(S1 + " is not a Palindrome String.");//Level is not a Palindrome String.
		}
		System.out.println(S1.length());//5
		System.out.println(S1.charAt(0));//l
	}
}
