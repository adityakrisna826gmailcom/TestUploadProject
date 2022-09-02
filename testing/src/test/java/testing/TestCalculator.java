package testing;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class TestCalculator {
	
	@Test
	
	public void testAddNilai()
	{
		Calculator c = new Calculator();
		assertEquals(c.addNilai(5, 10), 15);
		
	}
	
	@Test
	public void testDivideNilai()
	{
		Calculator c = new Calculator();
		assertEquals(c.divideNilai(10, 3), 3.333);
	}
}
