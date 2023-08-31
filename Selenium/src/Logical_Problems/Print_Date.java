package Logical_Problems;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Print_Date {

	public static void main(String[] args) {
		
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		String date = simpleDateFormat.format(new Date());
		System.out.println("Current Date: " + date);
		
	}
}
