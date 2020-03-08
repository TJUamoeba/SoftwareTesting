package lab1test;

import Lab1.counter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class lab1test {
	
	@Test
	public void testCount1() {
		assertEquals(true,counter.count(0));
	}
	@Test
	public void testCount2() {
		assertEquals(true,counter.count(26));
	}
	@Test
	public void testCount3() {
		assertEquals(false,counter.count(9));
	}
	@Test
	public void testCount4() {
		assertEquals(false,counter.count(500));
	}
	@Test
	public void testCount5() {
		assertEquals(false,counter.count(-1));
	}
}
