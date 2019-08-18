package my;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(1, 4));
	}

	@Test
	public void testSubtract() {
		assertEquals(3, calculator.subtract(7, 5));
	}

	@Test
	public void testMultiplication() {
		assertEquals(8, calculator.multiplicaton(2, 4));
	}
}
