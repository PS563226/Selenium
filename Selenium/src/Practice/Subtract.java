package Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {

	@Test
	@Parameters({"a","b"})
	public void subtract(int c, int d) {
	int sub = c-d;
	System.out.println("Subtraction of two numbers:"+sub);
	}
}
