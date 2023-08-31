package Logical_Problems;

public class Vowels_and_Consonant_as_a_String {

	public static void main(String[] args) {
		
		String S1 = new String("Hello, Karan, Pooja");
		
		for(int i=0; i<S1.length(); i++) {//for iteration we use for loop.
			if(S1.charAt(i)=='a'||S1.charAt(i)=='e'||S1.charAt(i)=='i'||
					S1.charAt(i)=='o'||S1.charAt(i)=='u')
				System.out.println("Given string contains vowels " + S1.charAt(i)+" at the index " + i);
		}
		
		String S2 = "Gumudi";
		String S3 = "Shinde";
		
		for(int i=0; i<S2.length(); i++) {
			if(S2.charAt(i)=='a'||S2.charAt(i)=='e'||S2.charAt(i)=='i'||
					S2.charAt(i)=='o'||S2.charAt(i)=='u')
				System.out.println("Given string contains vowels " + S2.charAt(i)+" at the index " + i);
		}
		
		for(int i=0; i<S3.length(); i++) {
			if(S3.charAt(i)=='a'||S3.charAt(i)=='e'||S3.charAt(i)=='i'||
					S3.charAt(i)=='o'||S3.charAt(i)=='u')
				System.out.println("Given string contains vowels " + S3.charAt(i)+" at the index " + i);
	    }
		
		System.out.println(S1.length());//19
		System.out.println(S2.length());//6
		System.out.println(S3.length());//6
	
	}	
}
