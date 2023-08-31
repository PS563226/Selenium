package Logical_Problems;

public class Multidimensional_Array_Print {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][2];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		
		int arr1[][] = {{10,20},{30,40}};
		
		for(int i = 0; i <= arr.length-1; i++) {
			for(int j = 0; j <=arr.length-1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
