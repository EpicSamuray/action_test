package ch.hftm.rechner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void addPositiveIntegers() {
		double result = calculator.add(5, 2);
		Assertions.assertEquals(7, result, 0);
	}

	@Test
	public void addDoubles() {
		double result = calculator.add(-5.24, 4.1);
		Assertions.assertEquals(-1.14, result, 0.001);
	}

	@Test
	public void subractDecimalFromInt() {
		double result = calculator.subtract(92, 1.2);
		Assertions.assertEquals(90.8, result, 0);
	}

	@Test
	public void multiplyDecimalWithMinusInt() {
		double result = calculator.multiply(2.5, -10);
		Assertions.assertEquals(-25, result, 0);
	}

	@Test
	public void divideIntegers() {
		double result = calculator.divide(20, 5);
		Assertions.assertEquals(4, result, 0.001);
	}

	@Test
	public void divideThroughZero() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calculator.divide(12, 0);
		  });
	}
}
