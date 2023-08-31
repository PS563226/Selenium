package Logical_Problems;

public class Remove_White_Spaces {

	public static void main(String[] args) {
		
		String S1 = "Quantum Academy Pune";
		String S2 = "Pooja Ankush Shinde";
		String S3 = "Karan Bankiya Gumudi";
		
		S1 = S1.replaceAll(" ", "");
		S2 = S2.replaceAll(" ", "");
		S3 = S3.replaceAll(" ", "");
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
	}
}
