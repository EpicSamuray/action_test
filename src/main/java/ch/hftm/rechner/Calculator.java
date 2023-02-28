package ch.hftm.rechner;

/*
 * A simple calculator to demonstrate unit testing.
 */
public class Calculator {

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	/*  */
	public double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

	public double untestedOperation(double a) {
		System.out.println("Additional code-line to decrase the coverage-value");
		return a;
	}

}
